package com.reckoning.rest.OBPObjects;

public class AccountById {

        private String bank_id;

        private String id;

        private Balance balance;

        private String swift_bic;

        private String number;

        private String label;

        private String type;

        private Owners[] owners;

        private String IBAN;

        public String getBank_id ()
        {
            return bank_id;
        }

        public void setBank_id (String bank_id)
        {
            this.bank_id = bank_id;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public Balance getBalance ()
        {
            return balance;
        }

        public void setBalance (Balance balance)
        {
            this.balance = balance;
        }

        public String getSwift_bic ()
    {
        return swift_bic;
    }

        public void setSwift_bic (String swift_bic)
        {
            this.swift_bic = swift_bic;
        }

        public String getNumber ()
        {
            return number;
        }

        public void setNumber (String number)
        {
            this.number = number;
        }

        public String getLabel ()
    {
        return label;
    }

        public void setLabel (String label)
        {
            this.label = label;
        }

        public String getType ()
    {
        return type;
    }

        public void setType (String type)
        {
            this.type = type;
        }

        public Owners[] getOwners ()
        {
            return owners;
        }

        public void setOwners (Owners[] owners)
        {
            this.owners = owners;
        }

        public String getIBAN ()
    {
        return IBAN;
    }

        public void setIBAN (String IBAN)
        {
            this.IBAN = IBAN;
        }

        @Override
        public String toString()
        {
            return " [bank_id = "+bank_id+", id = "+id+", balance = "+balance+", swift_bic = "+swift_bic+", number = "+number+", label = "+label+", type = "+type+", owners = "+owners+", IBAN = "+IBAN+"]";
        }
    
}
