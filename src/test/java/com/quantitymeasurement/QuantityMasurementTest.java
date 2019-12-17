package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given1FeetAnd0Feet_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1,inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnTrue() {
        Length inch1 = new Length(Length.Unit.INCH,1.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean equals = feet1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenZeroFeetAndZeroInch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        boolean compareCheck = feet1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneInch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        boolean compareCheck = feet1.compare(inch2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET,1.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }



}
