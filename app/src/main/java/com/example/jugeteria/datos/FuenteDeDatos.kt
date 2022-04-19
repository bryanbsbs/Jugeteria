package com.example.jugeteria.datos

import com.example.jugeteria.R
import com.example.jugeteria.Personaje

class FuenteDeDatos {
    fun getPersonajesDC(): ArrayList<Personaje> {
        return arrayListOf(
            Personaje(R.mipmap.batman, "DC", "Batman", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.superman, "DC", "Superman", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.joker, "DC", "Joker", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.wonder_woman, "DC", "Wonder Woman", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.flash, "DC", "Flash", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.linterna_verde, "DC", "Linterna Verde", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.robin, "DC", "Robin", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
    }

    fun getPersonajesMarvel(): ArrayList<Personaje> {
        return arrayListOf(
            Personaje(R.mipmap.spiderman, "Marvel", "Spiderman", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ironman, "Marvel", "Ironman", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.black_widow, "Marvel", "Black widow", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.thanos, "Marvel", "Thanos", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.capitan_america, "Marvel", "Capitan america", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.capitana_marvel, "Marvel", "Capitana marvel", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam.")
        )
    }

    fun getPersonajesXmen(): ArrayList<Personaje> {
        return arrayListOf(
            Personaje(R.mipmap.wolverine, "Xmen", "Wolverine", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ciclope, "Xmen", "Ciclope", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.mystique, "Xmen", "Mystique", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.magneto, "Xmen", "Magneto", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.tormenta, "Xmen", "Tormenta", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.profesor_x, "Xmen", "Profesor X", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam.")
        )
    }
}