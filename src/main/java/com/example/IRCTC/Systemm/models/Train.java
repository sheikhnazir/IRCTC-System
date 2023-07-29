package com.example.IRCTC.Systemm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer trainId;

    private String Source;

    private String Destination;

    @OneToMany(mappedBy = "Train", cascade = CascadeType.ALL)
    private FoodOrder foodOrder;
}



//Train = TrainId, Source, Destination
//        Passenger = TicketId, TrainId, Date, Age, Gender
//        FoodOrder = TicketId, TrainId, Price