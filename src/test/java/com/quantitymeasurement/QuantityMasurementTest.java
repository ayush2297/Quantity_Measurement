package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMasurementTest {
    @Test
    public void givenOneFeetAndOneFeet_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }
}
