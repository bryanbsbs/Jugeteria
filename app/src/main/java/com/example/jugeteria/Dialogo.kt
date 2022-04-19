package com.example.jugeteria

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class Dialogo {
    interface NotificaDialogo {
        fun onDialogoPositivoClick(entrada: String, personaje: Personaje)
    }

    class DialogoPersonalizado(private var dialogoListener: NotificaDialogo, private val personaje: Personaje): DialogFragment() {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            val builder = AlertDialog.Builder(activity)
            val inflater = activity?.layoutInflater
            val dialogo = inflater?.inflate(R.layout.dialogo_layout, null)
            builder.setView(dialogo)
            with(builder) {
                val titulo = dialogo?.findViewById<TextView>(R.id.txvTitulo)
                titulo?.text = "${personaje.categoria} ${personaje.nombre}"

                val precio = dialogo?.findViewById<TextView>(R.id.txvPrecio)
                precio?.text = "Precio: $${personaje.precio}"

                val imagen = dialogo?.findViewById<ImageView>(R.id.imgSuperheroe)
                imagen?.setImageResource(personaje.imagen)

                val descripcion = dialogo?.findViewById<TextView>(R.id.txvDescripcion)
                descripcion?.text = personaje.descripcion

                setPositiveButton("Aceptar") { dialog, _ ->
                    val editText = dialogo?.findViewById<EditText>(R.id.edtNombre)
                    val nombre: String = editText?.text.toString()
                    if (nombre.isNotEmpty()) {
                        dialogoListener.onDialogoPositivoClick(nombre, personaje)
                        dialog.dismiss()
                    } else {
                        Toast.makeText(activity, "Para completar la compra primero ingresa tu nombre", Toast.LENGTH_LONG).show()
                    }

                }
                setNegativeButton("Cancelar") {dialog, _ ->
                    dialog.cancel()
                }
            }
            return builder.create()
        }
    }
}