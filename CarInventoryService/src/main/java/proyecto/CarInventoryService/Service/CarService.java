package proyecto.CarInventoryService.Service;

import proyecto.CarInventoryService.Entidades.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> listAvailableCars();
    Car createCar(Car car);
    Optional<Car> findCarById(Long id);

}
