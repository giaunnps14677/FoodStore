package edu.home.service;

import java.util.Date;
import java.util.List;

import edu.home.entity.Order;

public interface OrderService {
	List<Order> findAll();
	Long findStatusById(Long id);
	void updateStatusById(Long status, Long id);
	Order findById(Long id);
	List<Order> findByPaymentmethodId(Long id);
	List<Order> findByOrderDate(Date orderDate);
	List<Order> findByShippedDate(Date shippedDate);
}
