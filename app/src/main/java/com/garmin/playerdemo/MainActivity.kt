package com.garmin.playerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnVideoPlay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnVideoPlay = findViewById(R.id.btn_video_play)
        btnVideoPlay.setOnClickListener(){ v ->  startActivity(Intent(this, PlayerActivity::class.java))}
    }
}