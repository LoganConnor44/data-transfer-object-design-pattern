package com.loganconnor44.dao;

import com.loganconnor44.domain.CustomerDTO;
import com.loganconnor44.entity.Customer;

public interface ICustomerDAO {
    void saveCustomer(Customer customer);
    CustomerDTO getCustomerById(int customerId);
}
