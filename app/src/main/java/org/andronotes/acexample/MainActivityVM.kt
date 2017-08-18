package org.andronotes.acexample

import android.view.View

/**
 * Created by anton on 8/18/17.
 */
class MainActivityVM {

    interface MainActivityCallback {
        fun onRunLifecycleAware()
        fun onRunLifeData()
    }

    var mainActivityCallback: MainActivityCallback? = null

    @Suppress("unused")
    fun onRunLifecycleAwareClick(view: View) { mainActivityCallback?.onRunLifecycleAware() }

    @Suppress("unused")
    fun onRunLifeDataClick(view: View) { mainActivityCallback?.onRunLifeData() }

}