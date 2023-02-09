package mx.edu.potros.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGC: Button = findViewById(R.id.btnGC)
        val btnGF: Button = findViewById(R.id.btnGF)
        var etC: EditText = findViewById(R.id.etC)
        var etF: EditText = findViewById(R.id.etF)

        btnGC.setOnClickListener {
            val c=this.calcularGradoC(etF.text.toString().toDouble())
            etC.setText(c.toString())
        }

        btnGF.setOnClickListener{
            val f=this.calcularGradoF(etC.text.toString().toDouble())
            etF.setText(f.toString())
        }



    }

    fun calcularGradoF(c: Double): Double{
        var gradosF=c*1.8+32
        return gradosF
    }

    fun calcularGradoC(f: Double): Double{
        var gradosC=(f-32)/1.8
        return gradosC
    }

}