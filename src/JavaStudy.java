import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Choose a recipe:
                1 - Breakfast
                2 - Appetizers
                3 - Soups and Salads
                4 - Main Dishes (Meat)
                5 - Main Dishes (Vegetarian/Vegan)
                6 - Pasta and Noodles
                7 - Rice and Grains
                8 - Side Dishes
                9 - Desserts
                10 - Drinks:\s""");
        String recipe = scanner.next();

        if (recipe.equals("1")) {
            System.out.print("Choose between 1 and 5: ");
            int breakfast = scanner.nextInt();
            if (breakfast == 1) {
                System.out.print("And your food is...Fluffy Pancakes!!!\n");
                System.out.print("Here is how you make Fluffy Pancakes:\n");
                System.out.print("""
                       Ingredients:
                       
                        - 1 1/2 cups all-purpose flour
                        - 3 1/2 teaspoons baking powder
                        - 1 teaspoon salt
                        - 1 tablespoon white sugar
                        - 1 1/4 cups milk
                        - 1 egg
                        - 3 tablespoons melted butter
                        - 1 teaspoon vanilla extract (optional)
                       
                        Instructions:
                       
                       1. In a large bowl, sift together the flour, baking powder, salt, and sugar;
                       2. In another bowl, whisk together the milk, egg, melted butter, and vanilla extract (if using);
                       3. Pour the wet ingredients into the bowl with the dry ingredients. Stir gently until just combined. The batter should be a bit lumpy. Over-mixing can lead to tough pancakes;
                       4. Heat a griddle or non-stick skillet over medium heat. Lightly grease with butter or oil;
                       5. Pour about 1/4 cup of batter onto the griddle or skillet for each pancake. Cook until bubbles form on the surface and the edges look set, about 2-3 minutes.
                        Flip the pancake and cook for another 1-2 minutes, until golden brown and cooked through;
                       6. Serve the pancakes warm with your favorite toppings, such as butter, maple syrup, fresh fruit, whipped cream, or chocolate chips.
                       
                       Tips:
                       
                       1. Do Not Over-Mix: Mix the batter just until the ingredients are combined. It's okay if there are a few lumps.
                       2. Rest the Batter: Letting the batter rest for a few minutes before cooking can help it thicken and produce fluffier pancakes.
                       3. Proper Heat: Ensure the griddle or skillet is properly preheated. Too hot, and the pancakes will burn before cooking through; too cool, and they will spread too much and become dense.
                       4. Fresh Baking Powder: Make sure your baking powder is fresh. Old baking powder can result in flat pancakes.
                       """);
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
                        - In a heatproof bowl (that can sit on the saucepan without touching the water), whisk together the egg yolks and lemon juice until they thicken and become pale.
                        - Place the bowl over the simmering water, ensuring it doesn't touch the water.
                        - Slowly drizzle in the melted butter while whisking continuously. The sauce should thicken and become smooth.
                        - Season with salt and a pinch of cayenne pepper or paprika, if desired.Remove from heat and cover to keep warm.

                        2. Poach the Eggs:

                        - Fill a medium-sized pot with water and bring it to a gentle simmer. Add a teaspoon of vinegar (optional) to help the eggs hold their shape.
                        - Crack each egg into a small bowl or ramekin.
                        - Create a gentle whirlpool in the simmering water with a spoon and carefully slide each egg into the water.
                        - Poach the eggs for about 3-4 minutes, or until the whites are set and the yolks are still runny.
                        -Remove the eggs with a slotted spoon and place them on a paper towel to drain.

                        3. Cook the Canadian Bacon:

                        - In a skillet over medium heat, cook the Canadian bacon or ham until browned on both sides.

                        4. Assemble the Eggs Benedict:

                        - Place the toasted English muffin halves on plates.
                        - Top each muffin half with a slice of Canadian bacon or ham.
                        - Place a poached egg on top of each bacon slice.
                        - Spoon the warm Hollandaise sauce over the eggs.
                        - Garnish with chopped chives or parsley.
                        """);
            } else if (breakfast == 3) {
                System.out.print("And your food is... French Toast!!!\nHere is how you make French Toast: \n");
                System.out.print("""
                        Ingredients:
                        
                        - 4 slices of bread (preferably a day or two old)
                        - 2 large eggs
                        - 1/2 cup milk (or cream for a richer flavor)
                        - 1 teaspoon vanilla extract
                        - 1/2 teaspoon ground cinnamon
                        - A pinch of salt
                        - 2 tablespoons butter (for cooking)
                        - Maple syrup, powdered sugar, or fresh fruit for serving
                        
                        Instructions:
                        
                        1. In a shallow bowl or pie dish, whisk together the eggs, milk, vanilla extract, cinnamon, and a pinch of salt until well combined.
                        2. Dip each slice of bread into the egg mixture, allowing it to soak for about 20-30 seconds on each side. Ensure the bread is fully coated but not overly soggy.
                        3. Heat a large skillet or griddle over medium heat and add a tablespoon of butter. Allow the butter to melt and coat the pan evenly.
                        4. Place the soaked bread slices onto the skillet. Cook until the bottoms are golden brown, about 2-3 minutes.
                        5. Flip the slices and cook the other side until golden brown, about 2-3 minutes more.
                        
                        Tips:
                        
                        1. Bread Choice: Sturdier bread like brioche, challah, or Texas toast works best as it holds up well when soaked.
                        2. Stale Bread: Slightly stale bread absorbs the egg mixture better without becoming too mushy.
                        3. Even Cooking: If making a large batch, keep cooked slices warm in a low oven (about 200°F or 95°C) while you finish cooking the rest.
                        """);
            } else if (breakfast == 4) {
                System.out.print("And your food is... Breakfast Burritos!!!\nHere is how you make Breakfast Burritos: \n\n");
                System.out.print("""
                        Ingredients:
                        
                        - 6 large eggs
                        - 1/4 cup milk
                        - Salt and pepper, to taste
                        - 1 tablespoon butter or oil
                        - 1 cup shredded cheese (cheddar, Monterey Jack, or your favorite)
                        - 4 large flour tortillas
                        - 1 cup cooked breakfast sausage or bacon, crumbled
                        - 1 cup diced potatoes (cooked)
                        - 1/2 cup diced tomatoes
                        - 1/2 cup diced onions
                        - 1/4 cup chopped green onions
                        - Salsa, sour cream, and avocado (optional, for serving)
                        
                        Instructions:
                        
                        1. In a medium bowl, whisk together the eggs, milk, salt, and pepper until well combined.
                        2. Heat the butter or oil in a large non-stick skillet over medium heat.
                        3. Pour in the egg mixture and cook, stirring gently, until the eggs are scrambled and just set. Remove from heat.
                        4. Warm the tortillas in a dry skillet over medium heat for about 30 seconds on each side, or wrap them in a damp paper towel and microwave for 20-30 seconds to make them pliable.
                        5. Lay a warm tortilla on a flat surface.
                        6. Spoon about 1/4 of the scrambled eggs onto the center of the tortilla.
                        7. Add 1/4 of the cooked breakfast sausage or bacon, cooked potatoes, diced tomatoes, diced onions, and shredded cheese.
                        8. Fold in the sides of the tortilla, then roll it up from the bottom to encase the filling completely.
                        9. Repeat with the remaining tortillas and filling.
                        
                        Tips:
                        
                        1. Customization: Feel free to customize the filling with your favorite ingredients such as sautéed bell peppers, black beans, or spinach.
                        2. Make Ahead: You can make a batch of burritos in advance, wrap them in foil, and freeze. To reheat, unwrap and microwave for 2-3 minutes, or until heated through.
                        3. Crispy Burritos: For a crispy exterior, lightly toast the wrapped burritos in a skillet over medium heat for a couple of minutes on each side.
                        """);
            } else if (breakfast == 5) {
                System.out.print("And your food is... Smoothie Bowl!!!\nHere is how you make a Smoothie Bowl: \n\n");
                System.out.print("""
                        Ingredients:
                        
                        - 1 cup frozen fruit (e.g., mixed berries, mango, banana)
                        - 1/2 cup yogurt (plain or flavored)
                        - 1/2 cup milk or juice (adjust for desired consistency)
                        - 1 tablespoon honey or another sweetener (optional)
                        
                        For the Toppings:
                      
                        - Fresh fruit slices (e.g., banana, strawberries, kiwi)
                        - Granola
                        - Nuts and seeds (e.g., almonds, chia seeds, flaxseeds)
                        - Coconut flakes
                        - Drizzle of honey or nut butter
                        - Any other desired toppings (e.g., cacao nibs, goji berries)
                        
                        Instructions:
                        
                        1. In a blender, combine the frozen fruit, yogurt, milk or juice, and honey (if using).
                        2. Blend until smooth and thick. The mixture should be thicker than a typical smoothie to support the toppings. If it's too thick to blend, add a little more liquid; if it's too thin, add more frozen fruit or a small amount of ice.
                        3. Pour the smoothie mixture into a bowl, using a spoon to help spread it evenly.
                        4. Arrange your chosen toppings on the surface of the smoothie. Be creative and have fun with the presentation!
                        
                        Tips:
                        
                        1. Frozen Fruit: Using frozen fruit helps achieve the thick, creamy consistency that is ideal for smoothie bowls.
                        2. Balance: Aim for a balance of textures and flavors with your toppings—crunchy granola, creamy nut butter, and fresh fruit slices make a satisfying combination.
                        3. Customization: Feel free to customize both the smoothie base and the toppings based on your preferences and what's available. Experiment with different fruits, yogurt types, and toppings to find your favorite combinations.
                        """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("2")) {
            System.out.print("Choose between 1 and 5");
            int app = scanner.nextInt();
            if (app == 1) {
                System.out.print("And you food is... Stuffed Mushrooms!!!\nHere is how you make Stuffed Mushrooms:\n\n");
                System.out.print("""
                        Ingredients:
                        
                        - 1 pound (450 grams) button or cremini mushrooms
                        - 1/4 cup finely chopped onion
                        - 2 cloves garlic, minced
                        - 1/2 cup breadcrumbs (preferably panko for extra crunch)
                        - 1/2 cup grated Parmesan cheese
                        - 4 oz (115 grams) cream cheese, softened
                        - 2 tablespoons chopped fresh parsley
                        - 1/4 teaspoon salt
                        - 1/4 teaspoon black pepper
                        - 2 tablespoons olive oil, divided
                        - 2 tablespoons melted butter (optional, for extra richness)
                        
                        Instructions:
                        
                        1. Preheat your oven to 190°C.
                        2. Clean the mushrooms with a damp paper towel. Remove the stems and set the caps aside.
                        3. Finely chop the stems.
                        4. Heat 1 tablespoon of olive oil in a skillet over medium heat.
                        5. Add the chopped mushroom stems and onions. Sauté until the mixture is soft and the moisture has evaporated, about 5 minutes.
                        6. Add the garlic and sauté for another minute until fragrant.
                        7. Remove from heat and allow to cool slightly.
                        8. In a bowl, combine the sautéed mushroom stems, onions, garlic, breadcrumbs, Parmesan cheese, cream cheese, parsley, salt, and pepper. Mix until well combined.
                        9. Arrange the mushroom caps on a baking sheet, cavity side up.
                        10. Spoon the filling into each mushroom cap, pressing gently to mound it slightly.
                        11. Drizzle the remaining 1 tablespoon of olive oil (and melted butter, if using) over the stuffed mushrooms.
                        12. Bake in the preheated oven for 20-25 minutes, or until the mushrooms are tender and the tops are golden brown.
                        13. Remove from the oven and let cool slightly before serving.
                        14. Garnish with additional chopped parsley, if desired.
                        
                        Tips:
                        
                        1. Mushroom Size: Choose mushrooms that are roughly the same size for even cooking.
                        2. Filling Variations: Customize the filling with ingredients like cooked sausage, spinach, or different cheeses.
                        3. Make-Ahead: Prepare the stuffed mushrooms in advance and refrigerate. Bake just before serving.
                        """);
            } else if (app == 2) {
                System.out.print("And you food is... Bruschetta!!!\nHere is how you make Bruschetta:\n\n");
                System.out.print("""
                        Ingredients:
                        
                        - 1 baguette or Italian bread loaf
                        - 4 large ripe tomatoes, diced
                        - 2 cloves garlic, minced
                        - 1/4 cup fresh basil leaves, chopped
                        - 2 tablespoons extra-virgin olive oil
                        - 1 tablespoon balsamic vinegar (optional)
                        - Salt and pepper, to taste
                        - 1/4 cup grated Parmesan cheese (optional)
                        - Extra olive oil for brushing the bread
                        
                        Instructions:
                        
                        1. In a medium bowl, combine the diced tomatoes, minced garlic, chopped basil, olive oil, balsamic vinegar (if using), salt, and pepper.
                        2. Mix well and let the mixture sit for at least 10 minutes to allow the flavors to meld.
                        3. Preheat your oven to 200°C.
                        4. Slice the baguette or Italian bread into 1/2-inch thick slices.
                        5. Arrange the bread slices on a baking sheet and brush both sides lightly with olive oil.
                        6. Toast the bread in the preheated oven for 5-7 minutes, or until golden brown and crispy.
                        7. Remove the toasted bread from the oven and let it cool slightly.
                        8. Spoon the tomato mixture onto each slice of toasted bread.
                        9. If desired, sprinkle the bruschetta with grated Parmesan cheese.
                        10. Serve the bruschetta immediately, garnished with extra fresh basil if desired.
                        
                        Tips:
                        
                        1. Tomato Quality: Use ripe, flavorful tomatoes for the best taste.
                        2. Bread Choice: A sturdy, crusty bread works best to hold the topping without becoming soggy.
                        3. Garlic Flavor: For a milder garlic flavor, you can rub a cut clove of garlic on the toasted bread slices before adding the tomato mixture.
                        """);
            } else if (app == 3) {
                System.out.print("And you food is... Spinach Artichoke Dip!!!\nHere is how you make Spinach Artichoke Dip:\n\n");
                System.out.print(".");
            } else if (app == 4) {
                System.out.print("And you food is... Caprese Skewers!!!\nHere is how you make Caprese Skewers:\n\n");
                System.out.print(".");
            } else if (app == 5) {
                System.out.print("And you food is... Deviled Eggs Mushrooms!!!\nHere is how you make Deviled Eggs Mushrooms:\n\n");
                System.out.print(".");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("3")) {
            System.out.print("Choose a number between 1 and 5: ");
            int soup = scanner.nextInt();
            if (soup == 1) {
                System.out.print("And your food is... Stuffed Mushrooms!!!\nHere is how you make Stuffed Mushrooms:\n\n");
                System.out.print("");
            } else if (soup == 2) {
                System.out.print("And your food is... Tomato Basil Soup!!!\nHere is how you make Tomato Basil Soup:\n\n");
                System.out.print("");
            } else if (soup == 3) {
                System.out.print("And your food is... Caesar Salad!!!\nHere is how you make Caesar Salad:\n\n");
                System.out.print("");
            } else if (soup == 4) {
                System.out.print("And your food is... Minestrone Soup!!!\nHere is how you make Minestrone Soup\n\n");
                System.out.print("");
            } else if (soup == 5) {
                System.out.print("And your food is... Deviled Eggs!!!\nHere is how you make Deviled Eggs\n\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("4")) {
            System.out.print("Choose a number between 1 and 5: ");
            int main = scanner.nextInt();
            if (main == 1) {
                System.out.print("And your food is... Beef Lasagna!!!\nHere is how you make Beef Lasagna:\n");
                System.out.print("");
            } else if (main == 2) {
                System.out.print("And your food is... Roast Chicken!!!\nHere is how you make Roast Chicken:\n");
                System.out.print("");
            } else if (main == 3) {
                System.out.print("And your food is... Pork Tenderloin with Apples!!!\nHere is how you make Pork Tenderloin with Apples:\n");
                System.out.print("");
            } else if (main == 4) {
                System.out.print("And your food is... Grilled Steak!!!\nHere is how you make a Grilled Steak:\n");
                System.out.print("");
            } else if (main == 5) {
                System.out.print("And your food is... Lemon Garlic Shrimp!!!\nHere is how you make Lemon Garlic Shrimp:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("5")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Vegetable Paella!!!\nHere is how you make Vegetable Paella:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Eggplant Parmesan!!!\nHere is how you make Eggplant Parmesan:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Quinoa Stuffed Peppers!!!\nHere is how you make Quinoa Stuffed Peppers:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Tofu Stir-Fry!!!\nHere is how you make Tofu Stir-Fry:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Vegetarian Chili!!!\nHere is how you make Vegetarian Chili:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("6")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Spaghetti Bolognese!!!\nHere is how you make Spaghetti Bolognese:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Pesto Pasta!!!\nHere is how you make Pesto Pasta:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Shrimp Alfredo!!!\nHere is how you make Shrimp Alfredo:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Lemon Garlic Pasta!!!\nHere is how you make Lemon Garlic Pasta:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Vegetable Lo Mein!!!\nHere is how you make Vegetable Lo Mein:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("7")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Chicken Fried Rice!!!\nHere is how you make Chicken Fried Rice:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Mushroom Risotto!!!\nHere is how you make Mushroom Risotto:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Mexican Rice!!!\nHere is how you make Mexican Rice:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Quinoa Salad!!!\nHere is how you make Quinoa Salad:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Coconut Rice!!!\nHere is how you make Coconut Rice:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("8")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Garlic Mashed Potatoes!!!\nHere is how you make Garlic Mashed Potatoes:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Roasted Vegetables!!!\nHere is how you make Roasted Vegetables:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Coleslaw!!!\nHere is how you make Coleslaw:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Creamed Spinach!!!\nHere is how you make Creamed Spinach:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Baked Sweet Potatoes!!!\nHere is how you make Baked Sweet Potatoes:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("9")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Chocolate Lava Cake!!!\nHere is how you make Chocolate Lava Cake:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Apple Pie!!!\nHere is how you make Apple Pie:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Tiramisu!!!\nHere is how you make Tiramisu:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Key Lime Pie!!!\nHere is how you make Key Lime Pie:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Homemade Ice Cream!!!\nHere is how you make Homemade Ice Cream:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("10")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Margarita!!!\nHere is how you make Margarita:\n");
                System.out.print("");
            } else if (m == 2) {
                System.out.print("And your food is... Mojito!!!\nHere is how you make Mojito:\n");
                System.out.print("");
            } else if (m == 3) {
                System.out.print("And your food is... Hot Toddy!!!\nHere is how you make Hot Toddy:\n");
                System.out.print("");
            } else if (m == 4) {
                System.out.print("And your food is... Green Smoothie!!!\nHere is how you make Green Smoothie:\n");
                System.out.print("");
            } else if (m == 5) {
                System.out.print("And your food is... Iced Matcha Latte!!!\nHere is how you make Iced Matcha Latte:\n");
                System.out.print("");
            } else {
                System.out.print("Invalid input");
            }
        }
    }
}
