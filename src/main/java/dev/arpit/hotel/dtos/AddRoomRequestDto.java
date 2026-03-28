package dev.arpit.hotel.dtos;

import lombok.Data;

@Data
public class AddRoomRequestDto {
    private long adminId;
    private String name;
    private double price;
    private String roomType;
    private String description;
}
