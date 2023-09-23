package com.example.bottomnavapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bottomnavapp.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item_home -> replaceFragment(HomeFragment())
                R.id.item_perfil -> replaceFragment(PerfilFragment())
                R.id.item_dicas -> replaceFragment(DicasFragment())
                R.id.item_search -> replaceFragment(SearchFragment())
                R.id.item_logout -> finish()
                else -> {
                    replaceFragment(HomeFragment())
                }
            }
            true
        }
    }

    /* Organização dos Fragmentos
    Criação Fragmento
    Passar por algum fragmento geral
    Saber qual fragmento usar
    Passar para o framelayout o fragmento
    */
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}
