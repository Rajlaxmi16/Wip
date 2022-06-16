package com.dao;

import java.util.List;

import com.entity.Order;
import com.entity.Product;
import com.entity.User;

public interface OrderDAO {
	
	public List<Order> getOrder();
	
	public Order getOrder(int orderId);
	
	public void saveOrder(Order order);
	
	public void deleteOrder(int orderId);
	
	
	public List<Order> getUserOrders(int userId);

}
