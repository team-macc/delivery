package com.teammacc.delivery.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teammacc.delivery.data.vo.DeliveryVO;
import com.teammacc.delivery.service.DeliveryService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
	
	private final DeliveryService deliveryService;

	@Autowired
	public DeliveryController(DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	@GetMapping(produces = {"application/json","application/xml","application/x-yaml"})
	public DeliveryVO deliveryProducts(@RequestBody String body) {
		
		JSONObject deliveryInfo = new JSONObject(body);

		String address = deliveryInfo.getString("address");
		Long orderId = deliveryInfo.getLong("order_id");
		
		return deliveryService.deliveryProducts(body);
		
	}

}
