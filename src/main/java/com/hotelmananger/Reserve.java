package com.hotelmananger;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
