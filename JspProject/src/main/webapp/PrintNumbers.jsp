<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <% for(int i=1;i<=10;i++)
    	if(i%2==0){
    		out.println(i);
    	}
    %>
    
    <br>
    
    <%! String fruits[]={"banana","apple","mango"}; %>
    <% for(String fruit:fruits)
    	out.println(fruit);%>
    
    <br>
    
    <%@ page import="java.util.Date" %>
    <%Date date=new Date(); %>
    <%=date %>
    
    <br>
    <form>
         <label>Enter no.</label>
         <input type="text" name="n1">
         <br>
    
         <label>Enter power</label>
         <input type="text" name="n2">
         <br>
    
         <button type="submit">Calculate</button>
         <br>
    </form>
    
    <%@ page import="java.lang.Math" %>
    
    <%String x=request.getParameter("n1"); %>
    <%String y=request.getParameter("n2"); %>
    <%if(x!=null && y!=null) {
    	double res=Math.pow(Integer.parseInt(x),Integer.parseInt(y));
    	out.println(res);
    }
    %>
    <br>
    
    <%!double d1=5,d2=3; %>
    <% out.println(Math.pow(d1,d2)); %>
    
    <%@ include file="Header.jsp" %>

</body>
</html>