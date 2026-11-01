
package com.studypdfai

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(28, 28, 28, 28)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "📚 Study PDF AI"
        title.textSize = 30f
        title.setTextColor(Color.rgb(40, 70, 160))
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Your Personal AI Study Assistant"
        subtitle.textSize = 16f
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 15, 0, 35)

        val uploadButton = Button(this)
        uploadButton.text = "Upload PDF"

        uploadButton.setOnClickListener {
            Toast.makeText(
                this,
                "PDF Upload feature coming soon!",
                Toast.LENGTH_SHORT
            ).show()
        }

        val question = EditText(this)
        question.hint = "Ask your question..."
        question.textSize = 16f

        val askButton = Button(this)
        askButton.text = "Ask Question"

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(uploadButton)
        layout.addView(question)
        layout.addView(askButton)

        setContentView(layout)
    }
}
