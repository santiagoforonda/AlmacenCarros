package AlmacenCarros.CustomerService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import AlmacenCarros.CustomerService.Entity.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long>{
    
    Customer findByName(String name);

    Customer findByEmail(String email);

}
