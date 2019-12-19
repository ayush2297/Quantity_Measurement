package com.quantitymeasurement;

public enum Weight implements UnitOperations{
    KG(1), GRAM(1d/1000), TONNE(1000);

    public final double base;

    Weight(double base) {
        this.base = base;
    }

    @Override
    public double getBaseValue(QuantityMeasurements obj) {
        return obj.value*this.base;
    }
}
