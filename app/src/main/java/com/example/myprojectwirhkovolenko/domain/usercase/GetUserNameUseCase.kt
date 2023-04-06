package com.example.myprojectwirhkovolenko.domain.usercase

import android.text.BoringLayout
import com.example.myprojectwirhkovolenko.domain.models.SaveUserNameParam
import com.example.myprojectwirhkovolenko.domain.models.UserName

class GetUserNameUseCase {
    fun execute(): UserName {
        return UserName(firstName = "Alex", lastName = "hello")
    }

}