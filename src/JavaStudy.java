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
                Here is how you make Spinach and Artichoke Dip:
                
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

        String[] waldorfSalad = {"""
                Here is how you make Waldorf Salad:
                
                Ingredients:
                
                - 2 apples, diced
                - 1/2 cup grapes, halved
                - 1/4 cup walnuts, chopped
                - 1/4 cup celery, sliced
                - 1/4 cup Greek yogurt
                - 1 tablespoon lemon juice
                - Salt and pepper to taste
                
                Instructions:
                
                1. Combine Ingredients: In a bowl, mix apples, grapes, walnuts, and celery.
                2. Make Dressing: Stir together Greek yogurt, lemon juice, salt, and pepper.
                3. Toss Salad: Add the dressing to the fruit and toss until coated.
                4. Serve: Enjoy this refreshing fruit and nut salad.
                """};

        String[] lemonGarlicShrimp = {"""
                Here is how you make Lemon Garlic Shrimp:
                
                Ingredients:
                
                - 500g shrimp, peeled and deveined
                - 2 tablespoons butter
                - 4 cloves garlic, minced
                - Juice of 1 lemon
                - 1 tablespoon fresh parsley, chopped
                - Salt and pepper to taste
                
                Instructions:
                
                1. Cook Shrimp: In a large pan, melt butter over medium heat. Add garlic and cook until fragrant, about 1 minute.
                2. Add Shrimp: Add shrimp to the pan and cook for 2-3 minutes per side until pink and opaque.
                3. Add Lemon Juice: Squeeze lemon juice over the shrimp and toss to combine.
                4. Garnish: Sprinkle with fresh parsley and season with salt and pepper.
                5. Serve: Serve with rice or pasta for a quick and flavorful meal.
                """};

        String[] grilledSteak = {"""
                Here is how you make Grilled Steak:
                
                Ingredients:
                
                - 2 ribeye steaks
                - 2 tablespoons olive oil
                - 2 cloves garlic, minced
                - Salt and pepper to taste
                - Fresh rosemary sprigs
                
                Instructions:
                
                1. Season Steak: Rub the steaks with olive oil, garlic, salt, and pepper. Let them sit at room temperature for 30 minutes.
                2. Preheat Grill: Preheat your grill to high heat.
                3. Grill Steak: Place the steaks on the grill and cook for 4-5 minutes per side for medium-rare, or adjust according to your preference.
                4. Rest Steak: Remove from the grill and let the steak rest for 5 minutes before slicing.
                5. Serve: Garnish with fresh rosemary and serve with your favorite side dishes.
                """};

        String[] beefStroganoff = {"""
                Here is how you make Beef Stroganoff:
                
                Ingredients:
                
                - 500g beef strips
                - 1 onion, chopped
                - 3 cloves garlic, minced
                - 200g mushrooms, sliced
                - 1 cup beef broth
                - 1/2 cup sour cream
                - 2 tablespoons flour
                - Salt and pepper to taste
                - 2 tablespoons olive oil
                
                Instructions:
                
                1. Sauté Beef: Heat olive oil in a pan, add beef strips, and cook until browned. Remove and set aside.
                2. Sauté Vegetables: In the same pan, sauté onions, garlic, and mushrooms until softened.
                3. Add Flour: Sprinkle flour over the vegetables and stir for 1 minute.
                4. Add Broth: Slowly add beef broth, stirring constantly until the sauce thickens.
                5. Add Sour Cream: Stir in sour cream and return the beef to the pan. Season with salt and pepper.
                6. Serve: Serve over egg noodles or rice.
                """};

        String[] porkTenderloinWithApples = {"""
                Here is how you make Pork Tenderloin with Apples:
                
                Ingredients:
                
                - 1 pork tenderloin
                - 2 apples, sliced
                - 2 tablespoons olive oil
                - 1/4 cup apple cider
                - 1 tablespoon fresh thyme
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sear Pork: Heat olive oil in a pan, season the pork with salt and pepper, and sear on all sides until golden.
                2. Add Apples: Add sliced apples to the pan and cook for 2 minutes.
                3. Add Cider: Pour in the apple cider and sprinkle with thyme. Simmer until the pork reaches an internal temperature of 63°C (145°F).
                4. Rest Pork: Remove the pork from the pan and let it rest for 5 minutes.
                5. Serve: Slice the pork and serve with the apples and sauce.
                """};

        String[] roastChicken = {"""
                Here is how you make Roast Chicken:
                
                Ingredients:
                
                - 1 whole chicken
                - 2 tablespoons butter, softened
                - 4 cloves garlic, minced
                - 1 lemon, quartered
                - Fresh thyme sprigs
                - Salt and pepper to taste
                
                Instructions:
                
                1. Preheat Oven: Preheat your oven to 200°C (400°F).
                2. Season Chicken: Rub the chicken with butter, garlic, salt, and pepper. Stuff the cavity with lemon quarters and thyme.
                3. Roast Chicken: Place the chicken in a roasting pan and roast for 1 hour to 1 hour 15 minutes, until the internal temperature reaches 75°C (165°F).
                4. Rest Chicken: Let the chicken rest for 10 minutes before carving.
                5. Serve: Serve with roasted vegetables or your favorite side dishes.
                """};

        String[] chickenParmesan = {"""
                Here is how you make Chicken Parmesan:
                
                Ingredients:
                
                - 4 chicken breasts
                - 1 cup breadcrumbs
                - 1/2 cup grated Parmesan cheese
                - 1 cup marinara sauce
                - 1 cup mozzarella cheese, shredded
                - 1/4 cup flour
                - 2 eggs, beaten
                - Olive oil for frying
                
                Instructions:
                
                1. Bread Chicken: Coat chicken breasts in flour, dip in beaten eggs, and coat with a mixture of breadcrumbs and Parmesan cheese.
                2. Fry Chicken: Heat olive oil in a pan and fry the chicken breasts until golden on both sides.
                3. Add Sauce and Cheese: Place chicken in a baking dish, top with marinara sauce and mozzarella cheese.
                4. Bake: Bake at 180°C (350°F) for 20 minutes, until the cheese is melted and bubbly.
                5. Serve: Serve with pasta or a side salad.
                """};

        String[] beefTacos = {"""
                Here is how you make Beef Tacos:
                
                Ingredients:
                
                - 500g ground beef
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 2 tablespoons taco seasoning
                - 8 taco shells
                - Toppings: shredded lettuce, diced tomatoes, shredded cheese, sour cream
                
                Instructions:
                
                1. Cook Beef: In a pan, cook ground beef, onions, and garlic until the beef is browned. Drain excess fat.
                2. Add Seasoning: Stir in taco seasoning and cook for an additional 2 minutes.
                3. Assemble Tacos: Fill taco shells with the beef mixture and your favorite toppings.
                4. Serve: Enjoy your tacos with salsa or guacamole on the side.
                """};

        String[] barbecueRibs = {"""
                Here is how you make Barbecue Ribs:
                
                Ingredients:
                
                - 1 rack pork ribs
                - 1 cup barbecue sauce
                - 1 tablespoon paprika
                - 1 tablespoon garlic powder
                - 1 tablespoon brown sugar
                - Salt and pepper to taste
                
                Instructions:
                
                1. Season Ribs: Rub the ribs with paprika, garlic powder, brown sugar, salt, and pepper. Let them sit for 30 minutes.
                2. Preheat Oven: Preheat your oven to 150°C (300°F).
                3. Slow Cook: Place the ribs on a baking sheet and cover with foil. Cook for 2.5 to 3 hours.
                4. Add Barbecue Sauce: Remove the foil, brush the ribs with barbecue sauce, and cook uncovered for 20 minutes.
                5. Serve: Slice the ribs and serve with extra sauce on the side.
                """};

        String[] chickenMarsala = {"""
                Here is how you make Chicken Marsala:
                
                Ingredients:
                
                - 4 chicken breasts
                - 1 cup flour
                - 1/2 cup Marsala wine
                - 1/2 cup chicken broth
                - 1 cup mushrooms, sliced
                - 2 tablespoons butter
                - Olive oil for frying
                - Salt and pepper to taste
                
                Instructions:
                
                1. Prepare Chicken: Coat chicken breasts in flour and season with salt and pepper.
                2. Fry Chicken: Heat olive oil in a pan and fry the chicken until golden brown on both sides. Remove from the pan.
                3. Sauté Mushrooms: In the same pan, melt butter and sauté mushrooms until browned.
                4. Add Marsala: Pour in Marsala wine and chicken broth, simmering until the sauce thickens.
                5. Return Chicken: Return the chicken to the pan and cook for an additional 5 minutes.
                6. Serve: Serve the chicken with the sauce and a side of pasta or mashed potatoes.
                """};

        String[] shepherdsPie = {"""
                Here is how you make Shepherd's Pie:
                
                Ingredients:
                
                - 500g ground beef or lamb
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 1 cup frozen peas and carrots
                - 2 tablespoons tomato paste
                - 1/2 cup beef broth
                - 4 large potatoes, boiled and mashed
                - 1/2 cup cheddar cheese, grated
                
                Instructions:
                
                1. Cook Meat: In a large pan, cook ground beef or lamb with onions and garlic until browned. Drain excess fat.
                2. Add Veggies: Stir in frozen peas, carrots, tomato paste, and beef broth. Cook until the mixture thickens.
                3. Layer in Dish: Spread the meat mixture in a baking dish. Top with mashed potatoes and sprinkle with cheese.
                4. Bake: Bake at 180°C (350°F) for 25-30 minutes, until the top is golden and bubbly.
                5. Serve: Let the pie cool for a few minutes before serving.
                """};

        String[] teriyakiChicken = {"""
                Here is how you make Teriyaki Chicken:
                
                Ingredients:
                
                - 4 chicken breasts
                - 1/4 cup soy sauce
                - 1/4 cup honey
                - 2 tablespoons rice vinegar
                - 1 tablespoon ginger, minced
                - 2 cloves garlic, minced
                - 1 tablespoon sesame oil
                - 1 tablespoon sesame seeds for garnish
                
                Instructions:
                
                1. Make Sauce: In a bowl, whisk together soy sauce, honey, rice vinegar, ginger, garlic, and sesame oil.
                2. Cook Chicken: Heat a pan over medium heat and cook the chicken breasts until golden on both sides.
                3. Add Sauce: Pour the sauce into the pan and simmer until the chicken is cooked through and the sauce has thickened.
                4. Garnish: Sprinkle with sesame seeds and serve with steamed rice.
                """};

        String[] beefWellington = {"""
                Here is how you make Beef Wellington:
                
                Ingredients:
                
                - 1 beef tenderloin
                - 500g puff pastry
                - 200g mushrooms, finely chopped
                - 1 onion, finely chopped
                - 4 slices prosciutto
                - 2 tablespoons Dijon mustard
                - 1 egg, beaten for egg wash
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sear Beef: Season the beef with salt and pepper, then sear it on all sides. Remove and let it cool.
                2. Sauté Mushrooms: Cook mushrooms and onions in a pan until the moisture evaporates.
                3. Assemble: Spread Dijon mustard over the beef, then wrap it in prosciutto and the mushroom mixture. Finally, wrap the beef in puff pastry.
                4. Bake: Brush with egg wash and bake at 200°C (400°F) for 25-30 minutes, until the pastry is golden and the beef reaches your desired doneness.
                5. Serve: Let the Beef Wellington rest for 10 minutes before slicing.
                """};

        String[] stuffedPorkChops = {"""
                Here is how you make Stuffed Pork Chops:
                
                Ingredients:
                
                - 4 thick pork chops
                - 1/2 cup breadcrumbs
                - 1/4 cup grated Parmesan cheese
                - 1/4 cup fresh spinach, chopped
                - 1 tablespoon olive oil
                - Salt and pepper to taste
                
                Instructions:
                
                1. Prepare Filling: In a bowl, mix breadcrumbs, Parmesan, spinach, and olive oil.
                2. Stuff Pork Chops: Cut a pocket into each pork chop and stuff with the breadcrumb mixture.
                3. Sear Pork Chops: Heat a pan with olive oil and sear the pork chops on both sides.
                4. Bake: Transfer the chops to an oven and bake at 180°C (350°F) for 20 minutes, until cooked through.
                5. Serve: Let the pork chops rest for a few minutes before serving.
                """};

        String[] chickenCacciatore = {"""
                Here is how you make Chicken Cacciatore:
                
                Ingredients:
                
                - 4 chicken thighs
                - 1 onion, sliced
                - 2 cloves garlic, minced
                - 1 red bell pepper, sliced
                - 1 can diced tomatoes
                - 1/2 cup chicken broth
                - 1 teaspoon dried oregano
                - 2 tablespoons olive oil
                - Salt and pepper to taste
                
                Instructions:
                
                1. Brown Chicken: Heat olive oil in a pan and brown chicken thighs on both sides. Remove from the pan.
                2. Sauté Veggies: In the same pan, sauté onions, garlic, and bell peppers until softened.
                3. Add Tomatoes and Broth: Pour in diced tomatoes, chicken broth, and oregano. Return the chicken to the pan and simmer for 30 minutes.
                4. Serve: Serve with pasta or polenta.
                """};

        String[] beefLasagna = {"""
                Here is how you make Beef Lasagna:
                
                Ingredients:
                
                - 500g ground beef
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 1 can tomato sauce
                - 9 lasagna noodles, cooked
                - 2 cups ricotta cheese
                - 2 cups mozzarella cheese, shredded
                - 1/2 cup Parmesan cheese, grated
                
                Instructions:
                
                1. Cook Meat Sauce: In a pan, cook ground beef, onion, and garlic until browned. Add tomato sauce and simmer for 10 minutes.
                2. Layer Lasagna: In a baking dish, layer noodles, meat sauce, ricotta, mozzarella, and Parmesan. Repeat the layers.
                3. Bake: Bake at 180°C (350°F) for 30 minutes, until bubbly and golden.
                4. Serve: Let the lasagna rest for 10 minutes before slicing.
                """};

        String[] vegetableStirFry = {"""
                Here is how you make Vegetable Stir-Fry:
                
                Ingredients:
                
                - 1 bell pepper, sliced
                - 1 carrot, thinly sliced
                - 1 zucchini, sliced
                - 1 cup broccoli florets
                - 2 tablespoons soy sauce
                - 1 tablespoon sesame oil
                - 1 tablespoon honey or maple syrup
                - 1 clove garlic, minced
                - 1 teaspoon ginger, minced
                - Sesame seeds for garnish
                
                Instructions:
                
                1. Prepare Sauce: In a small bowl, mix soy sauce, sesame oil, honey, garlic, and ginger.
                2. Sauté Vegetables: Heat a pan or wok over medium-high heat, add a little oil, and sauté the vegetables until tender but still crisp, about 5 minutes.
                3. Add Sauce: Pour the sauce over the vegetables and cook for another 2 minutes.
                4. Serve: Garnish with sesame seeds and serve with rice or noodles.
                """};

        String[] chickpeaSalad = {"""
                Here is how you make Chickpea Salad:
                
                Ingredients:
                
                - 1 can chickpeas, drained and rinsed
                - 1 cucumber, diced
                - 1 tomato, diced
                - 1/4 red onion, diced
                - 2 tablespoons olive oil
                - 1 tablespoon lemon juice
                - Salt and pepper to taste
                - Fresh parsley, chopped (optional)
                
                Instructions:
                
                1. Mix Ingredients: In a bowl, combine chickpeas, cucumber, tomato, and onion.
                2. Dress Salad: Drizzle with olive oil and lemon juice, and season with salt and pepper.
                3. Toss: Toss to combine, and sprinkle with parsley if desired.
                4. Serve: Serve chilled or at room temperature.
                """};

        String[] stuffedBellPeppers = {"""
                Here is how you make Stuffed Bell Peppers:
                
                Ingredients:
                
                - 4 bell peppers, tops removed and seeds scooped out
                - 1 cup cooked quinoa or rice
                - 1 can black beans, drained and rinsed
                - 1/2 cup corn kernels
                - 1/2 cup diced tomatoes
                - 1 teaspoon cumin
                - 1 teaspoon paprika
                - Salt and pepper to taste
                - 1/2 cup shredded cheese (optional)
                
                Instructions:
                
                1. Preheat Oven: Preheat your oven to 180°C (350°F).
                2. Make Filling: In a bowl, mix quinoa (or rice), black beans, corn, diced tomatoes, cumin, paprika, salt, and pepper.
                3. Stuff Peppers: Fill each bell pepper with the mixture and place them in a baking dish.
                4. Bake: Bake for 25-30 minutes, until the peppers are tender.
                5. Add Cheese: If using cheese, sprinkle it on top of the peppers during the last 5 minutes of baking.
                6. Serve: Serve with salsa or a dollop of sour cream.
                """};

        String[] spinachCheeseQuesadillas = {"""
                Here is how you make Spinach and Cheese Quesadillas:
                
                Ingredients:
                
                - 4 flour tortillas
                - 2 cups fresh spinach
                - 1 cup shredded cheese (cheddar, mozzarella, or your choice)
                - 1 clove garlic, minced
                - 1 tablespoon olive oil
                - Sour cream and salsa for serving
                
                Instructions:
                
                1. Sauté Spinach: In a pan, heat olive oil and sauté garlic until fragrant. Add spinach and cook until wilted, then set aside.
                2. Assemble Quesadillas: On one half of each tortilla, sprinkle cheese and sautéed spinach. Fold the tortilla in half.
                3. Cook Quesadillas: Heat a pan over medium heat and cook each quesadilla for 2-3 minutes per side until golden and the cheese is melted.
                4. Serve: Cut into wedges and serve with sour cream and salsa.
                """};

        String[] vegetableCurry = {"""
                Here is how you make Vegetable Curry:
                
                Ingredients:
                
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 1 tablespoon ginger, minced
                - 2 cups mixed vegetables (e.g., carrots, potatoes, peas, bell peppers)
                - 1 can coconut milk
                - 2 tablespoons curry powder
                - 1 teaspoon cumin
                - 1/2 teaspoon turmeric
                - Salt and pepper to taste
                - Fresh cilantro for garnish
                
                Instructions:
                
                1. Sauté Aromatics: In a pot, sauté onion, garlic, and ginger until softened.
                2. Add Spices: Stir in curry powder, cumin, and turmeric.
                3. Add Vegetables: Add mixed vegetables and coconut milk. Simmer for 20-25 minutes until the vegetables are tender.
                4. Season: Season with salt and pepper, and garnish with fresh cilantro.
                5. Serve: Serve with rice or naan.
                """};

        String[] falafel = {"""
                Here is how you make Falafel:
                
                Ingredients:
                
                - 1 can chickpeas, drained and rinsed
                - 1/4 cup fresh parsley, chopped
                - 2 cloves garlic, minced
                - 1 teaspoon cumin
                - 1 teaspoon coriander
                - 2 tablespoons flour
                - Salt and pepper to taste
                - Oil for frying
                
                Instructions:
                
                1. Blend Ingredients: In a food processor, blend chickpeas, parsley, garlic, cumin, coriander, flour, salt, and pepper until combined but still slightly chunky.
                2. Shape Falafel: Form the mixture into small patties or balls.
                3. Fry Falafel: Heat oil in a pan and fry the falafel until golden brown on both sides.
                4. Serve: Serve with pita, hummus, and salad.
                """};

        String[] veggieBurgers = {"""
                Here is how you make Veggie Burgers:
                
                Ingredients:
                
                - 1 can black beans, drained and mashed
                - 1/2 cup breadcrumbs
                - 1/4 cup grated carrots
                - 1/4 cup chopped onion
                - 1 tablespoon soy sauce
                - 1 teaspoon cumin
                - Salt and pepper to taste
                - Oil for cooking
                
                Instructions:
                
                1. Make Patties: In a bowl, mix mashed black beans, breadcrumbs, carrots, onion, soy sauce, cumin, salt, and pepper.
                2. Shape Patties: Form the mixture into burger patties.
                3. Cook Patties: Heat oil in a pan and cook the patties for 4-5 minutes per side, until crispy and heated through.
                4. Serve: Serve on buns with your favorite toppings.
                """};

        String[] capreseSalad = {"""
                Here is how you make Caprese Salad:
                
                Ingredients:
                
                - 2 large tomatoes, sliced
                - 1 ball fresh mozzarella, sliced
                - Fresh basil leaves
                - 2 tablespoons olive oil
                - 1 tablespoon balsamic vinegar
                - Salt and pepper to taste
                
                Instructions:
                
                1. Arrange Salad: On a plate, alternate slices of tomato, mozzarella, and basil leaves.
                2. Drizzle: Drizzle with olive oil and balsamic vinegar.
                3. Season: Sprinkle with salt and pepper.
                4. Serve: Serve immediately as a fresh and light appetizer or side dish.
                """};

        String[] veggiePasta = {"""
                Here is how you make Veggie Pasta:
                
                Ingredients:
                
                - 200g pasta (your choice)
                - 1 zucchini, sliced
                - 1 bell pepper, sliced
                - 1 cup cherry tomatoes, halved
                - 2 cloves garlic, minced
                - 2 tablespoons olive oil
                - Salt and pepper to taste
                - Fresh basil for garnish
                
                Instructions:
                
                1. Cook Pasta: Cook the pasta according to package instructions and set aside.
                2. Sauté Vegetables: In a pan, heat olive oil and sauté garlic, zucchini, bell pepper, and cherry tomatoes until tender.
                3. Combine: Toss the cooked pasta with the sautéed vegetables. Season with salt and pepper.
                4. Serve: Garnish with fresh basil and serve with Parmesan cheese if desired.
                """};

        String[] hummusWithPitaAndVeggies = {"""
                Here is how you make Hummus with Pita and Veggies:
                
                Ingredients:
                
                - 1 can chickpeas, drained and rinsed
                - 2 tablespoons tahini
                - 2 cloves garlic, minced
                - 2 tablespoons lemon juice
                - 1/4 cup olive oil
                - Salt and pepper to taste
                - Assorted veggies (carrots, cucumbers, bell peppers)
                - Pita bread
                
                Instructions:
                
                1. Make Hummus: In a food processor, blend chickpeas, tahini, garlic, lemon juice, and olive oil until smooth. Season with salt and pepper.
                2. Serve: Serve with sliced veggies and warm pita bread for dipping.
                """};

        String[] veggiePizza = {"""
                Here is how you make Veggie Pizza:
                
                Ingredients:
                
                - 1 pizza dough (store-bought or homemade)
                - 1/2 cup pizza sauce
                - 1 cup mozzarella cheese, shredded
                - 1 bell pepper, sliced
                - 1/2 cup sliced mushrooms
                - 1/4 cup black olives
                - Fresh basil for garnish
                
                Instructions:
                
                1. Preheat Oven: Preheat your oven to 220°C (425°F).
                2. Assemble Pizza: Roll out the pizza dough and spread pizza sauce on top. Add mozzarella cheese and your veggie toppings.
                3. Bake: Bake for 12-15 minutes, until the crust is golden and the cheese is melted.
                4. Garnish: Garnish with fresh basil and serve hot.
                """};

        String[] greekSalad = {"""
                Here is how you make Greek Salad:
                
                Ingredients:
                
                - 2 cucumbers, diced
                - 2 tomatoes, diced
                - 1/4 red onion, thinly sliced
                - 1/4 cup Kalamata olives
                - 1/4 cup feta cheese, crumbled
                - 2 tablespoons olive oil
                - 1 tablespoon red wine vinegar
                - Salt and pepper to taste
                
                Instructions:
                
                1. Combine Ingredients: In a bowl, mix cucumbers, tomatoes, onion, olives, and feta cheese.
                2. Dress Salad: Drizzle with olive oil and red wine vinegar, and season with salt and pepper.
                3. Toss: Toss to combine and serve immediately.
                """};

        String[] vegetableSoup = {"""
                Here is how you make Vegetable Soup:
                
                Ingredients:
                
                - 1 onion, chopped
                - 2 carrots, diced
                - 2 stalks celery, diced
                - 2 cups mixed vegetables (e.g., green beans, corn, peas)
                - 1 can diced tomatoes
                - 4 cups vegetable broth
                - 1 teaspoon dried thyme
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Vegetables: In a pot, sauté onion, carrots, and celery until softened.
                2. Add Remaining Ingredients: Stir in mixed vegetables, diced tomatoes, vegetable broth, thyme, salt, and pepper.
                3. Simmer: Bring to a boil, then reduce heat and simmer for 25-30 minutes.
                4. Serve: Serve hot with a slice of bread.
                """};

        String[] beanChili = {"""
                Here is how you make Bean Chili:
                
                Ingredients:
                
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 1 can black beans, drained and rinsed
                - 1 can kidney beans, drained and rinsed
                - 1 can diced tomatoes
                - 1 tablespoon chili powder
                - 1 teaspoon cumin
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Onion and Garlic: In a pot, sauté onion and garlic until softened.
                2. Add Beans and Tomatoes: Stir in black beans, kidney beans, and diced tomatoes.
                3. Season: Add chili powder, cumin, salt, and pepper.
                4. Simmer: Bring to a boil, then reduce heat and simmer for 20-25 minutes.
                5. Serve: Serve with rice or tortilla chips.
                """};

        String[] spaghettiBolognese = {"""
                Here is how you make Spaghetti Bolognese:
                
                Ingredients:
                
                - 400g spaghetti
                - 500g ground beef
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 1 can crushed tomatoes
                - 2 tablespoons tomato paste
                - 1 teaspoon dried oregano
                - 1 teaspoon dried basil
                - Salt and pepper to taste
                - Olive oil for cooking
                - Parmesan cheese for serving
                
                Instructions:
                
                1. Cook Spaghetti: Cook spaghetti according to package instructions. Drain and set aside.
                2. Cook Beef: Heat olive oil in a pan and cook the ground beef until browned. Remove from the pan and set aside.
                3. Sauté Vegetables: In the same pan, sauté onion and garlic until softened.
                4. Add Tomatoes: Stir in crushed tomatoes, tomato paste, oregano, basil, salt, and pepper. Simmer for 15-20 minutes.
                5. Combine: Add the cooked beef back into the sauce and simmer for another 5 minutes.
                6. Serve: Serve the sauce over the cooked spaghetti and top with Parmesan cheese.
                """};

        String[] fettuccineAlfredoWithChicken = {"""
                Here is how you make Fettuccine Alfredo with Chicken:
                
                Ingredients:
                
                - 400g fettuccine
                - 2 chicken breasts, cooked and sliced
                - 1 cup heavy cream
                - 1/2 cup grated Parmesan cheese
                - 2 cloves garlic, minced
                - 2 tablespoons butter
                - Salt and pepper to taste
                - Fresh parsley for garnish
                
                Instructions:
                
                1. Cook Fettuccine: Cook fettuccine according to package instructions. Drain and set aside.
                2. Make Alfredo Sauce: In a pan, melt butter and sauté garlic until fragrant. Add cream and simmer for 5 minutes, then stir in Parmesan cheese.
                3. Combine: Add the cooked fettuccine and sliced chicken to the sauce, and toss to combine. Season with salt and pepper.
                4. Serve: Garnish with fresh parsley and more Parmesan if desired.
                """};

        String[] penneAllaVodkaWithPancetta = {"""
                Here is how you make Penne alla Vodka with Pancetta:
                
                Ingredients:
                
                - 400g penne pasta
                - 100g pancetta, diced
                - 1/2 cup vodka
                - 1 can crushed tomatoes
                - 1/2 cup heavy cream
                - 2 cloves garlic, minced
                - Olive oil for cooking
                - Salt and pepper to taste
                - Parmesan cheese for serving
                
                Instructions:
                
                1. Cook Penne: Cook penne according to package instructions. Drain and set aside.
                2. Cook Pancetta: In a pan, heat olive oil and cook pancetta until crispy. Remove from the pan and set aside.
                3. Sauté Garlic: In the same pan, sauté garlic until fragrant.
                4. Add Vodka and Tomatoes: Stir in vodka and cook for 1-2 minutes, then add crushed tomatoes and simmer for 10 minutes.
                5. Add Cream and Pancetta: Stir in the cream and cooked pancetta, and simmer for 5 more minutes.
                6. Serve: Toss the penne with the sauce and serve with Parmesan cheese.
                """};

        String[] lasagnaWithGroundBeef = {"""
                Here is how you make Lasagna with Ground Beef:
                
                Ingredients:
                
                - 12 lasagna noodles
                - 500g ground beef
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 1 can crushed tomatoes
                - 2 tablespoons tomato paste
                - 2 cups ricotta cheese
                - 2 cups mozzarella cheese, shredded
                - 1/2 cup Parmesan cheese
                - 1 egg
                - Olive oil for cooking
                - Salt and pepper to taste
                
                Instructions:
                
                1. Cook Lasagna Noodles: Cook lasagna noodles according to package instructions. Drain and set aside.
                2. Cook Beef: Heat olive oil in a pan, cook ground beef until browned, and set aside.
                3. Sauté Vegetables: In the same pan, sauté onion and garlic, then add crushed tomatoes, tomato paste, salt, and pepper. Simmer for 15-20 minutes.
                4. Prepare Cheese Mixture: In a bowl, mix ricotta cheese, egg, salt, and pepper.
                5. Assemble Lasagna: In a baking dish, layer noodles, ricotta mixture, meat sauce, and shredded mozzarella. Repeat layers and top with Parmesan.
                6. Bake: Bake at 180°C (350°F) for 25-30 minutes until bubbly and golden.
                """};

        String[] carbonaraWithBacon = {"""
                Here is how you make Carbonara with Bacon:
                
                Ingredients:
                
                - 400g spaghetti
                - 200g bacon, diced
                - 3 eggs
                - 1/2 cup Parmesan cheese, grated
                - 2 cloves garlic, minced
                - Salt and pepper to taste
                - Fresh parsley for garnish
                
                Instructions:
                
                1. Cook Spaghetti: Cook spaghetti according to package instructions. Drain and set aside.
                2. Cook Bacon: In a pan, cook bacon until crispy. Remove from the pan and set aside.
                3. Sauté Garlic: In the same pan, sauté garlic until fragrant.
                4. Combine Eggs and Cheese: In a bowl, whisk eggs and Parmesan cheese.
                5. Mix Pasta: Add cooked spaghetti to the pan with garlic and bacon. Remove from heat and quickly stir in the egg mixture.
                6. Serve: Season with salt, pepper, and garnish with parsley.
                """};

        String[] beefStroganoffWithEggNoodles = {"""
                Here is how you make Beef Stroganoff with Egg Noodles:
                
                Ingredients:
                
                - 400g egg noodles
                - 500g beef sirloin, sliced thinly
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 1 cup sour cream
                - 1/2 cup beef broth
                - 2 tablespoons flour
                - 2 tablespoons butter
                - Salt and pepper to taste
                - Fresh parsley for garnish
                
                Instructions:
                
                1. Cook Egg Noodles: Cook egg noodles according to package instructions. Drain and set aside.
                2. Cook Beef: In a pan, melt butter and cook beef until browned. Remove from the pan and set aside.
                3. Sauté Vegetables: In the same pan, sauté onion and garlic until softened. Add flour and cook for 1-2 minutes.
                4. Add Broth: Stir in beef broth and simmer until thickened, then return the beef to the pan.
                5. Add Sour Cream: Stir in sour cream and season with salt and pepper.
                6. Serve: Toss with egg noodles and garnish with fresh parsley.
                """};

        String[] pestoPastaWithSausage = {"""
                Here is how you make Pesto Pasta with Sausage:
                
                Ingredients:
                
                - 400g pasta (penne or fusilli)
                - 200g sausage, sliced
                - 1/2 cup pesto sauce
                - 2 tablespoons olive oil
                - Salt and pepper to taste
                - Parmesan cheese for serving
                
                Instructions:
                
                1. Cook Pasta: Cook pasta according to package instructions. Drain and set aside.
                2. Cook Sausage: In a pan, heat olive oil and cook sausage until browned.
                3. Combine: Toss the cooked pasta with pesto sauce and sausage. Season with salt and pepper.
                4. Serve: Serve with Parmesan cheese on top.
                """};

        String[] spaghettiCarbonara = {"""
                Here is how you make Spaghetti Carbonara:
                
                Ingredients:
                
                - 400g spaghetti
                - 200g pancetta or bacon, diced
                - 3 eggs
                - 1/2 cup Parmesan cheese, grated
                - 2 cloves garlic, minced
                - Salt and pepper to taste
                - Fresh parsley for garnish
                
                Instructions:
                
                1. Cook Spaghetti: Cook spaghetti according to package instructions. Drain and set aside.
                2. Cook Pancetta: In a pan, cook pancetta until crispy. Remove from the pan and set aside.
                3. Sauté Garlic: In the same pan, sauté garlic until fragrant.
                4. Combine Eggs and Cheese: In a bowl, whisk eggs and Parmesan cheese.
                5. Mix Pasta: Add cooked spaghetti to the pan with garlic and pancetta. Remove from heat and quickly stir in the egg mixture.
                6. Serve: Season with salt, pepper, and garnish with parsley.
                """};

        String[] meatballMarinara = {"""
                Here is how you make Meatball Marinara:
                
                Ingredients:
                
                - 400g spaghetti
                - 500g ground beef
                - 1/4 cup breadcrumbs
                - 1 egg
                - 2 tablespoons Parmesan cheese, grated
                - 1 jar marinara sauce
                - Salt and pepper to taste
                - Olive oil for cooking
                
                Instructions:
                
                1. Make Meatballs: In a bowl, mix ground beef, breadcrumbs, egg, Parmesan cheese, salt, and pepper. Form into small meatballs.
                2. Cook Meatballs: In a pan, heat olive oil and cook meatballs until browned. Remove from the pan and set aside.
                3. Heat Marinara Sauce: In the same pan, add marinara sauce and bring to a simmer. Add the cooked meatballs and simmer for 10-15 minutes.
                4. Cook Spaghetti: Cook spaghetti according to package instructions. Drain and set aside.
                5. Serve: Serve the meatballs and sauce over the cooked spaghetti.
                """};

        String[] shrimpScampi = {"""
                Here is how you make Shrimp Scampi:
                
                Ingredients:
                
                - 400g linguine or spaghetti
                - 500g shrimp, peeled and deveined
                - 4 cloves garlic, minced
                - 1/2 cup white wine or chicken broth
                - 2 tablespoons butter
                - 2 tablespoons olive oil
                - Fresh parsley for garnish
                - Salt and pepper to taste
                
                Instructions:
                
                1. Cook Pasta: Cook linguine or spaghetti according to package instructions. Drain and set aside.
                2. Cook Shrimp: In a pan, heat olive oil and butter. Add garlic and sauté until fragrant, then add shrimp and cook until pink.
                3. Add Wine: Stir in white wine (or chicken broth) and simmer for 2-3 minutes.
                4. Serve: Toss the pasta with the shrimp mixture and garnish with fresh parsley.
                """};

        String[] rigatoniWithSausageAndPeppers = {"""
                Here is how you make Rigatoni with Sausage and Peppers:
                
                Ingredients:
                
                - 400g rigatoni pasta
                - 200g sausage, sliced
                - 1 bell pepper, sliced
                - 1 onion, sliced
                - 1 can diced tomatoes
                - 2 cloves garlic, minced
                - Olive oil for cooking
                - Salt and pepper to taste
                - Parmesan cheese for serving
                
                Instructions:
                
                1. Cook Pasta: Cook rigatoni according to package instructions. Drain and set aside.
                2. Cook Sausage: In a pan, heat olive oil and cook sausage until browned. Remove from the pan and set aside.
                3. Sauté Vegetables: In the same pan, sauté bell pepper, onion, and garlic until softened.
                4. Add Tomatoes: Stir in diced tomatoes, sausage, and simmer for 10-15 minutes. Season with salt and pepper.
                5. Serve: Toss the rigatoni with the sauce and serve with Parmesan cheese.
                """};

        String[] spaghettiWithClams = {"""
                Here is how you make Spaghetti with Clams:
                
                Ingredients:
                
                - 400g spaghetti
                - 500g fresh clams, scrubbed
                - 4 cloves garlic, minced
                - 1/2 cup white wine
                - 2 tablespoons olive oil
                - 1 tablespoon butter
                - Fresh parsley for garnish
                - Salt and pepper to taste
                
                Instructions:
                
                1. Cook Pasta: Cook spaghetti according to package instructions. Drain and set aside.
                2. Cook Clams: In a pan, heat olive oil and butter. Add garlic and sauté until fragrant, then add clams and white wine. Cover and cook until clams open (about 5 minutes).
                3. Serve: Toss the spaghetti with the clam mixture and garnish with fresh parsley.
                """};

        String[] beefAndMushroomPasta = {"""
                Here is how you make Beef and Mushroom Pasta:
                
                Ingredients:
                
                - 400g pasta (tagliatelle or fettuccine)
                - 300g beef strips
                - 200g mushrooms, sliced
                - 2 cloves garlic, minced
                - 1/2 cup beef broth
                - 1/2 cup cream
                - Olive oil for cooking
                - Salt and pepper to taste
                - Fresh parsley for garnish
                
                Instructions:
                
                1. Cook Pasta: Cook pasta according to package instructions. Drain and set aside.
                2. Cook Beef: In a pan, heat olive oil and cook beef strips until browned. Remove from the pan and set aside.
                3. Sauté Mushrooms: In the same pan, sauté garlic and mushrooms until tender. Add beef broth and simmer for 5 minutes.
                4. Add Cream: Stir in cream and return the beef to the pan. Simmer for another 5 minutes.
                5. Serve: Toss the pasta with the beef and mushroom sauce and garnish with parsley.
                """};

        String[] chickenParmesanPasta = {"""
                Here is how you make Chicken Parmesan Pasta:
                
                Ingredients:
                
                - 400g pasta (penne or rigatoni)
                - 2 chicken breasts, breaded and fried
                - 1 jar marinara sauce
                - 1/2 cup mozzarella cheese, shredded
                - 1/4 cup Parmesan cheese
                - Fresh basil for garnish
                - Olive oil for cooking
                
                Instructions:
                
                1. Cook Pasta: Cook pasta according to package instructions. Drain and set aside.
                2. Prepare Chicken: Bread and fry the chicken breasts until golden and cooked through. Slice into pieces.
                3. Heat Marinara Sauce: In a pan, heat the marinara sauce.
                4. Combine: Toss the cooked pasta with the marinara sauce and top with sliced chicken. Sprinkle with mozzarella and Parmesan cheese.
                5. Serve: Garnish with fresh basil.
                """};

        String[] turkeyAndSpinachPasta = {"""
                Here is how you make Turkey and Spinach Pasta:
                
                Ingredients:
                
                - 400g pasta (fusilli or penne)
                - 200g ground turkey
                - 2 cups fresh spinach
                - 2 cloves garlic, minced
                - 1/2 cup tomato sauce
                - Olive oil for cooking
                - Salt and pepper to taste
                
                Instructions:
                
                1. Cook Pasta: Cook pasta according to package instructions. Drain and set aside.
                2. Cook Turkey: In a pan, heat olive oil and cook ground turkey until browned. Add garlic and sauté until fragrant.
                3. Add Spinach: Stir in spinach and cook until wilted.
                4. Add Sauce: Stir in tomato sauce and simmer for 5 minutes.
                5. Serve: Toss the pasta with the turkey and spinach mixture, season with salt and pepper, and serve.
                """};

        String[] friedRice = {"""
                Here is how you make Fried Rice:
                
                Ingredients:
                
                - 3 cups cooked rice (preferably cold)
                - 2 eggs, beaten
                - 1 carrot, diced
                - 1/2 cup frozen peas
                - 2 cloves garlic, minced
                - 3 tablespoons soy sauce
                - 2 tablespoons sesame oil
                - 2 green onions, chopped
                - Salt and pepper to taste
                
                Instructions:
                
                1. Scramble Eggs: In a pan, heat sesame oil and scramble the eggs. Remove and set aside.
                2. Sauté Vegetables: In the same pan, sauté garlic, carrots, and peas until tender.
                3. Add Rice: Stir in the cooked rice and soy sauce. Cook for a few minutes, stirring occasionally.
                4. Combine: Add the scrambled eggs and green onions. Stir and cook for another minute.
                5. Serve: Season with salt and pepper and serve hot.
                """};

        String[] risotto = {"""
                Here is how you make Risotto:
                
                Ingredients:
                
                - 1 1/2 cups Arborio rice
                - 4 cups chicken or vegetable broth
                - 1/2 cup white wine
                - 1 onion, finely chopped
                - 2 cloves garlic, minced
                - 1/2 cup Parmesan cheese, grated
                - 2 tablespoons butter
                - 2 tablespoons olive oil
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Onion and Garlic: Heat olive oil in a pan and sauté onion and garlic until softened.
                2. Add Rice: Stir in Arborio rice and cook for 2 minutes until the edges are translucent.
                3. Add Wine: Pour in the white wine and cook until absorbed.
                4. Add Broth: Gradually add the warm broth, one ladle at a time, stirring constantly until absorbed.
                5. Finish: Once the rice is creamy and tender, stir in butter and Parmesan cheese. Season with salt and pepper.
                """};

        String[] pilaf = {"""
                Here is how you make Rice Pilaf:
                
                Ingredients:
                
                - 1 cup long-grain rice
                - 2 cups chicken or vegetable broth
                - 1 onion, finely chopped
                - 1 carrot, diced
                - 2 tablespoons butter
                - 1 bay leaf
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Vegetables: In a pan, melt butter and sauté onion and carrot until softened.
                2. Add Rice: Stir in the rice and cook for 2-3 minutes until lightly toasted.
                3. Add Broth: Add broth and bay leaf. Bring to a boil, then reduce heat, cover, and simmer for 15-18 minutes until the rice is tender.
                4. Serve: Remove the bay leaf and fluff the rice with a fork. Season with salt and pepper.
                """};

        String[] stuffedBellPeppersWithRice = {"""
                Here is how you make Stuffed Bell Peppers with Rice:
                
                Ingredients:
                
                - 4 bell peppers
                - 1 cup cooked rice
                - 200g ground beef or turkey (optional for non-vegetarian version)
                - 1 onion, chopped
                - 1 can diced tomatoes
                - 1/2 cup shredded cheese (optional)
                - Olive oil for cooking
                - Salt and pepper to taste
                
                Instructions:
                
                1. Prepare Peppers: Cut the tops off the bell peppers and remove seeds.
                2. Cook Filling: In a pan, heat olive oil and cook the onion (and ground meat if using) until browned. Add rice and diced tomatoes, then season with salt and pepper.
                3. Stuff Peppers: Stuff the bell peppers with the rice mixture. Top with shredded cheese if desired.
                4. Bake: Place the stuffed peppers in a baking dish, cover with foil, and bake at 180°C (350°F) for 25-30 minutes.
                """};

        String[] paella = {"""
                Here is how you make Paella (Vegetarian or with Seafood):
                
                Ingredients:
                
                - 1 1/2 cups short-grain rice
                - 4 cups vegetable or seafood broth
                - 1 onion, chopped
                - 2 cloves garlic, minced
                - 1 bell pepper, sliced
                - 1/2 cup peas
                - 1 can diced tomatoes
                - 1 teaspoon smoked paprika
                - 1/2 teaspoon saffron (optional)
                - Olive oil for cooking
                - Salt and pepper to taste
                - Optional: shrimp, mussels, or chicken for non-vegetarian version
                
                Instructions:
                
                1. Sauté Vegetables: Heat olive oil in a large pan and sauté onion, garlic, and bell pepper until softened.
                2. Add Rice: Stir in the rice, smoked paprika, and saffron. Cook for 2 minutes.
                3. Add Broth: Add the broth and tomatoes. Bring to a boil, then reduce heat and simmer until the rice is tender, about 20 minutes.
                4. Optional: If using seafood, add shrimp or mussels during the last 5 minutes of cooking.
                5. Serve: Garnish with fresh herbs and serve hot.
                """};

        String[] ricePudding = {"""
                Here is how you make Rice Pudding:
                
                Ingredients:
                
                - 1 cup short-grain rice
                - 4 cups milk
                - 1/2 cup sugar
                - 1 cinnamon stick
                - 1 teaspoon vanilla extract
                - Ground cinnamon for garnish
                
                Instructions:
                
                1. Cook Rice: In a pot, bring the rice and 2 cups of water to a boil. Reduce heat and simmer until water is absorbed.
                2. Add Milk: Stir in the milk, sugar, and cinnamon stick. Cook over low heat, stirring frequently, until the rice is creamy, about 25-30 minutes.
                3. Serve: Remove the cinnamon stick and stir in vanilla extract. Serve warm or chilled, topped with ground cinnamon.
                """};

        String[] quinoaSalad = {"""
                Here is how you make Quinoa Salad:
                
                Ingredients:
                
                - 1 cup quinoa
                - 2 cups water or vegetable broth
                - 1 cucumber, diced
                - 1 tomato, diced
                - 1/4 cup feta cheese (optional)
                - 2 tablespoons olive oil
                - 1 tablespoon lemon juice
                - Salt and pepper to taste
                
                Instructions:
                
                1. Cook Quinoa: Rinse quinoa and cook in water or broth according to package instructions. Let it cool.
                2. Combine: In a bowl, mix the cooled quinoa with cucumber, tomato, feta (if using), olive oil, and lemon juice.
                3. Serve: Season with salt and pepper and serve as a light, fresh salad.
                """};

        String[] tabouleh = {"""
                Here is how you make Tabouleh:
                
                Ingredients:
                
                - 1/2 cup bulgur wheat
                - 1 cup boiling water
                - 1/2 cup chopped parsley
                - 1/4 cup chopped mint
                - 1 tomato, diced
                - 1 cucumber, diced
                - 2 tablespoons olive oil
                - 2 tablespoons lemon juice
                - Salt and pepper to taste
                
                Instructions:
                
                1. Prepare Bulgur: Place bulgur in a bowl, pour boiling water over it, and cover. Let it sit for 10-15 minutes until absorbed.
                2. Combine: In a large bowl, mix the bulgur with parsley, mint, tomato, cucumber, olive oil, and lemon juice.
                3. Serve: Season with salt and pepper and serve chilled.
                """};

        String[] barleySoup = {"""
                Here is how you make Barley Soup:
                
                Ingredients:
                
                - 1/2 cup pearl barley
                - 1 onion, chopped
                - 2 carrots, diced
                - 2 celery stalks, diced
                - 4 cups vegetable broth
                - 2 cloves garlic, minced
                - 2 tablespoons olive oil
                - Salt and pepper to taste
                
                Instructions:
                
                1. Sauté Vegetables: In a pot, heat olive oil and sauté onion, carrots, celery, and garlic until softened.
                2. Add Barley and Broth: Stir in barley and vegetable broth. Bring to a boil, then reduce heat and simmer for 30-40 minutes until the barley is tender.
                3. Serve: Season with salt and pepper and serve hot.
                """};

        String[] stuffedCabbageRollsWithRice = {"""
                Here is how you make Stuffed Cabbage Rolls with Rice:
                
                Ingredients:
                
                - 8 cabbage leaves
                - 1 cup cooked rice
                - 200g ground beef or turkey (optional for non-vegetarian version)
                - 1 onion, chopped
                - 1 can diced tomatoes
                - 1 tablespoon tomato paste
                - Olive oil for cooking
                - Salt and pepper to taste
                
                Instructions:
                
                1. Prepare Cabbage: Blanch cabbage leaves in boiling water until soft.
                2. Cook Filling: In a pan, cook the onion (and meat if using) until browned. Add rice, diced tomatoes, and tomato paste. Season with salt and pepper.
                3. Roll: Place a spoonful of filling on each cabbage leaf and roll it up.
                4. Bake: Place the rolls in a baking dish, cover with foil, and bake at 180°C (350°F) for 30 minutes.
                """};

        String[] coconutRice = {"""
                Here is how you make Coconut Rice:
                
                Ingredients:
                
                - 1 1/2 cups jasmine rice
                - 1 1/2 cups coconut milk
                - 1 cup water
                - 1 tablespoon sugar
                - Pinch of salt
                
                Instructions:
                
                1. Cook Rice: In a pot, combine rice, coconut milk, water, sugar, and salt. Bring to a boil, then reduce heat and simmer for 15-20 minutes until the liquid is absorbed.
                2. Serve: Fluff the rice with a fork and serve with your favorite main dish.
                """};

        String[] brownRiceVegetableStirFry = {"""
                Here is how you make Brown Rice and Vegetable Stir-Fry:
                
                Ingredients:
                
                - 2 cups cooked brown rice
                - 1 bell pepper, sliced
                - 1 carrot, julienned
                - 1 zucchini, sliced
                - 2 tablespoons soy sauce
                - 1 tablespoon sesame oil
                - 2 cloves garlic, minced
                - 1 tablespoon ginger, minced
                
                Instructions:
                
                1. Sauté Vegetables: In a pan, heat sesame oil and sauté garlic and ginger. Add bell pepper, carrot, and zucchini, and stir-fry until tender.
                2. Add Rice: Stir in cooked brown rice and soy sauce. Cook for another 2-3 minutes.
                3. Serve: Serve hot as a quick and healthy meal.
                """};

        String[] biryani = {"""
                Here is how you make Biryani (Vegetarian or with Meat):
                
                Ingredients:
                
                - 1 1/2 cups basmati rice
                - 200g chicken or vegetables (for vegetarian version)
                - 1 onion, sliced
                - 2 cloves garlic, minced
                - 1 tablespoon ginger, minced
                - 1/2 cup yogurt
                - 1/4 cup chopped cilantro
                - 1 teaspoon garam masala
                - 1/2 teaspoon turmeric
                - 2 tablespoons ghee or oil
                
                Instructions:
                
                1. Cook Rice: Cook basmati rice according to package instructions. Set aside.
                2. Cook Meat or Vegetables: In a pan, heat ghee or oil and sauté onion, garlic, and ginger. Add chicken (or vegetables) and cook until browned. Stir in yogurt and spices.
                3. Combine: Layer the cooked rice over the meat or vegetables in the pan. Cover and cook on low heat for 10 minutes to let the flavors blend.
                4. Serve: Garnish with cilantro and serve hot.
                """};

        String[] farroSalad = {"""
                Here is how you make Farro Salad:
                
                Ingredients:
                
                - 1 cup farro
                - 2 cups water or vegetable broth
                - 1 cucumber, diced
                - 1 tomato, diced
                - 1/4 cup feta cheese (optional)
                - 2 tablespoons olive oil
                - 1 tablespoon lemon juice
                - Salt and pepper to taste
                
                Instructions:
                
                1. Cook Farro: Cook farro in water or broth according to package instructions. Let it cool.
                2. Combine: In a bowl, mix the cooled farro with cucumber, tomato, feta (if using), olive oil, and lemon juice.
                3. Serve: Season with salt and pepper and serve chilled as a hearty grain salad.
                """};

        String[] blackBeanAndRiceBowl = {"""
                Here is how you make a Black Bean and Rice Bowl:
                
                Ingredients:
                
                - 1 cup cooked rice (white or brown)
                - 1 can black beans, drained and rinsed
                - 1 avocado, diced
                - 1/2 cup corn kernels (optional)
                - 1/4 cup salsa
                - 1 tablespoon lime juice
                - 1/4 cup shredded cheese (optional)
                - Salt and pepper to taste
                
                Instructions:
                
                1. Heat Beans: In a pan, heat the black beans until warm.
                2. Assemble Bowl: In a bowl, layer rice, black beans, avocado, corn, salsa, and cheese (if using).
                3. Serve: Drizzle with lime juice and season with salt and pepper. Serve immediately.
                """};

        String[] garlicBread = {"""
                Here is how you make Garlic Bread:
                
                Ingredients:
                
                - 1 baguette or Italian bread
                - 4 tablespoons butter, softened
                - 3 cloves garlic, minced
                - 2 tablespoons fresh parsley, chopped
                - Optional: 1/4 cup grated Parmesan cheese
                
                Instructions:
                
                1. Preheat Oven: Preheat your oven to 180°C (350°F).
                2. Prepare Butter: Mix the softened butter with minced garlic and chopped parsley.
                3. Spread: Cut the baguette in half lengthwise and spread the garlic butter mixture evenly on each half.
                4. Bake: Place the bread on a baking sheet and bake for 10 minutes or until golden. Optional: Sprinkle with Parmesan cheese before baking.
                5. Serve: Slice and serve warm.
                """};

        String[] roastedVegetables = {"""
                Here is how you make Roasted Vegetables:
                
                Ingredients:
                
                - 2 carrots, sliced
                - 1 zucchini, sliced
                - 1 bell pepper, sliced
                - 1 onion, chopped
                - 2 tablespoons olive oil
                - Salt, pepper, and herbs (thyme, rosemary) to taste
                
                Instructions:
                
                1. Preheat Oven: Preheat the oven to 200°C (400°F).
                2. Toss Vegetables: In a large bowl, toss the vegetables with olive oil, salt, pepper, and herbs.
                3. Roast: Spread the vegetables on a baking sheet in a single layer and roast for 25-30 minutes until tender and slightly caramelized.
                4. Serve: Serve hot as a healthy side dish.
                """};

        String[] mashedPotatoes = {"""
                Here is how you make Mashed Potatoes:
                
                Ingredients:
                
                - 4 large potatoes, peeled and cubed
                - 1/2 cup milk
                - 2 tablespoons butter
                - Salt and pepper to taste
                - Optional: 1/4 cup sour cream or cream cheese for extra creaminess
                
                Instructions:
                
                1. Boil Potatoes: Cook the potatoes in boiling salted water until tender, about 15 minutes.
                2. Mash: Drain the potatoes and mash them with butter, milk, salt, and pepper. Optional: Stir in sour cream or cream cheese.
                3. Serve: Serve hot with your favorite main dish.
                """};

        String[] coleslaw = {"""
                Here is how you make Coleslaw:
                
                Ingredients:
                
                - 4 cups shredded cabbage
                - 1 carrot, grated
                - 1/2 cup mayonnaise
                - 1 tablespoon apple cider vinegar
                - 1 tablespoon sugar
                - Salt and pepper to taste
                
                Instructions:
                
                1. Combine Vegetables: In a large bowl, combine shredded cabbage and grated carrot.
                2. Make Dressing: In a small bowl, whisk together the mayonnaise, vinegar, sugar, salt, and pepper.
                3. Mix: Pour the dressing over the vegetables and toss until evenly coated.
                4. Serve: Chill in the refrigerator for 30 minutes before serving.
                """};

        String[] steamedBroccoli = {"""
                Here is how you make Steamed Broccoli:
                
                Ingredients:
                
                - 1 head of broccoli, cut into florets
                - Salt and pepper to taste
                - Optional: lemon wedges for serving
                
                Instructions:
                
                1. Steam Broccoli: Steam the broccoli florets in a steamer basket over boiling water for 5-7 minutes until tender but still bright green.
                2. Season: Season with salt and pepper. Optional: Serve with lemon wedges for a burst of flavor.
                """};

        String[] frenchFries = {"""
                Here is how you make French Fries:
                
                Ingredients:
                
                - 4 large potatoes, cut into fries
                - 2 tablespoons vegetable oil
                - Salt to taste
                
                Instructions:
                
                1. Preheat Oven: Preheat your oven to 220°C (425°F).
                2. Toss Potatoes: Toss the potato fries with vegetable oil and arrange them on a baking sheet in a single layer.
                3. Bake: Bake for 20-25 minutes, flipping halfway through, until golden and crispy.
                4. Season: Sprinkle with salt and serve hot.
                """};

        String[] bakedBeans = {"""
                Here is how you make Baked Beans:
                
                Ingredients:
                
                - 1 can baked beans
                - 1/2 onion, diced
                - 2 tablespoons molasses
                - 1 tablespoon mustard
                - 1 tablespoon ketchup
                - Salt and pepper to taste
                
                Instructions:
                
                1. Heat Ingredients: In a saucepan, combine baked beans, onion, molasses, mustard, and ketchup. Stir well.
                2. Simmer: Cook over medium heat for 10-15 minutes, stirring occasionally, until heated through.
                3. Serve: Season with salt and pepper and serve hot.
                """};

        String[] cornOnTheCob = {"""
                Here is how you make Corn on the Cob:
                
                Ingredients:
                
                - 4 ears of corn, husked
                - Butter for serving
                - Salt to taste
                
                Instructions:
                
                1. Boil Corn: In a large pot, bring water to a boil and add the corn. Boil for 7-10 minutes until tender.
                2. Serve: Drain and serve with butter and salt.
                """};

        String[] caesarSalad = {"""
                Here is how you make Caesar Salad:
                
                Ingredients:
                
                - 1 head of romaine lettuce, chopped
                - 1/4 cup grated Parmesan cheese
                - 1/2 cup Caesar dressing
                - 1/2 cup croutons
                - Optional: grilled chicken slices for a more filling salad
                
                Instructions:
                
                1. Toss Salad: In a large bowl, toss the lettuce with Caesar dressing until evenly coated.
                2. Add Toppings: Top with grated Parmesan cheese and croutons. Optional: Add grilled chicken slices for protein.
                3. Serve: Serve immediately as a fresh side or light meal.
                """};

        String[] potatoSalad = {"""
                Here is how you make Potato Salad:
                
                Ingredients:
                
                - 4 large potatoes, boiled and cubed
                - 1/2 cup mayonnaise
                - 2 tablespoons mustard
                - 1/4 cup chopped green onions
                - Salt and pepper to taste
                - Optional: 2 hard-boiled eggs, chopped
                
                Instructions:
                
                1. Combine Ingredients: In a large bowl, combine the potatoes, mayonnaise, mustard, and green onions. Stir gently to coat the potatoes.
                2. Serve: Season with salt and pepper. Optional: Stir in chopped hard-boiled eggs for extra flavor.
                """};

        String[] sauteedGreens = {"""
                Here is how you make Sautéed Greens (Spinach, Kale, etc.):
                
                Ingredients:
                
                - 1 bunch of spinach or kale, washed and chopped
                - 2 cloves garlic, minced
                - 1 tablespoon olive oil
                - Salt and pepper to taste
                
                Instructions:
                
                1. Heat Oil: In a pan, heat olive oil and sauté garlic until fragrant.
                2. Cook Greens: Add the chopped greens and cook until wilted, about 3-5 minutes.
                3. Season: Season with salt and pepper and serve immediately.
                """};

        String[] creamedCorn = {"""
                Here is how you make Creamed Corn:
                
                Ingredients:
                
                - 4 cups corn kernels (fresh or frozen)
                - 1/2 cup cream
                - 2 tablespoons butter
                - 1 tablespoon flour
                - Salt and pepper to taste
                
                Instructions:
                
                1. Cook Corn: In a pan, melt butter and stir in the flour to make a roux.
                2. Add Corn: Stir in the corn kernels and cook for a few minutes.
                3. Add Cream: Add the cream and cook until the mixture thickens, about 5 minutes.
                4. Serve: Season with salt and pepper and serve hot.
                """};

        String[] hummusWithPita = {"""
                Here is how you make Hummus with Pita Bread:
                
                Ingredients:
                
                - 1 can chickpeas, drained and rinsed
                - 2 tablespoons tahini
                - 1 clove garlic
                - 2 tablespoons olive oil
                - Juice of 1 lemon
                - Salt and pepper to taste
                - Pita bread for serving
                
                Instructions:
                
                1. Blend Ingredients: In a food processor, blend the chickpeas, tahini, garlic, olive oil, lemon juice, salt, and pepper until smooth.
                2. Serve: Serve with warm pita bread for dipping.
                """};

        String[] lemonade = {"""
                Here is how you make Lemonade:

                Ingredients:
                - 1 cup (240ml) fresh lemon juice (about 4-6 lemons)
                - 1 cup (200g) granulated sugar (adjust to taste)
                - 4 cups (960ml) cold water
                - Ice cubes
                - Lemon slices and mint leaves for garnish (optional)

                Instructions:
                1. Squeeze the Lemons: Juice the lemons to get about 1 cup of lemon juice. Remove any seeds.
                2. Make the Simple Syrup: In a small saucepan, combine sugar and 1 cup of water. Heat until the sugar is dissolved. Let cool.
                3. Combine: In a pitcher, combine the lemon juice, simple syrup, and the remaining water. Stir well.
                4. Serve: Pour over ice and garnish with lemon slices and mint leaves if desired.
                5. Enjoy: Refresh yourself with this tangy drink!
                """};

        String[] icedTea = {"""
                Here is how you make Iced Tea:

                Ingredients:
                - 4 cups (960ml) water
                - 4-6 tea bags (black, green, or herbal)
                - Ice cubes
                - Lemon slices and mint leaves for garnish (optional)
                - Sweetener to taste (sugar, honey, or syrup)

                Instructions:
                1. Boil Water: Bring the water to a boil in a pot.
                2. Brew Tea: Remove from heat, add the tea bags, and steep for 5-7 minutes.
                3. Sweeten: If desired, stir in sweetener while the tea is still warm.
                4. Chill: Remove tea bags and let the tea cool to room temperature. Refrigerate until chilled.
                5. Serve: Pour over ice, garnish with lemon slices and mint, and enjoy!
                """};

        String[] hotChocolate = {"""
                Here is how you make Hot Chocolate:

                Ingredients:
                - 2 cups (480ml) milk (dairy or plant-based)
                - 2 tablespoons cocoa powder
                - 2 tablespoons sugar (adjust to taste)
                - 1/4 teaspoon vanilla extract
                - Pinch of salt
                - Whipped cream or marshmallows for topping (optional)

                Instructions:
                1. Heat Milk: In a small saucepan, heat the milk over medium heat.
                2. Mix Cocoa and Sugar: In a separate bowl, mix cocoa powder, sugar, and salt. Add a few tablespoons of hot milk to make a paste.
                3. Combine: Whisk the cocoa mixture into the saucepan until smooth.
                4. Serve: Pour into a mug and top with whipped cream or marshmallows if desired. Enjoy!
                """};

        String[] coffee = {"""
                Here is how you make Coffee:

                Ingredients:
                - 1 cup (240ml) hot water
                - 1-2 tablespoons ground coffee (adjust to taste)
                - Milk or cream (optional)
                - Sugar or sweetener (optional)

                Instructions:
                1. Brew Coffee: Use a coffee maker, French press, or pour-over method to brew coffee using hot water and ground coffee.
                2. Serve: Pour into a cup. Add milk, cream, and sweetener as desired.
                3. Enjoy: Savor your freshly brewed coffee!
                """};

        String[] tea = {"""
                Here is how you make Tea:

                Ingredients:
                - 1 cup (240ml) hot water
                - 1 tea bag or 1 teaspoon loose tea
                - Sweetener (optional)
                - Lemon or milk (optional)

                Instructions:
                1. Boil Water: Bring water to a boil and then let it cool slightly.
                2. Brew Tea: Steep the tea bag or loose tea for 3-5 minutes.
                3. Serve: Remove tea bag, sweeten if desired, and add lemon or milk as you like.
                4. Enjoy: Relax with a warm cup of tea!
                """};

        String[] milkshakes = {"""
                Here is how you make Milkshakes:

                Ingredients:
                - 2 cups (480ml) ice cream (any flavor)
                - 1/2 cup (120ml) milk (adjust for thickness)
                - Whipped cream for topping (optional)

                Instructions:
                1. Blend: Combine ice cream and milk in a blender.
                2. Adjust Consistency: Blend until smooth. Add more milk if you want a thinner shake.
                3. Serve: Pour into a glass and top with whipped cream if desired. Enjoy!
                """};

        String[] mojitos = {"""
                Here is how you make Mojitos:

                Ingredients:
                - 10 fresh mint leaves
                - 1 lime, cut into wedges
                - 2 tablespoons sugar
                - 1 cup (240ml) soda water
                - Ice cubes

                Instructions:
                1. Muddle: In a glass, muddle mint leaves, lime wedges, and sugar until fragrant.
                2. Add Ice: Fill the glass with ice cubes.
                3. Pour Soda: Top with soda water, stir gently, and garnish with extra mint leaves if desired.
                4. Enjoy: Refreshing non-alcoholic drink!
                """};

        String[] freshFruitJuices = {"""
                Here is how you make Fresh Fruit Juices:

                Ingredients:
                - Assorted fresh fruits (oranges, apples, berries, etc.)
                - Water or sparkling water (optional)
                - Sweetener (optional)

                Instructions:
                1. Prepare Fruits: Peel and chop the fruits.
                2. Juice: Use a juicer or blender to extract juice. Strain if desired.
                3. Serve: Add water or sparkling water for dilution if needed. Enjoy fresh juice!
                """};

        String[] hotAppleCider = {"""
                Here is how you make Hot Apple Cider:

                Ingredients:
                - 4 cups (960ml) apple cider
                - 1-2 cinnamon sticks
                - 1/2 teaspoon whole cloves
                - 1/2 teaspoon allspice
                - Orange slices for garnish (optional)

                Instructions:
                1. Combine Ingredients: In a pot, combine apple cider, cinnamon sticks, cloves, and allspice.
                2. Heat: Simmer over low heat for 15-20 minutes.
                3. Serve: Pour into mugs and garnish with orange slices if desired. Enjoy warm!
                """};

        String[] icedCoffee = {"""
                Here is how you make Iced Coffee:

                Ingredients:
                - 1 cup (240ml) brewed coffee (cooled)
                - Ice cubes
                - Milk or cream (optional)
                - Sweetener (optional)

                Instructions:
                1. Brew Coffee: Brew your favorite coffee and let it cool.
                2. Serve: Fill a glass with ice, pour over the coffee, and add milk and sweetener if desired.
                3. Enjoy: Perfect for a warm day!
                """};

        String[] greenTeaIcedTea = {"""
                Here is how you make Green Tea Iced Tea:

                Ingredients:
                - 4 cups (960ml) water
                - 4 green tea bags
                - Ice cubes
                - Honey or lemon (optional)

                Instructions:
                1. Boil Water: Bring water to a boil and remove from heat.
                2. Steep: Add tea bags and steep for 3-5 minutes.
                3. Chill: Remove tea bags and let it cool. Refrigerate until chilled.
                4. Serve: Pour over ice, sweeten with honey or add lemon if desired, and enjoy!
                """};

        String[] lemonGingerHoneyTea = {"""
                Here is how you make Lemon Ginger Honey Tea:

                Ingredients:
                - 1 cup (240ml) water
                - 1-2 slices fresh ginger
                - 1 tablespoon lemon juice
                - 1 tablespoon honey (to taste)

                Instructions:
                1. Boil Water: In a saucepan, bring water to a boil.
                2. Add Ginger: Add ginger slices and simmer for 5-10 minutes.
                3. Strain: Strain the tea into a cup, add lemon juice and honey, stir well.
                4. Enjoy: A soothing drink, especially when you’re feeling under the weather!
                """};

        String[] herbalTeas = {"""
                Here is how you make Herbal Teas:

                Ingredients:
                - 1 cup (240ml) hot water
                - 1 herbal tea bag or 1 tablespoon loose herbal tea
                - Sweetener (optional)

                Instructions:
                1. Boil Water: Bring water to a boil and let cool slightly.
                2. Brew: Steep the herbal tea for 5-7 minutes.
                3. Serve: Sweeten if desired and enjoy your relaxing tea!
                """};

        String[] chocolateChipCookies = {"""
                Here is how you make Chocolate Chip Cookies:

                Ingredients:
                - 1 cup (227g) unsalted butter, softened
                - 3/4 cup (150g) brown sugar, packed
                - 3/4 cup (150g) granulated sugar
                - 1 teaspoon vanilla extract
                - 2 large eggs
                - 2 1/4 cups (280g) all-purpose flour
                - 1 teaspoon baking soda
                - 1/2 teaspoon salt
                - 2 cups (340g) chocolate chips

                Instructions:
                1. Preheat Oven: Preheat your oven to 375°F (190°C).
                2. Cream Butter and Sugars: In a large bowl, cream together the butter, brown sugar, and granulated sugar until smooth.
                3. Add Eggs and Vanilla: Beat in the eggs one at a time, then stir in the vanilla.
                4. Combine Dry Ingredients: In another bowl, combine flour, baking soda, and salt. Gradually blend this into the creamed mixture.
                5. Fold in Chocolate Chips: Stir in the chocolate chips.
                6. Bake: Drop by rounded tablespoon onto ungreased baking sheets. Bake for 9-11 minutes, or until golden brown.
                7. Enjoy: Let cool and enjoy your delicious cookies!
                """};

        String[] brownies = {"""
                Here is how you make Brownies:

                Ingredients:
                - 1/2 cup (113g) unsalted butter
                - 1 cup (200g) granulated sugar
                - 2 large eggs
                - 1 teaspoon vanilla extract
                - 1/3 cup (40g) unsweetened cocoa powder
                - 1/2 cup (65g) all-purpose flour
                - 1/4 teaspoon salt
                - 1/4 teaspoon baking powder

                Instructions:
                1. Preheat Oven: Preheat your oven to 350°F (175°C).
                2. Melt Butter: In a saucepan, melt the butter. Remove from heat and stir in sugar, eggs, and vanilla.
                3. Combine Dry Ingredients: Beat in cocoa, flour, salt, and baking powder.
                4. Bake: Spread batter into a greased 8-inch (20cm) square pan. Bake for 20-25 minutes.
                5. Cool and Cut: Let cool before cutting into squares. Enjoy your rich brownies!
                """};

        String[] cheesecake = {"""
                Here is how you make Cheesecake:

                Ingredients:
                - 1 1/2 cups (150g) graham cracker crumbs
                - 1/4 cup (50g) sugar
                - 1/2 cup (113g) unsalted butter, melted
                - 4 packages (8oz each) cream cheese, softened
                - 1 cup (200g) sugar
                - 1 teaspoon vanilla extract
                - 4 large eggs

                Instructions:
                1. Preheat Oven: Preheat your oven to 325°F (160°C).
                2. Make Crust: Combine graham cracker crumbs, 1/4 cup sugar, and melted butter. Press into the bottom of a 9-inch (23cm) springform pan.
                3. Beat Cream Cheese: In a large bowl, beat cream cheese, 1 cup sugar, and vanilla until smooth. Add eggs one at a time, mixing well.
                4. Bake: Pour filling over the crust and bake for 60-70 minutes, or until set.
                5. Cool: Let cool before refrigerating for at least 4 hours. Enjoy your creamy cheesecake!
                """};

        String[] applePie = {"""
                Here is how you make Apple Pie:

                Ingredients:
                - 2 1/2 cups (320g) all-purpose flour
                - 1 teaspoon salt
                - 1 tablespoon sugar
                - 1 cup (227g) unsalted butter, chilled and diced
                - 6-8 tablespoons ice water
                - 6-8 apples, peeled, cored, and sliced
                - 3/4 cup (150g) sugar
                - 2 tablespoons all-purpose flour
                - 1 teaspoon cinnamon

                Instructions:
                1. Make Pie Crust: In a bowl, mix flour, salt, and sugar. Cut in butter until mixture resembles coarse crumbs. Stir in water until dough forms a ball.
                2. Preheat Oven: Preheat your oven to 425°F (220°C).
                3. Prepare Filling: In a large bowl, toss apples with 3/4 cup sugar, 2 tablespoons flour, and cinnamon.
                4. Assemble Pie: Roll out dough, fill with apple mixture, and cover with top crust. Cut slits in the top.
                5. Bake: Bake for 15 minutes, then reduce temperature to 350°F (175°C) and bake for an additional 35-45 minutes.
                6. Cool: Let cool before serving. Enjoy your classic apple pie!
                """};

        String[] tiramisu = {"""
                Here is how you make Tiramisu:

                Ingredients:
                - 6 egg yolks
                - 3/4 cup (150g) sugar
                - 2/3 cup (160ml) milk
                - 1 1/4 cups (300ml) heavy cream
                - 1 cup (240ml) strong brewed coffee, cooled
                - 1/4 cup (60ml) coffee liqueur (optional)
                - 2 packs ladyfingers
                - Cocoa powder for dusting

                Instructions:
                1. Whisk Egg Yolks: In a bowl, whisk together egg yolks and sugar. Stir in milk and cook over low heat until thickened. Let cool.
                2. Whip Cream: In another bowl, whip heavy cream until stiff peaks form. Fold into the cooled egg mixture.
                3. Prepare Coffee: Mix coffee and liqueur (if using).
                4. Assemble: Dip ladyfingers in coffee and layer in a dish. Spread half of the cream mixture over the top. Repeat layers.
                5. Chill: Refrigerate for at least 4 hours. Dust with cocoa powder before serving. Enjoy your delicious tiramisu!
                """};

        String[] lemonBars = {"""
                Here is how you make Lemon Bars:

                Ingredients:
                - 1 cup (120g) all-purpose flour
                - 1/4 cup (50g) powdered sugar
                - 1/2 cup (113g) unsalted butter, softened
                - 1 cup (200g) granulated sugar
                - 2 large eggs
                - 2/3 cup (160ml) fresh lemon juice
                - 1 teaspoon baking powder
                - Powdered sugar for dusting

                Instructions:
                1. Preheat Oven: Preheat your oven to 350°F (175°C).
                2. Make Crust: Mix flour, powdered sugar, and butter until crumbly. Press into a greased 8-inch (20cm) square pan.
                3. Bake Crust: Bake for 15 minutes.
                4. Prepare Filling: In a bowl, whisk together granulated sugar, eggs, lemon juice, and baking powder. Pour over baked crust.
                5. Bake: Bake for an additional 20 minutes. Let cool before cutting into squares. Dust with powdered sugar. Enjoy!
                """};

        String[] pannaCotta = {"""
                Here is how you make Panna Cotta:

                Ingredients:
                - 1 cup (240ml) heavy cream
                - 1/2 cup (120ml) milk
                - 1/4 cup (50g) sugar
                - 1 teaspoon vanilla extract
                - 1 packet (2 1/4 teaspoons) gelatin powder
                - Fresh berries for topping (optional)

                Instructions:
                1. Heat Cream: In a saucepan, combine cream, milk, sugar, and vanilla. Heat until sugar is dissolved.
                2. Dissolve Gelatin: In a small bowl, sprinkle gelatin over 2 tablespoons of cold water. Let stand for 5 minutes. Then stir into the cream mixture until dissolved.
                3. Pour into Molds: Pour mixture into serving cups or molds. Refrigerate for at least 4 hours until set.
                4. Serve: Unmold and top with fresh berries if desired. Enjoy your creamy panna cotta!
                """};

        String[] cupcakes = {"""
                Here is how you make Cupcakes:

                Ingredients:
                - 1 1/2 cups (190g) all-purpose flour
                - 1 cup (200g) granulated sugar
                - 1/2 cup (113g) unsalted butter, softened
                - 2 large eggs
                - 1/2 cup (120ml) milk
                - 1 1/2 teaspoons baking powder
                - 1 teaspoon vanilla extract
                - Frosting of choice for topping

                Instructions:
                1. Preheat Oven: Preheat your oven to 350°F (175°C). Line a muffin tin with cupcake liners.
                2. Cream Butter and Sugar: In a large bowl, cream together butter and sugar. Beat in eggs one at a time.
                3. Combine Dry Ingredients: In another bowl, mix flour and baking powder. Gradually add to creamed mixture alternately with milk. Stir in vanilla.
                4. Bake: Fill cupcake liners 2/3 full with batter. Bake for 18-20 minutes or until a toothpick comes out clean.
                5. Cool and Frost: Let cool before frosting. Enjoy your delightful cupcakes!
                """};

        String[] cremeBrulee = {"""
                Here is how you make Crème Brûlée:

                Ingredients:
                - 2 cups (480ml) heavy cream
                - 1/2 cup (100g) sugar
                - 1 teaspoon vanilla extract
                - 4 large egg yolks
                - Extra sugar for caramelizing

                Instructions:
                1. Preheat Oven: Preheat your oven to 325°F (160°C).
                2. Heat Cream: In a saucepan, heat cream, 1/2 cup sugar, and vanilla until just boiling. Remove from heat.
                3. Whisk Egg Yolks: In a bowl, whisk egg yolks. Gradually whisk in the hot cream mixture.
                4. Bake: Pour into ramekins and place in a baking dish. Fill dish with water halfway up the sides of ramekins. Bake for 30-35 minutes.
                5. Cool and Serve: Let cool, then refrigerate for at least 2 hours. Before serving, sprinkle sugar on top and caramelize with a torch. Enjoy your elegant dessert!
                """};

        String[] bananaBread = {"""
                Here is how you make Banana Bread:

                Ingredients:
                - 2 to 3 ripe bananas, mashed
                - 1/3 cup (75g) melted butter
                - 1 teaspoon baking soda
                - Pinch of salt
                - 3/4 cup (150g) sugar
                - 1 large egg, beaten
                - 1 teaspoon vanilla extract
                - 1 1/2 cups (190g) all-purpose flour

                Instructions:
                1. Preheat Oven: Preheat your oven to 350°F (175°C). Grease a 4x8-inch (10x20cm) loaf pan.
                2. Mix Ingredients: In a mixing bowl, mix butter with mashed bananas. Stir in baking soda and salt. Mix in sugar, egg, and vanilla. Finally, mix in flour.
                3. Bake: Pour the batter into the prepared loaf pan. Bake for 60-65 minutes.
                4. Cool and Slice: Let cool before slicing. Enjoy your moist banana bread!
                """};

        String[] vanillaPudding = {"""
                Here is how you make Vanilla Pudding:

                Ingredients:
                - 2 cups (480ml) milk
                - 1/2 cup (100g) sugar
                - 1/4 cup (30g) cornstarch
                - 1/4 teaspoon salt
                - 1 teaspoon vanilla extract
                - 1 tablespoon butter

                Instructions:
                1. Combine Ingredients: In a saucepan, mix milk, sugar, cornstarch, and salt. Cook over medium heat, stirring until thickened.
                2. Add Vanilla: Remove from heat and stir in vanilla and butter.
                3. Cool: Pour into bowls and chill until set. Enjoy your creamy vanilla pudding!
                """};

        String[] fruitTart = {"""
                Here is how you make Fruit Tart:

                Ingredients:
                - 1 cup (120g) all-purpose flour
                - 1/4 cup (50g) sugar
                - 1/2 cup (113g) unsalted butter, softened
                - 1 egg yolk
                - 1/2 cup (120ml) pastry cream (store-bought or homemade)
                - Fresh fruit for topping (strawberries, blueberries, kiwi, etc.)

                Instructions:
                1. Make Crust: In a bowl, mix flour, sugar, and butter. Add egg yolk and combine until dough forms. Press into a tart pan.
                2. Preheat Oven: Preheat your oven to 350°F (175°C). Bake the crust for 15-20 minutes.
                3. Assemble Tart: Let crust cool, fill with pastry cream, and top with fresh fruit.
                4. Serve: Refrigerate for a bit and enjoy your refreshing fruit tart!
                """};

        String[] iceCream = {"""
                Here is how you make Ice Cream:

                Ingredients:
                - 2 cups (480ml) heavy cream
                - 1 cup (240ml) whole milk
                - 3/4 cup (150g) sugar
                - 1 teaspoon vanilla extract
                - Ice cream maker

                Instructions:
                1. Mix Ingredients: In a bowl, whisk together heavy cream, milk, sugar, and vanilla until sugar is dissolved.
                2. Churn: Pour the mixture into an ice cream maker and churn according to the manufacturer's instructions.
                3. Freeze: Transfer to an airtight container and freeze for at least 4 hours.
                4. Serve: Scoop and enjoy your homemade ice cream!
                """};

        String[] macarons = {"""
                Here is how you make Macarons:

                Ingredients:
                - 1 cup (100g) almond flour
                - 1 3/4 cups (200g) powdered sugar
                - 3 large egg whites
                - 1/4 cup (50g) granulated sugar
                - Food coloring (optional)
                - Filling of choice (buttercream, ganache, etc.)

                Instructions:
                1. Preheat Oven: Preheat your oven to 325°F (160°C) and line a baking sheet with parchment paper.
                2. Mix Dry Ingredients: Sift almond flour and powdered sugar together.
                3. Whip Egg Whites: In a bowl, whip egg whites until frothy. Gradually add granulated sugar and whip until stiff peaks form. If desired, add food coloring.
                4. Fold Ingredients: Gently fold the dry ingredients into the egg whites until combined.
                5. Pipe and Bake: Pipe circles onto the prepared baking sheet. Let sit for 30 minutes to form a skin. Bake for 15-20 minutes.
                6. Fill and Enjoy: Let cool and fill with your choice of filling. Enjoy your delicate macarons!
                """};

        String[] chocolateMousse = {"""
                Here is how you make Chocolate Mousse:

                Ingredients:
                - 6 ounces (170g) dark chocolate, chopped
                - 3 tablespoons (45g) butter
                - 3 large eggs, separated
                - 1/4 cup (50g) sugar
                - 1/2 cup (120ml) heavy cream

                Instructions:
                1. Melt Chocolate: In a bowl, melt chocolate and butter together until smooth.
                2. Beat Egg Yolks: In another bowl, whisk egg yolks and sugar until pale. Stir in melted chocolate.
                3. Whip Egg Whites: In a separate bowl, beat egg whites until stiff peaks form. Gently fold into chocolate mixture.
                4. Whip Cream: In another bowl, whip heavy cream until soft peaks form. Fold into the chocolate mixture.
                5. Chill: Spoon into serving dishes and refrigerate for at least 2 hours. Enjoy your rich chocolate mousse!
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
                "Waldorf Salad"};

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
                "Beef Lasagna"};

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
                "Bean chili"};

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
                "Turkey and spinach pasta"};

        String[] Rice = {
                "Fried rice",
                "Risotto",
                "Pilaf",
                "Stuffed bell peppers with rice",
                "Paella",
                "Rice pudding",
                "Quinoa salad",
                "Tabouleh",
                "Barley soup",
                "Stuffed cabbage rolls with rice",
                "Coconut rice",
                "Brown rice and vegetable stir-fry",
                "Biryani (vegetarian or with meat)",
                "Farro salad",
                "Black bean and rice bowl"};

        String[] Side = {
                "Garlic bread",
                "Roasted vegetables",
                "Mashed potatoes",
                "Coleslaw",
                "Steamed broccoli",
                "French fries",
                "Baked beans",
                "Corn on the cob",
                "Caesar salad",
                "Potato salad",
                "Sauteed greens",
                "Creamed corn",
                "Hummus with pita bread"};

        String[] Desserts = {
                "Chocolate chip cookies",
                "Brownies",
                "Cheesecake",
                "Apple pie",
                "Tiramisu",
                "Lemon bars",
                "Panna cotta",
                "Cupcakes",
                "Crème brûlée",
                "Banana bread",
                "Vanilla pudding",
                "Fruit tart",
                "Ice cream",
                "Macarons",
                "Rice pudding",
                "Chocolate mousse"};

        String[] Drinks = {
                "Lemonade",
                "Iced tea",
                "Smoothies",
                "Hot chocolate",
                "Coffee",
                "Tea",
                "Milkshakes",
                "Mojitos",
                "Fresh fruit juices",
                "Hot apple cider",
                "Iced coffee",
                "Green tea iced tea",
                "Lemon ginger honey tea",
                "Herbal teas",
                "Milk"};

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
                9 - Drinks
                10 - Desserts:
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
            String choice = Appetizers[random.nextInt(Appetizers.length)];
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
            String choice = soups[random.nextInt(soups.length)];
            if (choice.equals("Tomato Basil Soup")) {
                System.out.print("And your food is...Tomato Basil Soup!!!\n");
                System.out.print(Arrays.toString(tomatoBasilSoup));

            } else if (choice.equals("Chicken Noodle Soup")) {
                System.out.print("And your food is...Chicken Noodle Soup!!!\n");
                System.out.print(Arrays.toString(chickenNoodleSoup));

            } else if (choice.equals("Butternut Squash Soup")) {
                System.out.print("And your food is... Butternut Squash Soup!!!\n");
                System.out.print(Arrays.toString(butternutSquashSoup));

            } else if (choice.equals("Minestrone Soup")) {
                System.out.print("And your food is... Minestrone Soup!!!\n");
                System.out.print(Arrays.toString(minestroneSoup));

            } else if (choice.equals("French Onion Soup")) {
                System.out.print("And your food is... French Onion Soup!!!\n");
                System.out.print(Arrays.toString(frenchOnionSoup));

            } else if (choice.equals("Lentil Soup")) {
                System.out.print("And your food is... Lentil Soup!!!\n");
                System.out.print(Arrays.toString(lentilSoup));

            } else if (choice.equals("Clam Chowder")) {
                System.out.print("And your food is... Clam Chowder!!!\n");
                System.out.print(Arrays.toString(clamChowder));

            } else if (choice.equals("Thai Coconut Soup (Tom Kha Gai)")) {
                System.out.print("And your food is... Thai Coconut Soup!!!\n");
                System.out.print(Arrays.toString(thaiCoconutSoup));

            } else if (choice.equals("Broccoli Cheddar Soup")) {
                System.out.print("And your food is... Broccoli Cheddar Soup!!!\n");
                System.out.print(Arrays.toString(broccoliCheddarSoup));

            } else if (choice.equals("Gazpacho")) {
                System.out.print("And your food is... Gazpacho!!!\n");
                System.out.print(Arrays.toString(gazpacho));

            } else if (choice.equals("Split Pea Soup")) {
                System.out.print("And your food is... Split Pea Soup!!!\n");
                System.out.print(Arrays.toString(splitPeaSoup));

            } else if (choice.equals("Carrot Ginger Soup")) {
                System.out.print("And your food is... Carrot Ginger Soup!!!\n");
                System.out.print(Arrays.toString(carrotGingerSoup));

            } else if (choice.equals("Potato Leek Soup")) {
                System.out.print("And your food is... Potato Leek Soup!!!\n");
                System.out.print(Arrays.toString(potatoLeekSoup));

            } else if (choice.equals("Miso Soup")) {
                System.out.print("And your food is... Miso Soup!!!\n");
                System.out.print(Arrays.toString(misoSoup));

            }  else if (choice.equals("Waldorf Salad")) {
                System.out.print("And your food is... Waldorf Salad!!!\n");
                System.out.print(Arrays.toString(waldorfSalad));
            }
        }

        else if (recipe.equals("4")) {
            String choice = meat[random.nextInt(meat.length)];
            if (choice.equals("Lemon Garlic Shrimp")) {
                System.out.print("And your food is...Lemon Garlic Shrimp!!!\n");
                System.out.print(Arrays.toString(lemonGarlicShrimp));

            } else if (choice.equals("Grilled Steak")) {
                System.out.print("And your food is...Grilled Steak!!!\n");
                System.out.print(Arrays.toString(grilledSteak));

            } else if (choice.equals("Beef Stroganoff")) {
                System.out.print("And your food is... Beef Stroganoff!!!\n");
                System.out.print(Arrays.toString(beefStroganoff));

            } else if (choice.equals("Pork Tenderloin with Apples")) {
                System.out.print("And your food is... Pork Tenderloin with Apples!!!\n");
                System.out.print(Arrays.toString(porkTenderloinWithApples));

            } else if (choice.equals("Roast Chicken")) {
                System.out.print("And your food is... Roast Chicken!!!\n");
                System.out.print(Arrays.toString(roastChicken));

            } else if (choice.equals("Chicken Parmesan")) {
                System.out.print("And your food is... Chicken Parmesan!!!\n");
                System.out.print(Arrays.toString(chickenParmesan));

            } else if (choice.equals("Beef Tacos")) {
                System.out.print("And your food is... Beef Tacos!!!\n");
                System.out.print(Arrays.toString(beefTacos));

            } else if (choice.equals("Barbecue Ribs")) {
                System.out.print("And your food is... Barbecue Ribs!!!\n");
                System.out.print(Arrays.toString(barbecueRibs));

            } else if (choice.equals("Chicken Marsala")) {
                System.out.print("And your food is... Chicken Marsala!!!\n");
                System.out.print(Arrays.toString(chickenMarsala));

            } else if (choice.equals("Shepherd's Pie")) {
                System.out.print("And your food is... Shepherd's Pie!!!\n");
                System.out.print(Arrays.toString(shepherdsPie));

            } else if (choice.equals("Teriyaki Chicken")) {
                System.out.print("And your food is... Teriyaki Chicken!!!\n");
                System.out.print(Arrays.toString(teriyakiChicken));

            } else if (choice.equals("Beef Wellington")) {
                System.out.print("And your food is... Beef Wellington!!!\n");
                System.out.print(Arrays.toString(beefWellington));

            } else if (choice.equals("Stuffed Pork Chops")) {
                System.out.print("And your food is... Stuffed Pork Chops!!!\n");
                System.out.print(Arrays.toString(stuffedPorkChops));

            } else if (choice.equals("Chicken Cacciatore")) {
                System.out.print("And your food is... Chicken Cacciatore!!!\n");
                System.out.print(Arrays.toString(chickenCacciatore));

            }  else if (choice.equals("Beef Lasagna")) {
                System.out.print("And your food is... Beef Lasagna!!!\n");
                System.out.print(Arrays.toString(beefLasagna));
            }
        }

        else if (recipe.equals("5")) {
            String choice = Vegetarian[random.nextInt(Vegetarian.length)];
            if (choice.equals("Vegetable stir-fry")) {
                System.out.print("And your food is...Vegetable stir-fry!!!\n");
                System.out.print(Arrays.toString(vegetableStirFry));

            } else if (choice.equals("Lentil soup")) {
                System.out.print("And your food is...Lentil soup!!!\n");
                System.out.print(Arrays.toString(lentilSoup));

            } else if (choice.equals("Chickpea salad")) {
                System.out.print("And your food is... Chickpea salad!!!\n");
                System.out.print(Arrays.toString(chickpeaSalad));

            } else if (choice.equals("Stuffed bell peppers")) {
                System.out.print("And your food is... Stuffed bell peppers!!!\n");
                System.out.print(Arrays.toString(stuffedBellPeppers));

            } else if (choice.equals("Spinach and cheese quesadillas")) {
                System.out.print("And your food is... Spinach and cheese quesadillas!!!\n");
                System.out.print(Arrays.toString(spinachCheeseQuesadillas));

            } else if (choice.equals("Vegetable curry")) {
                System.out.print("And your food is... Vegetable curry!!!\n");
                System.out.print(Arrays.toString(vegetableCurry));

            } else if (choice.equals("Falafel")) {
                System.out.print("And your food is... Falafel!!!\n");
                System.out.print(Arrays.toString(falafel));

            } else if (choice.equals("Veggie burgers")) {
                System.out.print("And your food is... Veggie burgers!!!\n");
                System.out.print(Arrays.toString(veggieBurgers));

            } else if (choice.equals("Caprese salad")) {
                System.out.print("And your food is... Caprese salad!!!\n");
                System.out.print(Arrays.toString(capreseSalad));

            } else if (choice.equals("Veggie pasta")) {
                System.out.print("And your food is... Veggie pasta!!!\n");
                System.out.print(Arrays.toString(veggiePasta));

            } else if (choice.equals("Hummus with pita and veggies")) {
                System.out.print("And your food is... Hummus with pita and veggies!!!\n");
                System.out.print(Arrays.toString(hummusWithPitaAndVeggies));

            } else if (choice.equals("Veggie pizza")) {
                System.out.print("And your food is... Veggie pizza!!!\n");
                System.out.print(Arrays.toString(veggiePizza));

            } else if (choice.equals("Greek salad")) {
                System.out.print("And your food is... Greek salad!!!\n");
                System.out.print(Arrays.toString(greekSalad));

            } else if (choice.equals("Vegetable soup")) {
                System.out.print("And your food is... Vegetable soup!!!\n");
                System.out.print(Arrays.toString(vegetableSoup));

            }  else if (choice.equals("Bean chili")) {
                System.out.print("And your food is... Bean chili!!!\n");
                System.out.print(Arrays.toString(beanChili));
            }
        }

        else if (recipe.equals("6")) {
            String choice = Pasta[random.nextInt(Pasta.length)];
            if (choice.equals("Spaghetti Bolognese")) {
                System.out.print("And your food is...Spaghetti Bolognese!!!\n");
                System.out.print(Arrays.toString(spaghettiBolognese));

            } else if (choice.equals("Fettuccine Alfredo with chicken")) {
                System.out.print("And your food is...Fettuccine Alfredo with chicken!!!\n");
                System.out.print(Arrays.toString(fettuccineAlfredoWithChicken));

            } else if (choice.equals("Penne alla Vodka with pancetta")) {
                System.out.print("And your food is... Penne alla Vodka with pancetta!!!\n");
                System.out.print(Arrays.toString(penneAllaVodkaWithPancetta));

            } else if (choice.equals("Lasagna with ground beef")) {
                System.out.print("And your food is... Lasagna with ground beef!!!\n");
                System.out.print(Arrays.toString(lasagnaWithGroundBeef));

            } else if (choice.equals("Carbonara with bacon")) {
                System.out.print("And your food is... Carbonara with bacon!!!\n");
                System.out.print(Arrays.toString(carbonaraWithBacon));

            } else if (choice.equals("Beef Stroganoff with egg noodles")) {
                System.out.print("And your food is... Beef Stroganoff with egg noodles!!!\n");
                System.out.print(Arrays.toString(beefStroganoffWithEggNoodles));

            } else if (choice.equals("Pesto pasta with sausage")) {
                System.out.print("And your food is... Pesto pasta with sausage!!!\n");
                System.out.print(Arrays.toString(pestoPastaWithSausage));

            } else if (choice.equals("Spaghetti Carbonara")) {
                System.out.print("And your food is... Spaghetti Carbonara!!!\n");
                System.out.print(Arrays.toString(spaghettiCarbonara));

            } else if (choice.equals("Meatball marinara")) {
                System.out.print("And your food is... Meatball marinara!!!\n");
                System.out.print(Arrays.toString(meatballMarinara));

            } else if (choice.equals("Shrimp Scampi")) {
                System.out.print("And your food is... Shrimp Scampi!!!\n");
                System.out.print(Arrays.toString(shrimpScampi));

            } else if (choice.equals("Rigatoni with sausage and peppers")) {
                System.out.print("And your food is... Rigatoni with sausage and peppers!!!\n");
                System.out.print(Arrays.toString(rigatoniWithSausageAndPeppers));

            } else if (choice.equals("Spaghetti with clams")) {
                System.out.print("And your food is... Spaghetti with clams!!!\n");
                System.out.print(Arrays.toString(spaghettiWithClams));

            } else if (choice.equals("Beef and mushroom pasta")) {
                System.out.print("And your food is... Beef and mushroom pasta!!!\n");
                System.out.print(Arrays.toString(beefAndMushroomPasta));

            } else if (choice.equals("Chicken Parmesan pasta")) {
                System.out.print("And your food is... Chicken Parmesan pasta!!!\n");
                System.out.print(Arrays.toString(chickenParmesanPasta));

            }  else if (choice.equals("Turkey and spinach pasta")) {
                System.out.print("And your food is... Turkey and spinach pasta!!!\n");
                System.out.print(Arrays.toString(turkeyAndSpinachPasta));
            }
        }

        else if (recipe.equals("7")) {
            String choice = Rice[random.nextInt(Rice.length)];
            if (choice.equals("Fried rice")) {
                System.out.print("And your food is...Fried rice!!!\n");
                System.out.print(Arrays.toString(friedRice));

            } else if (choice.equals("Risotto")) {
                System.out.print("And your food is...Risotto!!!\n");
                System.out.print(Arrays.toString(risotto));

            } else if (choice.equals("Pilaf")) {
                System.out.print("And your food is... Pilaf!!!\n");
                System.out.print(Arrays.toString(pilaf));

            } else if (choice.equals("Stuffed bell peppers with rice")) {
                System.out.print("And your food is... Stuffed bell peppers with rice!!!\n");
                System.out.print(Arrays.toString(stuffedBellPeppersWithRice));

            } else if (choice.equals("Paella")) {
                System.out.print("And your food is... Paella!!!\n");
                System.out.print(Arrays.toString(paella));

            } else if (choice.equals("Rice pudding")) {
                System.out.print("And your food is... Rice pudding!!!\n");
                System.out.print(Arrays.toString(ricePudding));

            } else if (choice.equals("Quinoa salad")) {
                System.out.print("And your food is... Quinoa salad!!!\n");
                System.out.print(Arrays.toString(quinoaSalad));

            } else if (choice.equals("Tabouleh")) {
                System.out.print("And your food is... Tabouleh!!!\n");
                System.out.print(Arrays.toString(tabouleh));

            } else if (choice.equals("Barley soup")) {
                System.out.print("And your food is... Barley soup!!!\n");
                System.out.print(Arrays.toString(barleySoup));

            } else if (choice.equals("Stuffed cabbage rolls with rice")) {
                System.out.print("And your food is... Stuffed cabbage rolls with rice!!!\n");
                System.out.print(Arrays.toString(stuffedCabbageRollsWithRice));

            } else if (choice.equals("Coconut rice")) {
                System.out.print("And your food is... Coconut rice!!!\n");
                System.out.print(Arrays.toString(coconutRice));

            } else if (choice.equals("Brown rice and vegetable stir-fry")) {
                System.out.print("And your food is... Brown rice and vegetable stir-fry!!!\n");
                System.out.print(Arrays.toString(brownRiceVegetableStirFry));

            } else if (choice.equals("Biryani")) {
                System.out.print("And your food is... Biryani!!!\n");
                System.out.print(Arrays.toString(biryani));

            } else if (choice.equals("Farro salad")) {
                System.out.print("And your food is... Farro salad!!!\n");
                System.out.print(Arrays.toString(farroSalad));

            }  else if (choice.equals("Black bean and rice bowl")) {
                System.out.print("And your food is... Black bean and rice bowl!!!\n");
                System.out.print(Arrays.toString(blackBeanAndRiceBowl));
            }
        }

        else if (recipe.equals("8")) {
            String choice = Side[random.nextInt(Side.length)];
            if (choice.equals("Garlic bread")) {
                System.out.print("And your food is... Garlic bread!!!\n");
                System.out.print(Arrays.toString(garlicBread));

            } else if (choice.equals("Roasted vegetables")) {
                System.out.print("And your food is... Roasted vegetables!!!\n");
                System.out.print(Arrays.toString(roastedVegetables));

            } else if (choice.equals("Mashed potatoes")) {
                System.out.print("And your food is... Mashed potatoes!!!\n");
                System.out.print(Arrays.toString(mashedPotatoes));

            } else if (choice.equals("Coleslaw")) {
                System.out.print("And your food is... Coleslaw!!!\n");
                System.out.print(Arrays.toString(coleslaw));

            } else if (choice.equals("Steamed broccoli")) {
                System.out.print("And your food is... Steamed broccoli!!!\n");
                System.out.print(Arrays.toString(steamedBroccoli));

            } else if (choice.equals("French fries")) {
                System.out.print("And your food is... French fries!!!\n");
                System.out.print(Arrays.toString(frenchFries));

            } else if (choice.equals("Baked beans")) {
                System.out.print("And your food is... Baked beans!!!\n");
                System.out.print(Arrays.toString(bakedBeans));

            } else if (choice.equals("Corn on the cob")) {
                System.out.print("And your food is... Corn on the cob!!!\n");
                System.out.print(Arrays.toString(cornOnTheCob));

            } else if (choice.equals("Caesar salad")) {
                System.out.print("And your food is... Caesar salad!!!\n");
                System.out.print(Arrays.toString(caesarSalad));

            } else if (choice.equals("Potato salad")) {
                System.out.print("And your food is... Potato salad!!!\n");
                System.out.print(Arrays.toString(potatoSalad));

            } else if (choice.equals("Sauteed greens")) {
                System.out.print("And your food is... Sauteed greens!!!\n");
                System.out.print(Arrays.toString(sauteedGreens));

            } else if (choice.equals("Creamed corn")) {
                System.out.print("And your food is... Creamed corn!!!\n");
                System.out.print(Arrays.toString(creamedCorn));

            } else if (choice.equals("Hummus with pita bread")) {
                System.out.print("And your food is... Hummus with pita bread!!!\n");
                System.out.print(Arrays.toString(hummusWithPita));
            }
        }

        else if (recipe.equals("9")) {
            String choice = Drinks[random.nextInt(Drinks.length)];
            if (choice.equals("Lemonade")) {
                System.out.print("And your food is... Lemonade!!!\n");
                System.out.print(Arrays.toString(lemonade));

            } else if (choice.equals("Iced tea")) {
                System.out.print("And your food is... Iced tea!!!\n");
                System.out.print(Arrays.toString(icedTea));

            } else if (choice.equals("Smoothies")) {
                System.out.print("And your food is... Smoothies!!!\n");
                System.out.print(Arrays.toString(smoothie));

            } else if (choice.equals("Hot chocolate")) {
                System.out.print("And your food is... Hot chocolate!!!\n");
                System.out.print(Arrays.toString(hotChocolate));

            } else if (choice.equals("Coffee")) {
                System.out.print("And your food is... Coffee!!!\n");
                System.out.print(Arrays.toString(coffee));

            } else if (choice.equals("Tea")) {
                System.out.print("And your food is... Tea!!!\n");
                System.out.print(Arrays.toString(tea));

            } else if (choice.equals("Milkshakes")) {
                System.out.print("And your food is... Milkshakes!!!\n");
                System.out.print(Arrays.toString(milkshakes));

            } else if (choice.equals("Fresh fruit juices")) {
                System.out.print("And your food is... Fresh fruit juices!!!\n");
                System.out.print(Arrays.toString(freshFruitJuices));

            } else if (choice.equals("Hot apple cider")) {
                System.out.print("And your food is... Hot apple cider!!!\n");
                System.out.print(Arrays.toString(hotAppleCider));

            } else if (choice.equals("Iced coffee")) {
                System.out.print("And your food is... Iced coffee!!!\n");
                System.out.print(Arrays.toString(icedCoffee));

            } else if (choice.equals("Green tea iced tea")) {
                System.out.print("And your food is... Green tea iced tea!!!\n");
                System.out.print(Arrays.toString(greenTeaIcedTea));

            } else if (choice.equals("Lemon ginger honey tea")) {
                System.out.print("And your food is... Lemon ginger honey tea!!!\n");
                System.out.print(Arrays.toString(lemonGingerHoneyTea));

            } else if (choice.equals("Herbal teas")) {
                System.out.print("And your food is... Herbal teas!!!\n");
                System.out.print(Arrays.toString(herbalTeas));

            } else if (choice.equals("Mojitos")) {
                System.out.print("And your food is... Herbal teas!!!\n");
                System.out.print(Arrays.toString(mojitos));
            }
        }

        else if (recipe.equals("10")) {
            String choice = Desserts[random.nextInt(Desserts.length)];
            if (choice.equals("Chocolate chip cookies")) {
                System.out.print("And your food is... Chocolate chip cookies!!!\n");
                System.out.print(Arrays.toString(chocolateChipCookies));

            } else if (choice.equals("Brownies")) {
                System.out.print("And your food is... Brownies!!!\n");
                System.out.print(Arrays.toString((brownies)));

            } else if (choice.equals("Cheesecake")) {
                System.out.print("And your food is... Cheesecake!!!\n");
                System.out.print(Arrays.toString(cheesecake));

            } else if (choice.equals("Apple pie")) {
                System.out.print("And your food is... Apple pie!!!\n");
                System.out.print(Arrays.toString(applePie));

            } else if (choice.equals("Tiramisu")) {
                System.out.print("And your food is... Tiramisu!!!\n");
                System.out.print(Arrays.toString(tiramisu));

            } else if (choice.equals("Lemon bars")) {
                System.out.print("And your food is... Lemon bars!!!\n");
                System.out.print(Arrays.toString(lemonBars));

            } else if (choice.equals("Panna cotta")) {
                System.out.print("And your food is... Panna cotta!!!\n");
                System.out.print(Arrays.toString(pannaCotta));

            } else if (choice.equals("Cupcakes")) {
                System.out.print("And your food is... Cupcakes!!!\n");
                System.out.print(Arrays.toString(cupcakes));

            } else if (choice.equals("Crème brûlée")) {
                System.out.print("And your food is... Crème brûlée!!!\n");
                System.out.print(Arrays.toString(cremeBrulee));

            } else if (choice.equals("Banana bread")) {
                System.out.print("And your food is... Banana bread!!!\n");
                System.out.print(Arrays.toString(bananaBread));

            } else if (choice.equals("Vanilla pudding")) {
                System.out.print("And your food is... Vanilla pudding!!!\n");
                System.out.print(Arrays.toString(spaghettiWithClams));

            } else if (choice.equals("Fruit tart")) {
                System.out.print("And your food is... Fruit tart!!!\n");
                System.out.print(Arrays.toString(fruitTart));

            } else if (choice.equals("Ice cream")) {
                System.out.print("And your food is... Ice cream!!!\n");
                System.out.print(Arrays.toString(iceCream));

            }  else if (choice.equals("Macarons")) {
                System.out.print("And your food is... Macarons!!!\n");
                System.out.print(Arrays.toString(macarons));

            } else if (choice.equals("Chocolate mousse")) {
                System.out.print("And your food is... Chocolate mousse!!!\n");
                System.out.print(Arrays.toString(chocolateMousse));

            } else if (choice.equals("Rice pudding")) {
                System.out.print("And your food is... Rice pudding!!!\n");
                System.out.print(Arrays.toString(ricePudding));

            }
        } else {
            System.out.print("Invalid Input");
        }
    }
}
