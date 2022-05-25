package com.googlelabs.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Métodos Para Selecionar uma opção (tesoura,papel e pedra)
    public void selecionadoPedra(View view){

       this.opcaoSelecionada("Pedra");
    }

    public void selecionadoPapel(View view){

       this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view){

       this.opcaoSelecionada("Tesoura");
    }
      // Metodo de seleção Principal
    public void opcaoSelecionada(String opcaoSelecionada){
        // Intanciando a Imagem do resultado do app .
        ImageView imagemResultado = findViewById(R.id.imageResultado);

       //Gerando um número Aleátorio
        int numero = new Random().nextInt(3); // 0 1 2
        String [] opcoes = {"pedra","papel","tesoura"};
        String opcaoApp = opcoes[numero];


        // Acessando as imagens dentro de drawable e Colocando em resultado.
        switch (opcaoApp){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        System.out.println("Item CLicado: " + opcaoApp);

    }

}