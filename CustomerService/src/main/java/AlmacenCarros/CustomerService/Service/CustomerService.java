package AlmacenCarros.CustomerService.Service;

import AlmacenCarros.CustomerService.Entity.Customer;

public interface CustomerService {
    
    Customer createCustomer(Customer customer);

    Customer finByname( String name);

    Customer finByEmail(String email);
    

}
