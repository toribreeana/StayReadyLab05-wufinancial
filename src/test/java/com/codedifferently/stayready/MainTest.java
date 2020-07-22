package com.codedifferently.stayready;


import org.junit.Assert;
import org.junit.Test;

public class MainTest {


    @Test
    public void USDToEuroTest() {
        //Given
        Main conversion = new Main();

        double amount = 150.0;
        double expected = 141.0;

        //When
        double actual = conversion.USDollarToEuro(amount);

        //Then
        Assert.assertEquals(expected, actual, 0.01);

    }

    @Test
    public void EuroToUSDTest() {
        //Given
        Main conversion = new Main();

        double amount = 141.0;
        double expected = 150.0;

        //When
        double actual = conversion.EuroToUSDollar(amount);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void EuroToBritishPoundTest() {
        //Given
        Main conversion = new Main();

        double amount = 141;
        double expected = 123.0;

        //When
        double actual = conversion.EuroToBritishPounds(amount);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void BritishPoundToIndianRupeeTest() {
        //Given
        Main conversion = new Main();

        double amount = 123.0;
        double expected = 10248.0;

        //When
        double actual = conversion.BritishPoundsToIndianRupee(amount);  //finish this line

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

//    @Test
//    public void IndianRupeeToCanadianDollarTest() {
//        //Given
//        Main conversion = new Main();
//
//        double amount = 10248.0;
//        double expected = 198.0;
//
//        //When
//        double actual = conversion.IndianRupeeToCanadianDollar(amount);  //finish this line
//
//        //Then
//        Assert.assertEquals(expected, actual, 0.01);
//    }

    @Test
    public void CanadianDollarToSingaporeDollarTest() {
        //Given
        Main conversion = new Main();

        double amount = 198.0;
        double expected = 214.5;

        //When
        double actual = conversion.CanadianDollarToSingaporeDollar(amount);  //finish this line

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void SingaporeDollarToSwissFrancTest() {
        //Given
        Main conversion = new Main();

        double amount = 214.5;
        double expected = 151.5;

        //When
        double actual = conversion.SingaporeDollarToSwissFranc(amount);  //finish this line

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void SwissFrancToMalaysianRinggitTest() {
        //Given
        Main conversion = new Main();

        double amount = 151.5;
        double expected = 670.5;

        //When
        double actual = conversion.SwissFranceToMalaysianRinggit(amount);  //finish this line

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void MalaysianRinggitToJapaneseYen() {
        //Given
        Main conversion = new Main();

        double amount = 670.0;
        double expected = 17376.0;

        //When
        double actual = conversion.MalaysianRinggitToJapaneseYen(amount);  //finish this line

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void JapaneseYenToChineseYuanRenminbiTest() {
        //Given
        Main conversion = new Main();

        double amount = 17376.0;
        double expected = 1038.0;

        //When
        double actual = conversion.JapaneseYenToChineseYuanRenminbi(amount);  //finish this line

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
//    @Test
//    public void ChineseYuanRenminbiToUSDollar() {
//        //Given
//        Main conversion = new Main();
//
//        double amount = 1038.0;
//        double expected = 150.0;
//
//        //When
//        double actual = conversion.ChineseYuanRenminbiToUSDollar(amount);  //finish this line
//
//        //Then
//        Assert.assertEquals(expected, actual, 0.01);
//    }

}



