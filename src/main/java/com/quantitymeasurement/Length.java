package com.quantitymeasurement;

public class Length {

    public double value;
    public final LengthUnits.UnitType unit;

    public Length(LengthUnits.UnitType unit, double value) {
        this.value=value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        return LengthUnits.compare(this,that);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
