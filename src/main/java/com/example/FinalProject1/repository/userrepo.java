package com.example.FinalProject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FinalProject1.model.*;


@Repository
public interface userrepo extends JpaRepository<User,Integer> {

	User findByEmail(String email);
}
