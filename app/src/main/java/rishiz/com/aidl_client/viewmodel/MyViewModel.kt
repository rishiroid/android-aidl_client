package rishiz.com.aidl_client.viewmodel

import android.content.ComponentName
import android.content.ServiceConnection
import android.os.IBinder
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import rishiz.com.aidl_client.model.service.LocalService

class MyViewModel: ViewModel() {
    private val mBinder:MutableLiveData<LocalService.LocalBinder?> = MutableLiveData()
    companion object{
        private val TAG=MyViewModel::class.java.canonicalName
    }

    private val localServiceConnection:ServiceConnection=object:ServiceConnection{
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            Log.d(TAG,"Connected to LocalService")
            val binder = service as LocalService.LocalBinder
            mBinder.postValue(binder)
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            Log.d(TAG,"Disconnected to LocalService")
            mBinder.postValue(null)
        }
    }

    fun getServiceConnection(): ServiceConnection {
        return localServiceConnection
    }

    fun isServiceStarted(): Boolean? {
        return mBinder.value?.service?.isServiceStarted()
    }

    fun getColor(): Int? {
        return mBinder.value?.service?.getColor()
    }

}