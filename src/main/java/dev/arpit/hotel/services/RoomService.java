package dev.arpit.hotel.services;

import dev.arpit.hotel.dtos.ResponseCode;
import dev.arpit.hotel.exceptions.UnAuthorizedAccessException;
import dev.arpit.hotel.models.Admin;
import dev.arpit.hotel.models.Room;
import dev.arpit.hotel.models.RoomType;
import dev.arpit.hotel.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService implements IRoomService {
  @Autowired
  private RoomRepository roomRepository;

  @Override
  public Room addRoom(Admin admin, String roomName, double price, String roomType, String description) throws UnAuthorizedAccessException {
    if(admin == null) {
      throw new UnAuthorizedAccessException(
          ResponseCode.HOTEL_FAILURE_400,
          "Only admin can add rooms",
          "Unauthorized access"
      );
    }

    Room room = new Room(
        roomName,
        description,
        price,
        RoomType.valueOf(roomType)
    );

    return roomRepository.save(room);
  }
}
