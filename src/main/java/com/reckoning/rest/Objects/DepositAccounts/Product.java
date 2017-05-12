package com.reckoning.rest.Objects.DepositAccounts;

public class Product
{
    private String websiteLink;

    private String apply;

    private String monthlyStatements;

    private String feesAndCharges;

    private String productDescription;

    private String minimumBalance;

    private String initialDeposit;

    private String eligibility;

    private String remarks;

    private String benefits;

    private String productName;

    public String getWebsiteLink ()
    {
        return websiteLink;
    }

    public void setWebsiteLink (String websiteLink)
    {
        this.websiteLink = websiteLink;
    }

    public String getApply ()
    {
        return apply;
    }

    public void setApply (String apply)
    {
        this.apply = apply;
    }

    public String getMonthlyStatements ()
    {
        return monthlyStatements;
    }

    public void setMonthlyStatements (String monthlyStatements)
    {
        this.monthlyStatements = monthlyStatements;
    }

    public String getFeesAndCharges ()
    {
        return feesAndCharges;
    }

    public void setFeesAndCharges (String feesAndCharges)
    {
        this.feesAndCharges = feesAndCharges;
    }

    public String getProductDescription ()
    {
        return productDescription;
    }

    public void setProductDescription (String productDescription)
    {
        this.productDescription = productDescription;
    }

    public String getMinimumBalance ()
    {
        return minimumBalance;
    }

    public void setMinimumBalance (String minimumBalance)
    {
        this.minimumBalance = minimumBalance;
    }

    public String getInitialDeposit ()
    {
        return initialDeposit;
    }

    public void setInitialDeposit (String initialDeposit)
    {
        this.initialDeposit = initialDeposit;
    }

    public String getEligibility ()
    {
        return eligibility;
    }

    public void setEligibility (String eligibility)
    {
        this.eligibility = eligibility;
    }

    public String getRemarks ()
    {
        return remarks;
    }

    public void setRemarks (String remarks)
    {
        this.remarks = remarks;
    }

    public String getBenefits ()
    {
        return benefits;
    }

    public void setBenefits (String benefits)
    {
        this.benefits = benefits;
    }

    public String getProductName ()
    {
        return productName;
    }

    public void setProductName (String productName)
    {
        this.productName = productName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [websiteLink = "+websiteLink+", apply = "+apply+", monthlyStatements = "+monthlyStatements+", feesAndCharges = "+feesAndCharges+", productDescription = "+productDescription+", minimumBalance = "+minimumBalance+", initialDeposit = "+initialDeposit+", eligibility = "+eligibility+", remarks = "+remarks+", benefits = "+benefits+", productName = "+productName+"]";
    }
}
