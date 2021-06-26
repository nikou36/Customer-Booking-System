package com.customerservices.CustomerService.repositories;

import com.customerservices.CustomerService.entities.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentsRepository extends MongoRepository<Appointment,Long> {
    
}
