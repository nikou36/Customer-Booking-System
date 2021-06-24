package com.customerservices.CustomerService.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Appointment {
    private @Id @GeneratedValue Long id;
    private Long customerID;
    private Date bookedDate; 
    private Type type;
    private Status Status; 
    private double paidAmount;


    public Appointment() {
    }

    public Appointment(Long id, Long customerID, Date bookedDate, Type type, Status Status, double paidAmount) {
        this.id = id;
        this.customerID = customerID;
        this.bookedDate = bookedDate;
        this.type = type;
        this.Status = Status;
        this.paidAmount = paidAmount;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public Date getBookedDate() {
        return this.bookedDate;
    }

    public void setBookedDate(Date bookedDate) {
        this.bookedDate = bookedDate;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return this.Status;
    }

    public void setStatus(Status Status) {
        this.Status = Status;
    }

    public double getPaidAmount() {
        return this.paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Appointment id(Long id) {
        setId(id);
        return this;
    }

    public Appointment customerID(Long customerID) {
        setCustomerID(customerID);
        return this;
    }

    public Appointment bookedDate(Date bookedDate) {
        setBookedDate(bookedDate);
        return this;
    }

    public Appointment type(Type type) {
        setType(type);
        return this;
    }

    public Appointment Status(Status Status) {
        setStatus(Status);
        return this;
    }

    public Appointment paidAmount(double paidAmount) {
        setPaidAmount(paidAmount);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Appointment)) {
            return false;
        }
        Appointment appointment = (Appointment) o;
        return Objects.equals(id, appointment.id) && Objects.equals(customerID, appointment.customerID) && Objects.equals(bookedDate, appointment.bookedDate) && Objects.equals(type, appointment.type) && Objects.equals(Status, appointment.Status) && paidAmount == appointment.paidAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerID, bookedDate, type, Status, paidAmount);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", customerID='" + getCustomerID() + "'" +
            ", bookedDate='" + getBookedDate() + "'" +
            ", type='" + getType() + "'" +
            ", Status='" + getStatus() + "'" +
            ", paidAmount='" + getPaidAmount() + "'" +
            "}";
    }

    
}
