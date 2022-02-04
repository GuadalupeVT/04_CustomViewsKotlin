package com.example.a03_customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide

class MovieView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    //Declarar variables
    private val cover : ImageView
    private  val tittle: TextView

    init{
        //Mandar a llamar a la vista
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.view_movie,this, true)

        //Buscar la vista
        cover = view.findViewById(R.id.cover2)
        tittle = view.findViewById(R.id.tittle)

        orientation = LinearLayout.VERTICAL
    }

    //Asignar un pelicula
    fun setMovie(movie: Movie){
        tittle.text = movie.title
        //Agregar imagen desde url
        Glide.with(context).load(movie.cover).into(cover)
    }
}