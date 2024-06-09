package proyecto.BookingService.Service.BookingServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.BookingService.Entidades.Booking;
import proyecto.BookingService.FeignClients.CarFeignClient;
import proyecto.BookingService.Models.Car;
import proyecto.BookingService.Repository.BookingRepository;
import proyecto.BookingService.Service.BookingService;

import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {


    private final BookingRepository bookingRepository;

    @Autowired
    private CarFeignClient carroFeign;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking createBooking(Booking booking) {
        Booking bookingCopy = new Booking();
        bookingCopy.setCarId(booking.getCarId());
        bookingCopy.setCustomerId(booking.getCustomerId());
        bookingCopy.setStatus(booking.getStatus());
        bookingCopy.setStarDate(booking.getStarDate());
        bookingCopy.setEndDate(booking.getEndDate());
        return bookingRepository.save(bookingCopy);
    }

    @Override
    public Optional<Booking> findById(Long id) {
        return bookingRepository.findById(id);
    }

    @Override
    public Car saveCar(Long bookingId,Car carro) {
        carro.setBookingId(bookingId);
        Car nuevoCarro = carroFeign.save(carro); 
        return nuevoCarro;
    }
}
