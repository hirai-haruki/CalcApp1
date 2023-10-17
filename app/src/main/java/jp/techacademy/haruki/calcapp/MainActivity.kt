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
        setContentView(R.layout.activity_main)

        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val x: Double = binding.editText1.text.toString().toDouble()
        val y: Double = binding.editText2.text.toString().toDouble()
        val intent = Intent(this, SecondActivity::class.java)

        if (R.id.button1 == intent.) {
            val rootLayout: View = findViewById(android.R.id.content)
            val snackbar = Snackbar.make(rootLayout, "数字", Snackbar.LENGTH_LONG)
            snackbar.show()

        } else {
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("VALUE1", x)
            intent.putExtra("VALUE2", y)

            startActivity(intent)
        }
    }
}





