package com.example.wechatlogindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wechatlogindemo.databinding.ActivityMainBinding
import com.example.wechatlogindemo.wxapi.WxLogin

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            WxLogin.longWx()
        }


    }
}