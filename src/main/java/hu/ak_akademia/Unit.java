package hu.ak_akademia;

public enum Unit {
    LENGTH("km"), MASS("kg"), DENSITY("kg/dm"), ACCELERATION("m/s^2"), VELOCITY("km/s");

    public final String unit;

    Unit(String unit) {
        this.unit = unit;
    }
}
