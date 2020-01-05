package com.mavenits.bnk.db;

import com.mavenits.bnk.model.Customer;
import com.mavenits.bnk.model.Transactions;
import com.mavenits.bnk.services.CreateTransactions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DBConnector {

    public static List<Customer> customerStore = new ArrayList<>();

    public static List<CreateTransactions> transactionStore = new ArrayList<>();


    public void save(Customer customer) {
        customerStore.add(customer);
    }

    public void save(CreateTransactions transactions) {
        transactionStore.add(transactions);
    }

    public List<Customer> getCustomer(String dob, String lastname) {
        return customerStore.stream()
                .filter(birth -> birth.getDob().equalsIgnoreCase(dob))
                .filter(last -> last.getLastName().equalsIgnoreCase(lastname))
                .collect(Collectors.toList());

    }

    public void deleteCustomer(String lastname) {
        customerStore.stream().filter(s -> s.getLastName().equalsIgnoreCase(lastname)).collect(Collectors.toList());
        customerStore.remove(0);
    }

    public List<Customer> getCustomer(String lastName) {
        return customerStore.stream()
                .filter(last -> last.getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());
    }
}
