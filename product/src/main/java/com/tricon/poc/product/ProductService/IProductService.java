package com.tricon.poc.product.ProductService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tricon.poc.product.ProductModel.ProductModel;
@Service
public interface IProductService {

	
	 List<ProductModel> getAllProducts();
	 List<ProductModel> getAllProductsPaginated(int pageNumber,int pageSize);
	 ProductModel getProductById(String productId);
	 ProductModel updateProduct(ProductModel product);
	 void deleteProductById(String productId);
	 void addProduct(ProductModel product);
}
