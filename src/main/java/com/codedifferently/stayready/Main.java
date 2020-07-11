package com.codedifferently.stayready;

import java.util.HashMap;

public class Main {

    double USDRate = 1.0; //US Dollar
    double EURRate = 0.94;//Euro
    double GPBRate = 0.82;//British Pound
    double INRRate = 68.32;//Indian Rupee
    double AUDRate = 1.35;//Australian Dollar
    double CADRate = 1.32;//Canadian Dollar
    double SPDRate = 1.43;//Singapore Dollar
    double CHFRate = 1.01;//Swiss Franc
    double MYRRate = 4.47;//Malaysian Ringgit
    double JPYRate = 115.84;//Japanese Yen
    double RNBRate = 6.92;//Chinese Yuan Renminbi

    public double USD2Euro(double amt){
        double conversion = amt * EURRate;
        return conversion;
    }

    public double Euro2USD(double amt){
        double conversion = amt / EURRate;
        return conversion;
    }

    public double Euro2GPB(double amt){
        double conversion = amt / EURRate * GPBRate;
        return conversion;
    }

    public double GPB2INR(double amt){
        double conversion = amt / GPBRate * INRRate;
        return conversion;
    }
    public double INR2CAD(double amt){
        double conversion = amt / INRRate * CADRate;
        return conversion;
    }
    public double CAD2SPD(double amt){
        double conversion = amt / CADRate * SPDRate;
        return conversion;
    }
    public double SPD2CHF(double amt){
        double conversion = amt / SPDRate * CHFRate;
        return conversion;
    }
    public double CHF2MYR(double amt){
        double conversion = amt / CHFRate * MYRRate;
        return conversion;
    }
    public double MYR2JPY(double amt){
        double conversion = amt / MYRRate * JPYRate;
        return conversion;
    }

    public double JPY2RNB(double amt){
        double conversion = amt / JPYRate * RNBRate;
        return conversion;
    }

    public double RNB2USD(double amt){
        double conversion = amt / RNBRate * USDRate;
        return conversion;
    }
}
