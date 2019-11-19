package com.example.notification_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tapadoo.alerter.Alerter
// Add the dependency in our app
/*
*     implementation 'com.tapadoo.android:alerter:2.0.4'
*   Now simply see the following code for create the notification.
*
* 
* */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun show( view: View){
        Alerter.create(this)
            .setTitle("Hi User")
            .setText("Click Me")
            .setIcon(R.drawable.ic_read)
            .setBackgroundColorRes(R.color.alert_color)
            .setDuration(5000)
            .enableSwipeToDismiss()
            .enableProgress(true)
            .setProgressColorRes(R.color.colorProgrss)
            .enableVibration(true)
        // When we click our notification then what should be open
             .setOnClickListener(View.OnClickListener {
                     val intent = Intent(this,Main2Activity::class.java)
                     startActivity(intent)
               })
            .show()
    }
}
