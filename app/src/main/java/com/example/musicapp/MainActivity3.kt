package com.example.musicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3 : AppCompatActivity() {
    private lateinit var bottomNav:BottomNavigationView
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

    }
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.bottom_navigation_menu, menu)
//        return true
//    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.item1 -> {
//                val intent = Intent(this, MainActivity3::class.java)
//                startActivity(intent)
//                return true
//            }
//            R.id.item2 -> {
//                val intent = Intent(this, MainActivity4::class.java)
//                startActivity(intent)
//                return true
//            }
//            R.id.item3 -> {
//                val intent = Intent(this, MainActivity3::class.java)
//                startActivity(intent)
//                return true
//            }
//            R.id.item4 -> {
//                val intent = Intent(this, MainActivity3::class.java)
//                startActivity(intent)
//                return true
//            }
//            // Add more menu items as needed
//            else -> return super.onOptionsItemSelected(item)
//        }
//    }


}