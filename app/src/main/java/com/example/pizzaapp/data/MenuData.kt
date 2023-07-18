package com.example.pizzaapp.data


import com.example.pizzaapp.model.MenuItem

class MenuData {

    fun loadMenu(): List<MenuItem> {
       return listOf(
            MenuItem("Margarita", listOf("ketchup", "salami", "oregano", "cheddar"), 200),
            MenuItem(
                "Caprychoso",
                listOf("ketchup", "ham", "oregano", "cheddar", "corn", "mushrooms", "tomatoes"),
                245
            ),
            MenuItem("Peperoni", listOf("ketchup", "salami", "oregano", "cheddar", "olives"), 210),
            MenuItem(
                "Hawaii",
                listOf("ketchup", "BBQ sauce", "anchovies", "pepper", "cheddar", "pineapples"),
                265
            ),
            MenuItem(
                "Cheese",
                listOf("cheese sauce", "feta", "mozzarella", "cheddar", "philadelphia"),
                240
            ),
            MenuItem(
                "Spicy",
                listOf(
                    "spicy ketchup",
                    "salami",
                    "oregano",
                    "cheddar",
                    "chili pepper",
                    "corn",
                    "tomatoes"
                ),
                230
            ),
            MenuItem(
                "Vegeterian",
                listOf("ketchup", "tomatoes", "lettuce", "onion", "beet", "oregano", "cheddar"),
                225
            ),
            MenuItem(
                "Four Seasons",
                listOf(
                    "ketchup",
                    "BBQ",
                    "bechamel",
                    "berry sauce",
                    "salami",
                    "ham",
                    "chicken",
                    "beef",
                    "oregano",
                    "olive",
                    "corn",
                    "tomatoes",
                    "mushrooms",
                    "cheddar"
                ),
                320
            ),
            MenuItem(
                "Milan",
                listOf("ketchup", "salami", "italy spices", "olives", "mozzarella"),
                260
            ),
            MenuItem(
                "Chicken",
                listOf("ketchup", "chicken", "oregano", "pepper", "tomatoes", "olives", "cheddar"),
                240
            ),
            MenuItem(
                "Sweet Pizza",
                listOf("nutella", "marshmellows", "nuts", "candy", "icecream", "almond cake"),
                300
            )
        )
    }
}