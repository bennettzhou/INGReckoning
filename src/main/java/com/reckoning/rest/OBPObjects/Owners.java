package com.reckoning.rest.OBPObjects;

public class Owners
{
    private String id;

    private String display_name;

    private String provider;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDisplay_name ()
    {
        return display_name;
    }

    public void setDisplay_name (String display_name)
    {
        this.display_name = display_name;
    }

    public String getProvider ()
{
    return provider;
}

    public void setProvider (String provider)
    {
        this.provider = provider;
    }

    @Override
    public String toString()
    {
        return " [id = "+id+", display_name = "+display_name+", provider = "+provider+"]";
    }
}
