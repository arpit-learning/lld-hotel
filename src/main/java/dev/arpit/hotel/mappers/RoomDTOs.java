package dev.arpit.hotel.mappers;

import dev.arpit.hotel.dtos.AddRoomResponseDto;
import dev.arpit.hotel.dtos.RoomResponseDto;
import dev.arpit.hotel.models.Room;

public class RoomDTOs {
  public static AddRoomResponseDto getAddRoomResponseDto(Room room) {
    return new AddRoomResponseDto(
        RoomDTOs.getRoomResponseDto(room)
    );
  }

  public static RoomResponseDto getRoomResponseDto(Room room) {
    return new RoomResponseDto(
        room.getId(),
        room.getName(),
        room.getDescription(),
        room.getPrice(),
        room.getRoomType().toString()
    );
  }
}
