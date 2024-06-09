package proyecto.BookingService.Service;


import proyecto.BookingService.Entidades.Booking;
import proyecto.BookingService.Models.Car;

import java.util.Optional;

public interface BookingService {

    Booking createBooking(Booking booking);
    Optional<Booking> findById(Long id);
    Car saveCar(Long bookingid, Car carro);
}
