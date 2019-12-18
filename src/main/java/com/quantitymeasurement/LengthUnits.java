package com.quantitymeasurement;

public class LengthUnits {

    public enum UnitType {
        FEET {
            public double getValInInches(double value){
                return value*12.0;
            }
        }, INCHES {
            public double getValInInches(double value){
                return value;
            }
        }, YARD {
            public double getValInInches(double value){
                return value*36;
            }
        };
        public abstract double getValInInches(double value);
    }
}
