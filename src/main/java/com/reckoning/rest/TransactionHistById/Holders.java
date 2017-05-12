package com.reckoning.rest.TransactionHistById;

public class Holders
{
    private String is_alias;

    private String name;

    public String getIs_alias ()
    {
        return is_alias;
    }

    public void setIs_alias (String is_alias)
    {
        this.is_alias = is_alias;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [is_alias = "+is_alias+", name = "+name+"]";
    }
}