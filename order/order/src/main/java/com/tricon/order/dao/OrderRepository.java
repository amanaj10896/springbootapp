package com.tricon.order.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tricon.order.pojo.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>,CustomInterface{

}
