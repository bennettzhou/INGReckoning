package com.reckoning.rest.TransactionHistById;

public class Account
{
    private String id;

    private Holders[] holders;

    private String swift_bic;

    private Bank bank;

    private String number;

    private String IBAN;

    private String kind;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Holders[] getHolders ()
    {
        return holders;
    }

    public void setHolders (Holders[] holders)
    {
        this.holders = holders;
    }

    public String getSwift_bic ()
    {
        return swift_bic;
    }

    public void setSwift_bic (String swift_bic)
    {
        this.swift_bic = swift_bic;
    }

    public Bank getBank ()
    {
        return bank;
    }

    public void setBank (Bank bank)
    {
        this.bank = bank;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getIBAN ()
    {
        return IBAN;
    }

    public void setIBAN (String IBAN)
    {
        this.IBAN = IBAN;
    }

    public String getKind ()
    {
        return kind;
    }

    public void setKind (String kind)
    {
        this.kind = kind;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", holders = "+holders+", swift_bic = "+swift_bic+", bank = "+bank+", number = "+number+", IBAN = "+IBAN+", kind = "+kind+"]";
    }
}