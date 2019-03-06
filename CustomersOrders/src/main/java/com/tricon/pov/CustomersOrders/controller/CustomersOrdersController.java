package com.tricon.pov.CustomersOrders.controller;

import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tricon.pov.CustomersOrders.Model.CustomersOrders;
import com.tricon.pov.CustomersOrders.RestClient.RestClientService;


@RestController
@RequestMapping("/tricon/myorder")
public class CustomersOrdersController {
	
	
	@Autowired
	RestClientService restClientService;
	
	@GetMapping("/{id}")
        public CustomersOrders getOrders(@PathVariable String id,@RequestParam(value = "fromDate", required = false) String fromDate,@RequestParam(value = "toDate", required = false) String toDate) throws ParseException, java.text.ParseException{
		
		return restClientService.getCustomerProductDetails(id,fromDate,toDate  );


}
}
