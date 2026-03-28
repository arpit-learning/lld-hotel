package dev.arpit.hotel.services;

import dev.arpit.hotel.exceptions.UnAuthorizedAccessException;
import dev.arpit.hotel.models.Admin;
import dev.arpit.hotel.models.Room;

public interface IRoomService {
    Room addRoom(Admin admin, String roomName, double price, String roomType, String description) throws UnAuthorizedAccessException;
}
