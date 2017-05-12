package com.reckoning.rest.MyTransactions;

public class ResponseMyTransactions {

    private String transaction_ids;
    private String bank_id;
    private String bank_fullname;
    private String bank_shortname;
    private String account_id;
    private String status;
    private String start_date;
    private String end_date;
    private String balance;
    private String currency;

    public String getTransaction_ids() {
        return transaction_ids;
    }

    public void setTransaction_ids(String transaction_ids) {
        this.transaction_ids = transaction_ids;
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_fullname() {
        return bank_fullname;
    }

    public void setBank_fullname(String bank_fullname) {
        this.bank_fullname = bank_fullname;
    }

    public String getBank_shortname() {
        return bank_shortname;
    }

    public void setBank_shortname(String bank_shortname) {
        this.bank_shortname = bank_shortname;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
