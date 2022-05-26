package dev.minage.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNextmain: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNextmain = findViewById(R.id.btnNextmain)
        btnNextmain.setOnClickListener {
            val intent = Intent(this,BambooActivity::class.java)
            startActivity(intent)
        }
    }
}