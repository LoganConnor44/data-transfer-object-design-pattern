package com.loganconnor44.entity;

import java.time.Instant;
import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    /**
     * A unique identifier for a customer.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", nullable = false)
    private Integer id;

    /**
     * The first name of the customer.
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /**
     * The last name of the customer.
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * The email of the customer.
     */
    @Column(length = 2000)
    private String email;

    /**
     * A time stamp of the last time this object was modified.
     */
    @Column(name = "last_modified", nullable = false)
    private Instant lastModified;

    /**
     * The time stamp of the creation of this object.
     */
    @Column(name = "created", nullable = false)
    private Instant created;

    public Customer() {
        this.lastModified = Instant.now();
        this.created = Instant.now();
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