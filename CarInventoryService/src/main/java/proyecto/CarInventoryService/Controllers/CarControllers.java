package proyecto.CarInventoryService.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.CarInventoryService.Entidades.Car;
import proyecto.CarInventoryService.Service.CarService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarControllers {


    private CarService carService;

    public CarControllers(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<Car>> listCarAvailable(){
        List<Car> carros = carService.listAvailableCars();
        if(carros.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(carros);
    }

    @PostMapping
    public ResponseEntity<Car> reservarCar(@RequestBody Car car){
        Car nuevoCar = carService.createCar(car);
        return ResponseEntity.ok(nuevoCar);
    }

    @GetMapping("/{id}")
    public Optional<ResponseEntity<Car>> finCarById(@PathVariable("id") Long id){
        return carService.findCarById(id).map(carVerdadero -> ResponseEntity.ok().body(carVerdadero));
    }

}
