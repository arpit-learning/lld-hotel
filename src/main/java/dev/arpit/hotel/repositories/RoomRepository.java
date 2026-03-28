package dev.arpit.hotel.repositories;

import dev.arpit.hotel.models.Room;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<@NonNull Room, @NonNull Long> {
}
