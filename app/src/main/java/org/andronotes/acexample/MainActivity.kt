package org.andronotes.acexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
    }

    @Suppress("unused")
    @OnClick(R.id.btnLifecycle)
    fun onRunLifecycleAwareClick() {
        startActivity(Intent(this, LifecycleAwareActivity::class.java))
    }

    @Suppress("unused")
    @OnClick(R.id.btnLiveDataExample)
    fun onRunLifeDataClick() {
        startActivity(Intent(this, LifeDataActivity::class.java))
    }
}
