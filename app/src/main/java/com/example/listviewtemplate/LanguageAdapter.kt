package com.example.listviewtemplate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Context
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class LanguageAdapter(private val context : Context, private  val languages:  List<Language>) : BaseAdapter(){
    override fun getCount()= languages.size

    override fun getItem(position: Int)=languages[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemView = convertView ?: LayoutInflater.from(context)//LayoutInflater chuyen đổi tệp tin xml thanh đối tượng view
                                                    .inflate(R.layout.item_language,parent,false)

        val language = getItem(position)
        updateUI(itemView, language)
        return itemView
    }

    private fun updateUI(itemView: View, language: Language) {
        val imageView = itemView.findViewById<ImageView>(R.id.flag_imv)
        val textView = itemView.findViewById<TextView>(R.id.language_tv)
        imageView.setImageResource(language.imame)
        textView.text = language.languageName
    }


}