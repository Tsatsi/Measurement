public enum Unit {
    INCH(1,UnitType.LENGTH),
    FOOT(12,UnitType.LENGTH),
    YARD(36,UnitType.LENGTH),
    MILE(63360,UnitType.LENGTH),
    TEASPOON(1,UnitType.VOLUME),
    TABLESPOON(3,UnitType.VOLUME),
    OUNCE(6,UnitType.VOLUME),
    CUP(48,UnitType.VOLUME);

    private int baseFactor;
    private UnitType unitType;

    Unit(int unitValue, UnitType unitType ) {
        this.baseFactor = unitValue;
        this.unitType = unitType;
    }
    public int toBase(int value) {
        return value * this.baseFactor;
    }

    public UnitType getUnitType() {
        return unitType;
    }
}

