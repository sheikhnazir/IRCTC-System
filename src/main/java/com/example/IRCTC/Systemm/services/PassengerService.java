package com.example.IRCTC.Systemm.services;

import com.example.IRCTC.Systemm.models.Passenger;
import com.example.IRCTC.Systemm.repository.PassengerRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepostiory passengerRepostiory;

    public void addPassenger(Passenger passenger) {

        passengerRepostiory.save(passenger);
    }

    public int getPassengerCountBetweenTwoCities(String source, String destination, Date date) {

        List<Passenger> passengers = passengerRepostiory.findByTrain_SourceAndTrain_DestinationAndDate(source, destination, date);

//        for(Passenger passenger : passengers) {
//
//            if (passenger.)
//        }
        return passengers.size();
    }

    public int getFemalePassengersFromAgeXtoY(String dest, int ageFrom, int ageTo) {

        List<Passenger> femalePassenger = passengerRepostiory.findByTrain_DestinationAndAgeBetweenAndGender(dest, ageFrom, ageTo, "FEMALE");

        return femalePassenger.size();
    }
}
