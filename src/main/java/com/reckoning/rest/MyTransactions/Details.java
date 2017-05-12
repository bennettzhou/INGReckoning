package com.reckoning.rest.MyTransactions;

public class Details
{
    private To to;

    private String description;

    private Value value;

    public To getTo ()
    {
        return to;
    }

    public void setTo (To to)
    {
        this.to = to;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public Value getValue ()
    {
        return value;
    }

    public void setValue (Value value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [to = "+to+", description = "+description+", value = "+value+"]";
    }
}