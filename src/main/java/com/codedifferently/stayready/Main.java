package com.codedifferently.stayready;
import java.util.HashMap;

public class Main {

    //HashMap<String, Double> ConversionRate = new HashMap();

    Double UsDollar = 1.00;
    Double Euro = 0.94;
    Double BritishPound = 0.82;
    Double IndianRupee = 68.32;
    Double AustralianDollar = 1.35;
    Double CanadianDollar = 1.32;
    Double SingaporeDollar = 1.43;
    Double SwissFranc = 1.01;
    Double MalaysianRinggit = 4.47;
    Double JapaneseYen = 115.84;
    Double ChineseYuanRenminbi = 6.92;


    // public void initRate() {

//        ConversionRate.put("USDollar", 1.00);
//        ConversionRate.put("Euro", 0.94);
//        ConversionRate.put("BritishPound", 0.82);
//        ConversionRate.put("IndianRupee", 68.32);
//        ConversionRate.put("AustralianDollar", 1.35);
//        ConversionRate.put("CanadianDollar", 1.32);
//        ConversionRate.put("SingaporeDollar", 1.43);
//        ConversionRate.put("SwissFranc", 1.01);
//        ConversionRate.put("MalaysianRinggit", 4.47);
//        ConversionRate.put("JapaneseYen", 115.84);
//        ConversionRate.put("ChineseYuan Renminbi", 6.92);
//    }

    public Double USDollarToEuro(double amount) {
        double conversion = amount * Euro;
        return conversion;
    }

    public Double EuroToUSDollar(double amount) {
        double conversion = amount / Euro;
        return conversion;
    }

    public Double EuroToBritishPounds(double amount) {
        double conversion = amount / Euro * BritishPound;
        return conversion;
    }

    public Double BritishPoundsToIndianRupee(double amount) {
        double conversion = amount / BritishPound * IndianRupee;
        return conversion;
    }

    public Double IndianRupeeToAustralianDollar(double amount) {
        double conversion = amount / IndianRupee * AustralianDollar;
        return conversion;
    }

    public Double AustralianDollarToCanadianDollar(double amount) {
        double conversion = amount / AustralianDollar * CanadianDollar;
        return conversion;
    }

    public Double CanadianDollarToSingaporeDollar(double amount) {
        double conversion = amount / CanadianDollar * SingaporeDollar;
        return conversion;
    }

    public Double SingaporeDollarToSwissFranc(double amount) {
        double conversion = amount / SingaporeDollar * SwissFranc;
        return conversion;
    }

    public Double SwissFranceToMalaysianRinggit(double amount) {
        double conversion = amount / SwissFranc * MalaysianRinggit;
        return conversion;
    }

    public Double MalaysianRinggitToJapaneseYen(double amount) {
        double conversion = amount / MalaysianRinggit * JapaneseYen;
        return conversion;
    }

    public Double JapaneseYenToChineseYuanRenminbi(double amount) {
        double conversion = amount / JapaneseYen * ChineseYuanRenminbi;
        return conversion;
    }
//    public Double ChineseYuanRenminbiToUSDollar(double amount) {
//        double conversion = amount / ChineseYuanRenminbi * USDollar;
//        return conversion;
//    }
}

//Convert Dollar to Euro
//Convert Euro to Dollar
//Convert Euro to British Pound
//Convert British Pound to Indian Rupee
//Convert Rupee to Canadian Dollar
//Convert Canadian Dollar to Singapore Dollar
//Convert Singapore Dollar to Swiss Franc
//Convert Swiss Franc to Malaysian Ringgit
//Convert Malaysian Ringgit to Japanese Yen
//Convert Japanese Yen to Chinese Yuan Renminbi