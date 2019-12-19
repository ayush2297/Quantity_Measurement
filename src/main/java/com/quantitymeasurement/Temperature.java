package com.quantitymeasurement;

public enum Temperature implements UnitOperations {
    CELCIUS, FAHRENHEIT;

    @Override
    public double getBaseValue(QuantityMeasurements obj) {
        if (obj.unit == Temperature.FAHRENHEIT) {
            double converted = (obj.value - 32) * (5d / 9);
            return converted;
        }
        return obj.value;
    }

    @Override
    public double add(QuantityMeasurements obj1, QuantityMeasurements obj2) {
        return 0;
    }
}
