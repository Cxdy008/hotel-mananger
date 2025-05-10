package com.hotelmananger.models;

import lombok.Data;

import java.util.UUID;

@Data
//@Entity
public class Reserve {
    UUID uuid;
    private String entry;
    private String departureDate;
    private Room room;
}
