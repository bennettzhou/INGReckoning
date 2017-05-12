package com.reckoning.rest.Objects;

import java.util.ArrayList;

public class Forexrates
{
    private ArrayList<ForexRate> ForexRates;

    public ArrayList<ForexRate> getForexRates() { return this.ForexRates; }

    public void setForexRates(ArrayList<ForexRate> ForexRates) { this.ForexRates = ForexRates; }

    private String disclaimer;

    public String getDisclaimer() { return this.disclaimer; }

    public void setDisclaimer(String disclaimer) { this.disclaimer = disclaimer; }

    public String toString()
    {
        String toString="";
        for (ForexRate a : ForexRates){
            toString+=a.toString();
        }

         return "ForexRates ----------------------------- \n"
                 + toString;
    }



}
