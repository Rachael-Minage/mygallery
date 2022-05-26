package dev.minage.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NeemActivity : AppCompatActivity() {
    lateinit var btnNeemprev:Button
    lateinit var btnNeemnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neem)
        btnNeemnext = findViewById(R.id.btnNeemnext)
        btnNeemnext.setOnClickListener {
            val intent = Intent(this,BaobabActivity::class.java)
            startActivity(intent)
        }
        btnNeemprev = findViewById(R.id.btnNeemprev)
        btnNeemprev.setOnClickListener {
            val intent = Intent(this,MahoganyActivity::class.java)
            startActivity(intent)
        }
    }
}