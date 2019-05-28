package com.example.testmoxy

import android.os.AsyncTask

class APIHelper {
    companion object {

        fun login(body: () -> Unit) {
            object : AsyncTask<Void, Void, Void>() {


                override fun doInBackground(vararg params: Void?): Void? {
                    Thread.sleep(5000)
                    return null
                }

                override fun onPostExecute(result: Void?) {
                    body()
                }
            }.execute()

        }

    }

}