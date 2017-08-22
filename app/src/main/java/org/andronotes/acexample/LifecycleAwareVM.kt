package org.andronotes.acexample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by anton on 8/18/17.
 */
class LifecycleAwareVM: ViewModel() {

    var isConditionsAccepted = MutableLiveData<Boolean>()

    init {
        isConditionsAccepted.value = false
    }


}