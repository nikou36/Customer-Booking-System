package com.customerservices.CustomerService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Document
public class Appointment {
    private @Id @GeneratedValue Long id;
    private Long customerID;
    private Date bookedDate;
    private Type type;
    private Status Status;
    private double paidAmount;
}
