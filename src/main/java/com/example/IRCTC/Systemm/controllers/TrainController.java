package com.example.IRCTC.Systemm.controllers;

import com.example.IRCTC.Systemm.models.Train;
import com.example.IRCTC.Systemm.services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/train")
public class TrainController {

    @Autowired
    TrainService trainService;

    public void addTrain(@RequestBody Train train) {

       trainService.addTrain(train);
    }

}
