package com.howtodoinjava.example.springconfigclient;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface EmpRepo extends MongoRepository<EmpModel ,String>  {

}
