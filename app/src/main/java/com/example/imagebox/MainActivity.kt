package com.example.imagebox
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var txtNumero: TextView
    lateinit var imgdado: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNumero = findViewById(R.id.txtNumeros)
        imgdado = findViewById(R.id.imgdado)
    }
    //** metodo para lanzar el clic */

    fun lanzadado(v: View){
        Log.d("dado app","se preciono")//es com el print
        val numeroAleatorio = Random.nextInt(6)+1;
        val imagenAponer = when(numeroAleatorio) {
            1 -> {
                txtNumero.setText ("1")
                    R.drawable.dice_1;
            }
            2 -> {
                txtNumero.setText("2")
                R.drawable.dice_2
            }
            3 -> {
                txtNumero.setText("3")
                R.drawable.dice_3
            }
            4 -> {
                txtNumero.setText("4")
                R.drawable.dice_4
            }
            5 -> {
                txtNumero.setText("5")
                R.drawable.dice_5}

            else -> {
                txtNumero.setText("6")
                R.drawable.dice_6}
            }
        imgdado.setImageResource(imagenAponer)
        }
}
