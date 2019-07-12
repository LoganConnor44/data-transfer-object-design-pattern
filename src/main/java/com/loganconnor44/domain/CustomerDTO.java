package com.loganconnor44.domain;

import com.loganconnor44.entity.Customer;

public class CustomerDTO {
    private final String firstName;
    private final String lastName;
    private final String email;

    /**
     * @param firstName customer first name
     * @param lastName  customer last name
     */
    public CustomerDTO(Customer customer) {
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
        this.email = customer.getEmail();
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
