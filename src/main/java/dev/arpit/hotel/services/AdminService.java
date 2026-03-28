package dev.arpit.hotel.services;

import dev.arpit.hotel.dtos.ResponseCode;
import dev.arpit.hotel.exceptions.InvalidAdminIdException;
import dev.arpit.hotel.exceptions.UnAuthorizedAccessException;
import dev.arpit.hotel.models.Admin;
import dev.arpit.hotel.models.Room;
import dev.arpit.hotel.models.RoomType;
import dev.arpit.hotel.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService {
  @Autowired
  private AdminRepository adminRepository;

  @Override
  public Admin findById(long adminId) throws InvalidAdminIdException {
    return adminRepository
        .findById(adminId)
        .orElseThrow(() ->
            new InvalidAdminIdException(
                ResponseCode.HOTEL_FAILURE_400,
                "invalid admin id",
                "Invalid admin id"
            )
        );
  }
}
