package org.andronotes.acexample

import android.databinding.ObservableBoolean
import android.widget.CompoundButton

/**
 * Created by anton on 8/18/17.
 */
class LifecycleAwareVM {

    private var isAgreeChecked = true
    var isButtonEnabled = ObservableBoolean(false)

    fun checkedChangedListener(buttonView: CompoundButton, isChecked: Boolean) {
        isAgreeChecked = isChecked
        isButtonEnabled.set(isChecked)
    }

}