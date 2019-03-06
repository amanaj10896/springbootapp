package com.tricon.poc.product.ProductService;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tricon.poc.product.ProductModel.ProductModel;

public interface IProductDao {
	 List<ProductModel> getAllProducts();
	 List<ProductModel> getAllProductsPaginated(int pageNumber,int pageSize);
	 ProductModel getProductById(String productId);
	 ProductModel updateProduct(ProductModel product);
	 void deleteProductById(String productId);
	 void addProduct(ProductModel product);
}
