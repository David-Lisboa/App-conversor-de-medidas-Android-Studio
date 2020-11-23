package br.com.ddproject.conversordemedidas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = Converter as Button

        btn.setOnClickListener {
            var numero = textView.text.toString().toInt()
            var calcular = Calcular(numero)
            Resultado.text = calcular.toString()
        }

    }
    private fun Calcular(numero: Int): String {
        val m  = numero * 1000
        val cm = numero * 100000
        val mm = numero * 1000000
        return "$m metros,\n $cm centimetro,\n $mm milimetros"
    }

}