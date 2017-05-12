package com.reckoning.rest.Objects;

public class GetRate {

    String FromCurrency;
    String ToCurrency;
    double rate;

    public String getFromCurrency() {
        return FromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        FromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return ToCurrency;
    }

    public void setToCurrency(String toCurrency) {
        ToCurrency = toCurrency;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString(){
        return "Rates [FromCurrency=" + FromCurrency + ", ToCurrency=" + ToCurrency + ", rate=" + rate + "]";
    }
}
