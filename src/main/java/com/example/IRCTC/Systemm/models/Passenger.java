package com.example.IRCTC.Systemm.models;

import com.example.IRCTC.Systemm.Enums.Gender;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private Integer ticketId;

    private Data date;

    private Integer age;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;



}