public class Length {


    private int value;
    private Unit unit;

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null || otherObject.getClass() != this.getClass()) {
            return false;
        }
        return toBase() == ((Length) otherObject).toBase();
    }

    private int toBase() {
        return this.value * this.unit.getNumberOfInches();
    }

    @Override
    public String toString() {
        return "" + value + "" + unit;
    }
}
