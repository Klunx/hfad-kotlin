package com.klunx.mymessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val EXTRA_MESSAGE = "message"

class ReceiveMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive_message)
        val intent: Intent = intent
        val messageText = intent.getStringExtra(EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.message)
        textView.text = messageText
    }
}