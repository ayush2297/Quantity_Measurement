package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

import static com.quantitymeasurement.Units.add;
import static com.quantitymeasurement.Units.compare;

public class UnitsTest {
    @Test
    public void givenZeroFeetAndZeroInch_ShouldReturnEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET, 0.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.INCHES, 0.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneInch_ShouldReturnNotEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.INCHES, 1.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnNotEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.FEET, 1.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneFeet_ShouldReturnNotEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.INCHES, 12.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneInch_ShouldReturnNotEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.INCHES, 1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.INCHES, 1.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenThreeFeetAndOneYard_ShouldReturnEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET, 3.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.YARD, 1.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchesAndOneYard_ShouldReturnEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.INCHES, 36.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.YARD, 1.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd36Inches_ShouldReturnEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.YARD, 1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.INCHES, 36.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneYardAndThreeFeet_ShouldReturnEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.YARD, 1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.FEET, 3.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneFeetAndOneYard_ShouldReturnNotEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET, 1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.YARD, 1.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneInchAndOneYard_ShouldReturnNotEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.INCHES, 1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.YARD, 1.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneInchAndOneCm_ShouldReturnNotEqualLength() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.INCHES,2.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.CM, 5.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneInchAndOneCm_ShouldReturnAdditionOfBothInInches() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.INCHES,2.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.CM, 5.0);
        double add = add(val1,val2);
        Assert.assertEquals(4,add,0.0);
    }

    @Test
    public void givenOneFeetAndTwoInches_ShouldReturnAdditionOfBothInInches() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.INCHES, 2.0);
        double add = add(val1,val2);
        Assert.assertEquals(14,add,0.0);
    }

    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnAdditionOfBothInInches() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.FEET,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.FEET, 1.0);
        double add = add(val1,val2);
        Assert.assertEquals(24,add,0.0);
    }

    @Test
    public void givenTwoInchAndTwoHalfCm_ShouldReturnAdditionOfBothInInches() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.INCHES,2.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.CM, 2.5);
        double add = add(val1,val2);
        Assert.assertEquals(3,add,0.0);
    }

    @Test
    public void givenOneLitreAnd1000ml_ShouldReturnAdditionOfBoth() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.LITRE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.ML, 1000.0);
        double add = add(val1,val2);
        Assert.assertEquals(2,add,0.0);
    }

    @Test
    public void givenOneGallonAndLitre_ShouldReturnReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.GALLON,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.LITRE, 3.78);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneGallonAnd3Litre_ShouldReturnAdditionOfBothInLitres() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.GALLON,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.LITRE, 3.78);
        double add = add(val1,val2);
        Assert.assertEquals(7.56,add,0.0);
    }

    @Test
    public void givenOneLitreAnd1000ml_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.LITRE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.ML, 1000.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneLitreAnd1Feet_ShouldReturnNotAdditionOfBoth() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.LITRE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.INCHES, 1.0);
        double add = add(val1,val2);
        Assert.assertNotEquals(2.0,add);
    }

    @Test
    public void givenOneKgAnd1000gm_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.KG,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.GRAM, 1000.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneTonneAnd1000Gmams_ShouldReturnAdditionOfBoth() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.TONNE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.GRAM, 1000.0);
        double add = add(val1,val2);
        Assert.assertEquals(1001.0,add,0.0);
    }

    @Test
    public void givenOneTonneAnd1000Kgs_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.TONNE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.KG, 1000.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneTonneAnd100Kgs_ShouldReturnFalse() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.TONNE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.KG, 100.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void givenOneTonneAnd100Kgs_ShouldReturnNotAdditionOfBoth() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.TONNE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.KG, 100.0);
        double add = add(val1,val2);
        Assert.assertNotEquals(101.0,add,0.0);
    }

    @Test
    public void givenOneTonneAnd1000Litre_ShouldReturnNotAdditionOfBoth() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.TONNE,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.LITRE, 1000.0);
        double add = add(val1,val2);
        Assert.assertNotEquals(1001.0,add,0.0);
    }

    @Test
    public void givenOneDegreeCAnd1DegreeC_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.CELCIUS,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.CELCIUS, 1.0);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenOneDegreeCelciusAnd2FahrenheitC_ShouldReturnTrue() {
        QuantityMeasurements val1 = new QuantityMeasurements(Units.CELCIUS,1.0);
        QuantityMeasurements val2 = new QuantityMeasurements(Units.FAHRENHEIT, 2.12);
        boolean compareCheck = compare(val1,val2);
        Assert.assertTrue(compareCheck);
    }
}
