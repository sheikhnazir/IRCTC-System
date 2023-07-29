package com.example.IRCTC.Systemm.services;

import com.example.IRCTC.Systemm.models.Train;
import com.example.IRCTC.Systemm.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class TrainService {

    @Autowired
    TrainRepository trainRepository;

    @PostMapping("/add")
    public void addTrain(Train train) {

        trainRepository.save(train);
    }
}
