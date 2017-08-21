package org.andronotes.acexample

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean

/**
 * Created by anton on 8/18/17.
 */
class LifecycleAwareVM: ViewModel() {

    var isConditionsAccepted = ObservableBoolean(false)
}