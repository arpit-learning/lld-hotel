package dev.arpit.hotel.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomResponseDto {
  private long id;
  private String name;
  private String description;
  private double price;
  private String roomType;
}
