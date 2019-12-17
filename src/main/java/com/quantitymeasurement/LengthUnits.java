package com.quantitymeasurement;

public class LengthUnits {

    public enum UnitType {
        FEET {
            public double getUnitVal(double value){
                return value*12.0;
            }
        }, INCHES {
            public double getUnitVal(double value){
                return value;
            }
        };
        public abstract double getUnitVal(double value);
    }

    public static double getUnitVal(UnitType unitType, double value){
        return unitType.getUnitVal(value);
    }
}
