package com.example.jugeteria.datos

import com.example.jugeteria.R
import com.example.jugeteria.Personaje

class FuenteDeDatos {
    fun getPersonajesDC(): ArrayList<Personaje> {
        return arrayListOf(
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Batman", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Superman", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Joker", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Harley Quin", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Robin", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Pinguino", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Harley Quin", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Robin", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.drawable.ic_launcher_foreground, "DC", "Pinguino", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
    }

    fun getPersonajesMarvel(): ArrayList<Personaje> {
        return arrayListOf(
            Personaje(R.mipmap.ic_launcher, "Marvel", "Spiderman", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Marvel", "Ironman", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Marvel", "Black widow", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Marvel", "Thanos", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Marvel", "Capitan america", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Marvel", "Capitana marvel", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam.")
        )
    }

    fun getPersonajesXmen(): ArrayList<Personaje> {
        return arrayListOf(
            Personaje(R.mipmap.ic_launcher, "Xmen", "Wolverine", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Xmen", "Ciclope", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Xmen", "Mystique", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Xmen", "Magneto", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Xmen", "Tormenta", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."),
            Personaje(R.mipmap.ic_launcher, "Xmen", "Profesor X", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam.")
        )
    }
}