package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.BMI.setOnClickListener{
            bmi()
        }
    }
        private fun bmi()
        {
            var wzrost = binding.wzrost.text.toString().toDouble()
            var waga = binding.waga.text.toString().toDouble()
            var wzrostDouble = wzrost/100
            var wynik = waga/(wzrostDouble*wzrostDouble)
            var opis = 0

            Toast.makeText(this,"Twoje BMI: %.2f".format(wynik) ,Toast.LENGTH_SHORT).show()
        }
}