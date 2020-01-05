package com.mavenits.bnk.services;

import com.mavenits.bnk.db.DBConnector;
import com.mavenits.bnk.model.Customer;
import com.mavenits.bnk.model.Transactions;

import java.time.LocalDate;
import java.util.List;

public class CreateTransactions {
    DBConnector dbConnector = new DBConnector();
    Transactions tx1 = new Transactions();


    // do transactions

    //debit sender by sender amount

    // credit rece by revi amount


    public void create() {

        tx1.setAccountHolderName("Garla");
        tx1.setRefer("just like that, i have extra");
        tx1.setTxAmount(100.00);
        tx1.setTxDateTime(LocalDate.now());

        //bene details
        tx1.setAccountNumber("222222222");
        tx1.setSortCode("22-22-22");
        tx1.setBenefierName("redd");

    }

    public boolean isAccountExists(DBConnector dbConnector) {
        //verify both account exists
        int cust1 = dbConnector.getCustomer("Garla").size();
        int cust2 = dbConnector.getCustomer("redjd").size();
        if (cust1 == 0) {
            throw new RuntimeException("Cust 1 is not existed.");
        }
        if (cust2 == 0) {
            throw new RuntimeException("Cust 2 is not existed.");

        }
        return true;
    }

    public void isUserGotEnoughMoney() {

        List<Customer> results = dbConnector.getCustomer("Garla");
        boolean enoughAmount = tx1.getTxAmount() <= results.get(0).getBalance();
        if (!enoughAmount) {
            throw new RuntimeException("No enough money for transactions. ");
        }
    }


}
