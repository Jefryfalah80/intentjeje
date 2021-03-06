package com.jefry.intenjeje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import com.isak.inttentjefryfalah.MainActivity

class MoveForResultActivity : AppCompatActivity() {
    var rgFood: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var btnChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        rgFood = findViewById(R.id.rg_food)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener {
            val selectedOption: Int = rgFood!!.checkedRadioButtonId
            radioButton = findViewById(selectedOption)

            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle()
            bundle.putString("food", radioButton.text as String?)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}