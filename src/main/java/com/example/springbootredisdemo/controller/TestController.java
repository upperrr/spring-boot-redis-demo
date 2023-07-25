package com.example.springbootredisdemo.controller;

import com.example.springbootredisdemo.entity.Person;
import com.example.springbootredisdemo.repository.RedisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	RedisRepository redisRepository;

	@GetMapping
	public String get() {
		return redisRepository.findAll().toString();

	}

	@PostMapping
	public String set(@RequestBody Person person) {
		return redisRepository.save(person).toString();

	}
}
