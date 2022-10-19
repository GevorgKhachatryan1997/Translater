package com.example.translator

import android.os.Bundle
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

// TODO handle window overlay permission
class MainActivity : AppCompatActivity() {

    private var toggleBtnShowTranslation: ToggleButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleBtnShowTranslation = findViewById(R.id.toggleBtnShowTranslationView)
        // TODO Fix toggle button state after activity creation
        toggleBtnShowTranslation?.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                TranslationViewManager.showView(this)
            } else {
                TranslationViewManager.hideView(this)
            }
        }
    }
}