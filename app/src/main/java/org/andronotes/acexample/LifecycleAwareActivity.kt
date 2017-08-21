package org.andronotes.acexample

import android.arch.lifecycle.LifecycleActivity
import android.databinding.DataBindingUtil
import android.os.Bundle
import org.andronotes.acexample.databinding.ActivityLifecycleAwareBinding

class LifecycleAwareActivity : LifecycleActivity() {

    private val binding: ActivityLifecycleAwareBinding by lazy {
        DataBindingUtil.setContentView<ActivityLifecycleAwareBinding>(this, R.layout.activity_lifecycle_aware)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lifecycleAwareVM = LifecycleAwareVM()
        binding.viewModel = lifecycleAwareVM
    }
}
