package com.klunx.mymessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val EXTRA_MESSAGE = "message"

class ReceiveMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)
        val messageText = intent.getStringExtra(EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.message).apply {
            text = messageText
        }
    }
}