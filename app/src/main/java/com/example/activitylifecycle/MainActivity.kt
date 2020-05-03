package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("my app","on create")
    }



    override fun onStart() {
        super.onStart()
        Log.e("my app","onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.e("my app","onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.e("my app","onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.e("my app","onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("my app","onDestroy called")
    }
}
