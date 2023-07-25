package com.example.springbootredisdemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@RedisHash("person")
public class Person {

	@Id
	String id; //person:<id> 형식으로 들어감
	String name;
	int age;

	List<String> tag;
}
