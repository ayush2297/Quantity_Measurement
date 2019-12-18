package com.quantitymeasurement;
public enum Units {
    FEET(12),INCHES(1),YARD(36),CM(1/2.5);

    public final double baseConversionUnit;

    Units(double baseConversionUnit) {
        this.baseConversionUnit = baseConversionUnit;
    }

    public static boolean compare (Length lenObj1, Length lenObj2) {
        Long firstVal = getVal(lenObj1);
        Long secondVal = getVal(lenObj2);
        return firstVal.equals(secondVal);
    }

    public static double add(Length lenObj1, Length lenObj2) {
        Long firstVal = getVal(lenObj1);
        Long secondVal = getVal(lenObj2);
        return firstVal+secondVal;
    }

    private static Long getVal(Length lenObj) {
        return Math.round(lenObj.unit.baseConversionUnit*lenObj.value);
    }
}