package com.example.fragmenttoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), CommunicatorInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpFragmentOne()
    }

    override fun passData(editTextInput: String) {
        val uiTvOutputText = findViewById<TextView>(R.id.uiTvOutputText)
        uiTvOutputText?.text = editTextInput
    }

    private fun setUpFragmentOne() {
        val fragmentOne = FragmentOne()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragmentOne)
            .commit()
    }
}