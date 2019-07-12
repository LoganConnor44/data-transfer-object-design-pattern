package com.loganconnor44.business;

import com.loganconnor44.domain.CustomerDTO;
import com.loganconnor44.entity.Customer;
import com.loganconnor44.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Calendar;

@Component
public class CustomerBO implements ICustomerBO {

    @Autowired
    private CustomerService customerService;

    @Override
    public void saveNewCustomer(Customer customer){
        //this is where we would do business logic if we had any
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            this.customerService.saveCustomer(customer);
        }
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("customerId") Integer customerId) {
        CustomerDTO customer = customerService.getCustomerById(customerId);
        return new ResponseEntity<CustomerDTO>(customer, HttpStatus.OK);
    }
}
