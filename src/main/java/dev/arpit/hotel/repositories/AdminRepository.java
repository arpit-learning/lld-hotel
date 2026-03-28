package dev.arpit.hotel.repositories;

import dev.arpit.hotel.models.Admin;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<@NonNull Admin, @NonNull Long> {
}
