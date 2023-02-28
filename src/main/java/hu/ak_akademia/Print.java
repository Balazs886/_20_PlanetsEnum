package hu.ak_akademia;

public class Print {

    public static void printPlanet(Planet planet) {
        System.out.println("A " + planet.getName() + "bolygó");
        System.out.println("sugara" + planet.getRadius() + " km");
        System.out.println("felszíne " + planet.getMass() + "km2");
        System.out.println(planet.getSourface());
        System.out.println(planet.getVolume());
        System.out.println(planet.getDensity());
        System.out.println(planet.getDifficultyAcceleration());
        System.out.println(planet.getEscapeVelocity());
    }
}
