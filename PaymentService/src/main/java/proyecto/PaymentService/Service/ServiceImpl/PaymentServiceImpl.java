package proyecto.PaymentService.Service.ServiceImpl;

import org.springframework.stereotype.Service;
import proyecto.PaymentService.Entity.Payment;
import proyecto.PaymentService.Repository.PaymentRepo;
import proyecto.PaymentService.Service.PaymentService;

import java.util.Optional;
import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {


    private final PaymentRepo paymentRepo;

    public PaymentServiceImpl(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }


    @Override
    public Payment createPayment(Payment payment) {
        Payment paymentCopy = new Payment();
        paymentCopy.setBookingId(payment.getBookingId());
        paymentCopy.setCreditCard(payment.getCreditCard());
        paymentCopy.setAmount(payment.getAmount());
        paymentCopy.setStatus(payment.getStatus());
        paymentCopy.setTransactionId(payment.getTransactionId());
        return paymentRepo.save(paymentCopy);
    }

    @Override
    public Optional<Payment> getPaymentById(UUID id) {
        return paymentRepo.findById(id);
    }
}
