package com.loganconnor44.domain;

public class CustomerDTO {
    private final String id;
    private final String firstName;
    private final String lastName;

    /**
     * @param id        customer id
     * @param firstName customer first name
     * @param lastName  customer last name
     */
    public CustomerDTO(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
