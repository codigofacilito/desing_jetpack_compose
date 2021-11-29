package com.codigofacilito.tallereccommer.model

import com.codigofacilito.tallerecommerce.R


class Category(
    val id: Int = 0,
    val category: String = "",
    val image: Int = 0,
) {

fun getCategories()  = listOf(
        Category(
            0,
            "Pizza",
            R.drawable.pizza,
        ),
        Category(
            1,
            "Mexicana",
            R.drawable.mexicana,
        ),
        Category(
            2,
            "Alitas",
            R.drawable.alitas,
        ),
        Category(
            3,
            "Sushi",
            R.drawable.sushi,
        ),
        Category(
            4,
            "Pasta",
            R.drawable.pasta,
        ),
    Category(
        5,
        "Mariscos",
        R.drawable.mariscos,
    )
    )
}