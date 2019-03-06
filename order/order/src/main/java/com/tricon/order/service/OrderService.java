package com.tricon.order.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import com.tricon.order.dao.CustomInterface;
import com.tricon.order.dao.OrderRepository;
import com.tricon.order.pojo.Order;

@Service
public class OrderService implements CustomInterface {

	@Autowired
	OrderRepository orderRepository;
	
	@Query("{'customer_id':?0 }")
	public List<Order> getAll() {
		return orderRepository.findAll();
	}

	public Optional<Order> getByid(String id) {
		return orderRepository.findById(id);
	}

	public Order save(Order order) {
		return orderRepository.insert(order);
	}

	public void update(Order order) {
		orderRepository.save(order);
		
	}

	public void delete(String id) {
	orderRepository.deleteById(id);
		
	}

	@Override
	public List<Order> getOrderDetails(String id, Date fromDate, Date toDate) {
		
		return orderRepository.getOrderDetails(id, fromDate, toDate);
	}

	

}
