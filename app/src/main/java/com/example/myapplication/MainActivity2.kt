package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.getSerializableExtra("result") as LoveModel
        binding.tvName.text = result.firstName
        binding.tvSecond.text = result.secondName
        binding.tvResult.text = result.result
        binding.tvPercentage.text = result.percentage
    }
}