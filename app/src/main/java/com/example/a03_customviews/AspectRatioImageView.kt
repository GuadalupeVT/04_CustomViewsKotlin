package com.example.a03_customviews

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class AspectRatioImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr : Int=0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    //Radio
    var ratio: Float =1f

    //Constructor para obtener el radio
    init {
        val a = context.obtainStyledAttributes(attrs,R.styleable.AspectRatioImageView)
        ratio = a.getFloat(R.styleable.AspectRatioImageView_ratio,1f)
        a.recycle() //Reciclar para ahorrar espacio
    }

    //Tamaño de la vista, sobre las configuraciones de tamaños
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        var width = measuredWidth
        var height = measuredHeight

        //Si aun no se termina de medir la vista, se retorna hasta obtener un resultado
        if(width == 0 && height ==0){
            return
        } //Comprobar cual de ellas es distinta de cero y en base a ella asignar la otra
        if(width >0){
            height = (width * ratio).toInt()
        } else if(height >0){
            width = (height/ratio).toInt()
        }

        //Cambiar dimensiones
        setMeasuredDimension(width,height)
    }
}