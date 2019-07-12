package com.loganconnor44.service;

import com.loganconnor44.domain.CustomerDTO;
import com.loganconnor44.entity.Customer;

public interface ICustomerService {
    boolean saveCustomer(Customer customer);
    CustomerDTO getCustomerById(int customerId);
}