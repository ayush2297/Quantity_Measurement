package com.quantitymeasurement;

public enum Volume implements UnitOperations{
    GALLON(3.78),LITRE(1),
    ML(1d/1000);

    public final double base;

    Volume(double base) {
        this.base = base;
    }

    @Override
    public double getBaseValue(QuantityMeasurements obj) {
        return obj.value*this.base;
    }
}
