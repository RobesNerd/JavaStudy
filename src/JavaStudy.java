import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which calculator? (normal/density/pressure): ");
        String whichCalculator = scanner.next();

        switch (whichCalculator) {
            case "normal" -> System.out.println("Normal calculator functionality not implemented yet.");
            case "density" -> {
                System.out.print("Give one unit to be found (mass/volume/density):\n");
                String unit = scanner.next();
                switch (unit) {
                    case "mass" -> {
                        System.out.print("What is the density and volume (kg/m3 and m3):\n");
                        double density = scanner.nextDouble();
                        double volume = scanner.nextDouble();
                        double mass = volume * density;
                        System.out.println("Mass: " + mass + "kg");
                    }
                    case "density" -> {
                        System.out.print("What is the mass and volume (kg and m3):\n");
                        double mass = scanner.nextDouble();
                        double volume = scanner.nextDouble();
                        double density = mass / volume;
                        System.out.println("Density: " + density + "kg/m3");
                    }
                    case "volume" -> {
                        System.out.print("What is the mass and density (kg and kg/m3):\n");
                        double mass = scanner.nextDouble();
                        double density = scanner.nextDouble();
                        double volume = mass / density;
                        System.out.println("Volume: " + volume + "m3");
                    }
                    default -> System.out.println("Unknown unit");
                }
            }
            case "pressure" -> {
                System.out.print("Which pressure would you like to choose? (normal/hydrostatic)");
                String pressureChoice = scanner.next();
                switch (pressureChoice) {
                    case "normal" -> {
                        System.out.print("Give one unit to be found (pressure/force/area):\n");
                        String unit = scanner.next();
                        switch (unit) {
                            case "pressure" -> {
                                System.out.print("What is the force and area (N and m2):\n");
                                double force = scanner.nextDouble();
                                double area = scanner.nextDouble();
                                double pressure = force / area;
                                System.out.println("Pressure: " + pressure + "Pa");
                            }
                            case "force" -> {
                                System.out.print("What is the pressure and area (Pa and m2):\n");
                                double pressure = scanner.nextDouble();
                                double area = scanner.nextDouble();
                                double force = pressure * area;
                                System.out.println("Force: " + force + "N");
                            }
                            case "area" -> {
                                System.out.print("What is the force and pressure (N and Pa):\n");
                                double force = scanner.nextDouble();
                                double pressure = scanner.nextDouble();
                                double area = force / pressure;
                                System.out.println("Area: " + area + "m2");
                            }
                            default -> System.out.println("Unknown unit");
                        }
                    }
                    case "hydrostatic" -> {
                        System.out.print("Give one unit to be found (pressure/gravity/density/height):\n");
                        String unit = scanner.next();
                        switch (unit) {
                            case "pressure" -> {
                                System.out.print("What is the height, gravity and density? (m/ m/s2 / kg/m3):\n");
                                double height = scanner.nextDouble();
                                double gravity = scanner.nextDouble();
                                double density = scanner.nextDouble();
                                double pressure = height * gravity * density;
                                System.out.println("Pressure: " + pressure + "Pa");
                            }
                            case "height" -> {
                                System.out.print("What is the pressure, gravity and density? (Pa/ m/s2 / kg/m3):\n");
                                double pressure = scanner.nextDouble();
                                double gravity = scanner.nextDouble();
                                double density = scanner.nextDouble();
                                double height = pressure / (gravity * density);
                                System.out.println("Height: " + height + "m");
                            }
                            case "gravity" -> {
                                System.out.print("What is the pressure, height and density? (Pa/ m / kg/m3):\n");
                                double pressure = scanner.nextDouble();
                                double height = scanner.nextDouble();
                                double density = scanner.nextDouble();
                                double gravity = pressure / (height * density);
                                System.out.println("Gravity: " + gravity + "m/s2");
                            }
                            case "density" -> {
                                System.out.print("What is the pressure, height and gravity? (Pa/ m / m/s2):\n");
                                double pressure = scanner.nextDouble();
                                double height = scanner.nextDouble();
                                double gravity = scanner.nextDouble();
                                double density = pressure / (height * gravity);
                                System.out.println("Density: " + density + "kg/m3");
                            }
                        }
                    }
                }
            }
            default -> System.out.println("Invalid input");
        }

        scanner.close();
    }
}