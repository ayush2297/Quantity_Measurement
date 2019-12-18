package com.quantitymeasurement;

public class Length {

    public double value;
    public final Units unit;

    public Length(Units unit, double value) {
        this.value=value;
        this.unit = unit;
    }

    public boolean compare(Length that) {
        return Units.compare(this,that);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    public double add(Length value) {
        return Units.add(this,value);
    }
}
