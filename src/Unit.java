public enum Unit {
    INCHES(1),
    FEET(12),
    YARDS(36),
    MILES(63360);
    private int numberOfInches;

    Unit(int numberOfInches) {
        this.numberOfInches = numberOfInches;
    }
    int getNumberOfInches(){
        return numberOfInches;
    }

}
