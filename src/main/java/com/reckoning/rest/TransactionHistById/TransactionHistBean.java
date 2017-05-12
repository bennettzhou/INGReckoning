package com.reckoning.rest.TransactionHistById;

import com.reckoning.rest.INGConstant;

public class TransactionHistBean {
    private String TransactionId;
    private String MyAccount;
    private String MyBank;
    private String MyAccountNumber;
    private String ToAccount;
    private String ToBank;
    private String ToAccountNumber;
    private String Amount;
    private String currency;

    private String type;
    private String description;
    private String completedDateTime;
    private String newBalance;
    private String balanceCcy;

    public TransactionHistBean(Transactions tranx){
        TransactionId = tranx.getId();
        MyAccount=tranx.getAccount().getId();
        MyBank=tranx.getAccount().getBank().getName();
        MyAccountNumber=tranx.getAccount().getNumber();
        ToAccount=tranx.getCounterparty().getHolder().getName() + (INGConstant.getInstance().getAccountMap()
                .get(tranx.getCounterparty().getNumber())==null?"":"(id="+INGConstant.getInstance().getAccountMap().get(tranx.getCounterparty().getNumber())+")");
        ToBank=tranx.getCounterparty().getBank().getName();
        ToAccountNumber=tranx.getCounterparty().getNumber();
        Amount=tranx.getDetails().getValue().getAmount();
        currency=tranx.getDetails().getValue().getCurrency();

        completedDateTime=tranx.getDetails().getCompleted();
        type=tranx.getDetails().getType();
        description=tranx.getDetails().getDescription();
        newBalance=tranx.getDetails().getNew_balance().getAmount();
        balanceCcy=tranx.getDetails().getNew_balance().getCurrency();
    }

    public String getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(String transactionId) {
        TransactionId = transactionId;
    }

    public String getMyAccount() {
        return MyAccount;
    }

    public void setMyAccount(String myAccount) {
        MyAccount = myAccount;
    }

    public String getMyBank() {
        return MyBank;
    }

    public void setMyBank(String myBank) {
        MyBank = myBank;
    }

    public String getMyAccountNumber() {
        return MyAccountNumber;
    }

    public void setMyAccountNumber(String myAccountNumber) {
        MyAccountNumber = myAccountNumber;
    }

    public String getToAccount() {
        return ToAccount;
    }

    public void setToAccount(String toAccount) {
        ToAccount = toAccount;
    }

    public String getToBank() {
        return ToBank;
    }

    public void setToBank(String toBank) {
        ToBank = toBank;
    }

    public String getToAccountNumber() {
        return ToAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        ToAccountNumber = toAccountNumber;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompletedDateTime() {
        return completedDateTime;
    }

    public void setCompletedDateTime(String completedDateTime) {
        this.completedDateTime = completedDateTime;
    }

    public String getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(String newBalance) {
        this.newBalance = newBalance;
    }

    public String getBalanceCcy() {
        return balanceCcy;
    }

    public void setBalanceCcy(String balanceCcy) {
        this.balanceCcy = balanceCcy;
    }
}
