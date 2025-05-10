package com.hotelmananger.models;

import lombok.Data;

//@Entity
@Data
public class Room {
    private String roomNumber;
    private String roomType;
    private boolean roomAvailable;
}
