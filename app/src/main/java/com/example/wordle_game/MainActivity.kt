package com.example.wordle_game

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Shows correct answer
        val wordToGuess = findViewById<TextView>(R.id.Corectword)
        //Returns word User guessed
        val guess1 = findViewById<TextView>(R.id.gw1)
        val guessedw1 = findViewById<TextView>(R.id.gw1view)
        val guess2 = findViewById<TextView>(R.id.gw2)
        val guessedw2 = findViewById<TextView>(R.id.gw2view)
        val guess3 = findViewById<TextView>(R.id.gw3)
        val guessedw3 = findViewById<TextView>(R.id.gw3view)
        //Where user inputs text
        val word = findViewById<EditText>(R.id.word)
        //User used up all guesses
        val no = findViewById<TextView>(R.id.Opps)
        //Restart button for user if they use all three guesses or wants try a new game after getting the word right
        val btn = findViewById<Button>(R.id.Restrtbtn)
        //submit button for editbox
        val button = findViewById<Button>(R.id.Submitbtn)
        //User guessed correctly
        val nice = findViewById<TextView>(/* id = */ R.id.Congrats)
        // Still figuring out this  vvv
        var numberguess = 3


        fun checkGuess(word: String) : String {
            var result = ""
            for (i in 0..3) {

                if (word[i] == wordToGuess[i]) {
                    // 'O' reps the right letter and position
                    result += "O"
                }
                else if (word[i] in wordToGuess) {
                    // ' +' reps right letter but wrong position
                    result += "+"
                }
                else {
                    // 'X' reps wrong letter
                    result += "X"
                }
            }
            return result
        }
        FourLetterWordList.getRandomFourLetterWord()


        button.setOnClickListener {


        }
           }




}


