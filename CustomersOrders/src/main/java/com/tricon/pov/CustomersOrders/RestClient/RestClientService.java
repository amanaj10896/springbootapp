package com.tricon.pov.CustomersOrders.RestClient;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tricon.pov.CustomersOrders.Model.CustomersOrderedProducts;
import com.tricon.pov.CustomersOrders.Model.CustomersOrders;
import com.tricon.pov.CustomersOrders.Model.Orders;
import com.tricon.pov.CustomersOrders.PojoClasses.Customer;
import com.tricon.pov.CustomersOrders.PojoClasses.Order;
import com.tricon.pov.CustomersOrders.PojoClasses.OrderedProduct;
import com.tricon.pov.CustomersOrders.PojoClasses.Product;



@Service
public class RestClientService {

	@Autowired
	RestTemplate restTemplate;

	public CustomersOrders getCustomerProductDetails(String id, String fromDate, String toDate) {
		CustomersOrders customersOrder = new CustomersOrders();
		List<Orders> orders_list = new ArrayList<>();

		/*
		 * Getting Customer Details
		 */
		ResponseEntity<Customer> result = restTemplate.exchange("http://CUSTOMER/tricon/customer/" + id,
				HttpMethod.GET, null, Customer.class);
		System.out.println("a");
		Customer customer = result.getBody();
		customersOrder.setCustomer_details(customer);

		/*
		 * Getting Order Details
		 */
		String url = "http://ORDER/tricon/order/myorder/" + id + "/?fromDate=" + fromDate + "&toDate="
				+ toDate;
		ResponseEntity<List<Order>> order = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Order>>() {
				});
		System.out.println("b");

		List<Order> myorders = order.getBody();
		Iterator<Order> iterator = myorders.iterator();

		while (iterator.hasNext()) {
			Order iterator_order_item = iterator.next();
			Orders myeachorder = new Orders(iterator_order_item.getId(), iterator_order_item.getOrderTime(),
					iterator_order_item.getPaymentMode());

			List<CustomersOrderedProducts> ordered_product_details = new ArrayList<>();
			Iterator<OrderedProduct> iterator2 = iterator_order_item.getOrderedItems().iterator();
			while (iterator2.hasNext()) {
				OrderedProduct iterator2_orderProduct_item = iterator2.next();
				ResponseEntity<Product> result2 = restTemplate.exchange(
						"http://PRODUCT/tricon/products/" + iterator2_orderProduct_item.getProductId(),
						HttpMethod.GET, null, Product.class);
				System.out.println("c");

				CustomersOrderedProducts my_ordered_product_details = new CustomersOrderedProducts(result2.getBody(),
						iterator2_orderProduct_item.getAmount(), iterator2_orderProduct_item.getCurrency(),
						iterator2_orderProduct_item.getTax(), iterator2_orderProduct_item.getTotal(),
						iterator2_orderProduct_item.getScheduledDelivery(), iterator2_orderProduct_item.getArrivedDelivery(),
						iterator2_orderProduct_item.getScheduledShipping(), iterator2_orderProduct_item.getArrivedShipping());
				ordered_product_details.add(my_ordered_product_details);
			}
			myeachorder.setCustomersOrderedProducts(ordered_product_details);
			orders_list.add(myeachorder);
		}
		customersOrder.setOrders(orders_list);
		System.out.println("d");

		return customersOrder;

	}

}