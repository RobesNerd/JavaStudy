import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a recipe:\n" +
                "1 - Breakfast\n2 - Appetizers\n3 - Soups and Salads\n4 - Main Dishes (Meat)\n5 - Main Dishes (Vegetarian/Vegan)\n" +
                "6 - Pasta and Noodles\n7 - Rice and Grains\n8 - Side Dishes\n9 - Desserts\n10 - Drinks: ");
        String recipe = scanner.next();

        if (recipe.equals("1")) {
            System.out.print("Choose between 1 and 5: ");
            int breakfast = scanner.nextInt();
            if (breakfast == 1) {
                System.out.print("And your food is...Fluffy Pancakes!!!\n");
                System.out.print("Here is how you make a Fluffy Pancake:\n");
                System.out.print(".");
            } else if (breakfast == 2) {
                System.out.print("And your food is...Eggs Benedict!!!\n");
                System.out.print("Here is how you make Eggs Benedict: \n");
                System.out.print("""
                        Ingredients:

                        For the Hollandaise Sauce:

                        - 3 large egg yolks
                        - 1 tablespoon lemon juice
                        - 1/2 cup unsalted butter, melted
                        - Salt, to taste
                        - Cayenne pepper or paprika (optional)

                        For the Eggs Benedict:

                        - 4 large eggs
                        - 2 English muffins, split and toasted
                        - 4 slices Canadian bacon or ham
                        - Fresh chives or parsley, chopped (for garnish)

                        Instructions:

                        1. Prepare the Hollandaise Sauce:

                        - Fill a saucepan with a few inches of water and bring it to a simmer.
                        - In a heatproof bowl (that can sit on the saucepan without touching the water), whisk together the \
                        egg yolks and lemon juice until they thicken and become pale.
                        - Place the bowl over the simmering water, \
                        ensuring it doesn't touch the water.
                        - Slowly drizzle in the melted butter while whisking continuously. \
                        The sauce should thicken and become smooth.
                        - Season with salt and a pinch of cayenne pepper or paprika, \
                        if desired.Remove from heat and cover to keep warm.

                        2. Poach the Eggs:

                        - Fill a medium-sized pot with water and bring it to a gentle simmer. \
                        Add a teaspoon of vinegar (optional) to help the eggs hold their shape.
                        - Crack each egg into a small bowl or ramekin.
                        - Create a gentle whirlpool \
                        in the simmering water with a spoon and carefully slide each egg into the water.
                        - Poach the eggs for about 3-4 minutes, or until the whites are set and the yolks are still runny.
                        -Remove the eggs with a slotted spoon and place them on a paper towel to drain.

                        3. Cook the Canadian Bacon:

                        - In a skillet over medium heat, cook the Canadian bacon o\
                        r ham until browned on both sides.

                        4. Assemble the Eggs Benedict:

                        - Place the toasted English muffin halves on plates.
                        - Top each muffin half with a slice of Canadian bacon or ham.
                        - Place a poached egg on top of each bacon slice.
                        - Spoon the warm Hollandaise sauce over the eggs.
                        - Garnish with chopped chives or parsley.""");
            } else if (breakfast == 3) {
                System.out.print("And your food is... French Toast!!!\nHere is how you make French Toast: \n");
                System.out.print(".");
            } else if (breakfast == 4) {
                System.out.print("And your food is... Breakfast Burritos!!!\nHere is how you make Breakfast Burritos: \n\n");
            } else if (breakfast == 5) {
                System.out.print("And your food is... Smoothie Bowl!!!\nHere is how you make Smoothie Bowl: \n\n");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("2")) {
            System.out.print("Choose between 1 and 5");
            int app = scanner.nextInt();
            if (app == 1) {

            } else if (app == 2) {

            } else if (app == 3) {

            } else if (app == 4) {

            } else if (app == 5) {

            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("3")) {
            System.out.print("Choose a number between 1 and 5: ");
            int soup = scanner.nextInt();
            if (soup == 1) {

            } else if (soup == 2) {
                System.out.print("And your food is... Tomato Basil Soup!!!\nHere is how you make Tomato Basil Soup:\n\n");
                System.out.print("");
            } else if (soup == 3) {
                System.out.print("And your food is... Caesar Salad!!!\nHere is how you make Caesar Salad:\n\n");
            } else if (soup == 4) {
                System.out.print("And your food is... Minestrone Soup!!!\nHere is how you make Minestrone Soup\n\n");
            } else if (soup == 5) {
                System.out.print("And your food is");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("4")) {
            System.out.print("Choose a number between 1 and 5: ");
            int main = scanner.nextInt();
            if (main == 1) {
                System.out.print("And your food is... Beef Lasagna!!!\nHere is how you make a Beef Lasagna:\n");
                System.out.print("");
            } else if (main == 2) {
                System.out.print("And your food is... Roast Chicken!!!\nHere is how you make a Roast Chicken:\n");
                System.out.print("");
            } else if (main == 3) {
                System.out.print("And your food is... Pork Tenderloin with Apples!!!\nHere is how you make a Pork Tenderloin with Apples:\n");
                System.out.print("");
            } else if (main == 4) {
                System.out.print("And your food is... Grilled Steak!!!\nHere is how you make a Grilled Steak:\n");
                System.out.print("");
            } else if (main == 5) {
                System.out.print("And your food is... Lemon Garlic Shrimp!!!\nHere is how you make a Lemon Garlic Shrimp:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("5")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Vegetable Paella!!!\nHere is how you make a Vegetable Paella:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Eggplant Parmesan!!!\nHere is how you make a Eggplant Parmesan:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Quinoa Stuffed Peppers!!!\nHere is how you make a Quinoa Stuffed Peppers:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Tofu Stir-Fry!!!\nHere is how you make a Tofu Stir-Fry:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Vegetarian Chili!!!\nHere is how you make a Vegetarian Chili:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("6")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Spaghetti Bolognese!!!\nHere is how you make a Spaghetti Bolognese:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Pesto Pasta!!!\nHere is how you make a Pesto Pasta:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Shrimp Alfredo!!!\nHere is how you make a Shrimp Alfredo:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Lemon Garlic Pasta!!!\nHere is how you make a Lemon Garlic Pasta:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Vegetable Lo Mein!!!\nHere is how you make a Vegetable Lo Mein:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("7")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Chicken Fried Rice!!!\nHere is how you make a Chicken Fried Rice:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Mushroom Risotto!!!\nHere is how you make a Mushroom Risotto:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Mexican Rice!!!\nHere is how you make a Mexican Rice:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Quinoa Salad!!!\nHere is how you make a Quinoa Salad:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Coconut Rice!!!\nHere is how you make a Coconut Rice:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("8")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Garlic Mashed Potatoes!!!\nHere is how you make a Garlic Mashed Potatoes:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Roasted Vegetables!!!\nHere is how you make a Roasted Vegetables:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Coleslaw!!!\nHere is how you make a Coleslaw:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Creamed Spinach!!!\nHere is how you make a Creamed Spinach:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Baked Sweet Potatoes!!!\nHere is how you make a Baked Sweet Potatoes:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("9")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Chocolate Lava Cake!!!\nHere is how you make a Chocolate Lava Cake:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Apple Pie!!!\nHere is how you make a Apple Pie:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Tiramisu!!!\nHere is how you make a Tiramisu:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Key Lime Pie!!!\nHere is how you make a Key Lime Pie:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Homemade Ice Cream!!!\nHere is how you make a Homemade Ice Cream:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("10")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Margarita!!!\nHere is how you make a Margarita:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Mojito!!!\nHere is how you make a Mojito:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Hot Toddy!!!\nHere is how you make a Hot Toddy:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Green Smoothie!!!\nHere is how you make a Green Smoothie:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Iced Matcha Latte!!!\nHere is how you make a Iced Matcha Latte:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }
    }
}
