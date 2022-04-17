package com.example.jugeteria.adaptadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.jugeteria.R
import com.example.jugeteria.Superheroe

class SuperheroeAdapter : BaseAdapter {

    var contexto: Context? = null
    var listaDeSuperheroes = ArrayList<Superheroe>()

    constructor(contexto: Context, lista: ArrayList<Superheroe>): super() {
        this.contexto = contexto
        this.listaDeSuperheroes = lista
    }

    //Este metodo genera una vista a partir de los datos de la lista de datos, inflando los
    //componentes
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = p1
        val holder: ItemHolder
        if(view == null) {
            view = LayoutInflater.from(contexto).inflate(R.layout.superheroe_item, null)
            holder = ItemHolder(view)
            view.tag = holder
        } else {
            holder = view.tag as ItemHolder
        }
        val superheroe = listaDeSuperheroes[p0]
        holder.imagen.setImageResource(superheroe.imagen)
        holder.categoria.text = superheroe.categoria
        holder.nombre.text = superheroe.nombre
        holder.precio.text = superheroe.precio.toString()

        return view as View
    }

    override fun getCount(): Int {
        return listaDeSuperheroes.size
    }

    override fun getItem(position: Int): Any {
        return listaDeSuperheroes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    internal class ItemHolder(view: View) {
        var imagen: ImageView = view.findViewById(R.id.imgSuperheroe)
        var categoria: TextView = view.findViewById(R.id.txvCategoria)
        var nombre: TextView = view.findViewById(R.id.txvNombre)
        var precio: TextView = view.findViewById(R.id.txvPrecio)
    }
}