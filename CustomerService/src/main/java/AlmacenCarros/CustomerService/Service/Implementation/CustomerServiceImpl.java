package AlmacenCarros.CustomerService.Service.Implementation;

import org.springframework.stereotype.Service;

import AlmacenCarros.CustomerService.Entity.Customer;
import AlmacenCarros.CustomerService.Repository.CustomerRepository;
import AlmacenCarros.CustomerService.Service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {


    private final CustomerRepository customerRepo;

    public CustomerServiceImpl(CustomerRepository customerRepo){
        this.customerRepo=customerRepo;
    }
    @Override
    public Customer createCustomer(Customer customer) {
        Customer customerCopy = new Customer();
        customerCopy.setName(customer.getName());
        customerCopy.setEmail(customer.getEmail());
        return customerRepo.save(customerCopy);
    }

    @Override
    public Customer finByname(String name) {
        return customerRepo.findByName(name);
    }

    @Override
    public Customer finByEmail(String email) {
        return customerRepo.findByEmail(email);
    }
    
    
}
