package com.quantitymeasurement;

public enum Length implements UnitOperations {

    FEET(12),INCHES(1),
    YARD(36),CM(1/2.5);

    public final double base;

    Length(double base) {
        this.base = base;
    }

    @Override
    public double getBaseValue(QuantityMeasurements obj) {
        return obj.value*this.base;
    }
}
