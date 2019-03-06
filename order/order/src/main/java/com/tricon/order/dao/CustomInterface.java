package com.tricon.order.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.Query;

import com.tricon.order.pojo.Order;

public interface CustomInterface {

	
@Query("{ 'customerId': ?0,  'orderTime': {$gte:?1,$lte:?2}}")	
public List<Order> getOrderDetails(String id,Date fromDate, Date toDate);
}
