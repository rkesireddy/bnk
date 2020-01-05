package com.mavenits.bnk.db;

import com.mavenits.bnk.model.Customer;
import com.mavenits.bnk.model.Transactions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DBConnector {

    public static List<Customer> customerStore = new ArrayList<>();

    public static List<Transactions> transactionStore = new ArrayList<>();



    public void save(Customer customer) {
        customerStore.add(customer);
    }

    public void save(Transactions transactions) {
        transactionStore.add(transactions);
    }

    public List<Customer> getCustomer(String dob, String lastname) {
        return customerStore.stream()
                .filter(birth -> birth.getDob().equalsIgnoreCase(dob))
                .filter(last -> last.getLastName().equalsIgnoreCase(lastname))
                .collect(Collectors.toList());

    }

//    public void deleteCustomer(Long id) {
//        customerStore.stream().filter(ids -> ids.getId().equals(id)).collect(Collectors.toList());
//        customerStore.remove(0);
//    }

    public List<Customer> getCustomer(String accountHolderName) {
        return customerStore.stream()
                .filter(last -> last.getLastName().equalsIgnoreCase(accountHolderName))
                .collect(Collectors.toList());
    }
}
