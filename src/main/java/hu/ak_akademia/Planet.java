package hu.ak_akademia;

public enum Planet {
    MERKURY("Merkúr", 2439.64, 3.302 * Math.pow(10, 23)
    ), VENUS("Vénusz", 6051.59, 4.869 * Math.pow(10, 24)
    ), EARTH("Föld", 6378.1, 5.972 * Math.pow(10, 24)
    ), MARS("Mars", 3397, 6.4191 * Math.pow(10, 23)
    ), JUPITER("Jupiter", 71492.68, 1.8987 * Math.pow(10, 27)
    ), SATURN("Szaturnusz", 60267.14, 5.6851 * Math.pow(10, 26)
    ), URANUS("Uránusz", 25557.25, 8.6849 * Math.pow(10, 25)
    ), NEPTUNE("Neptunusz", 24766.36, 1.0244 * Math.pow(10, 26)
    );

    private final double pi = 3.14;
    private final String name;
    private final Value radius;
    private final double mass;
    private final double sourface;
    private double volume;
    private double density;
    private double difficultyAcceleration;
    private double escapeVelocity;
    private double gamma = 1;

    Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = new Value(radius, Unit.LENGTH);

        this.mass = mass;
        this.sourface = 4 * Math.pow(radius, 2) * pi;
        this.volume = 4 * Math.pow(radius, 3) * pi / 3;
        this.density = mass / volume;
        this.difficultyAcceleration = gamma * mass / Math.pow(radius, 2);
        this.escapeVelocity = Math.pow((2 * gamma * mass) / radius, 2);
    }

    @Override
    public String toString() {
        String result = String.format("A %s bolygó\n", name);
        result += String.format("sugara %s\n", radius);
        return result;
    }
}
