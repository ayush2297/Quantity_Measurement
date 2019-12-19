package com.quantitymeasurement;
public enum Units {
    FEET(12,UnitCategory.LENGTH),INCHES(1,UnitCategory.LENGTH),
    YARD(36,UnitCategory.LENGTH),CM(1/2.5,UnitCategory.LENGTH),
    GALLON(3.78,UnitCategory.VOLUME),LITRE(1,UnitCategory.VOLUME),
    ML(1d/1000,UnitCategory.VOLUME),KG(1,UnitCategory.WEIGHT),
    GRAM(1d/1000,UnitCategory.WEIGHT),TONNE(1000,UnitCategory.WEIGHT);

    public final double baseConversionUnit;
    private final UnitCategory unitType;

    Units(double baseConversionUnit, UnitCategory category) {
        this.baseConversionUnit = baseConversionUnit;
        this.unitType = category;
    }

    private static double getVal(QuantityMeasurements lenObj) {
        return lenObj.unit.baseConversionUnit*lenObj.value;
    }

    private static boolean typeEquals(QuantityMeasurements lenObj1, QuantityMeasurements lenObj2) {
        return lenObj1.unit.unitType.equals(lenObj2.unit.unitType);
    }

    public static boolean compare (QuantityMeasurements lenObj1, QuantityMeasurements lenObj2) {
        if (typeEquals(lenObj1,lenObj2)) {
            Long firstVal = Math.round(getVal(lenObj1));
            Long secondVal = Math.round(getVal(lenObj2));
            return firstVal.equals(secondVal);
        }
        return false;
    }

    public static double add(QuantityMeasurements lenObj1, QuantityMeasurements lenObj2) {
        if (typeEquals(lenObj1,lenObj2)) {
            double firstVal = getVal(lenObj1);
            double secondVal = getVal(lenObj2);
            return firstVal+secondVal;
        }
        return 0;
    }
}