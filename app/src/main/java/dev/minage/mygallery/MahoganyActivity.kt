package dev.minage.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MahoganyActivity : AppCompatActivity() {
    lateinit var btnMahoganynext: Button
    lateinit var btnMahoganyprev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mahogany)
        btnMahoganynext = findViewById(R.id.btnMahoganynext)
        btnMahoganynext.setOnClickListener {
            val intent = Intent(this,NeemActivity::class.java)
            startActivity(intent)
        }
        btnMahoganyprev = findViewById(R.id.btnMahoganyprev)
        btnMahoganyprev.setOnClickListener {
            val intent = Intent(this,BambooActivity::class.java)
            startActivity(intent)
        }
    }
}