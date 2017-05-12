package com.reckoning.rest.Objects.DepositAccounts;

import java.util.ArrayList;

public class DepositAccounts {

        private ArrayList<CASAAccountList> CASAAccountList;

        private String disclaimer;

    public ArrayList<com.reckoning.rest.Objects.DepositAccounts.CASAAccountList> getCASAAccountList() {
        return CASAAccountList;
    }

    public void setCASAAccountList(ArrayList<com.reckoning.rest.Objects.DepositAccounts.CASAAccountList> CASAAccountList) {
        this.CASAAccountList = CASAAccountList;
    }

    public String getDisclaimer ()
        {
            return disclaimer;
        }

        public void setDisclaimer (String disclaimer)
        {
            this.disclaimer = disclaimer;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [CASAAccountList = "+CASAAccountList+", disclaimer = "+disclaimer+"]";
        }

}
