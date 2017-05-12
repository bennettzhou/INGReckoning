package com.reckoning.rest.TransactionHistById;

public class Transactions
{
    private String id;

    private Details details;

    private Account account;

    private Counterparty counterparty;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Details getDetails ()
    {
        return details;
    }

    public void setDetails (Details details)
    {
        this.details = details;
    }

    public Account getAccount ()
    {
        return account;
    }

    public void setAccount (Account account)
    {
        this.account = account;
    }

    public Counterparty getCounterparty ()
    {
        return counterparty;
    }

    public void setCounterparty (Counterparty counterparty)
    {
        this.counterparty = counterparty;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", details = "+details+", account = "+account+", counterparty = "+counterparty+"]";
    }
}