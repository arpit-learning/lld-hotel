package dev.arpit.hotel.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity(name = "hotel_customer")
public class Customer extends User {
}
