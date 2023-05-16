package com.mirhina.databindingex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        var value = "this is value"
        val value2 = "this is value2"

        value = "this is not value" // val은 값 수정이 불가능하다. var로 변경

        Log.d("MainActivity","Hello Log") // MainActivity에 로그 찍기 (하단 Logcat에서 확인 가능)
        Log.w("MainActivity",value) // value 값 log에 경고 로그 표시
        Log.i("MainActivity",value) // value 값 log에 정보 로그 표시
        Log.e("MainActivity",value) // value 값 log에 오류 로그 표시
        Log.v("MainActivity",value) // value 값 log에 상세 로그 표시
        Log.d("MainActivity",value) // value 값 log에 디버그 로그 표시

    }
}