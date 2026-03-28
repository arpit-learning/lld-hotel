package dev.arpit.hotel.exceptions;

import dev.arpit.hotel.dtos.ResponseCode;

public class UnAuthorizedAccessException extends BaseException {
  public UnAuthorizedAccessException (ResponseCode code, String message, String displayMessage) {
    super(code, message, displayMessage);
  }
}
