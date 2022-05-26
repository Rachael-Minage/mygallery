package dev.minage.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BambooActivity : AppCompatActivity() {
    lateinit var btnNextone:Button
    lateinit var btnPrevone:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bamboo)
        btnNextone = findViewById(R.id.btnNextone)
        btnNextone.setOnClickListener {
            val intent = Intent(this,MahoganyActivity::class.java)
            startActivity(intent)
        }
        btnPrevone = findViewById(R.id.btnPrevone)
        btnPrevone.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}