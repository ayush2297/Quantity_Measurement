package com.quantitymeasurement;
public enum Units {
    FEET(12),INCHES(1),YARD(36),CM(1/2.5),
    GALLON(3.78),LITRE(1), ML(1d/1000);

    public final double baseConversionUnit;

    Units(double baseConversionUnit) {
        this.baseConversionUnit = baseConversionUnit;
    }

    private static double getVal(Length lenObj) {
        double v = lenObj.unit.baseConversionUnit*lenObj.value;
        return v;
    }

    public static boolean compare (Length lenObj1, Length lenObj2) {
        Long firstVal = Math.round(getVal(lenObj1));
        Long secondVal = Math.round(getVal(lenObj2));
        return firstVal.equals(secondVal);
    }

    public static double add(Length lenObj1, Length lenObj2) {
        double firstVal = getVal(lenObj1);
        double secondVal = getVal(lenObj2);
        return firstVal+secondVal;
    }
}