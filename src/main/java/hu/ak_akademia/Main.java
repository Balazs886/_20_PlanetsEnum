package hu.ak_akademia;

public class Main {
    public static void main(String[] args) {
        printPlanets();
    }

    public static void printPlanets() {
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }

    }
}
