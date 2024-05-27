package AlmacenCarros.CustomerService.Entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    private UUID id;

    private String name;

    private String email;
}
