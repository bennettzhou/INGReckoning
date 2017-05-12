package com.reckoning.rest.TransactionHistById;

public class Details
{
    private New_balance new_balance;

    private String description;

    private Value value;

    private String type;

    private String posted;

    private String completed;

    public New_balance getNew_balance ()
    {
        return new_balance;
    }

    public void setNew_balance (New_balance new_balance)
    {
        this.new_balance = new_balance;
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

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getPosted ()
    {
        return posted;
    }

    public void setPosted (String posted)
    {
        this.posted = posted;
    }

    public String getCompleted ()
    {
        return completed;
    }

    public void setCompleted (String completed)
    {
        this.completed = completed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [new_balance = "+new_balance+", description = "+description+", value = "+value+", type = "+type+", posted = "+posted+", completed = "+completed+"]";
    }
}