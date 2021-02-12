package com.klunx.mymessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class CreateMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)
    }

    fun onSendMessage(view: View) {
        val messageToBeSent:EditText = findViewById(R.id.message)

        val intent: Intent = Intent(this, ReceiveMessageActivity::class.java).apply {
            putExtra("message", messageToBeSent.text.toString())
        }
        startActivity(intent)
    }
}