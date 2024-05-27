package proyecto.BookingService.Service;


import proyecto.BookingService.Entidades.Booking;
import proyecto.BookingService.Models.Car;

import java.util.Optional;
import java.util.UUID;

public interface BookingService {

    Booking createBooking(Booking booking);
    Optional<Booking> findById(UUID id);
    Car saveCar(UUID bookingid, Car carro);
}
