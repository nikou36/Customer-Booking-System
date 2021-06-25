package com.customerservices.CustomerService.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.customerservices.CustomerService.entities.*;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository <Customer,Long>{

}
