package com.loganconnor44.dao;

import com.loganconnor44.domain.CustomerDTO;
import com.loganconnor44.entity.Customer;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@Repository
public class CustomerDAO implements ICustomerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Instructs the entity manager to persist the data of the given customer.
     *
     * @param customer The customer to persist.
     */
    @Override
    public void saveCustomer(Customer customer) {
        this.entityManager.persist(customer);
    }

    /**
     * Retrieves the customer from a given id.
     *
     * @param customerId The id of a customer.
     * @return Customer
     */
    @Override
    public CustomerDTO getCustomerById(int customerId) {
        Customer customer = this.entityManager.find(Customer.class, customerId);
        CustomerDTO customerDTO = new CustomerDTO(customer);
        return customerDTO;
    }

}