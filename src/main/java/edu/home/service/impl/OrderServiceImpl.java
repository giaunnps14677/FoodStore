package edu.home.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.home.entity.Order;
import edu.home.repository.OrderRepository;
import edu.home.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	OrderRepository dao;
	
	@Override
	public List<Order> findAll() {
		return dao.findAll();
	}

	@Override
	public Long findStatusById(Long id) {
		return dao.findStatusById(id);
	}

	@Override
	public void updateStatusById(Long status, Long id) {
		dao.updateStatusById(status, id);
	}

	@Override
	public Order findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Order> findByPaymentmethodId(Long id) {
		return dao.findByPaymentmethodId(id);
	}

	@Override
	public List<Order> findByOrderDate(Date orderDate) {
		return dao.findByOrderDate(orderDate);
	}

	@Override
	public List<Order> findByShippedDate(Date shippedDate) {
		return dao.findByShippedDate(shippedDate);
	}
}
