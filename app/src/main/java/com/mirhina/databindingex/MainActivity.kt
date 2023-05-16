package com.mirhina.databindingex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.mirhina.databindingex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /*
        // 1. findViewBuId 방식
        val btn = findViewById<Button>(R.id.testBtnId)
        btn.setOnClickListener {
            Toast.makeText(this,"Clcik",Toast.LENGTH_SHORT).show()
        }
        */

        // 2. DataBinding 방식
        binding.testBtnId.setOnClickListener {
            Toast.makeText(this,"Click1",Toast.LENGTH_SHORT).show()
        }
    }
}