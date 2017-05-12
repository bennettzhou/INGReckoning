package com.reckoning.rest.Objects.DepositAccounts;

public class GetDepositAccount {

    String categoryName;
    String subCategoryName;
    String productName;
    String benefits;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    @Override
    public String toString() {
        return "GetDepositAccount [categoryName=" + categoryName +
                ", subCategoryName=" + subCategoryName +
                ", productName=" + productName +
                ", benefits=" + benefits + "]";
    }
}
