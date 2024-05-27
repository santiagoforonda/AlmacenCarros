package proyecto.BookingService.FeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import proyecto.BookingService.Models.Car;

@FeignClient(name = "booking-service", url ="http://localhost:8002")
@RequestMapping("/booking")
public interface CarFeignClient {
    
    @PostMapping
    public Car save(@RequestBody Car carro);

}
