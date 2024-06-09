package proyecto.PaymentService.Service;

import proyecto.PaymentService.Entity.Payment;

import java.util.Optional;

public interface PaymentService {
    Payment createPayment(Payment payment);

    Optional<Payment> getPaymentById(Long id);

}
