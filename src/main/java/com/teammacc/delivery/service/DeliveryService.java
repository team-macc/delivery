package com.teammacc.delivery.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.teammacc.delivery.data.vo.DeliveryVO;

@Service
public class DeliveryService {
	
	private static HashMap<String, DeliveryVO> deliveries = new HashMap<String, DeliveryVO>(); 
	
	public void populate() {
		
		DeliveryVO delivery1 = new DeliveryVO();
		delivery1.setAddress("Betronio frota");
		
		DeliveryVO delivery2 = new DeliveryVO();
		delivery2.setAddress("Frei Vidal");
		
		deliveries.put("12345", delivery1);
		deliveries.put("678910", delivery2);
		
	}
	
	public DeliveryVO getDelivery(String orderId) {
		
		if(deliveries.containsKey(orderId)) {
			DeliveryVO deliveryVO = deliveries.get(orderId);
			return deliveryVO;
		}else {
			return null;
		}
		
	}
	
	public DeliveryVO createNewDelivery(String orderId, String address) {
		if(!deliveries.containsKey(orderId)) {
			DeliveryVO deliveryVO = new DeliveryVO();
			deliveryVO.setAddress(address);
			deliveryVO.setStatus("Pedido em preparo");
			deliveries.put(orderId,deliveryVO);
			
			return deliveries.get(orderId);
		}
		
		return null;
	}
	
	public DeliveryVO changeStatus(String orderId, String status) {
		if(deliveries.containsKey(orderId)) {
			DeliveryVO deliveryVO = deliveries.get(orderId);
			deliveryVO.setStatus(status);
			
			return deliveryVO;
		}else {
			return null;
		}
	}
	
	
}
