import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which calculator? (normal/density/pressure/average speed/converter of units/acceleration/weight): ");
        String whichCalculator = scanner.next();
        int d = 1;

        switch (whichCalculator) {
            case "normal" -> {
                System.out.println("Number of digits being used: ");
                double numberOfDigits = scanner.nextDouble();
                int digit = 0;
                for (int i = 0; i < numberOfDigits; i++) {
                    System.out.print("Enter digit and operation: ");
                    digit = scanner.nextInt();
                    String operation = scanner.next();
                    if (operation.equals("+")) {
                        digit += d;
                    } else if (operation.equals("-")) {
                        digit -= d;
                    } else if (operation.equals("*")) {
                        digit *= d;
                    } else if (operation.equals("/")) {
                        digit /= d;
                    }
                    d = digit;
                }
                System.out.println("Answer: " + digit);
            }

            case "converter" -> {
                System.out.println("Which unit are you using (distance/weight/time): ");
                String unit = scanner.next();
                if (unit.equals("distance")) {
                    System.out.println("Which unit do you want to convert(mm/cm/m/km): ");
                    String distance = scanner.next();
                    if (distance.equals("mm")) {
                        double mm = scanner.nextDouble();
                        System.out.print("Which unit to convert (cm/m/km): ");
                        String convert = scanner.next();
                        if (convert.equals("cm")) {
                            double converted = mm * 10;
                            System.out.print(converted + "cm");
                        } else if (convert.equals("m")) {
                            double converted = mm * 100;
                            System.out.print(converted + "m");
                        } else if (convert.equals("km")) {
                            double converted = mm * 1000;
                            System.out.print(converted + "km");
                        } else {
                            System.out.print("Invalid input");
                        }

                    } else if (distance.equals("cm")) {
                        double cm = scanner.nextDouble();
                        System.out.print("Which unit to convert (mm/m/km): ");
                        String convert = scanner.next();
                        if (convert.equals("mm")) {
                            
                        }
                    }







                    //NAO TERMINADO EM BAIXO
                } else if (unit.equals("time")) {
                    System.out.println("Which unit do you want to convert(s/m/h/d/w/y): ");
                    String time = scanner.next();
                    if (time.equals("mm")) {
                        double mm = scanner.nextDouble();
                        System.out.print("Which unit to convert(cm/m/km): ");
                        String convert = scanner.next();
                        if (convert.equals("cm")) {
                            double converted = mm * 10;
                            System.out.print(converted + "cm");
                        } else if (convert.equals("m")) {
                            double converted = mm * 100;
                            System.out.print(converted + "m");
                        } else if (convert.equals("km")) {
                            double converted = mm * 1000;
                            System.out.print(converted + "km");
                        } else {
                            System.out.print("Invalid input");
                        }
                    }
                } else if (unit.equals("weight")) {

                }
            }

            case "weight" -> {
                System.out.println("Give one unit to be found (weight/mass/gravity):\n");
                String unit = scanner.next();
                switch (unit) {
                    case "weight" -> {
                        System.out.print("What is the mass and gravity (kg and N/kg):\n");
                        double mass = scanner.nextDouble();
                        double gravity = scanner.nextDouble();
                        double weight = mass * gravity;
                        System.out.println("Weight: " + weight + "N");
                    }

                    case "mass" -> {
                        System.out.print("What is the weight and gravity (m/s2 and N/kg):\n");
                        double weight = scanner.nextDouble();
                        double gravity = scanner.nextDouble();
                        double mass = weight / gravity;
                        System.out.println("Mass: " + mass + "km");
                    }

                    case "gravity" -> {
                        System.out.print("What is the weight and mass (N and kg):\n");
                        double weight = scanner.nextDouble();
                        double mass = scanner.nextDouble();
                        double gravity = weight / mass;
                        System.out.println("Gravity: " + gravity + "m/s2");
                    }
                    default -> System.out.println("Invalid input");
                }
            }

            case "acceleration" -> {
                System.out.println("Give one unit to be found (acceleration/velocity/time):\n");
                String unit = scanner.next();
                switch (unit) {
                    case "acceleration" -> {
                        System.out.print("What is the velocity and time (m/s and s):\n");
                        double velocity = scanner.nextDouble();
                        double time = scanner.nextDouble();
                        double acceleration = velocity / time;
                        System.out.println("Acceleration: " + acceleration + "m/s2");
                    }

                    case "velocity" -> {
                        System.out.print("What is the acceleration and time (m/s2 and s):\n");
                        double acceleration = scanner.nextDouble();
                        double time = scanner.nextDouble();
                        double velocity = acceleration * time;
                        System.out.println("Velocity: " + velocity + "km");
                    }

                    case "time" -> {
                        System.out.print("What is the acceleration and velocity (m/s2 and m/s):\n");
                        double acceleration = scanner.nextDouble();
                        double velocity = scanner.nextDouble();
                        double time = velocity / acceleration;
                        System.out.println("Time: " + time + "s");
                    }
                    default -> System.out.println("Invalid input");
                }
            }

            case "speed" -> {
                System.out.println("Give one unit to be found (speed/distance/time):");
                String unit = scanner.next();
                switch (unit) {
                    case "speed" -> {
                        System.out.print("What is the distance and time (km and h):\n");
                        double distance = scanner.nextDouble();
                        double time = scanner.nextDouble();
                        double speed = distance / time;
                        System.out.println("Average Speed: " + speed + "km/h");
                    }

                    case "distance" -> {
                        System.out.print("What is the average speed and time (km/h and h):\n");
                        double speed = scanner.nextDouble();
                        double time = scanner.nextDouble();
                        double distance = speed * time;
                        System.out.println("Distance: " + distance + "km");
                    }

                    case "time" -> {
                        System.out.print("What is the average speed and distance (km/h and km):\n");
                        double speed = scanner.nextDouble();
                        double distance = scanner.nextDouble();
                        double time = distance / speed;
                        System.out.println("Time: " + time + "h");
                    }
                    default -> System.out.println("Invalid input");
                }
            }

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
                    default -> System.out.println("Invalid input");
                }
            }

            default -> System.out.println("Invalid input");
        }
        scanner.close();
    }
}