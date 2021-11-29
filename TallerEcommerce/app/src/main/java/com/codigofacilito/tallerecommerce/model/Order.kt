package com.codigofacilito.tallereccommer.model

import com.codigofacilito.tallerecommerce.R


class Order(
    val id: Int = 0,
    val title: String = "",
    val total: Double = 0.0,
    val count: Int =0,
    val image: Int = 0,
    val direction : String=""
) {

fun getOrders()  = listOf(
        Order(
            0,
            "Burger King",
            200.0,
            3,
            R.drawable.hamburguesa,
            "Avenida alegria #1234"
        ),
        Order(
            1,
            "Comida China",
            100.0,
            1,
            R.drawable.chopsuey,
            "Avenida alegria #1234"
        ),
        Order(
            2,
            "Italiano",
            400.0,
            5,
            R.drawable.lasana,
            "Avenida alegria #1234"
        ),
    )
}