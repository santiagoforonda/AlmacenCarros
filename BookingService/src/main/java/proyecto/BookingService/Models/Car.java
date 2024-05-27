package proyecto.BookingService.Models;



import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String modelo;

    private String marca;

    private String available;

    private UUID bookingId;
    
}
