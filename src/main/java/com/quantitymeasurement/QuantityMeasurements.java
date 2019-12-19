package com.quantitymeasurement;

public class QuantityMeasurements {

    public double value;
    public final Units unit;

    public QuantityMeasurements(Units unit, double value) {
        this.value=value;
        this.unit = unit;
    }

    public boolean compare(QuantityMeasurements that) {
        return Units.compare(this,that);
    }

    public double add(QuantityMeasurements value) {
        return Units.add(this,value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurements quantityMeasurements = (QuantityMeasurements) o;
        return Double.compare(quantityMeasurements.value, value) == 0 &&
                unit == quantityMeasurements.unit;
    }

}
