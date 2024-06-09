package proyecto.BookingService.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.BookingService.Entidades.Booking;
import proyecto.BookingService.Models.Car;
import proyecto.BookingService.Service.BookingService;

import java.util.Optional;

@RestController
@RequestMapping("/booking")
public class BookingController {


    private BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking){
        Booking nuevoBooking = bookingService.createBooking(booking);
        return ResponseEntity.ok(nuevoBooking);
    }


    @GetMapping("/{id}")
    public Optional<ResponseEntity<Booking>> getBookingById(@PathVariable("id") Long id){
        return bookingService.findById(id).map(bookingVerdadero -> ResponseEntity.ok().body(bookingVerdadero));

    }

    /*Metodo para guardar un carro desde el micro servicio de booking */
    @PostMapping("/carro/{bookingId}")
    public ResponseEntity<Car> saveCar(@PathVariable("bookingId") Long bookingId, @RequestBody Car carro){
        Car nuevoCarro = bookingService.saveCar(bookingId, carro);
        return ResponseEntity.ok(nuevoCarro);
    }
    
}
