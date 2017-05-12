package com.reckoning.rest.MyTransactions;

public class MyTransactions
{
    private String id;

    private String end_date;

    private Charge charge;

    private String challenge;

    private Details details;

    private String status;

    private String[] transaction_ids;

    private From from;

    private String type;

    private String start_date;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEnd_date ()
    {
        return end_date;
    }

    public void setEnd_date (String end_date)
    {
        this.end_date = end_date;
    }

    public Charge getCharge ()
    {
        return charge;
    }

    public void setCharge (Charge charge)
    {
        this.charge = charge;
    }

    public String getChallenge ()
{
    return challenge;
}

    public void setChallenge (String challenge)
    {
        this.challenge = challenge;
    }

    public Details getDetails ()
    {
        return details;
    }

    public void setDetails (Details details)
    {
        this.details = details;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String[] getTransaction_ids ()
    {
        return transaction_ids;
    }

    public void setTransaction_ids (String[] transaction_ids)
    {
        this.transaction_ids = transaction_ids;
    }

    public From getFrom ()
    {
        return from;
    }

    public void setFrom (From from)
    {
        this.from = from;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getStart_date ()
    {
        return start_date;
    }

    public void setStart_date (String start_date)
    {
        this.start_date = start_date;
    }

    @Override
    public String toString()
    {
        return "MyTransactions [id = "+id+", end_date = "+end_date+", charge = "+charge+", challenge = "+challenge+", details = "+details+", status = "+status+", transaction_ids = "+transaction_ids+", from = "+from+", type = "+type+", start_date = "+start_date+"]";
    }
}
