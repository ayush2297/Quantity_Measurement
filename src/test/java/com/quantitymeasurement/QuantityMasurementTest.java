package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 0.0);
        Length feet2 = new Length(LengthUnits.UnitType.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd0Feet_ShouldReturnFalse() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 1.0);
        Length feet2 = new Length(LengthUnits.UnitType.FEET, 0.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        Length inch1 = new Length(LengthUnits.UnitType.INCHES, 0.0);
        Length inch2 = new Length(LengthUnits.UnitType.INCHES, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnTrue() {
        Length inch1 = new Length(LengthUnits.UnitType.INCHES, 1.0);
        Length inch2 = new Length(LengthUnits.UnitType.INCHES, 0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOneFeetAndNull_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 1.0);
        Length feet2 = null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenSameFeetObjectToEqual_ShouldReturnEqualLength() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 1.0);
        boolean equals = feet1.equals(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOneFeetAndOtherClassObject_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 1.0);
        Integer integer = 2;
        boolean equals = feet1.equals(integer);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 0.0);
        Length inch2 = new Length(LengthUnits.UnitType.INCHES, 0.0);
        boolean equals = feet1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenZeroFeetAndZeroInch_ShouldReturnEqualLength() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 0.0);
        Length inch2 = new Length(LengthUnits.UnitType.INCHES, 0.0);
        boolean compareCheck = feet1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneInch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 1.0);
        Length inch2 = new Length(LengthUnits.UnitType.INCHES, 1.0);
        boolean compareCheck = feet1.compare(inch2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 1.0);
        Length feet2 = new Length(LengthUnits.UnitType.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneFeet_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(LengthUnits.UnitType.FEET, 1.0);
        Length inch1 = new Length(LengthUnits.UnitType.INCHES, 12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneInch_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(LengthUnits.UnitType.INCHES, 1.0);
        Length inch2 = new Length(LengthUnits.UnitType.INCHES, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }
}