package proyecto.PaymentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.PaymentService.Entity.Payment;

import java.util.UUID;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
