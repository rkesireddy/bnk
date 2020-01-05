package com.mavenits.bnk.services;

import com.mavenits.bnk.db.DBConnector;
import com.mavenits.bnk.model.Customer;

import java.time.LocalDate;

public class CreateCustomer {


    public void create() {
        // read data from customer
        Customer customer1 = new Customer();
        customer1.setFirstName("ayyappa");
        customer1.setLastName("Garla");
        customer1.setDob("29-06-1982");
        customer1.setId(1L);
        customer1.setPostcode("E61JG");
        customer1.setCreateDated(LocalDate.now().minusDays(20));

        // read data from customer
        Customer customer2 = new Customer();
        customer2.setFirstName("rk");
        customer2.setLastName("redd");
        customer2.setDob("29-06-1982");
        customer2.setId(2L);
        customer2.setPostcode("E61JG");
        customer2.setCreateDated(LocalDate.now());

        //Customer1 store in db (cusomterstore)

        DBConnector db = new DBConnector();
        db.save(customer1);
        db.save(customer2);
    }
}

























