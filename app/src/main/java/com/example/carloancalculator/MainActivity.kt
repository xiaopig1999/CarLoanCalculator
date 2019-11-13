package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_cal.setOnClickListener(){
            val builder = AlertDialog.Builder(this@MainActivity)

            if (editText.text.isEmpty()){

                builder.setMessage("No Leave It Blank!")
                val alert = builder.create()
                // set title for alert dialog box
                alert.setTitle("Down Payment Amount")
                // show alert dialog
                alert.show()
            }else if (editText2.text.isEmpty()){
                builder.setMessage("No Leave It Blank!")
                val alert = builder.create()
                // set title for alert dialog box
                alert.setTitle("Loan Period")
                // show alert dialog
                alert.show()
            }else if (editText3.text.isEmpty()){
                builder.setMessage("No Leave It Blank!")
                val alert = builder.create()
                // set title for alert dialog box
                alert.setTitle("Interest Rate")
                // show alert dialog
                alert.show()
            }else if (text_car_Price.text.isEmpty()){
                builder.setMessage("No Leave It Blank!")
                val alert = builder.create()
                // set title for alert dialog box
                alert.setTitle("Car Price")
                // show alert dialog
                alert.show()
            }
            else {
                val input: String = text_car_Price.text.toString()

                val input1: String = editText.text.toString()

                val input2: String = editText3.text.toString()

                val input3: String = editText2.text.toString()

                val value: Double = input.toDouble()

                val value1: Double = input1.toDouble()

                val value2: Double = input2.toDouble()

                val value3: Double = input3.toDouble()

                val result: Double = value - value1

                val result1: Double = result * value2 * value3

                val result2: Double = (result + result1) / value3 / 12

                outputCP.text = "%.2f".format(result)

                outputCP3.text = "%.2f".format(result1)

                outputCP2.text = "%.2f".format(result2)
            }
        }
    }


}
