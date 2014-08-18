public class Measurement {


    private int value;
    private Unit unit;

    public Measurement(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null || otherObject.getClass() != this.getClass()) {
            return false;
        }
        Measurement otherMeasurement = (Measurement) otherObject;

        if (unit.getUnitType() != otherMeasurement.unit.getUnitType())
            return false;

        return unit.toBase(value) == otherMeasurement.unit.toBase(otherMeasurement.value);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "" + value + "" + unit;
    }
}
