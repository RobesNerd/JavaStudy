import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which calculator? (normal/density/pressure/average speed/converter of units/acceleration/weight): ");
        String whichCalculator = scanner.next();

        switch (whichCalculator) {
            case "normal" -> {
                System.out.print("Enter the first number: ");
                double result = scanner.nextDouble();

                while (true) {
                    System.out.print("Enter an operation (+, -, *, /) or '.' to quit: ");
                    char operator = scanner.next().charAt(0);

                    if (operator == '.') {
                        break;
                    }

                    System.out.print("Enter the next number: ");
                    double number = scanner.nextDouble();

                    switch (operator) {
                        case '+':
                            result += number;
                            break;
                        case '-':
                            result -= number;
                            break;
                        case '*':
                            result *= number;
                            break;
                        case '/':
                            if (number != 0) {
                                result /= number;
                            } else {
                                System.out.println("Cannot divide by zero. Try again.");
                                continue;
                            }
                            break;
                        default:
                            System.out.println("Invalid operator. Try again.");
                            continue;
                    }
                    System.out.println("Current result: " + result);
                }
                System.out.println("Final result: " + result);
                scanner.close();
            }

            case "converter" -> {
                System.out.println("Which unit are you using (distance/weight/time/digital storage/volume/tension): ");
                String unit = scanner.next();
                if (unit.equals("distance")) {
                    System.out.println("Which unit do you want to convert(mm/cm/m/km): ");
                    String distance = scanner.next();
                    if (distance.equals("mm")) {
                        double mm = scanner.nextDouble();
                        System.out.print("Which unit to convert (cm/m/km): ");
                        String convert = scanner.next();
                        if (convert.equals("cm")) {
                            double converted = mm / 10;
                            System.out.print(converted + "cm");
                        } else if (convert.equals("m")) {
                            double converted = mm / 1000;
                            System.out.print(converted + "m");
                        } else if (convert.equals("km")) {
                            double converted = mm / 1000000;
                            System.out.print(converted + "km");
                        } else {
                            System.out.print("Invalid input");
                        }

                    } else if (distance.equals("cm")) {
                        double cm = scanner.nextDouble();
                        System.out.print("Which unit to convert (mm/m/km): ");
                        String convert = scanner.next();
                        if (convert.equals("mm")) {
                            double converted = cm * 10;
                            System.out.print(converted + "mm");
                        } else if (convert.equals("m")) {
                            double converted = cm / 100;
                            System.out.print(converted + "m");
                        } else if (convert.equals("km")) {
                            double converted = cm / 100000;
                            System.out.print(converted + "km");
                        } else {
                            System.out.print("Invalid input");
                        }

                    } else if (distance.equals("m")) {
                        double m = scanner.nextDouble();
                        System.out.print("Which unit to convert (mm/cm/km): ");
                        String convert = scanner.next();
                        if (convert.equals("mm")) {
                            double converted = m * 1000;
                            System.out.print(converted + "mm");
                        } else if (convert.equals("cm")) {
                            double converted = m * 100;
                            System.out.print(converted + "cm");
                        } else if (convert.equals("km")) {
                            double converted = m / 1000;
                            System.out.print(converted + "km");
                        } else {
                            System.out.print("Invalid input");
                        }

                    } else if (distance.equals("km")) {
                        double km = scanner.nextDouble();
                        System.out.print("Which unit to convert (mm/cm/m): ");
                        String convert = scanner.next();
                        if (convert.equals("mm")) {
                            double converted = km * 1000000;
                            System.out.print(converted + "mm");
                        } else if (convert.equals("cm")) {
                            double converted = km * 100000;
                            System.out.print(converted + "cm");
                        } else if (convert.equals("m")) {
                            double converted = km * 1000;
                            System.out.print(converted + "m");
                        } else {
                            System.out.print("Invalid input");
                        }
                    }

                } else if (unit.equals("time")) {
                    System.out.println("Which unit do you want to convert(s/m/h/d/w/y): ");
                    String time = scanner.next();
                    if (time.equals("s")) {
                        double s = scanner.nextDouble();
                        System.out.print("Which unit to convert(m/h/d/w/ms/y): ");
                        String convert = scanner.next();
                        if (convert.equals("m")) {
                            double converted = s / 60;
                            System.out.print(converted + "m");
                        } else if (convert.equals("h")) {
                            double converted = s / 3600;
                            System.out.print(converted + "h");
                        } else if (convert.equals("d")) {
                            double converted = s / 86400;
                            System.out.print(converted + "d");
                        } else if (convert.equals("w")) {
                            double converted = s / 604800;
                            System.out.print(converted + "w (apr.)");
                        } else if (convert.equals("ms")) {
                            double converted = s / 262800000;
                            System.out.print(converted + "ms (apr.)");
                        } else if (convert.equals("y")) {
                            double converted = s / 315400000;
                            System.out.print(converted + "y (apr.)");
                        } else {
                            System.out.print("Invalid input");
                        }
                    }
                } else if (unit.equals("weight")) {
                    System.out.println("Which unit do you want to convert(g/kg/T): ");
                    String weight = scanner.next();
                    if (weight.equals("g")) {
                        double g = scanner.nextDouble();
                        System.out.print("Which unit to convert(kg/T): ");
                        String convert = scanner.next();
                        if (convert.equals("kg")) {
                            double converted = g / 1000;
                            System.out.print(converted + "kg");
                        } else if (convert.equals("T")) {
                            double converted = g / 1000000;
                            System.out.print(converted + "T");
                        } else {
                            System.out.print("Invalid input");
                        }
                    } else if (weight.equals("kg")) {
                        double kg = scanner.nextDouble();
                        System.out.print("Which unit to convert(g/T): ");
                        String convert = scanner.next();
                        if (convert.equals("g")) {
                            double converted = kg * 1000;
                            System.out.print(converted + "g");
                        } else if (convert.equals("T")) {
                            double converted = kg / 1000;
                            System.out.print(converted + "T");
                        } else {
                            System.out.print("Invalid input");
                        }
                    } else if (weight.equals("T")) {
                        double T = scanner.nextDouble();
                        System.out.print("Which unit to convert(g/kg): ");
                        String convert = scanner.next();
                        if (convert.equals("g")) {
                            double converted = T * 1000000;
                            System.out.print(converted + "g");
                        } else if (convert.equals("kg")) {
                            double converted = T * 1000;
                            System.out.print(converted + "kg");
                        } else {
                            System.out.print("Invalid input");
                        }
                    } else {
                        System.out.print("Invalid input");
                    }
                } else if (unit.equals("digital")) {
                    System.out.print("Which unit do you want to convert(Mb/Gb/Tb): ");
                    String digital = scanner.next();
                    if (digital.equals("Mb")) {
                        double mb = scanner.nextDouble();
                        System.out.print("Which unit to convert(Gb/Tb): ");
                        String convert = scanner.next();
                        if (convert.equals("Gb")) {
                            double converted = mb / 1000;
                            System.out.print(converted + "Gb");
                        } else if (convert.equals("Tb")) {
                            double converted = mb / 1000000;
                            System.out.print(converted + "Tb");
                        } else {
                            System.out.print("Invalid input");
                        }
                    } else if (digital.equals("Gb")) {
                        double gb = scanner.nextDouble();
                        System.out.print("Which unit to convert(Mb/Tb): ");
                        String convert = scanner.next();
                        if (convert.equals("Mb")) {
                            double converted = gb * 1000;
                            System.out.print(converted + "Gb");
                        } else if (convert.equals("Tb")) {
                            double converted = gb / 1000;
                            System.out.print(converted + "Tb");
                        } else {
                            System.out.print("Invalid input");
                        }
                    } else if (digital.equals("Tb")) {
                        double gb = scanner.nextDouble();
                        System.out.print("Which unit to convert(Mb/Tb): ");
                        String convert = scanner.next();
                        if (convert.equals("Mb")) {
                            double converted = gb * 1000;
                            System.out.print(converted + "Gb");
                        } else if (convert.equals("Tb")) {
                            double converted = gb / 1000;
                            System.out.print(converted + "Tb");
                        } else {
                            System.out.print("Invalid input");
                        }
                    }
                } else if (unit.equals("volume")) {
                        System.out.print("Which unit you will want to convert? (mm3/cm3/m3/km3)");
                        String convert = scanner.next();
                        if (convert.equals("mm3")) {
                            double mm = scanner.nextDouble();
                            System.out.print("Which unit to convert? (cm3/m3/km3)");
                            String conversion = scanner.next();
                            if (conversion.equals("cm3")) {
                                double converted = mm / 1000;
                                System.out.print(converted + "cm3");
                            } else if (conversion.equals("m3")) {
                                double converted = mm / 1000000000;
                                System.out.print(converted + "m3");
                            } else if (conversion.equals("km3")) {
                                double converted = mm / (1000000 * 1000);
                                System.out.print(converted + "km3  (aprx.)");
                            } else {
                                System.out.print("Invalid Input");
                            }
                        } else if (convert.equals("cm3")) {
                            double cm = scanner.nextDouble();
                            System.out.print("Which unit to convert? (mm3/m3/km3)");
                            String conversion = scanner.next();
                            if (conversion.equals("mm3")) {
                                double converted = cm * 1000;
                                System.out.print(converted + "mm3");
                            } else if (conversion.equals("m3")) {
                                double converted = cm / 1000000;
                                System.out.print(converted + "m3");
                            } else if (conversion.equals("km3")) {
                                double converted = cm / 1000000000;
                                System.out.print(converted + "km3  (aprx.)");
                            } else {
                                System.out.print("Invalid Input");
                            }
                        } else if (convert.equals("m3")) {
                            double m = scanner.nextDouble();
                            System.out.print("Which unit to convert? (mm3/cm3/km3)");
                            String conversion = scanner.next();
                            if (conversion.equals("mm3")) {
                                double converted = m * 1000000000;
                                System.out.print(converted + "mm3");
                            } else if (conversion.equals("cm3")) {
                                double converted = m * 1000000;
                                System.out.print(converted + "cm3");
                            } else if (conversion.equals("km3")) {
                                double converted = m / 1000000000;
                                System.out.print(converted + "km3");
                            } else {
                                System.out.print("Invalid Input");
                            }
                        } else if (convert.equals("km3")) {
                            double km = scanner.nextDouble();
                            System.out.print("Which unit to convert? (mm3/cm3/m3)");
                            String conversion = scanner.next();
                            if (conversion.equals("mm3")) {
                                double converted = km * 1000000000;
                                System.out.print(converted + "mm3 (aprx.)");
                            } else if (conversion.equals("cm3")) {
                                double converted = km * 1000000000;
                                System.out.print(converted + "cm3 (aprx.)");
                            } else if (conversion.equals("m3")) {
                                double converted = km * 1000000000;
                                System.out.print(converted + "m3");
                            } else {
                                System.out.print("Invalid Input");
                            }
                        } else {
                            System.out.print("Invalid Input");
                        }
                    } else if (unit.equals("energy")) {
                        System.out.print("Which unit you will want to convert? (j/kj)");
                        String convert = scanner.next();
                        if (convert.equals("j")) {
                            double j = scanner.nextDouble();
                            double converted = j / 1000;
                            System.out.print(converted + "kj");
                        } else if (convert.equals("kj")) {
                            double kj = scanner.nextDouble();
                            double converted = kj * 1000;
                            System.out.print(converted + "j");
                        }
                    } else {
                        System.out.print("Invalid input");
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
                System.out.print("Which pressure would you like to choose? (normal/water)");
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

                    case "water" -> {
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
                    } case "tension" -> {
                        System.out.print("Choose a unit to be found (tension/mass/gravity/acceleration)");
                        String unit = scanner.next();
                        if (unit.equals("tension")) {
                            System.out.print("Which are the units for mass, gravity and acceleration?");
                            double mass = scanner.nextDouble();
                            double gravity = scanner.nextDouble();
                            double acceleration = scanner.nextDouble();
                            double tension = mass * (gravity + acceleration);
                            System.out.print("Tension: " + tension + "N");
                        } else if (unit.equals("mass")) {
                            System.out.print("Which are the units for tension, gravity and acceleration?");
                            double tension = scanner.nextDouble();
                            double gravity = scanner.nextDouble();
                            double acceleration = scanner.nextDouble();
                            double mass = tension / (gravity + acceleration);
                            System.out.print("Mass: " + mass + "Kg");
                        } else if (unit.equals("gravity")) {
                            System.out.print("Which are the units for tension, mass and acceleration?");
                            double tension = scanner.nextDouble();
                            double mass = scanner.nextDouble();
                            double acceleration = scanner.nextDouble();
                            double gravity = (tension / mass) - acceleration;
                            System.out.print("Gravity: " + gravity + "m/s2");
                        } else if (unit.equals("acceleration")) {
                            System.out.print("Which are the units for tension, mass and gravity?");
                            double tension = scanner.nextDouble();
                            double mass = scanner.nextDouble();
                            double gravity = scanner.nextDouble();
                            double acceleration = (tension / mass) - gravity;
                            System.out.print("Acceleration: " + acceleration + "m/s2");
                        } else {
                            System.out.print("Invalid input");
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