package com.example.obligu41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val usernamesInDatabase = mutableListOf("SuperRolf", "crazy_Randi",
            "slowOlga418")

    var userExists = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check_user_button.setOnClickListener {
            //oppgave6()
            //oppgave7og8Old()
            oppgave9og10og11()
        }
    }

    private fun oppgave6() {
        if (username_editText.text.toString() == usernamesInDatabase[0]) {
            userExists = true
        }
    }

    private fun oppgave7og8Old() {
        if (username_editText.text.toString() == usernamesInDatabase[1]
                || username_editText.text.toString() == usernamesInDatabase[2]) {
            userExists = true
        }

        if (userExists) {
            status_textView.text = "brukeren eksisterer fra før"
        } else {
            status_textView.text = "brukeren eksisterer ikke"
        }
    }

    private fun oppgave9og10og11() {
        for (username in usernamesInDatabase) {
            if (username_editText.text.toString() == username) {
                userExists = true
            }
        }

        if (userExists) {
            status_textView.text = "brukeren eksisterer fra før"
        } else {
            status_textView.text = "brukeren eksisterer ikke"

            if (!username_editText.text.toString().contains("æ")
                    && !username_editText.text.toString().contains("ø")
                    && !username_editText.text.toString().contains("å")) {

                usernamesInDatabase.add(username_editText.text.toString())
            }
        }
        userExists = false
    }


    //OPPGAVE 5
    /*val listOne = listOf("en", "to", "tre")
    val listTwo = listOf("A", "B")*/

    /*fun oppg5(){
        if(listOne.size < listTwo.size){
            Log.d("OPPG", "listOne er mindre enn listTwo”")
        }else {
            Log.d("OPPG", "listOne er større enn listTwo")
        }
    }*/
    //
}