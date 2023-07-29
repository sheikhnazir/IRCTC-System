package com.example.IRCTC.Systemm.controllers;

import com.example.IRCTC.Systemm.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    FoodService foodService;

    public int getTotalPriceForTrainOnParticularDate(@RequestBody Integer trainId, Date date) {

        return foodService.getTotalPriceForTrainOnParticularDate(trainId, date);
    }
}
