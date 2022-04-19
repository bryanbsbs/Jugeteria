package com.example.jugeteria

import android.media.RingtoneManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.jugeteria.adaptadores.SuperheroeAdapter
import com.example.jugeteria.datos.FuenteDeDatos

class MainActivity : AppCompatActivity(), Dialogo.NotificaDialogo {
    private lateinit var adaptador: SuperheroeAdapter
    private lateinit var listView: ListView
    val personajesDC = FuenteDeDatos().getPersonajesDC()
    val personajesMarvel = FuenteDeDatos().getPersonajesMarvel()
    val personajesXmen = FuenteDeDatos().getPersonajesXmen()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        iniciarLista(personajesDC)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.dc -> {
                iniciarLista(personajesDC)
                item.isChecked = true
                return true
            }
            R.id.marvel -> {
                iniciarLista(personajesMarvel)
                item.isChecked = true
                return true
            }
            R.id.xmen -> {
                iniciarLista(personajesXmen)
                item.isChecked = true
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun iniciarLista(lista: ArrayList<Personaje>) {
        adaptador = SuperheroeAdapter(this, lista)
        listView.adapter = adaptador
        listView.setOnItemClickListener { adapterView, view, i, l ->
            val dp: Dialogo.DialogoPersonalizado = Dialogo.DialogoPersonalizado(this, lista[i])
            dp.show(supportFragmentManager, null)
        }
    }

    override fun onDialogoPositivoClick(entrada: String, personaje: Personaje) {
            if (entrada.isNotBlank()){
                enviarNotificacion(entrada, personaje)
            }
    }

    private fun enviarNotificacion(nombre: String?, personaje: Personaje) {
        val miBitmap = personaje.imagen.createBitmap(this)
        val CHANNEL_ID = "com.example.jugeteria"
        val NOTIFICATION_ID = 1
        // Contenido de la notificación
        val titulo = "Se realizó su compra"
        val texto = "$nombre usted compró: ${personaje.nombre} figura de acción"
        val uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.sym_def_app_icon)
            .setLargeIcon(miBitmap)
            .setContentTitle(titulo)
            .setContentText(texto)
            .setStyle(
                NotificationCompat.BigPictureStyle()
                    .bigPicture(miBitmap)
            )
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setSound(uri)
            .setAutoCancel(true)
        // Mostrar la notificacion
        with(NotificationManagerCompat.from(this)) {
            notify(NOTIFICATION_ID, builder.build())
        }
    }


}
























