package com.klunx.mymessengeraction

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
        val intent: Intent = Intent(Intent.ACTION_SEND).apply {
            setType("text/plain")
            putExtra(Intent.EXTRA_TEXT, messageToBeSent.text.toString())
        }
        val chooserTitle: String = getString(R.string.chooser)
        val chosenItent = Intent.createChooser(intent, chooserTitle)
        startActivity(chosenItent)
    }
}