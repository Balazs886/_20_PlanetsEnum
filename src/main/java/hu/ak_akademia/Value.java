package hu.ak_akademia;

import java.text.NumberFormat;
import java.util.Locale;

public class Value {
    private static NumberFormat numberFormat = NumberFormat.getInstance(new Locale("hu", "HU"));

    static {
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(0);
    }

    private String value;
    private Unit unit;

    public Value(String value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public Value(Integer value, Unit unit) {
        this.value = numberFormat.format(value.longValue());
        this.unit = unit;
    }

    public Value(Double value, Unit unit) {
        this.value = numberFormat.format(value);
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("%s %s", value, unit.unit);
    }
}
