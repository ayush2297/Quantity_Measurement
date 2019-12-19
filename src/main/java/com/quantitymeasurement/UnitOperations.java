package com.quantitymeasurement;

public interface UnitOperations {

    double getBaseValue(QuantityMeasurements obj);

    default boolean typeSame(UnitOperations unit, UnitOperations unit1) throws QuantityMeasurementException {
        boolean typeCheck = unit.getClass().equals(unit1.getClass());
        if (!typeCheck) {
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.INCOMPATIBLE_TYPES,
                    "Different types cannot added or compared");
        }
        return true;
    }

    default boolean compare(QuantityMeasurements obj1, QuantityMeasurements obj2) throws QuantityMeasurementException {
        if (typeSame(obj1.unit, obj2.unit)) {
            Double first = obj1.unit.getBaseValue(obj1);
            Double second = obj2.unit.getBaseValue(obj2);
            return first.equals(second);
        }
        return false;
    }

    default double add(QuantityMeasurements obj1, QuantityMeasurements obj2) throws QuantityMeasurementException {
        if (typeSame(obj1.unit, obj2.unit)) {
            Double first = obj1.unit.getBaseValue(obj1);
            Double second = obj2.unit.getBaseValue(obj2);
            return first + second;
        }
        return 0.0;
    }
}





