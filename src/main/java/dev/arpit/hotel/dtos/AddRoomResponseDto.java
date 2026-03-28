package dev.arpit.hotel.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddRoomResponseDto {
    private RoomResponseDto room;
}
