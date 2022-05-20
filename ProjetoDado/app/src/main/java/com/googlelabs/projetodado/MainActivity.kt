package com.googlelabs.projetodado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/*Esta atividade permite ao usuário rolar um dado e visualizar o resultado * na tela. */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     // Ação ao Clicar no Botão Roll6
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice()
    // Ação ao Clicar no Botão Roll20
       val rollButton2: Button = findViewById(R.id.button2)
        rollButton2.setOnClickListener{rollDice2()}
        }
    }
    /* Jogue os dados e atualize a tela com o resultado. */
    private fun rollDice() {
        // Cria um novo objeto Dice com 6 lados e rola
        val dice = Dice(6)
        var diceRoll = dice.roll()

        // Atualiza a tela com o lançamento do 1 dado
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
    private fun rollDice2() {
        // Cria um novo Objeto Dice com 20 lados e rola
        val dice2 = Dice(20)
        var diceRoll2 = dice2.roll()

        // Atualiza a tela com lançamento do 2 dado
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = diceRoll2.toString()
    }

}
/* Método de números Aleatórios :) */
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}