package com.example.FinalProject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FinalProject1.model.House;

@Repository
public interface proprepo extends JpaRepository<House, Integer> {
	

}
