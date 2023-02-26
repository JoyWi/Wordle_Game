package com.example.wordle_game

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var wordToGuess: String

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Shows correct answer
        val correct = findViewById<TextView>(R.id.Corectword)
        //Returns word User guessed
        val guess1 = findViewById<TextView>(R.id.gw1)
        val guessedw1 = findViewById<TextView>(R.id.gw1view)
        val guess2 = findViewById<TextView>(R.id.gw2)
        val guessedw2 = findViewById<TextView>(R.id.gw2view)
        val guess3 = findViewById<TextView>(R.id.gw3)
        val guessedw3 = findViewById<TextView>(R.id.gw3view)
        //Where user inputs text
        val word = findViewById<EditText>(R.id.word)
        //submit button for editbox
        val button = findViewById<Button>(R.id.Submitbtn)
        //Reset button
        val btn = findViewById<Button>(R.id.Restrtbtn)
        //User guessed correctly
        val nice = findViewById<TextView>(/* id = */ R.id.Congrats)
        // User guessed wrong
        val nope = findViewById<TextView>(R.id.Opps)

        var wordToGuess = FourLetterWordList.getRandomFourLetterWord()
        btn.visibility = View.GONE
        nice.visibility = View.GONE
        nope.visibility = View.GONE
        correct.text = wordToGuess
        correct.visibility = View.GONE


        var counter = 0
        button.setOnClickListener {
            counter = counter + 1
            if (counter == 1) {
                if (guess1.text == wordToGuess){
                    val g = word.text.toString().uppercase()
                    guess1.text = g
                    guessedw1.text = g
                    word.text.clear()
                    val checkFunc1 = checkGuess(g, wordToGuess)
                    guessedw1.text = checkFunc1
                    correct.visibility = View.VISIBLE
                    button.visibility = View.GONE
                    btn.visibility = View.VISIBLE
                    word.visibility = View.INVISIBLE
                    nice.visibility = View.VISIBLE
                }else if(guess1.text != wordToGuess) {
                    val g = word.text.toString().uppercase()
                    guess1.text = g
                    guessedw1.text = g
                    word.text.clear()
                    val checkFunc1 = checkGuess(g, wordToGuess)
                    guessedw1.text = checkFunc1
                }
            }

            if (counter == 2) {
                if (guess2.text == wordToGuess){
                    val g1 = word.text.toString().uppercase()
                    guess2.text = g1
                    guessedw2.text = g1
                    word.text.clear()
                    val checkFunc2 = checkGuess(g1, wordToGuess)
                    guessedw2.text = checkFunc2
                    correct.visibility = View.VISIBLE
                    button.visibility = View.GONE
                    btn.visibility = View.VISIBLE
                    word.visibility = View.INVISIBLE
                    nice.visibility = View.VISIBLE
                }else if(guess2.text != wordToGuess) {
                    val g1 = word.text.toString().uppercase()
                    guess2.text = g1
                    guessedw2.text = g1
                    word.text.clear()
                    val checkFunc2 = checkGuess(g1, wordToGuess)
                    guessedw2.text = checkFunc2
                }
            }

            if (counter == 3) {
                if (guess3.text == wordToGuess){
                    val g2 = word.text.toString().uppercase()
                    guess3.text = g2
                    guessedw3.text = g2
                    word.text.clear()
                    val checkFunc3 = checkGuess(g2, wordToGuess)
                    guessedw3.text = checkFunc3
                    correct.visibility = View.VISIBLE
                    button.visibility = View.GONE
                    btn.visibility = View.VISIBLE
                    word.visibility = View.INVISIBLE
                    nice.visibility = View.VISIBLE
                }else if(guess3.text != wordToGuess) {
                    val g2 = word.text.toString().uppercase()
                    guess3.text = g2
                    guessedw3.text = g2
                    word.text.clear()
                    val checkFunc3 = checkGuess(g2, wordToGuess)
                    guessedw3.text = checkFunc3
                    correct.visibility = View.VISIBLE
                    button.visibility = View.GONE
                    btn.visibility = View.VISIBLE
                    word.visibility = View.INVISIBLE
                    nope.visibility = View.VISIBLE
                }
            }
        }
        btn.setOnClickListener {
            // resets counter
            counter = 0

            // Enable buttons and hide word and reset button
            button.visibility = View.VISIBLE
            btn.visibility = View.INVISIBLE
            nope.visibility = View.GONE
            nice.visibility = View.GONE
            correct.visibility = View.GONE

            // Clear the TextViews for each word
            guess1.text = "Text"
            guess2.text = "Text"
            guess3.text = "Text"
            guessedw1.text = "Text"
            guessedw2.text = "Text"
            guessedw3.text = "Text"

            // Set TextViews to invisible
            guess1.visibility = View.INVISIBLE
            guess2.visibility = View.INVISIBLE
            guess3.visibility = View.INVISIBLE
            guessedw1.visibility = View.INVISIBLE
            guessedw2.visibility = View.INVISIBLE
            guessedw3.visibility = View.INVISIBLE
            word.visibility = View.INVISIBLE
        }

    }
    private fun checkGuess(guess: String, wordToGuess: String): String {
        var result = ""
        for (i in 0..3) {
            if (guess[i] == wordToGuess[i]) {
                result += "O"
            } else if (guess[i] in wordToGuess) {
                result += "+"
            } else {
                result += "X"
            }
        }
        return result
    }

}


