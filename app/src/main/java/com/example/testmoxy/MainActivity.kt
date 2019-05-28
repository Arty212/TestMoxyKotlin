package com.example.testmoxy

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : MvpAppCompatActivity(), IMainActivity {

    override fun ok() {

    }

    override fun error(msg: String) {
        hideProgress()
        Snackbar.make(loginBtn, msg, Snackbar.LENGTH_LONG).show()
    }

    @InjectPresenter
    lateinit var presenter: MainPresenter

    override fun showProgress() {
        setProgress(true)
    }

    override fun hideProgress() {
        setProgress(false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginBtn.setOnClickListener { presenter.login("","") }
    }

    private fun setProgress(flag: Boolean) {
        if (flag) {
            progress.visibility = View.VISIBLE
            loginBtn.visibility = View.GONE
        } else {
            progress.visibility = View.GONE
            loginBtn.visibility = View.VISIBLE
        }
    }
}
