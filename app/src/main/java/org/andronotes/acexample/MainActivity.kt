package org.andronotes.acexample

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.andronotes.acexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainActivityVM.MainActivityCallback {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainActivityVM = MainActivityVM()
        mainActivityVM.mainActivityCallback = this
        binding.viewModel = mainActivityVM
    }

    override fun onRunLifecycleAware() {
        startActivity(Intent(this, LifecycleAwareActivity::class.java))
    }

    override fun onRunLifeData() {
        startActivity(Intent(this, LifeDataActivity::class.java))
    }
}
