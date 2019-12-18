package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        Length feet1 = new Length(Units.FEET, 0.0);
        Length feet2 = new Length(Units.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd0Feet_ShouldReturnFalse() {
        Length feet1 = new Length(Units.FEET, 1.0);
        Length feet2 = new Length(Units.FEET, 0.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        Length inch1 = new Length(Units.INCHES, 0.0);
        Length inch2 = new Length(Units.INCHES, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnTrue() {
        Length inch1 = new Length(Units.INCHES, 1.0);
        Length inch2 = new Length(Units.INCHES, 0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOneFeetAndNull_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Units.FEET, 1.0);
        Length feet2 = null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenSameFeetObjectToEqual_ShouldReturnEqualLength() {
        Length feet1 = new Length(Units.FEET, 1.0);
        boolean equals = feet1.equals(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOneFeetAndOtherClassObject_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Units.FEET, 1.0);
        Integer integer = 2;
        boolean equals = feet1.equals(integer);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqual() {
        Length feet1 = new Length(Units.FEET, 0.0);
        Length inch2 = new Length(Units.INCHES, 0.0);
        boolean equals = feet1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenZeroFeetAndZeroInch_ShouldReturnEqualLength() {
        Length feet1 = new Length(Units.FEET, 0.0);
        Length inch2 = new Length(Units.INCHES, 0.0);
        boolean compareCheck = feet1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneInch_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Units.FEET, 1.0);
        Length inch2 = new Length(Units.INCHES, 1.0);
        boolean compareCheck = feet1.compare(inch2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Units.FEET, 1.0);
        Length feet2 = new Length(Units.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneFeet_ShouldReturnNotEqualLength() {
        Length feet1 = new Length(Units.FEET, 1.0);
        Length inch1 = new Length(Units.INCHES, 12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneInch_ShouldReturnNotEqualLength() {
        Length inch1 = new Length(Units.INCHES, 1.0);
        Length inch2 = new Length(Units.INCHES, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThreeFeetAndOneYard_ShouldReturnEqualLength() {
        Length feet = new Length(Units.FEET, 3.0);
        Length yard = new Length(Units.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchesAndOneYard_ShouldReturnEqualLength() {
        Length inches = new Length(Units.INCHES, 36.0);
        Length yard = new Length(Units.YARD, 1.0);
        boolean compareCheck = inches.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inches_ShouldReturnEqualLength() {
        Length yard = new Length(Units.YARD, 1.0);
        Length inches = new Length(Units.INCHES, 36.0);
        boolean compareCheck = yard.compare(inches);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneYardAndThreeFeet_ShouldReturnEqualLength() {
        Length yard = new Length(Units.YARD, 1.0);
        Length feet = new Length(Units.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneYard_ShouldReturnNotEqualLength() {
        Length feet = new Length(Units.FEET, 1.0);
        Length yard = new Length(Units.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneInchAndOneYard_ShouldReturnNotEqualLength() {
        Length inch = new Length(Units.INCHES, 1.0);
        Length yard = new Length(Units.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneInchAndOneCm_ShouldReturnNotEqualLength() {
        Length inch = new Length(Units.INCHES,2.0);
        Length cm = new Length(Units.CM, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneCm_ShouldReturnAdditionOfBothInInches() {
        Length inch = new Length(Units.INCHES,2.0);
        Length cm = new Length(Units.CM, 5.0);
        double add = inch.add(cm);
        Assert.assertEquals(4,add,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInches_ShouldReturnAdditionOfBothInInches() {
        Length feet = new Length(Units.FEET,1.0);
        Length inches = new Length(Units.INCHES, 2.0);
        double add = feet.add(inches);
        Assert.assertEquals(14,add,0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnAdditionOfBothInInches() {
        Length feet1 = new Length(Units.FEET,1.0);
        Length feet2 = new Length(Units.FEET, 1.0);
        double add = feet1.add(feet2);
        Assert.assertEquals(24,add,0.0);
    }

    @Test
    public void givenTwoInchAndTwoHalfCm_ShouldReturnAdditionOfBothInInches() {
        Length val1 = new Length(Units.INCHES,2.0);
        Length val2 = new Length(Units.CM, 2.5);
        double add = val1.add(val2);
        Assert.assertEquals(3,add,0.0);
    }

}