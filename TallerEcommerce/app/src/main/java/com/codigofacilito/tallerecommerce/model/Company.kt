package com.codigofacilito.tallereccommer.model

import com.codigofacilito.tallerecommerce.R


class Company(
    val id: Int = 0,
    val name: String = "",
    val description : String="",
    val deliveryPrice: String = "",
    val deliveryTime: String = "",
    val rating: String = "",
    val image : Int =0,
    val products : List<Product> =listOf()
) {

fun getCompanies()  = listOf(
        Company(
            0,
            "Burger King",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",
            "30.00",
            "45-55 min",
            "5.0",
            R.drawable.burgerking,
            listOf(
                Product(
                    0,
                    "Hambuerguesa Res",
                    200.0,
                    R.drawable.hamburguesa,
                    true

                ),
                Product(
                    1,
                    "Hambuerguesa Pollo",
                    500.0,
                    R.drawable.hamburguesa,
                    false
                ),
                Product(
                    2,
                    "Hambuerguesa Puerco",
                    250.0,
                    R.drawable.hamburguesa,
                    false
                ),
            )
        ),
        Company(
            1,
            "Comida China",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",
            "20.00",
            "25-40 min",
            "4.0",
            R.drawable.chinas,
            listOf(
                Product(
                    0,
                    "Chop suey res",
                    200.0,
                    R.drawable.chopsuey,
                    false

                ),
                Product(
                    1,
                    "Chop suey pollo",
                    500.0,
                    R.drawable.chopsuey,
                    true
                ),
                Product(
                    2,
                    "Chop suey puerco",
                    250.0,
                    R.drawable.chopsuey,
                    false
                ),
            )
        ),
        Company(
            2,
            "Italiano",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",
            "40.00",
            "10-25 min",
            "3.0",
            R.drawable.italiana,
            listOf(
                Product(
                    0,
                    "Lasana res",
                    200.0,
                    R.drawable.lasana,
                    true

                ),
                Product(
                    1,
                    "Lasana pollo",
                    500.0,
                    R.drawable.lasana,
                    true
                ),
                Product(
                    2,
                    "Lasana puerco",
                    250.0,
                    R.drawable.lasana,
                    false
                ),
            )
        ),
        Company(
            3,
            "Don Rafita",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",

            "90.00",
            "45-60 min",
            "5.0",
            R.drawable.donrafita,
            listOf(
                Product(
                    0,
                    "Gordita res",
                    200.0,
                    R.drawable.gorditas,
                    false

                ),
                Product(
                    1,
                    "Gordita pollo",
                    500.0,
                    R.drawable.gorditas,
                    false
                ),
                Product(
                    2,
                    "Gordita puerco",
                    250.0,
                    R.drawable.gorditas,
                    true
                ),
            )
        ),
        Company(
            4,
            "Chilis",
            "es una cadena de establecimientos de comida rápida estadounidense con sede central en Miami, Florida, fundada por James McLamore y David Edgerton, presente a nivel internacional y especializada principalmente en la elaboración de hamburguesas.",
            "100.00",
            "05-15 min",
            "4.5",
            R.drawable.chillis,
            listOf(
                Product(
                    0,
                    "Alitas habanero",
                    200.0,
                    R.drawable.alitas,
                    false

                ),
                Product(
                    1,
                    "Alitas Bufalo",
                    500.0,
                    R.drawable.wings,
                    true
                ),
                Product(
                    2,
                    "Papas",
                    250.0,
                    R.drawable.wings,
                    false
                ),
            )
        )
    )
}