package com.example.a03_customviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MoviesAdapter(private val movies: List<Movie>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //Inflar o mostrar vista
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.view_movie,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Asignar una pelicula a la vista
        val movie= movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = movies.size


    class ViewHolder(view:View): RecyclerView.ViewHolder(view) {
        //Buscar la vista
        private val cover = view.findViewById<ImageView>(R.id.cover2)
        private val tittle = view.findViewById<TextView>(R.id.tittle)

        fun bind(movie: Movie) {
            tittle.text = movie.title
            //Agregar imagen desde url
            Glide.with(cover.context).load(movie.cover).into(cover)
        }
    }

}