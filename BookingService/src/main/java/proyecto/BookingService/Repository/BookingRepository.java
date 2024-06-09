package proyecto.BookingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.BookingService.Entidades.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {



}
