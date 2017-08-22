package org.andronotes.acexample

import android.arch.lifecycle.LifecycleActivity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.widget.Button
import android.widget.CompoundButton
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnCheckedChanged


class LifecycleAwareActivity : LifecycleActivity() {

    @BindView(R.id.btnLogin)
    lateinit var loginButton: Button

    private var lifecycleAwareVM: LifecycleAwareVM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_aware)
        ButterKnife.bind(this)

        lifecycleAwareVM = ViewModelProviders.of(this).get(LifecycleAwareVM::class.java)
        subscribe()

    }

    @Suppress("unused")
    @OnCheckedChanged(R.id.chbAgreeConditions)
    fun onLicenseClick(button: CompoundButton, isChecked: Boolean) {
        lifecycleAwareVM?.isConditionsAccepted?.value = isChecked
    }

    private fun subscribe() {
        lifecycleAwareVM?.isConditionsAccepted?.observe(this, Observer<Boolean> { isAccepted ->
            loginButton.isEnabled = isAccepted ?: false
        })
    }
}
