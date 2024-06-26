package proyecto.PaymentService.Controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proyecto.PaymentService.Entity.Payment;
import proyecto.PaymentService.Service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }

    @PostMapping
    public ResponseEntity<Payment> processPayment(@RequestBody Payment payment){
        Payment paymentVerdadero = paymentService.createPayment(payment);
        return ResponseEntity.ok(paymentVerdadero);
    }

    @GetMapping("/{id}")
    public Optional<ResponseEntity<Payment>> findById(@PathVariable("id") Long id){
        return paymentService.getPaymentById(id).map(pagoVerdadero -> ResponseEntity.ok().body(pagoVerdadero));
    }

}
