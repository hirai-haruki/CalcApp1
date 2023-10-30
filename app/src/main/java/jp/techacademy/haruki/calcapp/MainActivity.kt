package jp.techacademy.haruki.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import jp.techacademy.haruki.intent.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import android.widget.EditText


class MainActivity :  AppCompatActivity() ,View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)

    }

    override fun  onClick(v: View) {
          val x: Double = binding.editText1.text.toString().toDouble()
          val y: Double = binding.editText2.text.toString().toDouble()
          val num1 =x + y
          val num2 =x-y
          val num3=x * y
          val  num4=x/y
          val intent = Intent(this, SecondActivity::class.java)


        if(binding.editText1.text.toString()==""||binding.editText2.text.toString()=="") {
            val rootLayout: View = findViewById(android.R.id.content)
            val snackbar = Snackbar.make(rootLayout, "数字を入力してください", Snackbar.LENGTH_LONG)
            snackbar.show()
        }else {
            (v.id == R.id.button1)
            intent.putExtra("VALUE1", num1)
        }

        when (v.id) {
              R.id.button1 -> intent.putExtra("VALUE", num1)
              R.id.button2 ->  intent.putExtra("VALUE", num2)
              R.id.button3 ->  intent.putExtra("VALUE", num3)
              R.id.button4 ->   intent.putExtra("VALUE", num4)
        }
        startActivity(intent)
        }
    }






//override fun  onClick(v: View) {
//        when (v.id) {
//            R.id.button1 -> binding.textView.text = "${value1 + value2}"
//            R.id.button2 -> binding.textView.text = "${value1 + value2}"
//            R.id.button3 ->  binding.textView.text = "${value1 * value2}"
//            R.id.button4 ->  binding.textView.text = "${value1 / value2}"


// override fun onClick(p0: View) {
//        val x: Double = binding.editText1.text.toString().toDouble()
//        val y: Double = binding.editText2.text.toString().toDouble()
//        val intent = Intent(this, SecondActivity::class.java)
//
//        if(binding.editText1.text.toString()==""||binding.editText2.text.toString()=="") {
//            val rootLayout: View = findViewById(android.R.id.content)
//            val snackbar = Snackbar.make(rootLayout, "数字を入力してください", Snackbar.LENGTH_LONG)
//            snackbar.show()
//        }else{
//            intent.putExtra("VALUE1",x)
//            intent.putExtra("VALUE2",y)
//
//            startActivity(intent)
//        }

//when (v.id) {
//              R.id.button1 -> binding.textView.text = "${x + y}"
//              R.id.button2 -> binding.textView.text = "${x - y}"
//              R.id.button3 ->  binding.textView.text = "${x * y}"
//              R.id.button4 ->  binding.textView.text = "${x / y}"
//
//intent.putExtra("VALUE1",num1)
//            intent.putExtra("VALUE2",num2)
//            intent.putExtra("VALUE3",num3)
//            intent.putExtra("VALUE4",num4)
//            intent.putExtra("XXX", result,num1)


// if(binding.editText1.text.toString()==""||binding.editText2.text.toString()=="") {
//            val rootLayout: View = findViewById(android.R.id.content)
//            val snackbar = Snackbar.make(rootLayout, "数字を入力してください", Snackbar.LENGTH_LONG)
//            snackbar.show()
//        }else{
//            val num1 =x + y
//            val num2 =x-y
//            val num3=x * y
//            val  num4=x/y
//            intent.putExtra("VALUE1",num1)
//            intent.putExtra("VALUE2",num2)
//            intent.putExtra("VALUE3",num3)
//            intent.putExtra("VALUE4",num4)
//            intent.putExtra("XXX", result
//
//            startActivity(intent)
//        }