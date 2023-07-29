package com.example.IRCTC.Systemm.repository;

import com.example.IRCTC.Systemm.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
}
