package com.mavenits.bnk;


import com.mavenits.bnk.db.DBConnector;
import com.mavenits.bnk.model.Customer;
import com.mavenits.bnk.model.Transactions;
import com.mavenits.bnk.services.CreateCustomer;
import com.mavenits.bnk.services.CreateTransactions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Properties;

public class Application {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream(String.valueOf(new URL("/Users/maheshreddy/Desktop/" +
                "/bnk/src/com/mavenits/bnkkjghjkg/security.properites")));
        properties.load(fs);


        String authID = properties.get("authid").toString();
        if (!authID.equals("dsjhflke4984lkdfsvdf")) {
            throw new RuntimeException("Unauthosized access .");
        }

        //Accounts
        new CreateCustomer().create();
        String dob = "29-06-1982";
        String lastname = "Garla";

        DBConnector db = new DBConnector();

        List<Customer> resultsSet =
                db.getCustomer(dob, lastname);

        if (resultsSet.size() == 0) {
            throw new RuntimeException("No Customer found with details. " + dob + lastname);
        }
//       db.deleteCustomer(lastname);


        //Transactions
        CreateTransactions transactions = new CreateTransactions();
        transactions.create();
        transactions.isAccountExists(db);
        transactions.isUserGotEnoughMoney();

        db.save(transactions);
        System.out.println();
    }
}
