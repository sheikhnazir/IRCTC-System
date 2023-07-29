package com.example.IRCTC.Systemm.controllers;

import com.example.IRCTC.Systemm.models.Passenger;
import com.example.IRCTC.Systemm.services.PassengerService;
import com.example.IRCTC.Systemm.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @PostMapping("/add")
    public void addPassenger(@RequestBody Passenger passenger) {

        passengerService.addPassenger(passenger);
    }

    @GetMapping("/getPassengerCountBetweenTwoCities")
     public int getPassengerCountBetweenTwoCities(@RequestParam String source, String destination, Date date) {

        return passengerService.getPassengerCountBetweenTwoCities(source, destination, date);
    }

    @GetMapping("/getFemalePassengersFromAgeXtoY")
    public int getFemalePassengersFromAgeXtoY(@RequestParam String destination, Integer ageFrom, Integer ageTo) {

        return passengerService.getFemalePassengersFromAgeXtoY(destination, ageFrom, ageTo);
    }
}
