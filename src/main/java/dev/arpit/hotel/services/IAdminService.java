package dev.arpit.hotel.services;

import dev.arpit.hotel.exceptions.InvalidAdminIdException;
import dev.arpit.hotel.models.Admin;

public interface IAdminService {
    Admin findById(long adminId) throws InvalidAdminIdException;
}
