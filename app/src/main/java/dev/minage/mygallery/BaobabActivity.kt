package dev.minage.mygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BaobabActivity : AppCompatActivity() {

    lateinit var btnBaobabprev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baobab)
        btnBaobabprev = findViewById(R.id.btnBaobabprev)
        btnBaobabprev.setOnClickListener {
            val intent = Intent(this,NeemActivity::class.java)
            startActivity(intent)
        }


    }
}