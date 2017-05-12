package com.reckoning.rest.Objects;

public class ForexRate
{
    private int unit;

    public int getUnit() { return this.unit; }

    public void setUnit(int unit) { this.unit = unit; }

    private double bankSellingRate;

    public double getBankSellingRate() { return this.bankSellingRate; }

    public void setBankSellingRate(double bankSellingRate) { this.bankSellingRate = bankSellingRate; }

    private String toCurrency;

    public String getToCurrency() { return this.toCurrency; }

    public void setToCurrency(String toCurrency) { this.toCurrency = toCurrency; }

    private double bankBuyingRateTT;

    public double getBankBuyingRateTT() { return this.bankBuyingRateTT; }

    public void setBankBuyingRateTT(double bankBuyingRateTT) { this.bankBuyingRateTT = bankBuyingRateTT; }

    private String fromCurrency;

    public String getFromCurrency() { return this.fromCurrency; }

    public void setFromCurrency(String fromCurrency) { this.fromCurrency = fromCurrency; }

    @Override
    public String toString()
    {
        return "fromCurrency = "+fromCurrency+"\t toCurrency = "+toCurrency+"\t unit = "+unit+"\t bankSellingRate = "+bankSellingRate+"\t bankBuyingRateTT = "+bankBuyingRateTT+"\n";
    }
}


