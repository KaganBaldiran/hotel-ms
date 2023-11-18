package com.pavlokaganise.hotelms.repositories;

import com.pavlokaganise.hotelms.entities.GuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<GuestEntity, Integer> { }
