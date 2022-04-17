package com.example.jugeteria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.jugeteria.adaptadores.SuperheroeAdapter

class MainActivity : AppCompatActivity() {
    private var personajesDC = ArrayList<Superheroe>()
    private var personajesMarvel = ArrayList<Superheroe>()
    private var personajesXmen = ArrayList<Superheroe>()
    private lateinit var adaptador: SuperheroeAdapter
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Batman", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Superman", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Joker", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Harley Quin", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Robin", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Pinguino", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Harley Quin", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Robin", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesDC.add(Superheroe(R.mipmap.ic_launcher, "DC", "Pinguino", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))

        personajesMarvel.add(Superheroe(R.mipmap.ic_launcher, "Marvel", "Spiderman", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesMarvel.add(Superheroe(R.mipmap.ic_launcher, "Marvel", "Ironman", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesMarvel.add(Superheroe(R.mipmap.ic_launcher, "Marvel", "Black widow", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesMarvel.add(Superheroe(R.mipmap.ic_launcher, "Marvel", "Thanos", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesMarvel.add(Superheroe(R.mipmap.ic_launcher, "Marvel", "Capitan america", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesMarvel.add(Superheroe(R.mipmap.ic_launcher, "Marvel", "Capitana marvel", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))

        personajesXmen.add(Superheroe(R.mipmap.ic_launcher, "Xmen", "Wolverine", 599.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesXmen.add(Superheroe(R.mipmap.ic_launcher, "Xmen", "Ciclope", 499.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesXmen.add(Superheroe(R.mipmap.ic_launcher, "Xmen", "Mystique", 399.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesXmen.add(Superheroe(R.mipmap.ic_launcher, "Xmen", "Magneto", 299.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesXmen.add(Superheroe(R.mipmap.ic_launcher, "Xmen", "Tormenta", 199.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))
        personajesXmen.add(Superheroe(R.mipmap.ic_launcher, "Xmen", "Profesor X", 99.99, "Lorem ipsum dolor sit amet consectetur adipiscing elit nibh sociis, potenti auctor venenatis aliquam fermentum platea ad torquent, massa dui sed ante posuere eget tellus nullam."))

        adaptador = SuperheroeAdapter(this, personajesDC)
        listView.adapter = adaptador
    }

    override fun onStart() {
        super.onStart()
        listView.onItemClickListener = object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(applicationContext, "Escojiste: ${personajesDC[p2].nombre}", Toast.LENGTH_LONG).show()
            }
        }
    }
}