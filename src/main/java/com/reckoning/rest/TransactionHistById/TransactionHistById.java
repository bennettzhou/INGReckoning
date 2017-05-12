package com.reckoning.rest.TransactionHistById;

public class TransactionHistById {

        private Transactions[] transactions;

        public Transactions[] getTransactions ()
        {
            return transactions;
        }

        public void setTransactions (Transactions[] transactions)
        {
            this.transactions = transactions;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [transactions = "+transactions+"]";
        }
    }
