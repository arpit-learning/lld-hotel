package dev.arpit.hotel.controllers;

import dev.arpit.hotel.dtos.*;
import dev.arpit.hotel.exceptions.BaseException;
import dev.arpit.hotel.mappers.RoomDTOs;
import dev.arpit.hotel.models.Admin;
import dev.arpit.hotel.models.Room;
import dev.arpit.hotel.services.IAdminService;
import dev.arpit.hotel.services.IRoomService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController implements IRoomController {
  @Autowired
  private IAdminService iAdminService;
  @Autowired
  private IRoomService iRoomService;

  @Override
  @PostMapping(Endpoints.v1Rooms)
  public ResponseEntity<@NonNull ResponseDto<AddRoomResponseDto>> addRoom(AddRoomRequestDto requestDto) {
        ResponseDto<AddRoomResponseDto> responseDto = new ResponseDto<>();
        try {
          long adminId = requestDto.getAdminId();
          String name = requestDto.getName();
          double price = requestDto.getPrice();
          String roomType = requestDto.getRoomType();
          String description = requestDto.getDescription();
          Admin admin = iAdminService.findById(adminId);
            Room room = iRoomService.addRoom(admin, name, price, roomType, description);
            responseDto.setData(
                RoomDTOs.getAddRoomResponseDto(room)
            );
            responseDto.setMeta(
                new MetaDataDto(
                    ResponseCode.HOTEL_SUCCESS_200,
                    "Room added successfully",
                    "Room added successfully",
                    null,
                    null
                )
            );

            return ResponseEntity.ok(responseDto);
        } catch (BaseException e) {
            responseDto.setMeta(
                new MetaDataDto(
                    e.getCode(),
                    e.getMessage(),
                    e.getDisplayMessage(),
                    null,
                    null
                )
            );

          ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.badRequest();
          return bodyBuilder.body(responseDto);
        }
    }
}