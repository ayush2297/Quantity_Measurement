package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

import static com.quantitymeasurement.Units.add;
import static com.quantitymeasurement.Units.compare;

public class QuantityMasurementTest {
    @Test
    public void given0FeetAnd0Feet_ShouldReturnTrue() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 0.0);
        QuantityMeasurements feet2 = new QuantityMeasurements(Units.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd0Feet_ShouldReturnFalse() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements feet2 = new QuantityMeasurements(Units.FEET, 0.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnTrue() {
        QuantityMeasurements inch1 = new QuantityMeasurements(Units.INCHES, 0.0);
        QuantityMeasurements inch2 = new QuantityMeasurements(Units.INCHES, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnTrue() {
        QuantityMeasurements inch1 = new QuantityMeasurements(Units.INCHES, 1.0);
        QuantityMeasurements inch2 = new QuantityMeasurements(Units.INCHES, 0.0);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenOneFeetAndNull_ShouldReturnNotEqualLength() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements feet2 = null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenSameFeetObjectToEqual_ShouldReturnEqualLength() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 1.0);
        boolean equals = feet1.equals(feet1);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenOneFeetAndOtherClassObject_ShouldReturnNotEqualLength() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 1.0);
        Integer integer = 2;
        boolean equals = feet1.equals(integer);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEqual() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 0.0);
        QuantityMeasurements inch2 = new QuantityMeasurements(Units.INCHES, 0.0);
        boolean equals = feet1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenZeroFeetAndZeroInch_ShouldReturnEqualLength() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 0.0);
        QuantityMeasurements inch2 = new QuantityMeasurements(Units.INCHES, 0.0);
        boolean compareCheck = feet1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneInch_ShouldReturnNotEqualLength() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements inch2 = new QuantityMeasurements(Units.INCHES, 1.0);
        boolean compareCheck = feet1.compare(inch2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnNotEqualLength() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements feet2 = new QuantityMeasurements(Units.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneFeet_ShouldReturnNotEqualLength() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements inch1 = new QuantityMeasurements(Units.INCHES, 12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneInch_ShouldReturnNotEqualLength() {
        QuantityMeasurements inch1 = new QuantityMeasurements(Units.INCHES, 1.0);
        QuantityMeasurements inch2 = new QuantityMeasurements(Units.INCHES, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThreeFeetAndOneYard_ShouldReturnEqualLength() {
        QuantityMeasurements feet = new QuantityMeasurements(Units.FEET, 3.0);
        QuantityMeasurements yard = new QuantityMeasurements(Units.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchesAndOneYard_ShouldReturnEqualLength() {
        QuantityMeasurements inches = new QuantityMeasurements(Units.INCHES, 36.0);
        QuantityMeasurements yard = new QuantityMeasurements(Units.YARD, 1.0);
        boolean compareCheck = inches.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inches_ShouldReturnEqualLength() {
        QuantityMeasurements yard = new QuantityMeasurements(Units.YARD, 1.0);
        QuantityMeasurements inches = new QuantityMeasurements(Units.INCHES, 36.0);
        boolean compareCheck = yard.compare(inches);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneYardAndThreeFeet_ShouldReturnEqualLength() {
        QuantityMeasurements yard = new QuantityMeasurements(Units.YARD, 1.0);
        QuantityMeasurements feet = new QuantityMeasurements(Units.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneYard_ShouldReturnNotEqualLength() {
        QuantityMeasurements feet = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements yard = new QuantityMeasurements(Units.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneInchAndOneYard_ShouldReturnNotEqualLength() {
        QuantityMeasurements inch = new QuantityMeasurements(Units.INCHES, 1.0);
        QuantityMeasurements yard = new QuantityMeasurements(Units.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneInchAndOneCm_ShouldReturnNotEqualLength() {
        QuantityMeasurements inch = new QuantityMeasurements(Units.INCHES,2.0);
        QuantityMeasurements cm = new QuantityMeasurements(Units.CM, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneCm_ShouldReturnAdditionOfBothInInches() {
        QuantityMeasurements inch = new QuantityMeasurements(Units.INCHES,2.0);
        QuantityMeasurements cm = new QuantityMeasurements(Units.CM, 5.0);
        double add = inch.add(cm);
        Assert.assertEquals(4,add,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInches_ShouldReturnAdditionOfBothInInches() {
        QuantityMeasurements feet = new QuantityMeasurements(Units.FEET,1.0);
        QuantityMeasurements inches = new QuantityMeasurements(Units.INCHES, 2.0);
        double add = feet.add(inches);
        Assert.assertEquals(14,add,0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnAdditionOfBothInInches() {
        QuantityMeasurements feet1 = new QuantityMeasurements(Units.FEET,1.0);
        QuantityMeasurements feet2 = new QuantityMeasurements(Units.FEET, 1.0);
        double add = feet1.add(feet2);
        Assert.assertEquals(24,add,0.0);
    }

    @Test
    public void givenTwoInchAndTwoHalfCm_ShouldReturnAdditionOfBothInInches() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.INCHES,2.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.CM, 2.5);
        double add = val1.add(val2);
        Assert.assertEquals(3,add,0.0);
    }

    @Test
    public void givenOneLitreAnd1000ml_ShouldReturnAdditionOfBoth() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.LITRE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.ML, 1000.0);
        double add = val1.add(val2);
        Assert.assertEquals(2,add,0.0);
    }

    @Test
    public void givenOneGallonAndLitre_ShouldReturnReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.GALLON,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.LITRE, 3.78);
        boolean compareCheck = val1.compare(val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneGallonAnd3Litre_ShouldReturnAdditionOfBothInLitres() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.GALLON,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.LITRE, 3.78);
        double add = val1.add(val2);
        Assert.assertEquals(7.56,add,0.0);
    }

    @Test
    public void givenOneLitreAnd1000ml_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.LITRE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.ML, 1000.0);
        boolean compareCheck = val1.compare(val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneLitreAnd1Feet_ShouldReturnNotAdditionOfBoth() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.LITRE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.INCHES, 1.0);
        double add = val1.add(val2);
        Assert.assertNotEquals(2.0,add);
    }

    @Test
    public void givenOneKgAnd1000gm_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.KG,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.GRAM, 1000.0);
        boolean compareCheck = val1.compare(val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAnd1000gm_ShouldReturnFalse() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.GRAM, 1000.0);
        boolean compareCheck = val1.compare(val2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneFeetAnd3Litre_ShouldReturnNotAdditionOfBothInLitres() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.LITRE, 3.78);
        double add = val1.add(val2);
        Assert.assertNotEquals(4.78,add,0.0);
    }

    @Test
    public void givenOneTonneAnd1000Grams_ShouldReturnAdditionOfBoth() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.TONNE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.GRAM, 1000.0);
        double add = val1.add(val2);
        Assert.assertEquals(1001.0,add,0.0);
    }

    @Test
    public void givenOneTonneAnd1000Kgs_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.TONNE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.KG, 1000.0);
        boolean compareCheck = val1.compare(val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneTonneAndNullInEquals_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.TONNE,1.0);
        QuantityMeasurements val2 = null;
        boolean compareCheck = val1.equals(val2);
        Assert.assertFalse(compareCheck);
    }
}