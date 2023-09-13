package com.example.musicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.ActionBar
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.progressindicator.LinearProgressIndicator

class MainActivity3 : AppCompatActivity() {
    private lateinit var bottomNav:BottomNavigationView
    private lateinit var progressBar: LinearProgressIndicator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        bottomNav=findViewById(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener {item->
            when (item.itemId) {
           R.id.item1 -> {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
                 true
            }
            R.id.item2 -> {
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
                true
            }
            R.id.item3 -> {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
                true
            }
            R.id.item4 -> {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
                true
            }
            // Add more menu items as needed
            else ->  super.onOptionsItemSelected(item)
        }

        }
        progressBar=findViewById(R.id.progressBar)
        Handler().postDelayed({
            progressBar.visibility = View.INVISIBLE
        },3000)
    }


}