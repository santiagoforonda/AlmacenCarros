package proyecto.CarInventoryService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import proyecto.CarInventoryService.Entidades.Car;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {


    @Query("SELECT car FROM Car car WHERE car.disponibilidad = 'Disponible' ")
    List<Car> findAllCarAvailable();

}
