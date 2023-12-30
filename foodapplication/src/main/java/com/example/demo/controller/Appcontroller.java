package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appentity;
import com.example.demo.repository.Apprepo;

@RestController
public class Appcontroller {
@Autowired
	
	private Apprepo repo;
	@PostMapping("/add")
	public Appentity add(@RequestBody Appentity app) {
		try {
			repo.save(app);
			return app;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@GetMapping("/get")
	public List<Appentity> get(){
		try {
			return repo.findAll();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PutMapping("/update")
	public Appentity update(@RequestBody Appentity app) {
		try {
			repo.save(app);
			return app;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable int Id) {
		try {
			@SuppressWarnings("deprecation")
			Appentity user=repo.getOne(Id);
			repo.delete(user);
			return "product deleted";
		}catch(Exception e) {
			e.printStackTrace();	
		}
		return null;
	}
}
