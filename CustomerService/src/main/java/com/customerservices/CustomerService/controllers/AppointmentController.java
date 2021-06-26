package com.customerservices.CustomerService.controllers;

import com.customerservices.CustomerService.entities.Appointment;
import com.customerservices.CustomerService.repositories.AppointmentsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    private final AppointmentsRepository appointmentsRepository;

    public AppointmentController(AppointmentsRepository appointmentsRepository){
        this.appointmentsRepository = appointmentsRepository;
    }

    @GetMapping("/appointments")
    public List<Appointment> all(){
        return appointmentsRepository.findAll();
    }

    @GetMapping("/appointments/{id}")
    public Appointment getAppointment(@PathVariable Long id){
        return appointmentsRepository.findById(id).orElse(new Appointment());
    }

    @PostMapping("/appointments")
    public Appointment newAppointment(@RequestBody Appointment newAppointment){
        return appointmentsRepository.save(newAppointment);
    }
    /*
    @PutMapping("/appointments/{id}")
    public Appointment replaceAppointment(@RequestBody Appointment newAppointment, @PathVariable("id") Long id ){

    }*/

}
