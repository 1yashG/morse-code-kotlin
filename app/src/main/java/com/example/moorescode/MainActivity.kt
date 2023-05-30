package com.example.moorescode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var eti: EditText
    private lateinit var eto: EditText
    private lateinit var btne: Button
    private lateinit var btnd: Button
    private lateinit var btnc: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eti = findViewById(R.id.eti)
        eto = findViewById(R.id.eto)
        btnd = findViewById(R.id.btnd)
        btne = findViewById(R.id.btne)
        btnc = findViewById(R.id.btnc)
        val alphaNumeric = arrayOf(
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3",
            "4", "5", "6", "7", "8", "9"
        )
        val alphaNumeric1= arrayOf("· –",
            "– · · ·", "– · – ·", "– · ·"	, "·", "· · – ·", "– – ·"	, "· · · ·",
            "· ·", "· – – –", "– · –"	, "· – · ·", "– –", "– ·", "– – –"	, "· – – ·",
            "– – · –", "· – ·"	, "· · ·", "–", "· · –"	, "· · · –", "· – –"	, "– · · –",
            "– · – –", "– – · ·", "– – – – –", "· – – – –", "· · – – –", "· · · – –",
            "· · · · –", "· · · · ·", "– · · · ·", "– – · · ·", "– – – · ·", "– – – – ·",

        )
        btne.setOnClickListener {
            val input = eti.text.toString()
            var output = ""
            val l = input.length
            for (i in 0 until l) {
                val ch = input.substring(i, i + 1)
                for (j in 0 until 37) {
                    if (ch.equals(alphaNumeric[j], ignoreCase = true)) {
                        output = output.plus(alphaNumeric1[j]).plus(" ")
                    }
                }
            }
            eto.setText(output)
        }
        btnd.setOnClickListener {
            val input1 = eti.text.toString()
            val input = input1.plus(" ")
            val l = input.length
            var i: Int
            var j: Int
            var p = 0
            var pos = 0
            var letter = ""
            var output = ""
            for (i in 0 until l) {
                var flag = 0
                val ch = input.substring(i, i + 1)
                if (ch.equals(" ", ignoreCase = true)) {
                    p = i
                    letter = input.substring(pos, p)
                    pos = p + 1
                    flag = 1
                }
                val letter1 = letter.trim()
                if (flag == 1) {
                    for (j in 0..36) {
                        if (letter1.equals(alphaNumeric1[j], ignoreCase = true)) {
                            output = output.plus(alphaNumeric[j])
                            break
                        }
                    }
                }
            }
            eto.setText(output)
        }

    }


    }
