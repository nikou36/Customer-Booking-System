package com.customerservices.CustomerService.entities;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Document
public class Customer{
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Customer(){}

    public Customer(String firstName, String lastName, String phoneNumber,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId(){
        return  this.id;
    }

    public void setId(Long id){
        this.id = id;
    }


    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber; 
    }

    public void setPhoneNumber(String phoneNumber){
        if(isValidNumber(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }  
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //Method to check if a given phone number is valid;
    private boolean isValidNumber(String phoneNumber){
        for(int i = 0; i < phoneNumber.length();i++){
            if(!Character.isDigit(phoneNumber.charAt(i))){
                return false;
            }
        }
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phoneNumber, email);
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }


    
}