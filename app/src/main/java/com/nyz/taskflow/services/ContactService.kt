package com.nyz.taskflow.services;

import android.util.Log
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.nyz.taskflow.models.Contact;

class ContactService {

    val db = Firebase.firestore

    fun store(contact: Contact) {
        db.collection("contacts").add(contact)
            .addOnSuccessListener { documentReference ->
                Log.d("success","DocumentSnapshot written with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w("error", "Error adding document", e)
            }
    }

}
