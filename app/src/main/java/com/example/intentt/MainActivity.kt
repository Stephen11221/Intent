package com.example.intentt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button =findViewById(R.id.zalego)

        val url =".https://zalegoacademy.ac.ke"

        button.setOnClickListener {
            val intent=Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.type="text"
            intent.putExtra("click button",url)
             val chooser=Intent.createChooser(intent,"Click button........")
            startActivity(chooser)
        }

    }


}