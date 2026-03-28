package dev.arpit.hotel.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity(name = "hotel_admin")
public class Admin extends User {
}
