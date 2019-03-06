package com.tricon.poc.product.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.poc.product.ProductModel.ProductModel;
import com.tricon.poc.product.ProductService.IProductDao;
import com.tricon.poc.product.ProductService.IProductService;


@Service
public class ProductService implements IProductService {
	
	@Autowired
	private IProductDao productDao;

	@Override
	public List<ProductModel> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

	@Override
	public List<ProductModel> getAllProductsPaginated(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return productDao.getAllProductsPaginated(pageNumber, pageSize);
	}

	@Override
	public ProductModel getProductById(String productId) {
		// TODO Auto-generated method stub
		return productDao.getProductById(productId);
	}

	@Override
	public ProductModel updateProduct(ProductModel product) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(product);
	}

	@Override
	public void deleteProductById(String productId) {
		// TODO Auto-generated method stub
		productDao.deleteProductById(productId);
	}

	@Override
	public void addProduct(ProductModel product) {
		// TODO Auto-generated method stub
		productDao.addProduct(product);
		System.out.println("bb");
	}

}