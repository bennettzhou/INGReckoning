package com.reckoning.rest.OBPObjects;

public class ResponseAccountById {
    private String bank_id;
    private String bank_fullname;
    private String bank_shortname;
    private String id;
    private String number;
    private String amount;
    private String currency;
    private String displayname;

    public String getBank_shortname() {
        return bank_shortname;
    }

    public void setBank_shortname(String bank_shortname) {
        this.bank_shortname = bank_shortname;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
}
