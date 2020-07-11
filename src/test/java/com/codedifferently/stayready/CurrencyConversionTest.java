package com.codedifferently.stayready;

import org.junit.Test;
import org.junit.Assert;


public class CurrencyConversionTest {

    @Test
    public void USD2EuroTest(){
        //Given
        Main conv = new Main();

        double amount = 150.0;
        double expected = 141.0;

        //When
        double actual = conv.USD2Euro(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);
    }

    @Test
    public void Euro2USDTest(){
        //Given
        Main conv = new Main();

        double amount = 141.0;
        double expected = 150.0;

        //When
        double actual = conv.Euro2USD(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);
    }

    @Test
    public void Euro2GPBTest(){
        //Given
        Main conv = new Main();

        double amount = 141.0;
        double expected = 123.0;

        //When
        double actual = conv.Euro2GPB(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);
    }

    @Test
    public void GPB2INRTest(){
        //Given
        Main conv = new Main();

        double amount = 123.0;
        double expected = 10248.0;

        //When
        double actual = conv.GPB2INR(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);
    }

    @Test
    public void INR2CADTest(){
        //Given
        Main conv = new Main();

        double amount = 10248.0;
        double expected = 198.0;

        //When
        double actual = conv.INR2CAD(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);

    }

    @Test
    public void CAD2SGDTest(){
        //Given
        Main conv = new Main();

        double amount = 198.0;
        double expected = 214.5;

        //When
        double actual = conv.CAD2SPD(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);

    }

    @Test
    public void SPD2CHFTest(){
        //Given
        Main conv = new Main();

        double amount = 214.5;
        double expected = 151.5;

        //When
        double actual = conv.SPD2CHF(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);
    }

    @Test
    public void CHF2MYRTest(){
        //Given
        Main conv = new Main();

        double amount = 151.5;
        double expected = 670.5;

        //When
        double actual = conv.CHF2MYR(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);

    }

    @Test
    public void MYR2JPYTest(){
        //Given
        Main conv = new Main();

        double amount = 670.5;
        double expected = 17376.0;

        //When
        double actual = conv.MYR2JPY(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);

    }

    @Test
    public void JPY2RNBTest(){
        //Given
        Main conv = new Main();

        double amount = 17376.0;
        double expected = 1038.0;

        //When
        double actual = conv.JPY2RNB(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);

    }

    @Test
    public void RNB2USDTest(){
        //Given
        Main conv = new Main();

        double amount = 1038.0;
        double expected = 150.0;

        //When
        double actual = conv.RNB2USD(amount);
        //Then
        Assert.assertEquals(expected,actual, 0.01);

    }

}
