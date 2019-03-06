package com.tricon.poc.product.ProductController;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.poc.product.ProductModel.ProductModel;
import com.tricon.poc.product.ProductService.IProductService;

@RestController
@RequestMapping("/tricon")
public class ProductController {
	
	@Autowired
	private IProductService productService;

	@GetMapping("/products")
	public ResponseEntity<List<ProductModel>> getAllProducts() {
		List<ProductModel> list = productService.getAllProducts();
		return new ResponseEntity<List<ProductModel>>(list, HttpStatus.OK);
	}
	
	@PostMapping("/products")
		public void addProduct(@Valid @RequestBody ProductModel product){
		productService.addProduct(product);
	}
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<ProductModel> getProductById(@PathVariable String productId){
		ProductModel product=productService.getProductById(productId);
		return new ResponseEntity<ProductModel>(product,HttpStatus.OK);
	}
	@DeleteMapping("/products/{productId}")
	public void deleteProductById(@PathVariable String productId){
		productService.deleteProductById(productId);
		System.out.println("delete done");
	}
	
	
	@PutMapping("/products/{productId}")
	public ResponseEntity<ProductModel> updateProduct(@Valid @RequestBody ProductModel product){
	ProductModel product1=productService.updateProduct(product);
	return new ResponseEntity<ProductModel>(product1,HttpStatus.OK);
	}

}
