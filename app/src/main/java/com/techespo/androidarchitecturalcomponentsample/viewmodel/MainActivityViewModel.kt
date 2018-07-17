package com.techespo.androidarchitecturalcomponentsample.viewmodel

import android.arch.lifecycle.ViewModel
import com.techespo.androidarchitecturalcomponentsample.Model.User

class MainActivityViewModel : ViewModel() {
    lateinit var userId : String
    lateinit var user : User

    fun init(userId: String ){
        this.userId = userId
    }

    fun loadUser(): User{
        return user
    }
}