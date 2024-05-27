package proyecto.PaymentService.Service;

import proyecto.PaymentService.Entity.Payment;

import java.util.Optional;
import java.util.UUID;

public interface PaymentService {
    Payment createPayment(Payment payment);

    Optional<Payment> getPaymentById(UUID id);

}
