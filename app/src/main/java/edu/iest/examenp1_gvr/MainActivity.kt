package edu.iest.examenp1_gvr

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var bnComprar: Button? = null
    private var cambioIcono: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tvPie = findViewById<TextView>(R.id.tvPie)
        tvPie.setOnClickListener {
            finish()
        }

        val ivAntMan = findViewById<ImageView>(R.id.ivAntMan)
        ivAntMan.setOnClickListener {
            var arregloImagenes = arrayOf<Int>(R.drawable.antmanq, R.drawable.iv2)
            if (cambioIcono) {
                ivAntMan.setImageResource(arregloImagenes[0])
            } else {
                ivAntMan.setImageResource(arregloImagenes[1])
            }
            cambioIcono = !cambioIcono
        }


    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}