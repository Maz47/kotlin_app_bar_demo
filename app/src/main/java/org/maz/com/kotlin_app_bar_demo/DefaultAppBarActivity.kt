package org.maz.com.kotlin_app_bar_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_default_app_bar.*

class DefaultAppBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_default_app_bar)

        setSupportActionBar(findViewById(R.id.default_appbar))
        button_back_default_appbar.setOnClickListener { finish() }
    }
}
