package com.reckoning.rest.TransactionHistById;

public class Counterparty
{
    private String id;

    private Holder holder;

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

    public Holder getHolder ()
    {
        return holder;
    }

    public void setHolder (Holder holder)
    {
        this.holder = holder;
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
        return "ClassPojo [id = "+id+", holder = "+holder+", swift_bic = "+swift_bic+", bank = "+bank+", number = "+number+", IBAN = "+IBAN+", kind = "+kind+"]";
    }
}