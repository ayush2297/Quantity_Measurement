package com.quantitymeasurement;

public class Length {

    private final LengthUnits.UnitType unit;
    public double value;

    public Length(LengthUnits.UnitType unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        Long firstVal = Math.round(this.unit.getValInInches(this.value));
        Long secondVal = Math.round(that.unit.getValInInches(that.value));
        return firstVal.equals(secondVal);
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
