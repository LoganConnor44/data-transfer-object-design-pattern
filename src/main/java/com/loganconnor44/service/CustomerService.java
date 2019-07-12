package com.loganconnor44.service;

import com.loganconnor44.dao.ICustomerDAO;
import com.loganconnor44.domain.CustomerDTO;
import com.loganconnor44.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerDAO customerDAO;

    @Override
    public synchronized boolean saveCustomer(Customer customer) {
        this.customerDAO.saveCustomer(customer);
        return true;
    }

    @Override
    public CustomerDTO getCustomerById(int customerId) {
        return this.customerDAO.getCustomerById(customerId);
    }

}