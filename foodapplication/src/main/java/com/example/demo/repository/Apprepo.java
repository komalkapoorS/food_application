package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Appentity;

@Repository
public interface Apprepo extends JpaRepository<Appentity,Integer>{

}
