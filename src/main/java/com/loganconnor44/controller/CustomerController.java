package com.loganconnor44.controller;

import com.loganconnor44.business.ICustomerBO;
import com.loganconnor44.dao.ICustomerDAO;
import com.loganconnor44.domain.CustomerDTO;
import com.loganconnor44.entity.Customer;
import com.loganconnor44.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/dto/customer")
public class CustomerController {

    @Autowired
    private ICustomerBO customerBO;

    @Autowired
    private ICustomerService customerService;

    @PostMapping()
    public ResponseEntity<Void> saveNewCustomer(@RequestBody Customer customer, UriComponentsBuilder builder) {
        this.customerBO.saveNewCustomer(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/{id}").buildAndExpand(12345).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("customerId") Integer customerId) {
        CustomerDTO customer = this.customerService.getCustomerById(customerId);
        return new ResponseEntity<CustomerDTO>(customer, HttpStatus.OK);
    }
}
