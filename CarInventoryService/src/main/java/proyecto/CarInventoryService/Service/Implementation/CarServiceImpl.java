package proyecto.CarInventoryService.Service.Implementation;

import org.springframework.stereotype.Service;
import proyecto.CarInventoryService.Entidades.Car;
import proyecto.CarInventoryService.Repository.CarRepository;
import proyecto.CarInventoryService.Service.CarService;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    @Override
    public List<Car> listAvailableCars() {
        return carRepository.findAllCarAvailable();
    }

    @Override
    public Car createCar(Car car) {
        Car carCopy = new Car();
        carCopy.setModelo(car.getModelo());
        carCopy.setMarca(car.getMarca());
        carCopy.setDisponibilidad(car.getDisponibilidad());
        return carRepository.save(carCopy);
    }

    @Override
    public Optional<Car> findCarById(Long id) {
        return carRepository.findById(id);
    }
}
