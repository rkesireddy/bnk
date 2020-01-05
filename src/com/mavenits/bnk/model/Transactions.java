package com.mavenits.bnk.model;

import java.time.LocalDate;

public class Transactions {

    private String accountHolderName;

    private String accountNumber;

    private String sortCode;

    private String benefierName;

    private double txAmount;

    private LocalDate txDateTime;

    private String refer;


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getBenefierName() {
        return benefierName;
    }

    public void setBenefierName(String benefierName) {
        this.benefierName = benefierName;
    }

    public double getTxAmount() {
        return txAmount;
    }

    public void setTxAmount(double txAmount) {
        this.txAmount = txAmount;
    }

    public LocalDate getTxDateTime() {
        return txDateTime;
    }

    public void setTxDateTime(LocalDate txDateTime) {
        this.txDateTime = txDateTime;
    }

    public String getRefer() {
        return refer;
    }

    public void setRefer(String refer) {
        this.refer = refer;
    }
}
