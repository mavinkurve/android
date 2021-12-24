package com.example.android.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.android.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // TODO (03) Create a binding object in the MainActivity.

    // TODO (09) Create an instance of MyName and set binding.myName to it.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO (04) Use DataBindingUtil to set the layout for MainActivity.
        setContentView(R.layout.activity_main)
        // TODO (05) Use the binding object to replace all calls to findViewById.
        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }
    }

    /**
     * Click handler for the Done button.
     * Demonstrates how data binding can be used to make code much more readable
     * by eliminating calls to findViewById and changing data in the binding object.
     */
    private fun addNickname(view: View) {
        // TODO (10) set the nickname in the binding object and invalidateAll().
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_edit)

        nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE

        // Hide the keyboard. // TODO (03) Create a binding object in the MainActivity.
        //
        //    // TODO (09) Create an instance of MyName and set binding.myName to it.
        //
        //    override fun onCreate(savedInstanceState: Bundle?) {
        //        super.onCreate(savedInstanceState)
        //        // TODO (04) Use DataBindingUtil to set the layout for MainActivity.
        //        setContentView(R.layout.activity_main)
        //        // TODO (05) Use the binding object to replace all calls to findViewById.
        //        findViewById<Button>(R.id.done_button).setOnClickListener {
        //            addNickname(it)
        //        }
        //    }
        //
        //    /**
        //     * Click handler for the Done button.
        //     * Demonstrates how data binding can be used to make code much more readable
        //     * by eliminating calls to findViewById and changing data in the binding object.
        //     */
        //    private fun addNickname(view: View) {
        //        // TODO (10) set the nickname in the binding object and invalidateAll().
        //        val editText = findViewById<EditText>(R.id.nickname_edit)
        //        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
        //
        //        nicknameTextView.text = editText.text
        //        editText.visibility = View.GONE
        //        view.visibility = View.GONE
        //        nicknameTextView.visibility = View.VISIBLE
        //
        //        // Hide the keyboard.
        //        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        //        imm.hideSoftInputFromWindow(view.windowToken, 0)
        //    }
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}