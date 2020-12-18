package com.teammacc.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teammacc.delivery.entity.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

}
