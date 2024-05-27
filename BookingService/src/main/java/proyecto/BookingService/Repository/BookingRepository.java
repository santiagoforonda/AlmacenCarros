package proyecto.BookingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.BookingService.Entidades.Booking;

import java.util.UUID;

@Repository
public interface BookingRepository extends JpaRepository<Booking, UUID> {



}
