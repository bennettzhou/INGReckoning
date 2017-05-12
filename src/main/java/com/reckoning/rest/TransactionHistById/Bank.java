package com.reckoning.rest.TransactionHistById;

public class Bank
{
    private String name;

    private String national_identifier;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getNational_identifier ()
    {
        return national_identifier;
    }

    public void setNational_identifier (String national_identifier)
    {
        this.national_identifier = national_identifier;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", national_identifier = "+national_identifier+"]";
    }
}