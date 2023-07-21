package com.example.listviewtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class LanguageActivity : AppCompatActivity() {
    private lateinit var listView : ListView
    private val languages = listOf(
        Language(R.drawable.vietnam, "Vietnamese"),
        Language(R.drawable.us, "United_States")
    )
    private  val languageAdapter : LanguageAdapter by lazy { LanguageAdapter(this,languages) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initUIEventHandlers()

    }

    private fun initUIEventHandlers() {
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedLanguage = languages[position]
            Toast.makeText(this, selectedLanguage.languageName, Toast.LENGTH_SHORT).show()
//            if (selectedLanguage.languageName == "Vietnamese") {
//                setAppLanguage("vi")
//            } else if (selectedLanguage.languageName == "United States") {
//                setAppLanguage("en")
//            }
//            recreate()
        }

    }

//    private fun setAppLanguage(languageCode: String) {
//
//        val resources: Resources = this.resources
//        val configuration: Configuration = resources.configuration
//        val locale = Locale(languageCode)
//        Locale.setDefault(locale)
//        configuration.setLocale(locale)
//        resources.updateConfiguration(configuration, resources.displayMetrics)
//
//    }

    private fun initViews() {
        listView = findViewById(R.id.list_view)
        listView.adapter = languageAdapter

    }
}