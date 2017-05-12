package com.reckoning.rest.MyAccounts;


import com.reckoning.rest.OBPObjects.ResponseAccountById;

import java.util.ArrayList;

public class ResponseMyAccounts {

    private String numOfAccounts;
    private String displayname;
    private ArrayList<ResponseAccountById> accountList;

    public String getNumOfAccounts() {
        return numOfAccounts;
    }

    public void setNumOfAccounts(String numOfAccounts) {
        this.numOfAccounts = numOfAccounts;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public ArrayList<ResponseAccountById> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<ResponseAccountById> accountList) {
        this.accountList = accountList;
    }
}
