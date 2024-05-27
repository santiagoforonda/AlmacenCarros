package AlmacenCarros.CustomerService.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import AlmacenCarros.CustomerService.Entity.Customer;
import AlmacenCarros.CustomerService.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    

    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }

    @PostMapping
    public ResponseEntity<Customer> crearCustomer(@RequestBody Customer customer){
        Customer nuevoCustomer = customerService.createCustomer(customer);
        return ResponseEntity.ok(nuevoCustomer);
        
    }


    @GetMapping("/{name}")
    public ResponseEntity<Customer> findByName(@PathVariable("name") String name){
        Customer customer = customerService.finByname(name);
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/{email}")
    public ResponseEntity<Customer> findByEmail(@PathVariable("email") String email){
        Customer customer = customerService.finByEmail(email);
        return ResponseEntity.ok(customer);
    }

}
