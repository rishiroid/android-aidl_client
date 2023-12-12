package rishiz.com.aidl_client.view.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.mikhaellopez.circleview.CircleView
import rishiz.com.aidl_client.R
import rishiz.com.aidl_client.model.service.LocalService
import rishiz.com.aidl_client.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = MainActivity::class.java.canonicalName
    }

    private lateinit var viewModel: MyViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")
        viewModel = ViewModelProvider(this)[MyViewModel::class.java]

        Intent(this, LocalService::class.java).also { serviceIntent ->
                startService(serviceIntent)
                bindService(serviceIntent, viewModel.getServiceConnection(), BIND_AUTO_CREATE)
            }

        val btn = findViewById<Button>(R.id.button)
        val isServiceStart = findViewById<TextView>(R.id.isStart)
        btn.setOnClickListener {
            isServiceStart.text = viewModel.isServiceStarted().toString()
            circularView1()
            circularView2()
            circularView3()
            circularView4()
            circularView6()
            circularView7()
            circularView8()
            circularView9()

        }

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
        unbindService(viewModel.getServiceConnection())
    }

    private fun circularView1() {
        val circleView = findViewById<CircleView>(R.id.circleView1)
        circleView.apply {
            // Set Color
            circleColor = viewModel.getColor()!!
            // or with gradient
            circleColorStart = viewModel.getColor()!!
            circleColorEnd = viewModel.getColor()!!
            circleColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Set Border
            borderWidth = 10f
            borderColor = viewModel.getColor()!!
            // or with gradient
            borderColorStart = viewModel.getColor()!!
            borderColorEnd = viewModel.getColor()!!
            borderColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Add Shadow with default param
            shadowEnable = true
            // or with custom param
            shadowRadius = 15f
            shadowColor = viewModel.getColor()!!
            shadowGravity = CircleView.ShadowGravity.CENTER
        }
    }

    private fun circularView2() {
        val circleView = findViewById<CircleView>(R.id.circleView2)
        circleView.apply {
            // Set Color
            circleColor = viewModel.getColor()!!
            // or with gradient
            circleColorStart = viewModel.getColor()!!
            circleColorEnd = viewModel.getColor()!!
            circleColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Set Border
            borderWidth = 10f
            borderColor = viewModel.getColor()!!
            // or with gradient
            borderColorStart = viewModel.getColor()!!
            borderColorEnd = viewModel.getColor()!!
            borderColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Add Shadow with default param
            shadowEnable = true
            // or with custom param
            shadowRadius = 15f
            shadowColor = viewModel.getColor()!!
            shadowGravity = CircleView.ShadowGravity.CENTER
        }
    }

    private fun circularView3() {
        val circleView = findViewById<CircleView>(R.id.circleView3)
        circleView.apply {
            // Set Color
            circleColor = viewModel.getColor()!!
            // or with gradient
            circleColorStart = viewModel.getColor()!!
            circleColorEnd = viewModel.getColor()!!
            circleColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Set Border
            borderWidth = 10f
            borderColor = viewModel.getColor()!!
            // or with gradient
            borderColorStart = viewModel.getColor()!!
            borderColorEnd = viewModel.getColor()!!
            borderColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Add Shadow with default param
            shadowEnable = true
            // or with custom param
            shadowRadius = 15f
            shadowColor = viewModel.getColor()!!
            shadowGravity = CircleView.ShadowGravity.CENTER
        }
    }

    private fun circularView4() {
        val circleView = findViewById<CircleView>(R.id.circleView4)
        circleView.apply {
            // Set Color
            circleColor = viewModel.getColor()!!
            // or with gradient
            circleColorStart = viewModel.getColor()!!
            circleColorEnd = viewModel.getColor()!!
            circleColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Set Border
            borderWidth = 10f
            borderColor = viewModel.getColor()!!
            // or with gradient
            borderColorStart = viewModel.getColor()!!
            borderColorEnd = viewModel.getColor()!!
            borderColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Add Shadow with default param
            shadowEnable = true
            // or with custom param
            shadowRadius = 15f
            shadowColor = viewModel.getColor()!!
            shadowGravity = CircleView.ShadowGravity.CENTER
        }
    }

    private fun circularView6() {
        val circleView = findViewById<CircleView>(R.id.circleView6)
        circleView.apply {
            // Set Color
            circleColor = viewModel.getColor()!!
            // or with gradient
            circleColorStart = viewModel.getColor()!!
            circleColorEnd = viewModel.getColor()!!
            circleColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Set Border
            borderWidth = 10f
            borderColor = viewModel.getColor()!!
            // or with gradient
            borderColorStart = viewModel.getColor()!!
            borderColorEnd = viewModel.getColor()!!
            borderColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Add Shadow with default param
            shadowEnable = true
            // or with custom param
            shadowRadius = 15f
            shadowColor = viewModel.getColor()!!
            shadowGravity = CircleView.ShadowGravity.CENTER
        }
    }

    private fun circularView7() {
        val circleView = findViewById<CircleView>(R.id.circleView7)
        circleView.apply {
            // Set Color
            circleColor = viewModel.getColor()!!
            // or with gradient
            circleColorStart = viewModel.getColor()!!
            circleColorEnd = viewModel.getColor()!!
            circleColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Set Border
            borderWidth = 10f
            borderColor = viewModel.getColor()!!
            // or with gradient
            borderColorStart = viewModel.getColor()!!
            borderColorEnd = viewModel.getColor()!!
            borderColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Add Shadow with default param
            shadowEnable = true
            // or with custom param
            shadowRadius = 15f
            shadowColor = viewModel.getColor()!!
            shadowGravity = CircleView.ShadowGravity.CENTER
        }
    }

    private fun circularView8() {
        val circleView = findViewById<CircleView>(R.id.circleView8)
        circleView.apply {
            // Set Color
            circleColor = viewModel.getColor()!!
            // or with gradient
            circleColorStart = viewModel.getColor()!!
            circleColorEnd = viewModel.getColor()!!
            circleColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Set Border
            borderWidth = 10f
            borderColor = viewModel.getColor()!!
            // or with gradient
            borderColorStart = viewModel.getColor()!!
            borderColorEnd = viewModel.getColor()!!
            borderColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Add Shadow with default param
            shadowEnable = true
            // or with custom param
            shadowRadius = 15f
            shadowColor = viewModel.getColor()!!
            shadowGravity = CircleView.ShadowGravity.CENTER
        }
    }

    private fun circularView9() {
        val circleView = findViewById<CircleView>(R.id.circleView9)
        circleView.apply {
            // Set Color
            circleColor = viewModel.getColor()!!
            // or with gradient
            circleColorStart = viewModel.getColor()!!
            circleColorEnd = viewModel.getColor()!!
            circleColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Set Border
            borderWidth = 10f
            borderColor = viewModel.getColor()!!
            // or with gradient
            borderColorStart = viewModel.getColor()!!
            borderColorEnd = viewModel.getColor()!!
            borderColorDirection = CircleView.GradientDirection.TOP_TO_BOTTOM

            // Add Shadow with default param
            shadowEnable = true
            // or with custom param
            shadowRadius = 15f
            shadowColor = viewModel.getColor()!!
            shadowGravity = CircleView.ShadowGravity.CENTER
        }
    }
}
