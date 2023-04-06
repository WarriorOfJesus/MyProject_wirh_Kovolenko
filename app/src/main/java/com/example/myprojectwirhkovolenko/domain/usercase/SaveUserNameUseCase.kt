package com.example.myprojectwirhkovolenko.domain.usercase

import com.example.myprojectwirhkovolenko.domain.models.SaveUserNameParam
import com.example.myprojectwirhkovolenko.domain.models.UserName

class SaveUserNameUseCase {
    fun execute(param: SaveUserNameParam): Boolean {
        if (param.name.isEmpty()) return false
        else return true
    }
}