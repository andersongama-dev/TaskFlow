package com.nyz.taskflow.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.nyz.taskflow.R
import com.nyz.taskflow.models.Contact
import com.nyz.taskflow.services.ContactService

class NewContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_contact)

        val edtName = findViewById<EditText>(R.id.edtName)
        val edtPhone = findViewById<EditText>(R.id.edtPhone)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)

        findViewById<Button>(R.id.btnSave).setOnClickListener{
            val contact = Contact(
                name = edtName.text.toString(),
                phone = edtPhone.text.toString(),
                email = edtEmail.text.toString()
            )

            val contactService = ContactService()
            contactService.store(contact)
        }
    }
}