package AlmacenCarros.CustomerService.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import AlmacenCarros.CustomerService.Entity.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, UUID>{
    
    Customer findByName(String name);

    Customer findByEmail(String email);

}
