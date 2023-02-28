package hu.ak_akademia;

public enum Planet {
    MERKURY("Merkúr", 2439.64, 3.302 * Math.pow(10,23)
    ), VENUS("Vénusz", 6051.59, 4.869 * Math.pow(10,24)
    ), EARTH("Föld", 6378.1, 5.972 * Math.pow(10,24)
    ), MARS("Mars", 3397, 6.4191 * Math.pow(10,23)
    ), JUPITER("Jupiter", 71492.68, 1.8987 * Math.pow(10,27)
    ), SATURN("Szaturnusz", 60267.14, 5.6851 * Math.pow(10,26)
    ), URANUS("Uránusz", 25557.25, 8.6849 * Math.pow(10,25)
    ), NEPTUNE("Neptunusz", 24766.36, 1.0244 * Math.pow(10,26)
    );

    private final double pi = 3.14;
    private final String name;
    private final double radius;
    private final double mass;
    private double volume;
    private double gamma = 1;

    Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public double getSourface() {
        return 4 * Math.pow(radius, 2) * pi;
    }

    public double getVolume() {
        return volume = 4 * Math.pow(radius, 3) * pi / 3;
    }

    public double getDensity() {
        return mass / volume;

    }

    public double getDifficultyAcceleration() {
        return gamma * mass / Math.pow(radius, 2);
    }

    public double getEscapeVelocity() {
        return Math.pow((2*gamma*mass) / radius, 2);
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }
}
