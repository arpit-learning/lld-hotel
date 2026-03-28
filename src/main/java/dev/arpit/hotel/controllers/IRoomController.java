package dev.arpit.hotel.controllers;

import dev.arpit.hotel.dtos.AddRoomRequestDto;
import dev.arpit.hotel.dtos.AddRoomResponseDto;
import dev.arpit.hotel.dtos.ResponseDto;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;

public interface IRoomController {
  ResponseEntity<@NonNull ResponseDto<AddRoomResponseDto>> addRoom (AddRoomRequestDto requestDto);
}