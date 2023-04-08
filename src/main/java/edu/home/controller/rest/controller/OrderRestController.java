package edu.home.controller.rest.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.home.entity.Order;
import edu.home.service.OrderService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "rest/order")
public class OrderRestController {
	@Autowired
	OrderService orderService;
	
	@GetMapping("/findAll")
	public List<Order> findAll(){
		return orderService.findAll();
	}
	@GetMapping("/findStatusById/{id}")
	public Long findStatusById(@PathVariable("id") Long id) {
		return orderService.findStatusById(id);
	}
	@GetMapping("/findById/{id}")
	public Order findById(@PathVariable("id") Long id) {
		return orderService.findById(id);
	}
	@GetMapping("/findByPaymentmethodId/{id}")
	public List<Order> findByPaymentmethodId(@PathVariable("id") Long id) {
		return orderService.findByPaymentmethodId(id);
	}
	@GetMapping("/findByOrderDate/{orderDate}")
	public List<Order> findByOrderDate(@PathVariable("orderDate") Date orderDate) {
		return orderService.findByOrderDate(orderDate);
	}
	@GetMapping("/findByShippedDate/{shippedDate}")
	public List<Order> findByShippedDate(@PathVariable("shippedDate") Date shippedDate) {
		return orderService.findByShippedDate(shippedDate);
	}
	@PutMapping("/status/{status}/{id}")
	public void updateStatusById(@PathVariable("status") Long status, @PathVariable("id") Long id) {
		orderService.updateStatusById(status, id);
	}
}
