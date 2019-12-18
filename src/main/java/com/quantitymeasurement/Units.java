package com.quantitymeasurement;
public enum Units {
    FEET(12),INCHES(1),YARD(36),CM(1/2.5);

    public final double baseConversionUnit;

    Units(double baseConversionUnit) {
        this.baseConversionUnit = baseConversionUnit;
    }

    public static boolean compare (Length lenObj1, Length lenObj2) {
        Long firstVal = Math.round(lenObj1.unit.baseConversionUnit*lenObj1.value);
        Long secondVal = Math.round(lenObj2.unit.baseConversionUnit*lenObj2.value);
        return firstVal.equals(secondVal);
    }
}