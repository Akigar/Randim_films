package com.example.mainfilm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var array: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        array = resources.getStringArray(R.array.films)
    }
    var count: Int = 0

    fun onClick(v: View) {
        val film = findViewById<TextView>(R.id.films)
        film.text = array[count]

        if (count == 5) {
            film.text = array[count] + " (Last_film)"
        }
        else {count++}
    }
    fun onClick_reset(v: View){
        count = 0
        array.shuffle()
        onClick(v)
    }

    fun onClick_watch(v: View){
        val films = findViewById<TextView>(R.id.films)
        if (count == 5) {
            films.text = "Start watching film: "  + array[count]
        }
        else{
            films.text = "Start watching film: "  + array[count - 1]
        }

    }
    
}
