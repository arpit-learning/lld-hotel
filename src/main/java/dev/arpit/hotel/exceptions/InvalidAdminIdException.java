package dev.arpit.hotel.exceptions;

import dev.arpit.hotel.dtos.ResponseCode;

public class InvalidAdminIdException extends BaseException {
  public InvalidAdminIdException (ResponseCode code, String message, String displayMessage) {
    super(code, message, displayMessage);
  }
}
