package com.example.listviewtemplate

import androidx.annotation.DrawableRes

data class Language(
    @DrawableRes val imame : Int,  // gioi han cac so nguyen truyen vao thuoc id của Drawable
    val languageName : String
)
