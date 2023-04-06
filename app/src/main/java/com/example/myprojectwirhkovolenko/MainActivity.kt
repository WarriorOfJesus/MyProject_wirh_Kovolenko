package com.example.myprojectwirhkovolenko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myprojectwirhkovolenko.domain.models.SaveUserNameParam
import com.example.myprojectwirhkovolenko.domain.models.UserName
import com.example.myprojectwirhkovolenko.domain.usercase.GetUserNameUseCase
import com.example.myprojectwirhkovolenko.domain.usercase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private val getUserNameUseCase = GetUserNameUseCase()
    private val saveUserNameUseCase = SaveUserNameUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditView = findViewById<TextView>(R.id.dataEditText)
        val sendButton = findViewById<TextView>(R.id.sendButton)
        val receiveButton = findViewById<TextView>(R.id.receiveButton)

        sendButton.setOnClickListener {
            val text = dataEditView.text.toString()
            val params = SaveUserNameParam(name = text)
            val result: Boolean = saveUserNameUseCase.execute(param = params)
            dataTextView.text = "Save result = ${result}"
        }
        receiveButton.setOnClickListener {

            val userName:UserName = getUserNameUseCase.execute()
            dataTextView.text = "${userName.firstName } ${userName.lastName }"
        }
    }
}