package com.hotelmananger;

import jakarta.persistence.Entity;
import lombok.Data;

//@Entity
@Data
public class Room {
    private String roomNumber;
    private String roomType;
    private boolean roomAvailable;
}
