package com.teammacc.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teammacc.delivery.data.vo.DeliveryVO;
import com.teammacc.delivery.repository.DeliveryRepository;

@Service
public class DeliveryService {
	
	private final DeliveryRepository deliveryRepository;

	@Autowired
	public DeliveryService(DeliveryRepository deliveryRepository) {
		this.deliveryRepository = deliveryRepository;
	}
	
	public DeliveryVO deliveryProducts(String address) {
		
		DeliveryVO deliveryVO = new DeliveryVO();
		deliveryVO.setStatus("Saiu para entrega...");
		deliveryVO.setAddress("Betronio frota");
		
		return deliveryVO;
		
	}
	

}
