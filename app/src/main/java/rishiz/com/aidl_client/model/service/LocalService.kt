package rishiz.com.aidl_client.model.service

import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Binder
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.annotation.RequiresApi
import rishiz.com.aidl_server.IColorAidl


class LocalService : Service() {
    var iColorAidl: IColorAidl? = null
    private val binder = LocalBinder()

    companion object {
        private val TAG = LocalService::class.java.canonicalName
    }

    inner class LocalBinder : Binder() {
        // Return this instance of LocalService so clients can call public methods.
        val service: LocalService
            get() = this@LocalService
    }

    private var aidlserviceConnection: ServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            Log.d(TAG, "Connected to aidlService")
            if (iColorAidl == null) {
                iColorAidl = IColorAidl.Stub.asInterface(service)
            }
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            Log.d(TAG, "Disconnected from aidlService")
            iColorAidl = null
        }

    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")
//          val intent=Intent("AidlService")
//          intent.setPackage("rishiz.com.aidl_server")

        val intent = Intent().setClassName(
            "rishiz.com.aidl_server", "rishiz.com.aidl_server.AidlService"
        )
        bindService(intent, aidlserviceConnection, Context.BIND_AUTO_CREATE)
//        bindServiceAsUser(intent,aidlserviceConnection, BIND_AUTO_CREATE, UserHandle.getUserHandleForUid(0))
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)
        Log.d(TAG, "onStartCommand")
        return START_STICKY
    }

    override fun onBind(intent: Intent?): IBinder {
        Log.d(TAG, "onBind")
        return binder
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.d(TAG, "onBind")
        return super.onUnbind(intent)
    }

    override fun onRebind(intent: Intent?) {
        Log.d(TAG, "onRebind")
        super.onRebind(intent)
    }

    override fun onDestroy() {
        Log.d(TAG, "onRebind")
        unbindService(aidlserviceConnection)
        super.onDestroy()
    }

    fun isServiceStarted(): Boolean? {
        return iColorAidl?.isServiceSatarted
    }

    fun getColor(): Int? {
        return iColorAidl?.color
    }
}