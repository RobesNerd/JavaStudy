import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] pancakes = {"""
                       Here is how you make Fluffy Pancakes:
                       
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
                       """};

        String[] eggs = {"""
                        Here is how you make Eggs Benedict:
                        
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
                        """};

        String[] french = {"""
                            Here is how you make French Toast:
                            
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
                            """};

        String[] burritos = {"""
                        Here is how you make Breakfast Burritos:
                        
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
                        """};

        String[] smoothie = {"""
                        Here is how you make a Smoothie Bowl:
                        
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
                        """};

        String[] oats = {"""
                Here is how you make Overnight Oats:
                
                Ingredients:
                
                - 1/2 cup (about 45g) rolled oats
                - 1/2 cup (120ml) milk (you can use dairy or a plant-based alternative like almond, oat, or soy milk)
                - 2-3 tablespoons yogurt (optional, for creaminess)
                1 tablespoon chia seeds (optional, for extra fiber and texture)
                1 teaspoon honey, maple syrup, or another sweetener (optional)
                Toppings: fresh fruits (like berries, banana slices), nuts, seeds, or nut butter
                
                Instructions:
                
                1. Combine the Ingredients: In a jar or container, mix the oats, milk, chia seeds (if using), yogurt, and sweetener.
                2. Stir Well: Make sure everything is well mixed so that the oats can absorb the liquid properly.
                3. Refrigerate: Cover the jar or container with a lid and place it in the fridge for at least 4-6 hours or overnight.
                4. Add Toppings: In the morning, give the oats a good stir and add your favorite toppings (fruits, nuts, seeds, etc.).
                5. Enjoy: You can eat the oats straight from the jar or transfer them to a bowl.
                """};

        String[] Breakfast = {"Fluffy Pancakes", "Eggs Benedict", "French Toast", "Breakfast Burritos", "Smoothie Bowl", "Overnight Oats",
                "Fruit Smoothie", "Greek Yogurt Parfait", "Avocado Toast", "Quesadilla", "Chia Seed Pudding", "Peanut Butter Banana Toast",
                "English Muffin Sandwich", "Tacos", "Frittata", "Pita Pocket", "Polenta", "Shakshuka", "Muffins", "Quinoa"};

        String[] Appetizers = {"Caprese Skewers", "Deviled Eggs", "Spinach Artichoke Dip", "Bruschetta", "Stuffed Mushrooms",
                "Guacamole", "Shrimp Cocktail", "Baked Brie", "Cucumber Bites", "Mini Meatballs", "Spanakopita", "Stuffed Peppers",
                "Antipasto Platter", "Mango Salsa", "Crostini with Ricotta and Honey"};

        String[] soups = {
                "Tomato Basil Soup",
                "Chicken Noodle Soup",
                "Butternut Squash Soup",
                "Minestrone Soup",
                "French Onion Soup",
                "Lentil Soup",
                "Clam Chowder",
                "Thai Coconut Soup (Tom Kha Gai)",
                "Broccoli Cheddar Soup",
                "Gazpacho",
                "Split Pea Soup",
                "Carrot Ginger Soup",
                "Potato Leek Soup",
                "Miso Soup",
                "Tortilla Soup",
                "Caesar Salad",
                "Greek Salad",
                "Caprese Salad",
                "Cobb Salad",
                "Quinoa Salad",
                "Kale Salad",
                "Spinach Strawberry Salad",
                "Nicoise Salad",
                "Waldorf Salad",
                "Chickpea Salad",
                "Arugula Salad",
                "Asian Slaw",
                "Beet Salad",
                "Panzanella Salad",
                "Watermelon Feta Salad"};
        String[] meat = {
                "Lemon Garlic Shrimp",
                "Grilled Steak",
                "Beef Stroganoff",
                "Pork Tenderloin with Apples",
                "Roast Chicken",
                "Chicken Parmesan",
                "Beef Tacos",
                "Barbecue Ribs",
                "Chicken Marsala",
                "Shepherd's Pie",
                "Teriyaki Chicken",
                "Beef Wellington",
                "Stuffed Pork Chops",
                "Chicken Cacciatore",
                "Beef Lasagna"
        };
        String[] Vegetarian = {
                "Vegetable stir-fry",
                "Lentil soup",
                "Chickpea salad",
                "Stuffed bell peppers",
                "Spinach and cheese quesadillas",
                "Vegetable curry",
                "Falafel",
                "Veggie burgers",
                "Caprese salad",
                "Veggie pasta",
                "Hummus with pita and veggies",
                "Veggie pizza",
                "Greek salad",
                "Vegetable soup",
                "Bean chili",
                "Grilled cheese and tomato soup",
                "Ratatouille",
                "Black bean tacos",
                "Stuffed mushrooms",
                "Sweet potato fries"};

        String[] Pasta = {
                "Spaghetti Bolognese",
                "Fettuccine Alfredo with chicken",
                "Penne alla Vodka with pancetta",
                "Lasagna with ground beef",
                "Carbonara with bacon",
                "Beef Stroganoff with egg noodles",
                "Pesto pasta with sausage",
                "Spaghetti Carbonara",
                "Meatball marinara",
                "Shrimp Scampi",
                "Rigatoni with sausage and peppers",
                "Spaghetti with clams",
                "Beef and mushroom pasta",
                "Chicken Parmesan pasta",
                "Turkey and spinach pasta",
                "Tuna pasta casserole",
                "Baked Ziti with meat sauce",
                "Pasta with meat sauce and vegetables",
                "Pappardelle with ragu",
                "Tortellini with ham and cream sauce"};

        String[] Rice = {
                "Fried rice",
                "Risotto",
                "Pilaf",
                "Stuffed bell peppers with rice",
                "Paella (vegetarian or with seafood)",
                "Rice pudding",
                "Quinoa salad",
                "Tabouleh",
                "Barley soup",
                "Stuffed cabbage rolls with rice",
                "Coconut rice",
                "Brown rice and vegetable stir-fry",
                "Biryani (vegetarian or with meat)",
                "Farro salad",
                "Black bean and rice bowl",
                "Lentil and rice stew",
                "Millet porridge",
                "Wild rice and mushroom casserole",
                "Sushi rolls (vegetarian or with seafood)",
                "Spanish rice"};

        String[] Side = {
                "Garlic bread" +
                "Roasted vegetables" +
                "Mashed potatoes" +
                "Coleslaw" +
                "Steamed broccoli" +
                "French fries" +
                "Baked beans" +
                "Corn on the cob" +
                "Caesar salad" +
                "Potato salad" +
                "Sauteed greens (spinach, kale, etc.)" +
                "Creamed corn" +
                "Hummus with pita bread" +
                "Grilled asparagus" +
                "Rice pilaf" +
                "Caprese salad" +
                "Sweet potato wedges" +
                "Cucumber salad" +
                "Stuffed mushrooms" +
                "Deviled eggs"};

        String[] Desserts = {
                "Chocolate chip cookies" +
                "Brownies" +
                "Cheesecake" +
                "Apple pie" +
                "Tiramisu" +
                "Lemon bars" +
                "Panna cotta" +
                "Cupcakes" +
                "Crème brûlée" +
                "Banana bread" +
                "Vanilla pudding" +
                "Fruit tart" +
                "Ice cream (homemade or churned)" +
                "Macarons" +
                "Rice pudding" +
                "Chocolate mousse" +
                "Berry cobbler" +
                "Bread pudding" +
                "Eclairs" +
                "Pavlova"};

        String[] Drinks = {
                "Lemonade" +
                "Iced tea" +
                "Smoothies" +
                "Hot chocolate" +
                "Coffee" +
                "Tea" +
                "Milkshakes" +
                "Mojitos (non-alcoholic or alcoholic)" +
                "Fresh fruit juices (orange, apple, etc.)" +
                "Hot apple cider" +
                "Iced coffee" +
                "Green tea iced tea" +
                "Lemon ginger honey tea" +
                "Herbal teas" +
                "Milk (plain or flavored)" +
                "Berry spritzers" +
                "Homemade soda (like root beer or ginger ale)" +
                "Coconut water" +
                "Fruit-infused water" +
                "Eggnog"};

        // String choice = Breakfast[random.nextInt(Breakfast.length)];

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
                10 - Drinks:
                """);
        String recipe = scanner.next();

        if (recipe.equals("1")) {
            String choice = Breakfast[random.nextInt(Breakfast.length)];
            if (choice.equals("Fluffy Pancakes")) {
                System.out.print("And your food is...Fluffy Pancakes!!!\n");
                System.out.print(Arrays.toString(pancakes));

            } else if (choice.equals("Eggs Benedict")) {
                System.out.print("And your food is...Eggs Benedict!!!\n");
                System.out.print(Arrays.toString(eggs));

            } else if (choice.equals("French Toast")) {
                System.out.print("And your food is... French Toast!!!\n");
                System.out.print(Arrays.toString(french));

            } else if (choice.equals("Breakfast Burritos")) {
                System.out.print("And your food is... Breakfast Burritos!!!\n");
                System.out.print(Arrays.toString(burritos));

            } else if (choice.equals("Smoothie Bowl")) {
                System.out.print("And your food is... Smoothie Bowl!!!\n");
                System.out.print(Arrays.toString(smoothie));

            } else if (choice.equals("Overnight Oats")) {
                System.out.print("And your food is... Overnight Oats!!!\n");
                System.out.print(Arrays.toString(oats));
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
                System.out.print("""
                                 Ingredients:
                                
                                 - 1 cup frozen chopped spinach, thawed and drained
                                 - 1 cup canned or jarred artichoke hearts, drained and chopped
                                 - 1 cup cream cheese, softened
                                 - 1/2 cup sour cream
                                 - 1/4 cup mayonnaise
                                 - 1 cup grated Parmesan cheese
                                 - 1 cup shredded mozzarella cheese
                                 - 2 cloves garlic, minced
                                 - Salt and pepper, to taste
                                 - Red pepper flakes (optional, for a bit of heat)
                                 - 1 tablespoon olive oil (optional, for topping)

                                 Instructions:

                                 1. Preheat your oven to 190°C.
                                 2. Thaw the frozen spinach completely. Squeeze out as much excess water as possible using a clean kitchen towel or paper towels.
                                 3. Drain the canned or jarred artichoke hearts and chop them into small pieces.
                                 4. In a large bowl, combine the softened cream cheese, sour cream, and mayonnaise. Mix until smooth.
                                 5. Add the drained spinach, chopped artichokes, grated Parmesan cheese, shredded mozzarella cheese, and minced garlic. Stir until well combined.
                                 6. Season with salt, pepper, and red pepper flakes (if using).
                                 7. Transfer the mixture to a baking dish or oven-safe skillet, spreading it out evenly.
                                 8. For extra richness, drizzle a tablespoon of olive oil over the top.
                                 9. Bake in the preheated oven for 20-25 minutes, or until the dip is bubbly and the top is golden brown.
                                 10. Remove from the oven and let it cool slightly before serving.
                                 11. Serve with toasted baguette slices, tortilla chips, crackers, or fresh vegetables.

                                 Tips:

                                 1. Cream Cheese: Ensure the cream cheese is softened to mix smoothly with the other ingredients.
                                 2. Fresh Spinach: If you prefer using fresh spinach, sauté 4-5 cups of fresh spinach in a bit of olive oil until wilted, then chop and use as directed.
                                 3. Cheese Variation: Feel free to add other cheeses like cheddar or Gruyère for different flavors.
                                """);
            } else if (app == 4) {
                System.out.print("And you food is... Caprese Skewers!!!\nHere is how you make Caprese Skewers:\n\n");
                System.out.print("""
                                 Ingredients:
                                
                                 - 1 pint cherry or grape tomatoes
                                 - 8 oz (225 grams) fresh mozzarella balls (bocconcini or ciliegine)
                                 - Fresh basil leaves
                                 - Balsamic glaze or balsamic vinegar (optional)
                                 - Extra-virgin olive oil
                                 - Salt and pepper, to taste
                                 - Wooden or metal skewers (about 6-8 inches long)
                                
                                 Instructions:

                                 1. Rinse and dry the cherry or grape tomatoes.
                                 2. Drain the mozzarella balls if they are packed in water.
                                 3. Rinse and pat dry the fresh basil leaves.
                                 4. Thread a tomato onto a skewer.
                                 5. Follow with a basil leaf (fold it if it's large).
                                 6. Add a mozzarella ball.
                                 7. Repeat the pattern until the skewer is filled, leaving a little space at the end for handling. Typically, 2-3 sets of tomato, basil, and mozzarella per skewer work well.
                                 8. Continue assembling the remaining skewers in the same manner.
                                 9. Arrange the skewers on a serving platter.
                                 10. Drizzle the skewers with extra-virgin olive oil.
                                 11. Sprinkle with salt and pepper to taste.
                                 12. For an extra layer of flavor, drizzle the skewers with balsamic glaze or a few drops of balsamic vinegar.
                                 13. Serve the Caprese skewers immediately. They are best enjoyed fresh!

                                 Tips:

                                 1. Basil Freshness: Use fresh, bright green basil leaves for the best flavor and presentation.
                                 2. Tomato Variety: If you can find heirloom cherry tomatoes, they add a lovely variety of colors and flavors.
                                 3. Balsamic Glaze: Balsamic glaze is thicker and sweeter than regular balsamic vinegar, adding a nice touch of sweetness to the skewers.
                                """);
            } else if (app == 5) {
                System.out.print("And you food is... Deviled Eggs!!!\nHere is how you make Deviled Eggs:\n\n");
                System.out.print("""
                                 Ingredients:
                                
                                 - 6 large eggs
                                 - 3 tablespoons mayonnaise
                                 - 1 teaspoon yellow mustard
                                 - 1 teaspoon white vinegar
                                 - Salt and pepper, to taste
                                 - Paprika, for garnish
                                 - Optional toppings: chopped chives, dill, or crispy bacon bits
                                
                                 Instructions:

                                 1. Place the eggs in a single layer in a saucepan and cover with water, about an inch above the eggs.
                                 2. Bring the water to a boil over medium-high heat.
                                 3. Once boiling, remove the pan from heat, cover, and let it sit for 10-12 minutes.
                                 4. Transfer the eggs to a bowl of ice water to cool for about 5 minutes.
                                 5. Gently tap the eggs on a hard surface and roll them to crack the shell.
                                 6. Peel the eggs under running water to remove any shell fragments.
                                 7. Slice the eggs in half lengthwise and carefully remove the yolks.
                                 8. Place the yolks in a medium bowl and mash them with a fork until smooth
                                 9. Add the mayonnaise, mustard, vinegar, salt, and pepper to the mashed yolks. Mix until well combined and smooth.
                                 10. Spoon or pipe the yolk mixture back into the egg white halves. (To pipe, you can use a piping bag or a plastic bag with the corner snipped off.)
                                 11. Sprinkle the filled eggs with paprika for a classic look.
                                 12. Add any optional toppings like chopped chives, dill, or crispy bacon bits for extra flavor.

                                 Tips:

                                 1. Perfectly Cooked Eggs: Avoid overcooking the eggs to prevent a greenish ring around the yolk. The ice bath helps stop the cooking process immediately.
                                 2. Smooth Filling: For an extra smooth filling, you can pass the yolk mixture through a fine-mesh sieve before adding the mayonnaise and other ingredients.
                                 3. Flavor Variations: Experiment with different flavors by adding ingredients like hot sauce, relish, or different herbs and spices to the yolk mixture.
                                """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("3")) {
            System.out.print("Choose a number between 1 and 5: ");
            int soup = scanner.nextInt();
            if (soup == 1) {
                System.out.print("And your food is... Chicken Tortilla Soup!!!\nHere is how you make Chicken Tortilla Soup:\n\n");
                System.out.print("""
                                 Ingredients:
                                
                                 - 1 tablespoon olive oil
                                 - 1 medium onion, diced
                                 - 2 cloves garlic, minced
                                 - 1 red bell pepper, diced
                                 - 1 green bell pepper, diced
                                 - 1 jalapeño, seeded and minced (optional, for heat)
                                 - 1 teaspoon ground cumin
                                 - 1 teaspoon chili powder
                                 - 1/2 teaspoon paprika
                                 - 1/2 teaspoon dried oregano
                                 - 6 cups chicken broth
                                 - 1 can (14.5 oz) diced tomatoes
                                 - 1 can (14.5 oz) black beans, drained and rinsed
                                 - 1 cup corn kernels (fresh, frozen, or canned)
                                 - 2 cups cooked and shredded chicken (rotisserie chicken works well)
                                 - Salt and pepper, to taste
                                 - Juice of 1 lime
                                 - Fresh cilantro, chopped (for garnish)
                                 - Tortilla strips or chips (for garnish)
                                 - Optional toppings: diced avocado, shredded cheese, sour cream, sliced radishes
                                
                                 Instructions:

                                 1. Heat the olive oil in a large pot over medium heat.
                                 2. Add the diced onion and sauté until soft and translucent, about 5 minutes.
                                 3. Add the minced garlic, red and green bell peppers, and jalapeño (if using). Cook for another 2-3 minutes until the peppers start to soften.
                                 4. Stir in the ground cumin, chili powder, paprika, and dried oregano. Cook for 1 minute to release the flavors of the spices.
                                 5. Pour in the chicken broth, diced tomatoes, black beans, and corn kernels. Stir to combine.
                                 6. Bring the soup to a simmer and cook for 10-15 minutes to allow the flavors to meld.
                                 7. Add the cooked and shredded chicken to the pot. Stir and cook until the chicken is heated through, about 5 minutes.
                                 8. Season the soup with salt and pepper to taste.
                                 9. Stir in the lime juice.
                                 10. Ladle the soup into bowls.
                                 11. Garnish with fresh cilantro, tortilla strips or chips, and any optional toppings you like.

                                 Tips:

                                 1. For the best flavor, use homemade chicken broth. If you use store-bought broth, choose a low-sodium version and adjust the seasoning to your taste.
                                 2. Instead of frying, you can toast tortilla strips for a healthier option. Cut corn tortillas into strips, lightly brush with olive oil, and bake at 350°F (175°C) for about 10 minutes or until crispy.

                                 3. Adding a squeeze of fresh lime juice just before serving brightens the flavors and adds a zesty freshness to the soup.
                                """);
            } else if (soup == 2) {
                System.out.print("And your food is... Tomato Basil Soup!!!\nHere is how you make Tomato Basil Soup:\n\n");
                System.out.print("""
                                 Ingredients:
                                
                                 - 2 tablespoons olive oil
                                 - 1 medium onion, diced
                                 - 3 cloves garlic, minced
                                 - 1 can (28 ounces) whole peeled tomatoes
                                 - 2 cups vegetable or chicken broth
                                 - 1/2 teaspoon sugar (optional, to balance acidity)
                                 - Salt and pepper, to taste
                                 - 1/4 cup fresh basil leaves, chopped
                                 - 1/2 cup heavy cream or half-and-half (optional, for a creamy version)
                                 - Additional basil leaves for garnish
                                
                                 Instructions:
                                
                                 1. Heat the olive oil in a large pot over medium heat.
                                 2. Add the diced onion and cook until soft and translucent, about 5-7 minutes.
                                 3. Add the minced garlic and cook for another 1-2 minutes until fragrant.
                                 4. Add the canned tomatoes with their juice, breaking them up with a spoon or using a potato masher.
                                 5. Pour in the vegetable or chicken broth.
                                 6. Stir in the sugar (if using), and season with salt and pepper.
                                 7. Bring the soup to a simmer over medium-high heat, then reduce the heat to low.
                                 8. Let it simmer for about 20-30 minutes to allow the flavors to meld.
                                 9. Remove the soup from heat.
                                 10. Use an immersion blender to puree the soup until smooth, or carefully transfer the soup in batches to a blender and blend until smooth.
                                 11. Return the blended soup to the pot if using a blender.
                                 12. Stir in the chopped fresh basil.
                                 13. If you prefer a creamy soup, stir in the heavy cream or half-and-half.
                                 14. Taste the soup and adjust seasoning with more salt and pepper if needed.
                                 15. Ladle the soup into bowls and garnish with additional fresh basil leaves.

                                 Tips:

                                 1. Fresh Tomatoes: For a fresh tomato version, use about 2 pounds of ripe tomatoes. Blanch, peel, and chop them before adding to the soup.
                                 2. Roasting Tomatoes: For extra depth of flavor, roast the tomatoes in the oven with a bit of olive oil, salt, and pepper at 200°C for 25-30 minutes before adding to the soup.
                                 3. Serve with: Pair the soup with a grilled cheese sandwich or crusty bread for a classic combination.
                                """);
            } else if (soup == 3) {
                System.out.print("And your food is... Caesar Salad!!!\nHere is how you make Caesar Salad:\n\n");
                System.out.print("""
                                 Ingredients:
                                 For the Salad:

                                 - 1 large head of romaine lettuce, chopped
                                 - 1/2 cup grated Parmesan cheese
                                 - 1 cup croutons (store-bought or homemade)
                                
                                 For the Dressing:

                                 - 1/2 cup mayonnaise
                                 - 1/4 cup grated Parmesan cheese
                                 - 1 clove garlic, minced
                                 - 2 tablespoons lemon juice (freshly squeezed)
                                 - 1 teaspoon Dijon mustard
                                 - 1 teaspoon Worcestershire sauce
                                 - Salt and pepper, to taste
                                 - 1-2 anchovy fillets, minced (optional)
                                
                                 Instructions:

                                 1. In a medium bowl, whisk together the mayonnaise, grated Parmesan cheese, minced garlic, lemon juice, Dijon mustard, Worcestershire sauce, salt, and pepper.
                                 2. If using, add the minced anchovy fillets for an authentic Caesar dressing flavor.
                                 3. Mix until the dressing is smooth and well combined. Adjust the seasoning to taste.
                                 4. Chop the romaine lettuce into bite-sized pieces.
                                 5. Wash and dry the lettuce thoroughly, preferably using a salad spinner to remove excess water.
                                 6. In a large salad bowl, toss the chopped romaine lettuce with the dressing until the lettuce is evenly coated.
                                 7. Add the croutons and grated Parmesan cheese, tossing gently to combine.
                                 8. Transfer the salad to serving plates.
                                 9. For added flavor, top with additional grated Parmesan cheese and a few more croutons.

                                 Tips:

                                 1. Homemade Croutons: For homemade croutons, cut day-old bread into cubes, toss with olive oil, salt, and pepper, and bake at 190°C for about 10-15 minutes until golden and crispy.
                                 2. Anchovy Paste: If you prefer a milder anchovy flavor, use anchovy paste instead of whole fillets.
                                 3. Grilled Chicken: Add grilled chicken slices to the salad for a more filling meal.
                                """);
            } else if (soup == 4) {
                System.out.print("And your food is... Minestrone Soup!!!\nHere is how you make Minestrone Soup\n\n");
                System.out.print("""
                                 Ingredients:
                                
                                 - 2 tablespoons olive oil
                                 - 1 medium onion, diced
                                 - 2 cloves garlic, minced
                                 - 2 carrots, diced
                                 - 2 celery stalks, diced
                                 - 1 zucchini, diced
                                 - 1 yellow squash, diced
                                 - 1 potato, diced
                                 - 1 can (14.5 oz) diced tomatoes
                                 - 4 cups vegetable broth
                                 - 1 can (15 oz) cannellini beans, drained and rinsed
                                 - 1 cup green beans, trimmed and cut into 1-inch pieces
                                 - 1 cup small pasta (like ditalini or elbow macaroni)
                                 - 1 teaspoon dried oregano
                                 - 1 teaspoon dried basil
                                 - 1/2 teaspoon dried thyme
                                 - Salt and pepper, to taste
                                 - 2 cups fresh spinach or kale, chopped
                                 - Grated Parmesan cheese, for serving (optional)
                                 - Fresh basil or parsley, for garnish (optional)
                                
                                 Instructions:

                                 1. Heat the olive oil in a large pot over medium heat.
                                 2. Add the diced onion and cook until softened, about 5 minutes.
                                 3. Add the minced garlic, carrots, and celery, and cook for another 5 minutes until the vegetables begin to soften.
                                 4. Stir in the diced zucchini, yellow squash, and potato.
                                 5. Cook for 2-3 minutes, stirring occasionally.
                                 6. Pour in the diced tomatoes (with their juice) and vegetable broth.
                                 7. Add the dried oregano, basil, thyme, salt, and pepper.
                                 8. Bring the soup to a boil, then reduce the heat and let it simmer for about 20 minutes, or until the vegetables are tender.
                                 9. Stir in the cannellini beans and green beans.
                                 10. Add the pasta and cook according to the pasta package instructions, usually about 8-10 minutes, until the pasta is al dente.
                                 11. Stir in the chopped spinach or kale and cook for another 2-3 minutes until the greens are wilted.
                                 12. Taste and adjust seasoning with more salt and pepper if needed.
                                 13. Ladle the soup into bowls.
                                 14. Garnish with grated Parmesan cheese and fresh basil or parsley, if desired.

                                 Tips:

                                 1. Seasonal Vegetables: Feel free to use any seasonal vegetables you have on hand, such as bell peppers, peas, or cabbage.
                                 2. Parmesan Rind: For added depth of flavor, add a Parmesan rind to the soup while it simmers and remove it before serving.
                                 3. Vegan Option: Skip the Parmesan cheese and use a vegan-friendly broth to make this soup entirely plant-based.
                                """);
            } else if (soup == 5) {
                System.out.print("And your food is... Gazpacho!!!\nHere is how you make Gazpacho\n\n");
                System.out.print("""
                                 Ingredients:
                                
                                 - 6 large ripe tomatoes, chopped
                                 - 1 cucumber, peeled and chopped
                                 - 1 red bell pepper, chopped
                                 - 1 green bell pepper, chopped
                                 - 1 small red onion, chopped
                                 - 2 cloves garlic, minced
                                 - 3 cups tomato juice
                                 - 1/4 cup red wine vinegar
                                 - 1/4 cup olive oil
                                 - Salt and pepper, to taste
                                 - 1 teaspoon smoked paprika (optional)
                                 - Fresh basil or parsley, chopped (for garnish)
                                
                                 Instructions:

                                 1. In a large bowl, combine the chopped tomatoes, cucumber, red bell pepper, green bell pepper, red onion, and minced garlic.
                                 2. Working in batches, blend the vegetable mixture with the tomato juice until smooth. You can blend it completely for a smooth texture or leave some chunks for a more rustic texture.
                                 3. Return the blended mixture to the large bowl. Stir in the red wine vinegar, olive oil, salt, pepper, and smoked paprika (if using).
                                 4. Cover the bowl and refrigerate the gazpacho for at least 2 hours, or until thoroughly chilled.
                                 5. Ladle the gazpacho into bowls.
                                 6. Garnish with chopped fresh basil or parsley.
                                 7. Optionally, serve with a drizzle of olive oil or a sprinkle of croutons for added texture.

                                 Tips:

                                 1. Tomato Quality: Use the ripest and juiciest tomatoes you can find for the best flavor.
                                 2. Chill Thoroughly: Gazpacho tastes best when it’s very cold, so don't skip the chilling step.
                                 3. Adjust Consistency: If the soup is too thick, you can add a bit more tomato juice or cold water to reach your desired consistency.
                                """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("4")) {
            System.out.print("Choose a number between 1 and 5: ");
            int main = scanner.nextInt();
            if (main == 1) {
                System.out.print("And your food is... Beef Lasagna!!!\nHere is how you make Beef Lasagna:\n");
                System.out.print("""
                                 Ingredients:
                                 For the Meat Sauce:

                                 - 1 tablespoon olive oil
                                 - 1 pound ground beef
                                 - 1 medium onion, finely chopped
                                 - 3 cloves garlic, minced
                                 - 1 can (28 ounces) crushed tomatoes
                                 - 1 can (6 ounces) tomato paste
                                 - 1 can (15 ounces) tomato sauce
                                 - 1/2 cup water
                                 - 2 tablespoons sugar
                                 - 2 teaspoons dried basil
                                 - 1 teaspoon Italian seasoning
                                 - 1/2 teaspoon salt
                                 - 1/4 teaspoon black pepper
                                 - 1/4 cup fresh parsley, chopped
                                
                                 For the Cheese Mixture:

                                 - 15 ounces ricotta cheese
                                 - 1 egg
                                 - 1/4 cup fresh parsley, chopped
                                 - 1/2 teaspoon salt
                                
                                 For Assembling:

                                 - 12 lasagna noodles
                                 - 4 cups shredded mozzarella cheese
                                 - 3/4 cup grated Parmesan cheese
                                
                                 Instructions:

                                 1. Heat the olive oil in a large skillet over medium heat.
                                 2. Add the ground beef and cook until browned, breaking it up with a spoon as it cooks.
                                 3. Add the chopped onion and cook until soft, about 5 minutes.
                                 4. Add the minced garlic and cook for another minute until fragrant.
                                 5. Stir in the crushed tomatoes, tomato paste, tomato sauce, and water.
                                 6. Add the sugar, dried basil, Italian seasoning, salt, and pepper.
                                 7. Bring the mixture to a boil, then reduce the heat and let it simmer uncovered for about 30 minutes, stirring occasionally.
                                 8. Stir in the chopped parsley and remove from heat.
                                 9. In a medium bowl, combine the ricotta cheese, egg, chopped parsley, and salt. Mix until well combined.
                                 10. Bring a large pot of salted water to a boil.
                                 11. Cook the lasagna noodles according to the package instructions until al dente.
                                 12. Drain the noodles and lay them flat on a sheet of parchment paper to prevent sticking.
                                 13. Preheat your oven to 190°C.
                                 14. Spread a thin layer of meat sauce on the bottom of a 9x13-inch baking dish.
                                 15. Place 4 lasagna noodles over the sauce, slightly overlapping them.
                                 16. Spread 1/3 of the ricotta cheese mixture over the noodles.
                                 17. Sprinkle 1 cup of shredded mozzarella cheese over the ricotta mixture.
                                 18. Spoon 1/3 of the meat sauce over the mozzarella.
                                 19. Repeat the layers twice more: noodles, ricotta mixture, mozzarella, meat sauce.
                                 20. Top with the remaining 1 cup of shredded mozzarella cheese and sprinkle with the grated Parmesan cheese.
                                 21. Cover the baking dish with aluminum foil, making sure it doesn't touch the cheese.
                                 22. Bake in the preheated oven for 25 minutes.
                                 23. Remove the foil and bake for an additional 25 minutes, or until the lasagna is bubbly and the cheese is golden brown.
                                 24. Let the lasagna rest for 10-15 minutes before slicing and serving.
                                
                                Tips:
                                
                                1. After baking, let the lasagna rest for 10-15 minutes. This allows the layers to set and makes it easier to slice and serve, preventing it from falling apart.
                                2. No-boil lasagna noodles save time and effort. They cook perfectly in the oven as the lasagna bakes, absorbing moisture from the sauce. If you use these, make sure your sauce is slightly more liquid to compensate.
                                3. Spread each layer of ingredients (sauce, noodles, cheese mixture) evenly to ensure consistent texture and flavor throughout the dish. This also helps in achieving a balanced bite with each forkful.
                                """);
            } else if (main == 2) {
                System.out.print("And your food is... Roast Chicken!!!\nHere is how you make Roast Chicken:\n");
                System.out.print("""
                        Ingredients:
                        
                        - 1 whole chicken (about 4-5 pounds)
                        - 2 tablespoons olive oil
                        - 4 cloves garlic, minced
                        - 1 lemon, halved
                        - 1 bunch fresh thyme (or 1 teaspoon dried thyme)
                        - 1 bunch fresh rosemary (or 1 teaspoon dried rosemary)
                        - 1 bunch fresh parsley (optional)
                        - 1 large onion, quartered
                        - 4 carrots, peeled and cut into chunks
                        - 4 celery stalks, cut into chunks
                        - Salt and pepper, to taste
                        
                        Instructions:
                        
                        1. Preheat your oven to 220°C.
                        2. Remove the giblets from the chicken cavity, if present, and pat the chicken dry with paper towels.
                        3. Rub the entire chicken with olive oil. Season generously with salt and pepper, including inside the cavity.
                        4. Stuff the chicken cavity with the minced garlic, halved lemon, and half of the thyme and rosemary. You can also add parsley if using.
                        5. Tuck the wing tips under the body of the chicken to prevent them from burning.
                        6. In a large roasting pan, spread out the onion quarters, carrot chunks, and celery chunks.
                        7. Place the remaining thyme and rosemary over the vegetables.
                        8. Place the chicken on top of the bed of vegetables in the roasting pan, breast side up.
                        9. Roast in the preheated oven for about 1 hour and 20 minutes, or until the internal temperature reaches 74°C when measured at the thickest part of the thigh.
                        10. Baste the chicken with the pan juices halfway through the cooking time to keep it moist and flavorful.
                        11. Remove the chicken from the oven and tent it with aluminum foil.
                        12. Let the chicken rest for about 10-15 minutes before carving. This allows the juices to redistribute throughout the meat.
                        13. Carve the chicken and serve with the roasted vegetables from the pan.
                        
                        Tips:
                        
                        1. Truss the Chicken: Trussing the chicken (tying the legs together with kitchen twine) helps it cook more evenly and keeps the stuffing inside the cavity.
                        2. Use a Meat Thermometer: Ensure the chicken is perfectly cooked by using a meat thermometer. Insert it into the thickest part of the thigh without touching the bone to check for doneness.
                        3. Let the Chicken Rest: Allowing the chicken to rest after roasting ensures it stays juicy and flavorful when you carve it.
                        """);
            } else if (main == 3) {
                System.out.print("And your food is... Pork Tenderloin with Apples!!!\nHere is how you make Pork Tenderloin with Apples:\n");
                System.out.print("""
                        Ingredients:
                        
                        - 1-2 pork tenderloins (about 1.5-2 pounds total)
                        - Salt and pepper, to taste
                        - 2 tablespoons olive oil
                        - 2 tablespoons butter
                        - 1 large onion, thinly sliced
                        - 3-4 apples, cored and sliced (use a firm variety like Granny Smith or Honeycrisp)
                        - 2 cloves garlic, minced
                        - 1/2 cup chicken broth
                        - 1/2 cup apple cider or apple juice
                        - 1 tablespoon Dijon mustard
                        - 1 tablespoon fresh thyme leaves (or 1 teaspoon dried thyme)
                        - 1/2 teaspoon ground cinnamon
                        - Fresh parsley, chopped (for garnish)
                        
                        Instructions:
                        
                        1. Preheat your oven to 200°C.
                        2. Season the pork tenderloins generously with salt and pepper.
                        3. In a large oven-safe skillet or roasting pan, heat the olive oil over medium-high heat.
                        4. Sear the pork tenderloins on all sides until browned, about 2-3 minutes per side. Remove the pork from the skillet and set aside.
                        5. In the same skillet, add the butter and let it melt.
                        6. Add the sliced onions and cook until softened and lightly browned, about 5 minutes.
                        7. Add the apple slices and cook for another 3-4 minutes until they start to soften.
                        8. Add the apple slices and cook for another 3-4 minutes until they start to soften.
                        9. Add the chicken broth, apple cider (or apple juice), Dijon mustard, thyme, and ground cinnamon to the skillet.
                        10. Stir to combine and bring the mixture to a simmer.
                        11. Return the seared pork tenderloins to the skillet, nestling them among the apples and onions.
                        12. Transfer the skillet to the preheated oven and roast for about 15-20 minutes, or until the internal temperature of the pork reaches 63°C.
                        13. Remove the skillet from the oven and transfer the pork tenderloins to a cutting board.
                        14. Let the pork rest for about 5-10 minutes before slicing.
                        15. Slice the pork tenderloins into medallions.
                        16. Serve the pork with the apples and onions, spooning some of the pan sauce over the top.
                        17. Garnish with fresh parsley.
                        
                        Tips:
                        
                        1. Choose Firm Apples: Use firm apples like Granny Smith or Honeycrisp to hold their shape during cooking and provide a nice balance of sweetness and tartness.
                        2. Rest the Pork: Letting the pork rest after roasting allows the juices to redistribute, resulting in a juicier and more flavorful dish.
                        3. Deglaze the Pan: Ensure you scrape up any browned bits from the bottom of the skillet when adding the liquids to make the sauce. These bits add great flavor to the dish.
                        """);
            } else if (main == 4) {
                System.out.print("And your food is... Grilled Steak!!!\nHere is how you make a Grilled Steak:\n");
                System.out.print("""
                        Ingredients:
                        
                        - 2 steaks (as wished, preferably filet mignon)
                        - Salt and pepper, to taste
                        - 2 tablespoons olive oil
                        - 2 cloves garlic, minced
                        - 1 teaspoon fresh rosemary, chopped (optional)
                        - 1 teaspoon fresh thyme, chopped (optional)
                        - 1 tablespoon butter

                        Instructions:
                        
                        1. Remove the steaks from the refrigerator and let them sit at room temperature for about 30 minutes before grilling. This ensures even cooking.
                        2. Pat the steaks dry with paper towels to remove any excess moisture.
                        3. Rub the steaks with olive oil on both sides.
                        4. Season generously with salt and pepper on both sides.
                        5. Preheat your grill to high heat, around 232-260°C. Make sure the grates are clean and well-oiled to prevent sticking.
                        6. Optionally, rub the minced garlic, chopped rosemary, and thyme onto the steaks for additional flavor.
                        7. Place the steaks on the preheated grill.
                        8. For medium-rare, grill the steaks for about 4-5 minutes per side, depending on the thickness of the steaks and your desired doneness. Use a meat thermometer to check the internal temperature:
                           - Rare: 49-54°C
                           - Medium-rare: 54-57°C
                           - Medium: 57-63°C
                           - Medium-well: 63-68°C
                           - Well-done: 68°C and above
                        9. During the last minute of grilling, place a small pat of butter on each steak to melt and enhance the flavor.
                        10. Remove the steaks from the grill and transfer them to a cutting board.
                        11. Tent the steaks with aluminum foil and let them rest for about 5-10 minutes. This allows the juices to redistribute throughout the meat.
                        12. Slice the steaks against the grain for maximum tenderness.
                        13. Serve immediately, garnished with additional herbs if desired.
                        
                        Tips:
                        
                        1. Quality Meat: Choose high-quality, well-marbled steaks for the best flavor and tenderness.
                        2. Rest the Meat: Allowing the steaks to rest after grilling ensures they remain juicy and flavorful.
                        3. Use a Meat Thermometer: For precise doneness, use a meat thermometer to check the internal temperature rather than relying solely on time.
                        """);
            } else if (main == 5) {
                System.out.print("And your food is... Lemon Garlic Shrimp!!!\nHere is how you make Lemon Garlic Shrimp:\n");
                System.out.print("""
                        Ingredients:
                        
                        - 1 pound large shrimp, peeled and deveined
                        - 2 tablespoons olive oil
                        - 4 cloves garlic, minced
                        - 1/4 teaspoon red pepper flakes (optional)
                        - Salt and pepper, to taste
                        - 2 tablespoons butter
                        - 1 lemon, zest and juice
                        - 1/4 cup fresh parsley, chopped
                        - Lemon wedges, for serving
                        
                        Instructions:
                        
                        1. Rinse the shrimp under cold water and pat them dry with paper towels.
                        2. Season the shrimp with salt and pepper.
                        3. In a large skillet, heat the olive oil over medium-high heat (about 190-200°C).
                        4. Add the shrimp to the skillet in a single layer.
                        5. Cook for about 2 minutes on one side until they turn pink and start to curl.
                        6. Flip the shrimp and cook for another 1-2 minutes on the other side until fully cooked.
                        7. Remove the shrimp from the skillet and set aside.
                        8. In the same skillet, add the minced garlic and red pepper flakes (if using).
                        9. Cook for about 30 seconds until fragrant, being careful not to burn the garlic.
                        10. Reduce the heat to low and add the butter to the skillet.
                        11. Once the butter has melted, add the lemon zest and juice.
                        12. Stir to combine and let the sauce simmer for about 1 minute.
                        13. Add the cooked shrimp back to the skillet.
                        14. Toss to coat the shrimp evenly in the lemon garlic sauce.
                        15. Cook for another 1-2 minutes until the shrimp are heated through.
                        16. Stir in the chopped fresh parsley.
                        17. Transfer the shrimp to a serving platter.
                        18. Garnish with additional lemon wedges and a sprinkle of fresh parsley, if desired.
                        19. Serve immediately.
                        
                        Tips:
                        
                        1. Do Not Overcook: Shrimp cook quickly and can become rubbery if overcooked. As soon as they turn pink and opaque, they are done.
                        2. Fresh Ingredients: Use fresh lemon juice and zest for the best flavor.
                        3. Versatility: This dish can be served over pasta, rice, or alongside a fresh salad for a complete meal.
                        """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("5")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Vegetable Paella!!!\nHere is how you make Vegetable Paella:\n");
                System.out.print("""
                        Ingredients:
                        
                        - 1 onion, finely chopped
                        - 2 cloves garlic, minced
                        - 1 red bell pepper, diced
                        - 1 yellow bell pepper, diced
                        - 1 green bell pepper, diced
                        - 1 cup cherry tomatoes, halved
                        - 1 cup frozen peas, thawed
                        - 1 cup green beans, trimmed and cut into 1-inch pieces
                        - 1 cup artichoke hearts, quartered (canned or jarred, drained)
                        - 1 1/2 cups Arborio rice
                        - 3 1/2 cups vegetable broth
                        - 1 teaspoon smoked paprika
                        - 1/2 teaspoon saffron threads (optional)
                        - Salt and pepper, to taste
                        - 2 tablespoons olive oil
                        - Fresh parsley, chopped (for garnish)
                        - Lemon wedges (for serving)
                        
                        Instructions:
                        
                        1. If using saffron threads, steep them in 1/4 cup warm vegetable broth and set aside.
                        2. In a large paella pan or skillet, heat olive oil over medium heat.
                        3. Add the chopped onion and sauté for 3-4 minutes until softened.
                        4. Stir in the minced garlic and cook for another minute until fragrant.
                        5. Add the diced bell peppers and cook for 5-6 minutes until they start to soften.
                        6. Stir in the Arborio rice, smoked paprika, and season with salt and pepper.
                        7. Toast the rice for 1-2 minutes, stirring constantly, until it starts to become translucent.
                        8. Pour in the vegetable broth (with steeped saffron, if using). Stir well to combine.
                        9. Bring the mixture to a boil, then reduce the heat to low.
                        10. Cover the pan with a lid or aluminum foil and let it simmer gently for 15-20 minutes, or until the rice is almost tender and most of the liquid is absorbed.
                        11. Stir occasionally to prevent sticking, but do not over-stir to keep the paella's texture.
                        12. Gently fold in the cherry tomatoes, peas, green beans, and artichoke hearts.
                        13. Cover again and cook for an additional 5-10 minutes until the vegetables are heated through and the rice is tender.
                        14. If the paella appears too dry before the rice is fully cooked, add a little more vegetable broth or water, a small amount at a time.
                        15. Remove from heat and let the paella rest, covered, for 5 minutes.
                        16. Garnish with chopped fresh parsley and serve with lemon wedges on the side.
                        
                        Tips:
                        
                        1. Use Arborio Rice: Arborio rice is ideal for paella because it absorbs liquid well and becomes creamy without being mushy.
                        2. Layer Flavors: Sautéing the vegetables and toasting the rice enhances the depth of flavor in the dish.
                        3. Traditional Paella Pan: While not essential, using a traditional wide, shallow paella pan distributes heat evenly and helps in achieving the characteristic socarrat (crispy bottom layer of rice).
                        """);
            } else if (m == 2) {
                System.out.print("And your food is... Eggplant Parmesan!!!\nHere is how you make Eggplant Parmesan:\n");
                System.out.print("""
                        Ingredients:
                        
                        - 2 medium eggplants, sliced into 1/2-inch rounds
                        - Salt, for sweating eggplant
                        - 1 cup all-purpose flour
                        - 3 large eggs, beaten
                        - 2 cups Italian-style breadcrumbs
                        - 1 cup grated Parmesan cheese
                        - 2 cups marinara sauce (store-bought or homemade)
                        - 1 cup shredded mozzarella cheese
                        - Fresh basil leaves, chopped (for garnish)
                        - Olive oil, for frying
                        - Cooking spray
                        
                        Instructions:
                        
                        1. Place the eggplant slices in a colander and sprinkle generously with salt. Let them sit for about 30 minutes to draw out bitterness and excess moisture.
                        2. Rinse the salt off the eggplant slices and pat them dry with paper towels.
                        3. Prepare three shallow bowls or plates: one with flour, one with beaten eggs, and one with breadcrumbs mixed with grated Parmesan cheese.
                        4. Dredge each eggplant slice in flour, shaking off any excess.
                        5. Dip the flour-coated eggplant slice into the beaten eggs, allowing any excess to drip off.
                        6. Coat the eggplant slice in the breadcrumb-Parmesan mixture, pressing gently to adhere. Repeat with all slices.
                        7. In a large skillet, heat about 1/4 inch of olive oil over medium-high heat.
                        8. Fry the breaded eggplant slices in batches until golden brown and crispy on both sides, about 2-3 minutes per side. Place the cooked slices on a paper towel-lined plate to drain excess oil.
                        9. Preheat your oven to 190°C.
                        10. Spread a thin layer of marinara sauce on the bottom of a 9x13-inch baking dish.
                        11. Arrange a single layer of fried eggplant slices over the sauce.
                        12. Spoon more marinara sauce over the eggplant slices, spreading it evenly.
                        13. Sprinkle shredded mozzarella cheese over the sauce.
                        14. Repeat the layering process: eggplant slices, marinara sauce, and mozzarella cheese, until all ingredients are used, ending with a layer of sauce and cheese on top.
                        15. Cover the baking dish with aluminum foil and bake in the preheated oven for 25 minutes.
                        16. Remove the foil and bake for an additional 10-15 minutes, or until the cheese is melted and bubbly.
                        17. Remove from the oven and let it cool for a few minutes.
                        18. Garnish with chopped fresh basil leaves before serving.
                        
                        Tips:
                        
                        1. Sweat the Eggplant: Salting and sweating the eggplant slices before breading helps remove bitterness and excess moisture, resulting in a firmer texture.
                        2. Even Coating: Ensure each eggplant slice is evenly coated with flour, egg, and breadcrumb-Parmesan mixture for a crispy exterior.
                        3. Baking Option: If you prefer a lighter version, you can bake the breaded eggplant slices instead of frying them. Arrange them on a baking sheet lined with parchment paper, drizzle with olive oil, and bake at 200°C for about 20-25 minutes, flipping halfway through, until golden brown.
                        """);
            } else if (m == 3) {
                System.out.print("And your food is... Quinoa Stuffed Peppers!!!\nHere is how you make Quinoa Stuffed Peppers:\n");
                System.out.print("""
                        Ingredients:
                        
                        - 4 large bell peppers, any color
                        - 1 cup quinoa, rinsed
                        - 2 cups vegetable broth or water
                        - 1 tablespoon olive oil
                        - 1 onion, finely chopped
                        - 2 cloves garlic, minced
                        - 1 zucchini, diced
                        - 1 carrot, diced
                        - 1 cup corn kernels (fresh, canned, or frozen)
                        - 1 can (15 ounces) black beans, drained and rinsed
                        - 1 teaspoon ground cumin
                        - 1 teaspoon smoked paprika
                        - Salt and pepper, to taste
                        - 1 cup shredded cheese (cheddar, mozzarella, or your choice)
                        - Fresh cilantro or parsley, chopped (for garnish)
                        - Lime wedges (for serving)
                        
                        Instructions:
                        
                        1. Preheat your oven to 190°C.
                        2. In a medium saucepan, bring the vegetable broth or water to a boil.
                        3. Add the quinoa, reduce heat to low, cover, and simmer for 15-20 minutes, or until the quinoa is cooked and liquid is absorbed. Fluff with a fork and set aside.
                        4. Cut the tops off the bell peppers and remove the seeds and membranes.
                        5. If needed, trim the bottoms slightly so they stand upright in a baking dish.
                        6. Place the peppers upright in a baking dish that has been lightly greased with olive oil or cooking spray.
                        7. In a large skillet, heat olive oil over medium heat.
                        8. Add the chopped onion and sauté for 3-4 minutes until softened.
                        9. Add the minced garlic and cook for another 1 minute until fragrant.
                        10. Stir in the diced zucchini, carrot, and corn kernels. Cook for 5-6 minutes until the vegetables start to soften.
                        11. Add the cooked quinoa and black beans to the skillet with the sautéed vegetables.
                        12. Season with ground cumin, smoked paprika, salt, and pepper. Stir well to combine.
                        13. Spoon the quinoa and vegetable mixture evenly into the prepared bell peppers, pressing down gently to pack the filling.
                        14. Cover the baking dish with foil and bake in the preheated oven for 25-30 minutes.
                        15. Remove the foil and sprinkle shredded cheese over the tops of the stuffed peppers.
                        16. Bake uncovered for an additional 5-10 minutes, or until the cheese is melted and bubbly.
                        17. Remove the stuffed peppers from the oven and let them cool slightly.
                        18. Garnish with chopped fresh cilantro or parsley.
                        19. Serve hot, with lime wedges on the side for squeezing over the peppers.
                        
                        Tips:
                        
                        1. Choose Firm Peppers: Select large bell peppers that are firm and have flat bottoms so they stand upright in the baking dish.
                        2. Customize the Filling: Feel free to customize the filling with your favorite vegetables or add cooked protein like diced chicken or tofu.
                        3. Make Ahead: You can prepare the filling and stuff the peppers ahead of time. Cover and refrigerate until ready to bake.
                        """);
            } else if (m == 4) {
                System.out.print("And your food is... Tofu Stir-Fry!!!\nHere is how you make Tofu Stir-Fry:\n");
                System.out.print("""
                        Ingredients:
                        
                        - 1 block (about 400g) firm tofu, drained and cubed
                        - 2 tablespoons soy sauce
                        - 1 tablespoon cornstarch
                        - 1 tablespoon sesame oil
                        - 2 tablespoons vegetable oil
                        - 2 cloves garlic, minced
                        - 1 tablespoon fresh ginger, minced
                        - 1 onion, thinly sliced
                        - 1 bell pepper, thinly sliced
                        - 1 carrot, thinly sliced
                        - 1 cup broccoli florets
                        - 1 cup snow peas
                        - 1/2 cup sliced mushrooms (optional)
                        - 2 tablespoons oyster sauce (or vegetarian oyster sauce)
                        - 1 tablespoon hoisin sauce
                        - 1 tablespoon rice vinegar
                        - 1 teaspoon sugar
                        - Salt and pepper, to taste
                        - Cooked rice or noodles, for serving
                        - Sesame seeds and chopped green onions (scallions), for garnish
                        
                        Instructions:
                        
                        1. In a bowl, toss the tofu cubes with soy sauce and cornstarch until evenly coated. Set aside to marinate for 10-15 minutes.
                        2. Heat sesame oil in a large skillet or wok over medium-high heat.
                        3. Add the marinated tofu cubes to the skillet in a single layer.
                        4. Cook for 5-7 minutes, flipping occasionally, until all sides are golden and crispy. Remove tofu from skillet and set aside.
                        5. In the same skillet or wok, heat vegetable oil over medium-high heat.
                        6. Add minced garlic and ginger, and stir-fry for about 1 minute until fragrant.
                        7. Add sliced onion, bell pepper, carrot, broccoli florets, snow peas, and sliced mushrooms (if using) to the skillet.
                        8. Stir-fry for 5-7 minutes until vegetables are tender-crisp.
                        9. In a small bowl, mix together oyster sauce, hoisin sauce, rice vinegar, sugar, salt, and pepper.
                        10. Return the cooked tofu to the skillet with the stir-fried vegetables.
                        11. Pour the sauce over the tofu and vegetables.
                        12. Stir well to coat everything evenly and cook for 2-3 minutes until heated through.
                        13. Serve the tofu stir-fry hot over cooked rice or noodles.
                        14. Garnish with sesame seeds and chopped green onions (scallions) before serving.
                        
                        Tips:
                        
                        1. Use Firm Tofu: Firm or extra-firm tofu works best for stir-frying as it holds its shape better.
                        2. Prep Ahead: Cut and marinate the tofu ahead of time to save preparation time.
                        3. Customize Vegetables: Feel free to use any vegetables you prefer or have on hand. Adjust cooking times based on the vegetables' thickness and desired crispness.
                        """);
            } else if (m == 5) {
                System.out.print("And your food is... Vegetarian Chili!!!\nHere is how you make Vegetarian Chili:\n");
                System.out.print("""
                        
                        """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("6")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Spaghetti Bolognese!!!\nHere is how you make Spaghetti Bolognese:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 2) {
                System.out.print("And your food is... Pesto Pasta!!!\nHere is how you make Pesto Pasta:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 3) {
                System.out.print("And your food is... Shrimp Alfredo!!!\nHere is how you make Shrimp Alfredo:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 4) {
                System.out.print("And your food is... Lemon Garlic Pasta!!!\nHere is how you make Lemon Garlic Pasta:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 5) {
                System.out.print("And your food is... Vegetable Lo Mein!!!\nHere is how you make Vegetable Lo Mein:\n");
                System.out.print("""
                        
                        """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("7")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Chicken Fried Rice!!!\nHere is how you make Chicken Fried Rice:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 2) {
                System.out.print("And your food is... Mushroom Risotto!!!\nHere is how you make Mushroom Risotto:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 3) {
                System.out.print("And your food is... Mexican Rice!!!\nHere is how you make Mexican Rice:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 4) {
                System.out.print("And your food is... Quinoa Salad!!!\nHere is how you make Quinoa Salad:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 5) {
                System.out.print("And your food is... Coconut Rice!!!\nHere is how you make Coconut Rice:\n");
                System.out.print("""
                        
                        """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("8")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Garlic Mashed Potatoes!!!\nHere is how you make Garlic Mashed Potatoes:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 2) {
                System.out.print("And your food is... Roasted Vegetables!!!\nHere is how you make Roasted Vegetables:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 3) {
                System.out.print("And your food is... Coleslaw!!!\nHere is how you make Coleslaw:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 4) {
                System.out.print("And your food is... Creamed Spinach!!!\nHere is how you make Creamed Spinach:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 5) {
                System.out.print("And your food is... Baked Sweet Potatoes!!!\nHere is how you make Baked Sweet Potatoes:\n");
                System.out.print("""
                        
                        """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("9")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Chocolate Lava Cake!!!\nHere is how you make Chocolate Lava Cake:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 2) {
                System.out.print("And your food is... Apple Pie!!!\nHere is how you make Apple Pie:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 3) {
                System.out.print("And your food is... Tiramisu!!!\nHere is how you make Tiramisu:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 4) {
                System.out.print("And your food is... Key Lime Pie!!!\nHere is how you make Key Lime Pie:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 5) {
                System.out.print("And your food is... Homemade Ice Cream!!!\nHere is how you make Homemade Ice Cream:\n");
                System.out.print("""
                        
                        """);
            } else {
                System.out.print("Invalid input");
            }
        }

        else if (recipe.equals("10")) {
            System.out.print("Choose a number between 1 and 5");
            int m = scanner.nextInt();
            if (m == 1) {
                System.out.print("And your food is... Margarita!!!\nHere is how you make Margarita:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 2) {
                System.out.print("And your food is... Mojito!!!\nHere is how you make Mojito:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 3) {
                System.out.print("And your food is... Hot Toddy!!!\nHere is how you make Hot Toddy:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 4) {
                System.out.print("And your food is... Green Smoothie!!!\nHere is how you make Green Smoothie:\n");
                System.out.print("""
                        
                        """);
            } else if (m == 5) {
                System.out.print("And your food is... Iced Matcha Latte!!!\nHere is how you make Iced Matcha Latte:\n");
                System.out.print("""
                        
                        """);
            } else {
                System.out.print("Invalid input");
            }
        }
    }
}
