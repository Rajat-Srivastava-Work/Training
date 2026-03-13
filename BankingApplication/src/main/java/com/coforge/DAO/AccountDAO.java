package com.coforge.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.models.Account;

public class AccountDAO {

	public List<Account> getAllAccounts(Connection conn) {
		// TODO Auto-generated method stub
		String query="select * from account";
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(query);
			List<Account> accList=new ArrayList<Account>();
			while(rs.next()) {
				Account acc=new Account();
				acc.setAccNo(rs.getInt("accno"));
				acc.setAccHolderName(rs.getString("accholdername"));
				acc.setAccType(rs.getString("acctype"));
				acc.setBalance(rs.getDouble("balance"));
				accList.add(acc);
			}
			return accList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public Account addAccount(Connection conn, Account acc) {
		// TODO Auto-generated method stub
		String query="insert into account (accno, accholdername, acctype, balance) values(?,?,?,?)";
		
		try(PreparedStatement ps=conn.prepareStatement(query)){
			ps.setInt(1, acc.getAccNo());
			ps.setString(2, acc.getAccHolderName());
			ps.setString(3, acc.getAccType());
			ps.setDouble(4, acc.getBalance());
			ps.executeUpdate();
			System.out.println("record inserted");
			return acc;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public void depositAmount(Connection conn, Account acc) {
		// TODO Auto-generated method stub
		String query="update account set balance=balance+? where accno=?";
		try(PreparedStatement ps=conn.prepareStatement(query)){
			ps.setDouble(1, acc.getBalance());
			ps.setInt(2, acc.getAccNo());
			ps.executeUpdate();
			System.out.println("amount updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

	public void withdrawAmount(Connection conn, Account acc) {
		// TODO Auto-generated method stub
		String query="update account set balance=balance-? where accno=?";
		try(PreparedStatement ps=conn.prepareStatement(query)){
			ps.setDouble(1, acc.getBalance());
			ps.setInt(2, acc.getAccNo());
			ps.executeUpdate();
			System.out.println("amount updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deleteAccount(Connection con,int accNo) throws SQLException{
		String query="delete from account where accNo = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1,accNo);
		ps.executeUpdate();
	}
	public static List<Account> getAccountFromQuery(Connection con,String q) throws SQLException{
		String query="select * from account where accNo like ? or accHolderName like ? or accType like ? or balance like ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1,'%'+q+'%');
		ps.setString(2,'%'+q+'%');
		ps.setString(3,'%'+q+'%');
		ps.setString(4,'%'+q+'%');
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Account> accList= new ArrayList<Account>();
		while(rs.next()) {
			Account acc = new Account();
			acc.setAccNo(rs.getInt("accNo"));
			acc.setAccHolderName(rs.getString("accHolderName"));
			acc.setAccType(rs.getString("accType"));
			acc.setBalance(rs.getDouble("balance"));
			
			accList.add(acc);
		}
		
		return accList;
		
	}


}
