package jp.techacademy.haruki.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import jp.techacademy.haruki.intent.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)

        fun showAnswer(ans: View) {
            if (ans.id == R.id.button1) {
                binding.textView.text = "${value1 + value2}"
            }
            if (ans.id == R.id.button2) {
                binding.textView.text = "${value1 - value2}"
            }
            if (ans.id == R.id.button2) {
                binding.textView.text = "${value1 * value2}"
            }
            if (ans.id == R.id.button2) {
                binding.textView.text = "${value1 / value2}"
            }
        }
    }
}



