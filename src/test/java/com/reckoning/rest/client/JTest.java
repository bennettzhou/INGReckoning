package com.reckoning.rest.client;

import com.reckoning.rest.JSONService;
import org.junit.Test;

public class JTest {

    @Test
    /*
    public void TestRate() {

        JSONService j = new JSONService();
        GetRate rate = j.getOcbcRateInJSON();
        System.out.println(rate);

    }*/

    public void TestDepositAccounts() throws InterruptedException {

        JSONService j = new JSONService();

        //j.getLoanDetails(100000, 10, 38, 2000, 8000, "ING");
        //System.out.println(j.getBanks());
        //j.getMyAccounts("iamben");
        //j.getMyTransactionHistory("superhero");
        j.getBanks();
        j.getBanks();

        //System.out.println("Open Account Balance>>>>>>>>>>>>: "+j.getAccountById("iamben", "at02-0075--01", "iamben_pop").getAmount());
        //System.out.println("ING Account Balance>>>>>>>>>>>>: "+j.getAccountById("iamben", "at02-1465--01", "iamben_ing").getAmount());
        //System.out.println("\n=>>>>>>>>>>Transmitting EUR100 from ING to HSBC<<<<<<<<<=");
        //j.createTransaction("iamben", "at02-0075--01", "iamben_pop", "10", "at02-1465--01", "iamben_ing");
        //j.getMyTransactionHistory("iamben");
        //System.out.println("ING Account Balance>>>>>>>>>>>>: "+j.getAccountById("superhero", "at02-1465--01", "supering").getAmount());
        //System.out.println("HSBC Account Balance>>>>>>>>>>>>: "+j.getAccountById("superhero", "hsbc-test", "superhsbc").getAmount());
        //j.getMyAccounts("iamben");
        //j.getCurrentUser();

    }
}

