package com.reckoning.rest.MyTransactions;

public class To
{
    private String bank_id;

    private String account_id;

    public String getBank_id ()
    {
        return bank_id;
    }

    public void setBank_id (String bank_id)
    {
        this.bank_id = bank_id;
    }

    public String getAccount_id ()
    {
        return account_id;
    }

    public void setAccount_id (String account_id)
    {
        this.account_id = account_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [bank_id = "+bank_id+", account_id = "+account_id+"]";
    }
}
