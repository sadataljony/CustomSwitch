package com.sadataljony.app.android.customswitch

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sadataljony.app.android.customswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.btnEnglish.setOnClickListener {
            Toast.makeText(this, "English", Toast.LENGTH_LONG).show()
        }
        binding.btnBengali.setOnClickListener {
            Toast.makeText(this, "বাংলা", Toast.LENGTH_LONG).show()
        }
        binding.btnHindi.setOnClickListener {
            Toast.makeText(this, "हिन्दी", Toast.LENGTH_LONG).show()
        }
        binding.btnArabic.setOnClickListener {
            Toast.makeText(this, "عربي", Toast.LENGTH_LONG).show()
        }
    }

}