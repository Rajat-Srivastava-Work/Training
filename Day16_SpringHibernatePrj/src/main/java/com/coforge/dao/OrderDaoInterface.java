package com.coforge.dao;

import java.util.List;

import com.coforge.entities.Item;
import com.coforge.entities.Order;

public interface OrderDaoInterface {
	List<Order> getAllOrders();
	public void insertOrder(Order ord);
	public void updateOrder(Order ord);
	public void deleteOrder(long ordId);
	public Item getById(long ordId);

}
