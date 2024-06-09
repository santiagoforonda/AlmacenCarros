package proyecto.PaymentService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.PaymentService.Entity.Payment;



@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
