package com.reckoning.rest.MyAccounts;

public class MyAccounts
{
    private String bank_id;

    private String id;

    private _links _links;

    private String label;

    public String getBank_id ()
    {
        return bank_id;
    }

    public void setBank_id (String bank_id)
    {
        this.bank_id = bank_id;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public _links get_links ()
    {
        return _links;
    }

    public void set_links (_links _links)
    {
        this._links = _links;
    }

    public String getLabel ()
{
    return label;
}

    public void setLabel (String label)
    {
        this.label = label;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [bank_id = "+bank_id+", id = "+id+", _links = "+_links+", label = "+label+"]";
    }
}
