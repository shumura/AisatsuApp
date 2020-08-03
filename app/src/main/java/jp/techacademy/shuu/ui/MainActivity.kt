package jp.techacademy.shuu.ui

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.app.DatePickerDialog

class MainActivity : AppCompatActivity(),View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener(this)

    }

    override fun onClick(v: View){
        if (v.id == R.id.button3) {
            showTimePickerDialog()
        }
    }
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
                if(hour>= 2 && hour < 10){
                    log.d("「おはよう」")
                }else if(hour >= 10 && hour <18){
                    log.d("「こんにちは」")
                }else{
                    log.d("「こんばんは」")
                }
            },
            13,0 ,true )
        timePickerDialog.show()


    }
    }



