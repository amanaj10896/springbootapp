package com.tricon.poc.product.ProductDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.tricon.poc.product.ProductModel.ProductModel;
import com.tricon.poc.product.ProductService.IProductDao;


@Repository
public class ProductDao implements IProductDao{
	
	@Autowired
	public MongoTemplate mongoTemplate;
	
//	@Autowired
//	public ProductDao(MongoTemplate mongoTemplate) {
//        this.mongoTemplate = mongoTemplate;
//	}

	@Override
	public List<ProductModel> getAllProducts() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(ProductModel.class);
	}

	@Override
	public ProductModel getProductById(String productId) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("productId").is(productId));
		System.out.println("aj");
		return mongoTemplate.findOne(query, ProductModel.class);
	}

	@Override
	public ProductModel updateProduct(ProductModel product) {
		// TODO Auto-generated method stub
		mongoTemplate.save(product);
		return product;
	}

	@Override
	public void deleteProductById(String productId) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("productId").is(productId));
		mongoTemplate.remove(query, ProductModel.class);

	}

	@Override
	public void addProduct(ProductModel product) {
		// TODO Auto-generated method stub
		mongoTemplate.save(product);
		System.out.println("aa");
	}

	@Override
	public List<ProductModel> getAllProductsPaginated(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		Query query = new Query();
		   query.skip(pageNumber * pageSize);
		   query.limit(pageSize);
		   return mongoTemplate.find(query, ProductModel.class);
	}
		
	

}
