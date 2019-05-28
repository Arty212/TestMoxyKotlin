package com.example.testmoxy

import com.arellomobile.mvp.MvpView

interface IMainActivity:MvpView {

    fun showProgress()
    fun hideProgress()
    fun ok()
    fun error(msg:String)

}