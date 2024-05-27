package proyecto.PaymentService.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    private UUID id;

    private UUID bookingId;

    private String creditCard;

    private double amount;

    private UUID transactionId;

    private Status status;
}
