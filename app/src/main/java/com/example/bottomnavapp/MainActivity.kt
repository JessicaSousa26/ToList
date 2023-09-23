package com.example.bottomnavapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_home -> {
                    // Mostrar um Toast quando o item Home é selecionado
                    Toast.makeText(this@MainActivity, "Item Home selecionado", Toast.LENGTH_SHORT).show()

                    // Abrir a MainActivity2
                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(intent)

                    true
                }
                R.id.item_perfil -> {
                    // Mostrar um Toast quando o item Perfil é selecionado
                    Toast.makeText(this@MainActivity, "Item Search selecionado", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.item_dicas -> {
                    // Mostrar um Toast quando o item Dicas é selecionado
                    Toast.makeText(this@MainActivity, "Item Notifications selecionado", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.item_search -> {
                    // Mostrar um Toast quando o item Pesquisar é selecionado
                    Toast.makeText(this@MainActivity, "Item Profile selecionado", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.item_logout -> {
                    // Mostrar um Toast quando o item Profile é selecionado
                    Toast.makeText(
                        this@MainActivity,
                        "Item Profile selecionado",
                        Toast.LENGTH_SHORT
                    ).show()
                    true
                }
                else -> false
            }
        }

    }
}
