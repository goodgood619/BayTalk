package com.jay.baytalk.presenter

import com.google.firebase.auth.FirebaseUser
import com.jay.baytalk.MyCallback
import com.jay.baytalk.base.BasePresenter
import com.jay.baytalk.base.BaseView

interface MainConstract {

    interface View : BaseView<Presenter>{
        fun showLoading()
        fun makeRoom()
    }

    interface Presenter : BasePresenter<View>{
        fun welcome(currentUser: FirebaseUser, callback : MyCallback)
    }


}