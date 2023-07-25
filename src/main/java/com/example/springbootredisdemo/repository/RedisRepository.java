package com.example.springbootredisdemo.repository;

import com.example.springbootredisdemo.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface RedisRepository extends CrudRepository<Person, String> {

}
