package vcmsa.ci.flashcardapp3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)


        val correctAnswer = false // Example question


        //Feedback Textview.
        val feedback = findViewById<TextView>(R.id.Feedbacktext)
        var score = intent.getIntExtra("score", 0)

        findViewById<TextView>(R.id.Question2).text = "The Berlin wall fell in 1990."

        //True button
        findViewById<Button>(R.id.Truebutton).setOnClickListener {
            if (correctAnswer) {
                feedback.text = "Correct!"
                score++
            } else {
                feedback.text = "Incorrect!"
                score++
            }
        }

        //False button
        findViewById<Button>(R.id.Falsebutton).setOnClickListener {
            if (!correctAnswer) {
                feedback.text = "Correct!"
                score++
            } else {
                feedback.text = "Incorrect!"
                score++
            }

            //When the start button is clicked it will navigate to screen 4.
            findViewById<Button>(R.id.Nextbutton).setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}}