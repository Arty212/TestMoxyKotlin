package com.example.testmoxy

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter


@InjectViewState
class MainPresenter: MvpPresenter<IMainActivity>() {

    public fun login(login:String, password:String){
        viewState.showProgress()
        APIHelper.login { viewState.error(" ууууупс =(") }

    }

}