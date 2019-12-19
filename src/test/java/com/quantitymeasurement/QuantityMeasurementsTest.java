package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementsTest {

    @Test
    public void givenOneFeetAndOneFeet_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Length.FEET;
            UnitOperations unit2 = Length.FEET;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoInchAndTwoInch_WhenComparedAndEqual_ShouldReturnAdditionOfBothInInches() {
        try {
            UnitOperations unit1 = Length.INCHES;
            UnitOperations unit2 = Length.INCHES;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 2);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 2);
            double add = val1.add(val2);
            Assert.assertEquals(4, add, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneFeetAndTwoInch_WhenComparedAndEqual_ShouldReturnBothAddInInches() {
        try {
            UnitOperations unit1 = Length.FEET;
            UnitOperations unit2 = Length.INCHES;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 2);
            double add = val1.add(val2);
            Assert.assertEquals(14, add, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneFeetAndOneFeet_WhenComparedAndEqual_ShouldReturnBothAddInches() {
        try {
            UnitOperations unit1 = Length.FEET;
            UnitOperations unit2 = Length.FEET;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1);
            double add = val1.add(val2);
            Assert.assertEquals(24, add, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneFeetAndTwelthInches_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Length.FEET;
            UnitOperations unit2 = Length.INCHES;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 12);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenTwoFeetAndTwoHalfCm_WhenComparedAndEqual_ShouldReturnBothAddInches() {
        try {
            UnitOperations unit1 = Length.INCHES;
            UnitOperations unit2 = Length.CM;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 2);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 2.5);
            double add = val1.add(val2);
            Assert.assertEquals(3, add, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenThreeFeetAndOneYard_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Length.FEET;
            UnitOperations unit2 = Length.YARD;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 3);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneFeetAndOneYard_WhenComparedAndEqual_ShouldReturnFalse() {
        try {
            UnitOperations unit1 = Length.FEET;
            UnitOperations unit2 = Length.YARD;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1);
            boolean compare = val1.compare(val2);
            Assert.assertFalse(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void givenThreeFeetAnd12Inches_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Length.FEET;
            UnitOperations unit2 = Length.INCHES;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 12);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneInchAndOneYard_WhenComparedAndEqual_ShouldReturnFalse() {
        try {
            UnitOperations unit1 = Length.INCHES;
            UnitOperations unit2 = Length.YARD;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1);
            boolean compare = val1.compare(val2);
            Assert.assertFalse(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneYardAndThirtySixInches_WhenComparedAndEqual_ShouldReturntrue() {
        try {
            UnitOperations unit1 = Length.YARD;
            UnitOperations unit2 = Length.INCHES;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 36);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenThirtySixInchesAndOneYard_WhenComparedAndEqual_ShouldReturntrue() {
        try {
            UnitOperations unit1 = Length.YARD;
            UnitOperations unit2 = Length.INCHES;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 36);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void given100degCelAnd212Farh_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Temperature.CELCIUS;
            UnitOperations unit2 = Temperature.FAHRENHEIT;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 100);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 212);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneFeetAndTwelthKg_WhenComparedAndEqual_ShouldThrowAndException() {
        try {
            UnitOperations unit1 = Length.FEET;
            UnitOperations unit2 = Weight.KG;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 12);
            boolean compare = val1.compare(val2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.INCOMPATIBLE_TYPES, e.type);
        }
    }

    @Test
    public void givenOneGallonAndThreePtSevenEightLitre_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Volume.GALLON;
            UnitOperations unit2 = Volume.LITRE;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 3.78);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneLitreAndThousandML_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Volume.LITRE;
            UnitOperations unit2 = Volume.ML;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1000);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneGallonAndThreePtSevenEightLitre_WhenComparedAndEqual_ShouldReturnBothAddInLitres() {
        try {
            UnitOperations unit1 = Volume.GALLON;
            UnitOperations unit2 = Volume.LITRE;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 3.78);
            double add = val1.add(val2);
            Assert.assertEquals(7.57, add, 0.1);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneLitreAndThousandMl_WhenComparedAndEqual_ShouldReturnBothAddInLitres() {
        try {
            UnitOperations unit1 = Volume.LITRE;
            UnitOperations unit2 = Volume.ML;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1000);
            double add = val1.add(val2);
            Assert.assertEquals(2, add, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneKgAndThousandGrams_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Weight.KG;
            UnitOperations unit2 = Weight.GRAM;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1000);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneTonneAndThausandKgs_WhenComparedAndEqual_ShouldReturnTrue() {
        try {
            UnitOperations unit1 = Weight.TONNE;
            UnitOperations unit2 = Weight.KG;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1000);
            boolean compare = val1.compare(val2);
            Assert.assertTrue(compare);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenOneTonneAndThausandGrams_WhenComparedAndEqual_ShouldReturnBothAddInKg() {
        try {
            UnitOperations unit1 = Weight.TONNE;
            UnitOperations unit2 = Weight.GRAM;
            QuantityMeasurements val1 = new QuantityMeasurements(unit1, 1);
            QuantityMeasurements val2 = new QuantityMeasurements(unit2, 1000);
            double add = val1.add(val2);
            Assert.assertEquals(1001, add, 0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }
}
