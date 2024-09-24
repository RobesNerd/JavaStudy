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

        String[] fruitSmoothie = {"""
                Here is how you make a Fruit Smoothie:

                Ingredients:

                - 1 cup (240ml) milk or juice (any type you prefer, like almond milk or orange juice)
                - 1 banana
                - 1/2 cup (75g) berries (strawberries, blueberries, etc.)
                - 1/4 cup (60g) Greek yogurt (optional, for creaminess)
                - 1 tablespoon honey or maple syrup (optional)
                - Ice cubes (optional)

                Instructions:

                1. Combine all ingredients: Place all the ingredients in a blender.
                2. Blend: Blend on high until smooth and creamy.
                3. Adjust: If it's too thick, add more liquid. If too thin, add more fruit.
                4. Serve: Pour into a glass and enjoy!
                """};

        String[] greekYogurtParfait = {"""
                Here is how you make a Greek Yogurt Parfait:

                Ingredients:

                - 1 cup (240g) Greek yogurt
                - 1/2 cup (75g) granola
                - 1/2 cup (75g) fresh berries (blueberries, strawberries, etc.)
                - 1 tablespoon honey (optional)
                - Nuts or seeds for extra crunch (optional)

                Instructions:

                1. Layer: In a glass or bowl, add a layer of yogurt.
                2. Add granola: Sprinkle a layer of granola on top of the yogurt.
                3. Add berries: Add fresh berries as the next layer.
                4. Repeat: Continue layering until all ingredients are used up.
                5. Drizzle with honey and add nuts: Optional but adds extra flavor.
                """};

        String[] avocadoToast = {"""
                Here is how you make Avocado Toast:

                Ingredients:

                - 1 ripe avocado
                - 2 slices of whole grain bread
                - Salt and pepper to taste
                - A drizzle of olive oil (optional)
                - A sprinkle of red pepper flakes (optional)
                - Lemon juice (optional)

                Instructions:

                1. Toast bread: Toast the bread until it's crispy.
                2. Prepare avocado: Mash the avocado in a bowl, and season with salt, pepper, and a splash of lemon juice if desired.
                3. Assemble: Spread the mashed avocado on the toast.
                4. Add toppings: Drizzle with olive oil, sprinkle red pepper flakes, or add extra toppings like eggs or tomatoes.
                """};

        String[] quesadilla = {"""
                Here is how you make a Quesadilla:

                Ingredients:

                - 2 flour tortillas
                - 1 cup (120g) shredded cheese (cheddar, mozzarella, etc.)
                - 1/2 cup (75g) cooked chicken, beef, or veggies (optional)
                - Salsa, sour cream, or guacamole for serving

                Instructions:

                1. Heat the tortilla: In a large pan over medium heat, place one tortilla.
                2. Add fillings: Spread the cheese and any additional fillings (meat, veggies) on the tortilla.
                3. Top with second tortilla: Place the second tortilla on top.
                4. Cook until crispy: Cook for 2-3 minutes per side, or until golden and the cheese is melted.
                5. Slice and serve: Cut into wedges and serve with salsa or guacamole.
                """};

        String[] chiaSeedPudding = {"""
                Here is how you make Chia Seed Pudding:

                Ingredients:

                - 1/4 cup (40g) chia seeds
                - 1 cup (240ml) milk (any kind)
                - 1 tablespoon maple syrup or honey (optional)
                - 1/2 teaspoon vanilla extract (optional)
                - Fresh fruits, nuts, or granola for topping

                Instructions:

                1. Mix ingredients: Combine chia seeds, milk, sweetener, and vanilla in a bowl or jar.
                2. Stir: Stir well to prevent clumping.
                3. Refrigerate: Cover and refrigerate for at least 4 hours, or overnight, until the mixture thickens.
                4. Stir and top: Give it a stir, and add your favorite toppings before serving.
                """};

        String[] peanutButterBananaToast = {"""
                Here is how you make Peanut Butter Banana Toast:

                Ingredients:

                - 2 slices of whole grain bread
                - 2 tablespoons peanut butter
                - 1 banana, sliced
                - Honey or cinnamon for topping (optional)

                Instructions:

                1. Toast bread: Toast the bread to your desired crispiness.
                2. Spread peanut butter: Spread the peanut butter evenly on each slice.
                3. Add banana: Top with sliced banana.
                4. Add extra flavor: Drizzle with honey or sprinkle cinnamon on top if desired.
                """};

        String[] englishMuffinSandwich = {"""
                Here is how you make an English Muffin Sandwich:

                Ingredients:

                - 1 English muffin, split
                - 1 egg
                - 1 slice of cheese (cheddar, American, etc.)
                - 1-2 slices of ham or bacon (optional)
                - Butter for toasting (optional)

                Instructions:

                1. Toast muffin: Toast the English muffin halves until golden brown.
                2. Cook egg: Fry or scramble the egg in a pan.
                3. Assemble: Place the egg, cheese, and meat (if using) between the muffin halves.
                4. Serve: Enjoy your sandwich hot!
                """};

        String[] tacos = {"""
                Here is how you make Tacos:

                Ingredients:

                - 4 small corn tortillas
                - 1/2 cup (75g) cooked ground beef, chicken, or veggies
                - 1/4 cup (30g) shredded lettuce
                - 1/4 cup (30g) diced tomatoes
                - 1/4 cup (30g) shredded cheese
                - Salsa, guacamole, and sour cream for serving

                Instructions:

                1. Heat tortillas: Warm the tortillas in a dry skillet.
                2. Assemble tacos: Fill each tortilla with cooked meat or veggies, lettuce, tomatoes, and cheese.
                3. Serve: Top with salsa, guacamole, and sour cream if desired.
                """};

        String[] frittata = {"""
                Here is how you make a Frittata:

                Ingredients:

                - 6 eggs
                - 1/2 cup (60ml) milk
                - 1 cup (120g) vegetables (spinach, bell peppers, onions, etc.)
                - 1/2 cup (60g) shredded cheese
                - Salt and pepper to taste

                Instructions:

                1. Preheat oven: Preheat to 180°C (350°F).
                2. Whisk eggs and milk: In a bowl, whisk together the eggs and milk. Season with salt and pepper.
                3. Add veggies: Stir in the vegetables and cheese.
                4. Cook: Pour the mixture into a greased pan and bake for 20-25 minutes, or until set.
                """};

        String[] pitaPocket = {"""
                Here is how you make a Pita Pocket:

                Ingredients:

                - 2 pita bread pockets
                - 1/2 cup (75g) cooked chicken or falafel
                - 1/4 cup (30g) hummus
                - 1/4 cup (30g) cucumber, chopped
                - 1/4 cup (30g) tomatoes, chopped
                - Lettuce or spinach for crunch

                Instructions:

                1. Open pita: Carefully cut the pita to create a pocket.
                2. Fill: Spread hummus inside and fill with chicken or falafel, cucumber, tomatoes, and greens.
                3. Serve: Enjoy your fresh pita sandwich!
                """};

        String[] polenta = {"""
                Here is how you make Polenta:

                Ingredients:

                - 1 cup (240g) polenta (cornmeal)
                - 4 cups (960ml) water or broth
                - 1/2 cup (60g) grated Parmesan cheese
                - 1 tablespoon butter
                - Salt and pepper to taste

                Instructions:

                1. Boil liquid: Bring the water or broth to a boil in a large pot.
                2. Add polenta: Slowly whisk in the polenta, stirring constantly to avoid lumps.
                3. Simmer: Lower the heat and cook for 20-30 minutes, stirring occasionally until thick and creamy.
                4. Stir in cheese and butter: Mix in the Parmesan and butter, and season to taste.
                """};

        String[] shakshuka = {"""
                Here is how you make Shakshuka:

                Ingredients:

                - 1 tablespoon olive oil
                - 1/2 onion, chopped
                - 1 bell pepper, chopped
                - 2 cloves garlic, minced
                - 1 teaspoon ground cumin
                - 1 teaspoon paprika
                - 1 can (400g) diced tomatoes
                - 4 eggs
                - Salt and pepper to taste

                Instructions:

                1. Cook vegetables: Heat the oil in a pan and sauté the onion, bell pepper, and garlic until softened.
                2. Add spices: Stir in the cumin and paprika.
                3. Add tomatoes: Pour in the tomatoes and simmer for 10 minutes.
                4. Cook eggs: Make small wells in the sauce and crack an egg into each. Cover and cook until the eggs are done to your liking.
                """};

        String[] muffins = {"""
                Here is how you make Muffins:

                Ingredients:

                - 2 cups (240g) all-purpose flour
                - 1 cup (200g) sugar
                - 1/2 cup (120ml) vegetable oil
                - 1 cup (240ml) milk
                - 2 eggs
                - 1 teaspoon vanilla extract
                - 2 teaspoons baking powder
                - Pinch of salt
                - Optional add-ins: blueberries, chocolate chips, nuts

                Instructions:

                1. Preheat oven: Preheat to 180°C (350°F).
                2. Mix wet ingredients: In one bowl, whisk together the eggs, oil, milk, and vanilla.
                3. Mix dry ingredients: In another bowl, mix the flour, sugar, baking powder, and salt.
                4. Combine: Add the wet ingredients to the dry and mix until just combined. Fold in any add-ins.
                5. Bake: Spoon the batter into a muffin tin and bake for 20-25 minutes, or until a toothpick comes out clean.
                """};

        String[] quinoa = {"""
                Here is how you make Quinoa:

                Ingredients:

                - 1 cup (240g) quinoa
                - 2 cups (480ml) water or broth
                - 1/2 teaspoon salt
                - Optional add-ins: vegetables, herbs, feta cheese

                Instructions:

                1. Rinse quinoa: Rinse the quinoa under cold water to remove the bitter coating.
                2. Cook: Combine quinoa, water, and salt in a saucepan. Bring to a boil, reduce heat, and simmer for 15-20 minutes until the quinoa is fluffy.
                3. Add flavor: Stir in vegetables, herbs, or cheese for added flavor.
                """};

        String[] capreseSkewers = {"""
                Here is how you make Caprese Skewers:
                
                Ingredients:
                
                - Cherry tomatoes
                - Fresh mozzarella balls
                - Fresh basil leaves
                - Balsamic glaze
                - Olive oil
                - Salt and pepper
                
                Instructions:
                
                1. Assemble Skewers: Thread a cherry tomato, mozzarella ball, and a fresh basil leaf onto a skewer. Repeat until all ingredients are used.
                2. Drizzle: Place the skewers on a plate and drizzle with olive oil and balsamic glaze.
                3. Season: Sprinkle with salt and pepper to taste.
                4. Serve: These make a fresh and easy appetizer.
                """};

        String[] deviledEggs = {"""
                Here is how you make Deviled Eggs:
                
                Ingredients:
                
                - 6 large eggs
                - 3 tablespoons mayonnaise
                - 1 teaspoon mustard
                - 1 teaspoon white vinegar
                - Salt and pepper to taste
                - Paprika (for garnish)
                
                Instructions:
                
                1. Hard Boil Eggs: Place eggs in a saucepan, cover with water, and bring to a boil. Cook for 10 minutes, then cool and peel.
                2. Prepare Filling: Slice eggs in half, remove the yolks, and mash them in a bowl with mayonnaise, mustard, vinegar, salt, and pepper.
                3. Fill: Spoon or pipe the yolk mixture back into the egg whites.
                4. Garnish: Sprinkle with paprika for garnish before serving.
                """};

        String[] spinachArtichokeDip = {"""
                Here is how you make Spinach Artichoke Dip:
                
                Ingredients:
                
                - 1 can (400g) artichoke hearts, drained and chopped
                - 1 cup frozen spinach, thawed and drained
                - 1/2 cup mayonnaise
                - 1/2 cup sour cream
                - 1 cup shredded mozzarella cheese
                - 1/2 cup grated Parmesan cheese
                - 2 cloves garlic, minced
                
                Instructions:
                
                1. Preheat Oven: Preheat oven to 180°C (350°F).
                2. Mix Ingredients: In a bowl, mix together artichokes, spinach, mayonnaise, sour cream, mozzarella, Parmesan, and garlic.
                3. Bake: Transfer to a baking dish and bake for 20-25 minutes until bubbly and golden.
                4. Serve: Serve with chips, crackers, or bread for dipping.
                """};

        String[] bruschetta = {"""
                Here is how you make Bruschetta:
                
                Ingredients:
                
                - 1 baguette, sliced
                - 2 cups diced tomatoes
                - 1/4 cup fresh basil, chopped
                - 2 cloves garlic, minced
                - 2 tablespoons olive oil
                - Balsamic vinegar (optional)
                - Salt and pepper to taste
                
                Instructions:
                
                1. Toast Bread: Toast baguette slices until golden.
                2. Prepare Topping: In a bowl, mix tomatoes, basil, garlic, olive oil, and season with salt and pepper.
                3. Assemble: Spoon the tomato mixture onto the toasted bread.
                4. Drizzle with balsamic vinegar (optional): Serve immediately.
                """};

        String[] stuffedMushrooms = {"""
                Here is how you make Stuffed Mushrooms:
                
                Ingredients:
                
                - 12 large mushrooms
                - 1/2 cup cream cheese, softened
                - 1/4 cup grated Parmesan cheese
                - 2 cloves garlic, minced
                - 2 tablespoons parsley, chopped
                - Salt and pepper to taste
                
                Instructions:
                
                1. Preheat Oven: Preheat to 180°C (350°F).
                2. Prepare Mushrooms: Remove the stems from the mushrooms and finely chop the stems.
                3. Mix Filling: In a bowl, mix cream cheese, Parmesan, garlic, parsley, and chopped mushroom stems.
                4. Fill and Bake: Spoon the filling into the mushroom caps and bake for 15-20 minutes.
                """};

        String[] guacamole = {"""
                Here is how you make Guacamole:
                
                Ingredients:
                
                - 2 ripe avocados
                - 1 small onion, finely chopped
                - 1 small tomato, diced
                - 1 clove garlic, minced
                - Juice of 1 lime
                - Salt and pepper to taste
                - Fresh cilantro (optional)
                
                Instructions:
                
                1. Mash Avocados: In a bowl, mash the avocados until smooth.
                2. Add Ingredients: Mix in the onion, tomato, garlic, lime juice, and cilantro.
                3. Season: Add salt and pepper to taste.
                4. Serve: Enjoy with tortilla chips.
                """};

        String[] shrimpCocktail = {"""
                Here is how you make Shrimp Cocktail:
                
                Ingredients:
                
                - 1 pound cooked shrimp, peeled and deveined
                - 1/2 cup ketchup
                - 2 tablespoons horseradish
                - 1 tablespoon lemon juice
                - 1 teaspoon hot sauce (optional)
                - Lemon wedges for serving
                
                Instructions:
                
                1. Make Cocktail Sauce: Mix ketchup, horseradish, lemon juice, and hot sauce in a bowl.
                2. Serve: Arrange shrimp on a platter with the cocktail sauce and lemon wedges.
                """};

        String[] bakedBrie = {"""
                Here is how you make Baked Brie:
                
                Ingredients:
                
                - 1 wheel of brie cheese
                - 1/4 cup honey
                - 1/4 cup chopped nuts (optional)
                - Crackers or bread for serving
                
                Instructions:
                
                1. Preheat Oven: Preheat to 180°C (350°F).
                2. Bake Brie: Place the brie on a baking sheet and bake for 10-12 minutes until soft.
                3. Drizzle Honey: Remove from oven and drizzle with honey and top with nuts if desired.
                4. Serve: Serve warm with crackers or bread.
                """};

        String[] cucumberBites = {"""
                Here is how you make Cucumber Bites:
                
                Ingredients:
                
                - 1 cucumber, sliced
                - 1/4 cup cream cheese
                - 1/4 cup smoked salmon (optional)
                - Fresh dill for garnish
                
                Instructions:
                
                1. Prepare Cucumbers: Slice the cucumber into rounds.
                2. Add Cream Cheese: Spread a dollop of cream cheese on each cucumber slice.
                3. Add Salmon: Top with smoked salmon and garnish with dill.
                4. Serve: These are perfect as a light and refreshing appetizer.
                """};

        String[] miniMeatballs = {"""
                Here is how you make Mini Meatballs:
                
                Ingredients:
                
                - 1 pound ground beef or pork
                - 1/4 cup breadcrumbs
                - 1 egg
                - 2 cloves garlic, minced
                - Salt and pepper to taste
                - Marinara sauce for serving
                
                Instructions:
                
                1. Preheat Oven: Preheat to 180°C (350°F).
                2. Mix Meatballs: In a bowl, mix together the ground meat, breadcrumbs, egg, garlic, salt, and pepper.
                3. Shape: Roll into small meatballs and place on a baking sheet.
                4. Bake: Bake for 15-20 minutes until cooked through. Serve with marinara sauce.
                """};

        String[] spanakopita = {"""
                Here is how you make Spanakopita:
                
                Ingredients:
                
                - 1 package phyllo dough
                - 1 pound fresh spinach, wilted
                - 1/2 cup feta cheese
                - 2 eggs, beaten
                - 1/4 cup butter, melted
                
                Instructions:
                
                1. Preheat Oven: Preheat to 180°C (350°F).
                2. Prepare Filling: In a bowl, mix wilted spinach, feta cheese, and eggs.
                3. Layer Phyllo: Brush the phyllo sheets with butter and layer in a baking dish, alternating with spinach mixture.
                4. Bake: Bake for 25-30 minutes until golden and crispy.
                """};

        String[] stuffedPeppers = {"""
                Here is how you make Stuffed Peppers:
                
                Ingredients:
                
                - 4 bell peppers, tops removed and seeds scooped out
                - 1 cup cooked rice
                - 1/2 pound ground beef or turkey
                - 1 can diced tomatoes
                - 1/2 cup shredded cheese
                
                Instructions:
                
                1. Preheat Oven: Preheat to 180°C (350°F).
                2. Cook Filling: Cook the ground beef in a pan and mix with rice and diced tomatoes.
                3. Stuff Peppers: Fill the bell peppers with the mixture.
                4. Bake: Place peppers in a baking dish, top with cheese, and bake for 30 minutes.
                """};

        String[] antipastoPlatter = {"""
                Here is how you make an Antipasto Platter:
                
                Ingredients:
                
                - Assorted cured meats (salami, prosciutto)
                - Cheeses (mozzarella, provolone)
                - Marinated olives
                - Roasted red peppers
                - Artichoke hearts
                - Breadsticks or crackers
                
                Instructions:
                
                1. Arrange: Place all the ingredients on a large platter.
                2. Serve: Serve with breadsticks or crackers.
                """};

        String[] mangoSalsa = {"""
                Here is how you make Mango Salsa:
                
                Ingredients:
                
                - 2 ripe mangoes, diced
                - 1/2 red onion, finely chopped
                - 1/4 cup fresh cilantro, chopped
                - Juice of 1 lime
                - Salt and pepper to taste
                
                Instructions:
                
                1. Mix Ingredients: In a bowl, combine mango, red onion, cilantro, and lime juice.
                2. Season: Add salt and pepper to taste.
                3. Serve: Enjoy with tortilla chips or as a topping for grilled fish.
                """};

        String[] crostiniWithRicottaAndHoney = {"""
                Here is how you make Crostini with Ricotta and Honey:
                
                Ingredients:
                
                - 1 baguette, sliced
                - 1 cup ricotta cheese
                - 2 tablespoons honey
                - Fresh figs or berries (optional)
                
                Instructions:
                
                1. Toast Bread: Toast baguette slices until golden.
                2. Spread Ricotta: Spread ricotta cheese on the toasted bread.
                3. Drizzle Honey: Drizzle with honey and top with fresh fruit.
                4. Serve: A simple and elegant appetizer.
                """};

        String[] splitPeaSoup = {"""
                Here is how you make Split Pea Soup:
                
                Ingredients:
                
                - 1 tablespoon olive oil
                - 1 onion, chopped
                - 2 garlic cloves, minced
                - 2 cups dried split peas, rinsed
                - 4 cups vegetable broth
                - 2 carrots, diced
                - 1 bay leaf
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Vegetables: Heat oil in a pot, sauté onion and garlic until soft.
                2. Add Peas and Broth: Stir in split peas, broth, carrots, and bay leaf. Bring to a boil, then simmer for 1 hour.
                3. Remove Bay Leaf: Discard bay leaf and season with salt and pepper.
                4. Serve: Puree for a smoother texture or serve chunky.
                """};

        String[] carrotGingerSoup = {"""
                Here is how you make Carrot Ginger Soup:
                
                Ingredients:
                
                - 1 tablespoon olive oil
                - 1 onion, chopped
                - 1 tablespoon fresh ginger, grated
                - 6 large carrots, chopped
                - 4 cups vegetable broth
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Onion: Heat oil in a pot, sauté onion and ginger until fragrant.
                2. Add Carrots: Add carrots and broth, bring to a boil, then reduce to simmer for 20 minutes.
                3. Blend: Use an immersion blender to puree the soup until smooth.
                4. Serve: Season with salt and pepper and garnish with fresh herbs.
                """};

        String[] potatoLeekSoup = {"""
                Here is how you make Potato Leek Soup:
                
                Ingredients:
                
                - 2 tablespoons butter
                - 3 leeks, cleaned and chopped
                - 4 large potatoes, peeled and cubed
                - 4 cups vegetable broth
                - 1 cup heavy cream (optional)
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Leeks: Melt butter in a pot, add leeks and cook until soft.
                2. Add Potatoes and Broth: Stir in potatoes and broth, bring to a boil, then simmer for 20 minutes.
                3. Blend: Puree the soup until smooth, then stir in cream if desired.
                4. Serve: Season with salt and pepper and garnish with chives.
                """};

        String[] misoSoup = {"""
                Here is how you make Miso Soup:
                
                Ingredients:
                
                - 4 cups dashi (Japanese soup stock)
                - 3 tablespoons miso paste
                - 1/2 cup tofu, cubed
                - 1/4 cup green onions, chopped
                - 1 sheet nori (seaweed), cut into small pieces
                
                Instructions:
                
                1. Heat Dashi: Bring the dashi to a simmer in a pot.
                2. Add Miso: Whisk in miso paste until dissolved.
                3. Add Tofu and Nori: Stir in tofu, nori, and green onions.
                4. Serve: Enjoy this classic Japanese soup hot.
                """};

        String[] tortillaSoup = {"""
                Here is how you make Tortilla Soup:
                
                Ingredients:
                
                - 1 tablespoon olive oil
                - 1 onion, diced
                - 2 garlic cloves, minced
                - 1 can (400g) diced tomatoes
                - 4 cups chicken broth
                - 1 teaspoon cumin
                - 1 teaspoon chili powder
                - 1 cup cooked chicken, shredded
                - Tortilla strips, avocado, and cilantro for topping
                
                Instructions:
                
                1. Sauté Onion and Garlic: Heat oil in a pot, sauté onion and garlic until soft.
                2. Add Tomatoes and Broth: Stir in diced tomatoes, broth, cumin, and chili powder. Bring to a boil, then simmer.
                3. Add Chicken: Stir in cooked chicken and simmer for another 5 minutes.
                4. Serve: Top with tortilla strips, avocado, and cilantro.
                """};

        String[] caesarSalad = {"""
                Here is how you make Caesar Salad:
                
                Ingredients:
                
                - 1 head of romaine lettuce, chopped
                - 1/4 cup Parmesan cheese, grated
                - 1 cup croutons
                - 2 tablespoons Caesar dressing
                - Freshly ground black pepper
                
                Instructions:
                
                1. Toss Ingredients: In a large bowl, toss lettuce, Parmesan, and croutons.
                2. Add Dressing: Drizzle Caesar dressing and toss again.
                3. Serve: Sprinkle with black pepper and serve.
                """};

        String[] greekSalad = {"""
                Here is how you make Greek Salad:
                
                Ingredients:
                
                - 2 cucumbers, chopped
                - 4 tomatoes, chopped
                - 1/2 red onion, sliced
                - 1/4 cup Kalamata olives
                - 1/4 cup feta cheese, crumbled
                - 2 tablespoons olive oil
                - 1 tablespoon red wine vinegar
                - Salt and pepper to taste
                
                Instructions:
                
                1. Combine Vegetables: In a bowl, mix cucumbers, tomatoes, red onion, and olives.
                2. Add Feta: Sprinkle with feta cheese.
                3. Drizzle Dressing: Whisk together olive oil, vinegar, salt, and pepper. Drizzle over the salad.
                4. Serve: Toss lightly and enjoy.
                """};

        String[] capreseSalad = {"""
                Here is how you make Caprese Salad:
                
                Ingredients:
                
                - 4 large tomatoes, sliced
                - 1 ball fresh mozzarella, sliced
                - 1/4 cup fresh basil leaves
                - 2 tablespoons olive oil
                - 1 tablespoon balsamic vinegar
                - Salt and pepper to taste
                
                Instructions:
                
                1. Layer Ingredients: On a plate, alternate slices of tomatoes and mozzarella.
                2. Add Basil: Tuck basil leaves between the layers.
                3. Drizzle: Drizzle with olive oil and balsamic vinegar.
                4. Serve: Sprinkle with salt and pepper and enjoy.
                """};

        String[] cobbSalad = {"""
                Here is how you make Cobb Salad:
                
                Ingredients:
                
                - 4 cups romaine lettuce, chopped
                - 1 avocado, sliced
                - 2 hard-boiled eggs, chopped
                - 1/2 cup cooked chicken, diced
                - 1/4 cup bacon, cooked and crumbled
                - 1/4 cup blue cheese, crumbled
                - 2 tablespoons red wine vinegar
                - 1 tablespoon olive oil
                
                Instructions:
                
                1. Arrange Ingredients: On a plate, arrange lettuce, avocado, eggs, chicken, bacon, and blue cheese.
                2. Drizzle Dressing: Whisk together olive oil and vinegar, and drizzle over the salad.
                3. Serve: Toss lightly and enjoy!
                """};

        // Additional salads in the same format
        String[] quinoaSalad = {"""
                Here is how you make Quinoa Salad:
                
                Ingredients:
                
                - 1 cup cooked quinoa
                - 1 cucumber, diced
                - 1 bell pepper, diced
                - 1/4 cup red onion, chopped
                - 1/4 cup feta cheese, crumbled
                - 2 tablespoons olive oil
                - 1 tablespoon lemon juice
                - Salt and pepper to taste
                
                Instructions:
                
                1. Mix Ingredients: In a large bowl, combine quinoa, cucumber, bell pepper, red onion, and feta.
                2. Add Dressing: Whisk together olive oil, lemon juice, salt, and pepper, then pour over salad.
                3. Serve: Toss lightly and enjoy!
                """};

                String[] tomatoBasilSoup = {"""
                Here is how you make Tomato Basil Soup:
                
                Ingredients:
                
                - 2 tablespoons olive oil
                - 1 onion, chopped
                - 3 cloves garlic, minced
                - 2 cans (800g) crushed tomatoes
                - 2 cups vegetable broth
                - 1/4 cup fresh basil, chopped
                - Salt and pepper to taste
                - Optional: cream for extra richness
                
                Instructions:
                
                1. Sauté Vegetables: Heat olive oil in a pot, sauté onion and garlic until softened.
                2. Add Tomatoes: Add crushed tomatoes and broth, bring to a boil, then simmer for 20 minutes.
                3. Blend: Use an immersion blender to puree the soup until smooth.
                4. Add Basil: Stir in fresh basil, salt, and pepper. Optionally add a splash of cream.
                5. Serve: Enjoy warm with a drizzle of olive oil or a dollop of cream.
                """};

                String[] chickenNoodleSoup = {"""
                Here is how you make Chicken Noodle Soup:
                
                Ingredients:
                
                - 1 tablespoon olive oil
                - 1 onion, chopped
                - 2 carrots, diced
                - 2 celery stalks, diced
                - 2 garlic cloves, minced
                - 6 cups chicken broth
                - 2 cups cooked chicken, shredded
                - 1 1/2 cups egg noodles
                - Salt, pepper, and fresh parsley to taste
                
                Instructions:
                
                1. Sauté Vegetables: Heat oil in a pot, sauté onion, carrots, celery, and garlic until soft.
                2. Add Broth: Pour in chicken broth and bring to a boil.
                3. Cook Noodles: Add noodles and cook until tender.
                4. Add Chicken: Stir in shredded chicken and season with salt, pepper, and parsley.
                5. Serve: Enjoy this comforting soup warm.
                """};

                String[] butternutSquashSoup = {"""
                Here is how you make Butternut Squash Soup:
                
                Ingredients:
                
                - 1 tablespoon olive oil
                - 1 onion, chopped
                - 1 butternut squash, peeled and cubed
                - 3 cups vegetable broth
                - 1/2 teaspoon cinnamon
                - 1/2 teaspoon nutmeg
                - Salt and pepper to taste
                - Optional: cream for added richness
                
                Instructions:
                
                1. Sauté Onion: Heat oil in a pot, sauté onion until soft.
                2. Add Squash: Add butternut squash and broth, bring to a boil, then reduce to simmer.
                3. Season: Stir in cinnamon, nutmeg, salt, and pepper.
                4. Blend: Puree the soup until smooth using an immersion blender.
                5. Serve: Optionally swirl in some cream for extra richness.
                """};

                String[] minestroneSoup = {"""
                Here is how you make Minestrone Soup:
                
                Ingredients:
                
                - 1 tablespoon olive oil
                - 1 onion, diced
                - 2 carrots, diced
                - 2 celery stalks, diced
                - 2 cloves garlic, minced
                - 1 can (400g) diced tomatoes
                - 4 cups vegetable broth
                - 1 can (400g) cannellini beans, drained
                - 1 zucchini, diced
                - 1 cup spinach
                - 1/2 cup pasta
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Vegetables: Heat oil in a large pot, sauté onion, carrots, celery, and garlic until soft.
                2. Add Tomatoes and Broth: Pour in diced tomatoes and vegetable broth, bring to a simmer.
                3. Add Beans and Veggies: Stir in beans, zucchini, and pasta. Cook until pasta is tender.
                4. Stir in Spinach: Add spinach, season with salt and pepper, and cook for 2 more minutes.
                5. Serve: Ladle into bowls and enjoy with crusty bread.
                """};

                String[] frenchOnionSoup = {"""
                Here is how you make French Onion Soup:
                
                Ingredients:
                
                - 4 large onions, thinly sliced
                - 2 tablespoons butter
                - 1 tablespoon olive oil
                - 4 cups beef broth
                - 1/2 cup white wine
                - 1 tablespoon thyme
                - Salt and pepper to taste
                - Baguette slices, toasted
                - Gruyere cheese, shredded
                
                Instructions:
                
                1. Caramelize Onions: Heat butter and oil in a pot, add onions, and cook over low heat for 30-40 minutes until caramelized.
                2. Add Broth: Stir in beef broth, wine, thyme, salt, and pepper. Simmer for 20 minutes.
                3. Serve: Ladle soup into bowls, top with toasted baguette slices, and sprinkle with Gruyere cheese.
                4. Broil: Place bowls under the broiler until cheese is melted and bubbly.
                """};

                String[] lentilSoup = {"""
                Here is how you make Lentil Soup:
                
                Ingredients:
                
                - 1 tablespoon olive oil
                - 1 onion, diced
                - 2 carrots, diced
                - 2 garlic cloves, minced
                - 1 cup lentils, rinsed
                - 4 cups vegetable broth
                - 1 can (400g) diced tomatoes
                - 1 teaspoon cumin
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Vegetables: Heat oil in a pot, sauté onion, carrots, and garlic until soft.
                2. Add Lentils: Stir in lentils, diced tomatoes, and broth.
                3. Simmer: Bring to a boil, then reduce heat and simmer for 30-40 minutes until lentils are tender.
                4. Season: Stir in cumin, salt, and pepper. Serve warm.
                """};

                String[] clamChowder = {"""
                Here is how you make Clam Chowder:
                
                Ingredients:
                
                - 4 slices bacon, chopped
                - 1 onion, diced
                - 2 potatoes, peeled and diced
                - 2 cans (300g each) clams, drained (reserve the juice)
                - 2 cups clam juice or broth
                - 1 cup heavy cream
                - Salt, pepper, and fresh parsley to taste
                
                Instructions:
                
                1. Cook Bacon: In a pot, cook bacon until crispy, then remove and set aside.
                2. Sauté Onion: Add onion to the pot and cook until soft.
                3. Add Potatoes: Stir in potatoes, clam juice, and reserved clam liquid. Simmer until potatoes are tender.
                4. Add Clams: Stir in clams, cream, and seasonings. Heat through.
                5. Serve: Top with crispy bacon and parsley. Enjoy!
                """};

                String[] thaiCoconutSoup = {"""
                Here is how you make Thai Coconut Soup (Tom Kha Gai):
                
                Ingredients:
                
                - 2 cups coconut milk
                - 2 cups chicken broth
                - 2 chicken breasts, thinly sliced
                - 2 tablespoons fish sauce
                - 1 tablespoon lime juice
                - 1 tablespoon ginger, grated
                - 1-2 tablespoons red curry paste
                - Mushrooms, sliced
                - Fresh cilantro for garnish
                
                Instructions:
                
                1. Heat Coconut Milk: In a pot, bring coconut milk and broth to a simmer.
                2. Add Chicken: Stir in chicken, ginger, lime juice, fish sauce, and curry paste. Simmer until chicken is cooked through.
                3. Add Mushrooms: Stir in mushrooms and cook for a few more minutes.
                4. Serve: Garnish with fresh cilantro and enjoy warm.
                """};

                String[] broccoliCheddarSoup = {"""
                Here is how you make Broccoli Cheddar Soup:
                
                Ingredients:
                
                - 2 tablespoons butter
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 3 cups broccoli florets
                - 2 cups vegetable broth
                - 1 1/2 cups milk
                - 2 cups shredded cheddar cheese
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Onion: In a pot, melt butter and sauté onion and garlic until soft.
                2. Add Broccoli: Stir in broccoli and broth, bring to a boil, then simmer for 10 minutes.
                3. Blend: Use an immersion blender to blend the soup until smooth.
                4. Add Cheese: Stir in milk and cheddar cheese, season with salt and pepper.
                5. Serve: Enjoy with crusty bread!
                """};

                String[] gazpacho = {"""
                Here is how you make Gazpacho:
                
                Ingredients:
                
                - 4 large tomatoes, chopped
                - 1 cucumber, peeled and chopped
                - 1 bell pepper, chopped
                - 1/4 cup olive oil
                - 2 tablespoons red wine vinegar
                - 1 clove garlic, minced
                - Salt and pepper to taste
                
                Instructions:
                
                1. Blend Ingredients: In a blender, combine tomatoes, cucumber, bell pepper, olive oil, vinegar, and garlic.
                2. Chill: Refrigerate for at least 2 hours before serving.
                3. Serve: Enjoy this refreshing cold soup with crusty bread.
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
            } else if (choice.equals("Fruit Smoothie")) {
                System.out.print("And your food is... Fruit Smoothie!!!\n");
                System.out.print(Arrays.toString(fruitSmoothie));
            } else if (choice.equals("Greek Yogurt Parfait")) {
                System.out.print("And your food is... Greek Yogurt Parfait!!!\n");
                System.out.print(Arrays.toString(greekYogurtParfait));
            } else if (choice.equals("Avocado Toast")) {
                System.out.print("And your food is... Avocado Toast!!!\n");
                System.out.print(Arrays.toString(avocadoToast));
            } else if (choice.equals("Quesadilla")) {
                System.out.print("And your food is... Quesadilla!!!\n");
                System.out.print(Arrays.toString(quesadilla));
            } else if (choice.equals("Chia Seed Pudding")) {
                System.out.print("And your food is... Chia Seed Pudding!!!\n");
                System.out.print(Arrays.toString(chiaSeedPudding));
            } else if (choice.equals("Peanut Butter Banana Toast")) {
                System.out.print("And your food is... Peanut Butter Banana Toast!!!\n");
                System.out.print(Arrays.toString(peanutButterBananaToast));
            } else if (choice.equals("English Muffin Sandwich")) {
                System.out.print("And your food is... English Muffin Sandwich!!!\n");
                System.out.print(Arrays.toString(englishMuffinSandwich));
            } else if (choice.equals("Tacos")) {
                System.out.print("And your food is... Tacos!!!\n");
                System.out.print(Arrays.toString(tacos));
            }  else if (choice.equals("Frittata")) {
                System.out.print("And your food is... Frittata!!!\n");
                System.out.print(Arrays.toString(frittata));
            }  else if (choice.equals("Pita Pocket")) {
                System.out.print("And your food is... Pita Pocket!!!\n");
                System.out.print(Arrays.toString(pitaPocket));
            }  else if (choice.equals("Polenta")) {
                System.out.print("And your food is... Polenta!!!\n");
                System.out.print(Arrays.toString(polenta));
            }  else if (choice.equals("Shakshuka")) {
                System.out.print("And your food is... Shakshuka!!!\n");
                System.out.print(Arrays.toString(shakshuka));
            }  else if (choice.equals("Muffins")) {
                System.out.print("And your food is... Muffins!!!\n");
                System.out.print(Arrays.toString(muffins));
            }  else if (choice.equals("Quinoa")) {
                System.out.print("And your food is... Quinoa!!!\n");
                System.out.print(Arrays.toString(quinoa));
            }
        }

        else if (recipe.equals("2")) {
            String choice = Appetizers[random.nextInt(Breakfast.length)];
            if (choice.equals("Caprese Skewers")) {
                System.out.print("And your food is...Caprese Skewers!!!\n");
                System.out.print(Arrays.toString(capreseSkewers));
            } else if (choice.equals("Deviled Eggs")) {
                System.out.print("And your food is...Deviled Eggs!!!\n");
                System.out.print(Arrays.toString(deviledEggs));
            } else if (choice.equals("Spinach Artichoke Dip")) {
                System.out.print("And your food is... Spinach Artichoke Dip!!!\n");
                System.out.print(Arrays.toString(spinachArtichokeDip));
            } else if (choice.equals("Bruschetta")) {
                System.out.print("And your food is... Bruschetta!!!\n");
                System.out.print(Arrays.toString(bruschetta));
            } else if (choice.equals("Stuffed Mushrooms")) {
                System.out.print("And your food is... Stuffed Mushrooms!!!\n");
                System.out.print(Arrays.toString(stuffedMushrooms));
            } else if (choice.equals("Guacamole")) {
                System.out.print("And your food is... Guacamole!!!\n");
                System.out.print(Arrays.toString(guacamole));
            } else if (choice.equals("Shrimp Cocktail")) {
                System.out.print("And your food is... Shrimp Cocktail!!!\n");
                System.out.print(Arrays.toString(shrimpCocktail));
            } else if (choice.equals("Baked Brie")) {
                System.out.print("And your food is... Baked Brie!!!\n");
                System.out.print(Arrays.toString(bakedBrie));
            } else if (choice.equals("Cucumber Bites")) {
                System.out.print("And your food is... Cucumber Bites!!!\n");
                System.out.print(Arrays.toString(cucumberBites));
            } else if (choice.equals("Mini Meatballs")) {
                System.out.print("And your food is... Mini Meatballs!!!\n");
                System.out.print(Arrays.toString(miniMeatballs));
            } else if (choice.equals("Spanakopita")) {
                System.out.print("And your food is... Spanakopita!!!\n");
                System.out.print(Arrays.toString(spanakopita));
            } else if (choice.equals("Stuffed Peppers")) {
                System.out.print("And your food is... Stuffed Peppers!!!\n");
                System.out.print(Arrays.toString(stuffedPeppers));
            } else if (choice.equals("Antipasto Platter")) {
                System.out.print("And your food is... Antipasto Platter!!!\n");
                System.out.print(Arrays.toString(antipastoPlatter));
            } else if (choice.equals("Mango Salsa")) {
                System.out.print("And your food is... Mango Salsa!!!\n");
                System.out.print(Arrays.toString(mangoSalsa));
            }  else if (choice.equals("Crostini with Ricotta and Honey")) {
                System.out.print("And your food is... Crostini with Ricotta and Honey!!!\n");
                System.out.print(Arrays.toString(crostiniWithRicottaAndHoney));
            }
        }

        else if (recipe.equals("3")) {
            String choice = soups[random.nextInt(Breakfast.length)];
            if (choice.equals("Caprese Skewers")) {
                System.out.print("And your food is...Caprese Skewers!!!\n");
                System.out.print(Arrays.toString(capreseSkewers));
            } else if (choice.equals("Deviled Eggs")) {
                System.out.print("And your food is...Deviled Eggs!!!\n");
                System.out.print(Arrays.toString(deviledEggs));
            } else if (choice.equals("Spinach Artichoke Dip")) {
                System.out.print("And your food is... Spinach Artichoke Dip!!!\n");
                System.out.print(Arrays.toString(spinachArtichokeDip));
            } else if (choice.equals("Bruschetta")) {
                System.out.print("And your food is... Bruschetta!!!\n");
                System.out.print(Arrays.toString(bruschetta));
            } else if (choice.equals("Stuffed Mushrooms")) {
                System.out.print("And your food is... Stuffed Mushrooms!!!\n");
                System.out.print(Arrays.toString(stuffedMushrooms));
            } else if (choice.equals("Guacamole")) {
                System.out.print("And your food is... Guacamole!!!\n");
                System.out.print(Arrays.toString(guacamole));
            } else if (choice.equals("Shrimp Cocktail")) {
                System.out.print("And your food is... Shrimp Cocktail!!!\n");
                System.out.print(Arrays.toString(shrimpCocktail));
            } else if (choice.equals("Baked Brie")) {
                System.out.print("And your food is... Baked Brie!!!\n");
                System.out.print(Arrays.toString(bakedBrie));
            } else if (choice.equals("Cucumber Bites")) {
                System.out.print("And your food is... Cucumber Bites!!!\n");
                System.out.print(Arrays.toString(cucumberBites));
            } else if (choice.equals("Mini Meatballs")) {
                System.out.print("And your food is... Mini Meatballs!!!\n");
                System.out.print(Arrays.toString(miniMeatballs));
            } else if (choice.equals("Spanakopita")) {
                System.out.print("And your food is... Spanakopita!!!\n");
                System.out.print(Arrays.toString(spanakopita));
            } else if (choice.equals("Stuffed Peppers")) {
                System.out.print("And your food is... Stuffed Peppers!!!\n");
                System.out.print(Arrays.toString(stuffedPeppers));
            } else if (choice.equals("Antipasto Platter")) {
                System.out.print("And your food is... Antipasto Platter!!!\n");
                System.out.print(Arrays.toString(antipastoPlatter));
            } else if (choice.equals("Mango Salsa")) {
                System.out.print("And your food is... Mango Salsa!!!\n");
                System.out.print(Arrays.toString(mangoSalsa));
            }  else if (choice.equals("Crostini with Ricotta and Honey")) {
                System.out.print("And your food is... Crostini with Ricotta and Honey!!!\n");
                System.out.print(Arrays.toString(crostiniWithRicottaAndHoney));
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
