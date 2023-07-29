package com.example.IRCTC.Systemm.repository;

import com.example.IRCTC.Systemm.models.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<FoodOrder, Integer> {


    List<FoodOrder> findByTrain_TrainIdAndDate(Integer trainId, Date date);

}
