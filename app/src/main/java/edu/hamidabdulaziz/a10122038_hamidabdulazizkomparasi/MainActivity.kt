//10122038-HAMID ABDUL AZIZ IF-1
package edu.hamidabdulaziz.a10122038_hamidabdulazizkomparasi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etNIM: EditText
    private lateinit var etNama: EditText
    private lateinit var btnSimpan: Button
    private lateinit var tvNIM: TextView
    private lateinit var tvNama: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNIM = findViewById(R.id.etNIM)
        etNama = findViewById(R.id.etNama)
        btnSimpan = findViewById(R.id.btnSimpan)
        tvNIM = findViewById(R.id.tvNIM)
        tvNama = findViewById(R.id.tvNama)

        btnSimpan.setOnClickListener {
            val nim = etNIM.text.toString()
            val nama = etNama.text.toString()

            tvNIM.text = nim
            tvNama.text = nama
        }
    }
}
