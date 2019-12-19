package com.quantitymeasurement;

public class QuantityMeasurements {

    public double value;
    public UnitOperations unit;

    public QuantityMeasurements(UnitOperations unit, double value) {
        this.value= value;
        this.unit = unit;
    }

    public boolean compare(QuantityMeasurements that) throws QuantityMeasurementException {
        return unit.compare(this,that);
    }

    public double add(QuantityMeasurements value) throws QuantityMeasurementException {
        return unit.add(this,value);
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
