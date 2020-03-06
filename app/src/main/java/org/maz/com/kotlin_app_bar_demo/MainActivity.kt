package org.maz.com.kotlin_app_bar_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDefaultAppBar()
    }

    private fun initDefaultAppBar() {
        var button: Button = findViewById(R.id.button_default_appbar)
        button.setOnClickListener {
            var intent = Intent(this@MainActivity, DefaultAppBarActivity::class.java)
            startActivity(intent)
        }
    }
}
