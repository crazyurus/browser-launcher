package com.crazyurus.browser.launcher

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(Intent.ACTION_MAIN)
        val componentName = ComponentName("com.android.browser", "com.android.browser.BrowserActivity")

        intent.component = componentName

        startActivity(intent)
        finish()
    }
}
