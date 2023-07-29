package com.example.IRCTC.Systemm.services;

import com.example.IRCTC.Systemm.models.FoodOrder;
import com.example.IRCTC.Systemm.models.Train;
import com.example.IRCTC.Systemm.repository.FoodRepository;
import com.example.IRCTC.Systemm.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepository;

    @Autowired
    TrainRepository trainRepository;

    public int getTotalPriceForTrainOnParticularDate(Integer trainId, Date date) {

        List<FoodOrder> foodOrderList = foodRepository.findByTrain_TrainIdAndDate(trainId, date);

        int totalFoodAmount = 0;
        for (FoodOrder foodOrder : foodOrderList) {
            totalFoodAmount += foodOrder.getPrice();
        }

        return totalFoodAmount;
    }
}
