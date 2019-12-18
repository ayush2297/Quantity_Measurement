package com.quantitymeasurement;

public class LengthUnits {

    public enum UnitType {
        FEET {
            public double getValInInches(double value){
                return value*12.0;
            }
        }, INCHES {
            public double getValInInches(double value){
                return value ;
            }
        }, YARD {
            public double getValInInches(double value) {
                return value * 36;
            }
        },CM {
            public double getValInInches(double value) {
                return value/2.5;
            }
        };
        public abstract double getValInInches(double value);
    }
    public static boolean compare (Length lenObj1, Length lenObj2) {
        Long firstVal = Math.round(lenObj1.unit.getValInInches(lenObj1.value));
        Long secondVal = Math.round(lenObj2.unit.getValInInches(lenObj2.value));
        return firstVal.equals(secondVal);
    }
}
