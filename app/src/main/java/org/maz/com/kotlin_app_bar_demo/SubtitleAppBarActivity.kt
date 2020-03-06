package org.maz.com.kotlin_app_bar_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_subtitle_app_bar.*

class SubtitleAppBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subtitle_app_bar)

        setSupportActionBar(findViewById(R.id.subtitle_appbar))
        button_back_subtitle_appbar.setOnClickListener { finish() }
    }
}
