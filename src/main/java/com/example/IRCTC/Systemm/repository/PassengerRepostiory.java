package com.example.IRCTC.Systemm.repository;

import com.example.IRCTC.Systemm.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PassengerRepostiory extends JpaRepository<Passenger, Integer> {
    List<Passenger> findByTrain_SourceAndTrain_DestinationAndDate(String source, String destination, Date date);

    List<Passenger> findByTrain_DestinationAndAgeBetweenAndGender(String destination, int ageFrom, int ageTo, String gender);

}
