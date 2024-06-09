package proyecto.BookingService.Models;




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

    private Long bookingId;
    
}
