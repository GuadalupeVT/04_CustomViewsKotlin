package com.example.a03_customviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val cover = findViewById<AspectRatioImageView>(R.id.cover)
        //cover.ratio=1.5f

        val recycler = findViewById<RecyclerView>(R.id.recycler)

        //val layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        val layoutManager = GridLayoutManager(this,3)
        recycler.layoutManager = layoutManager

        recycler.adapter = MoviesAdapter(listOf(
            Movie("Batman","https://th.bing.com/th/id/OIP.AweUA_IuT_iRmzDcR5PLPQHaKB?pid=ImgDet&rs=1"),
            Movie("Batman 2","https://th.bing.com/th/id/OIP.AweUA_IuT_iRmzDcR5PLPQHaKB?pid=ImgDet&rs=1"),
            Movie("Batman 3","https://th.bing.com/th/id/OIP.AweUA_IuT_iRmzDcR5PLPQHaKB?pid=ImgDet&rs=1"),
            Movie("Batman 4","https://th.bing.com/th/id/OIP.AweUA_IuT_iRmzDcR5PLPQHaKB?pid=ImgDet&rs=1"),
            Movie("Batman 5","https://th.bing.com/th/id/OIP.AweUA_IuT_iRmzDcR5PLPQHaKB?pid=ImgDet&rs=1")
        ))

        //Mandar a llamar pelicula
        //val movie = findViewById<MovieView>(R.id.movie_avengers)
        //movie.setMovie(Movie("Batman","https://th.bing.com/th/id/OIP.AweUA_IuT_iRmzDcR5PLPQHaKB?pid=ImgDet&rs=1"))
    }
}