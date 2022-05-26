package com.googlelabs.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Métodos Para Selecionar uma opção (tesoura,papel e pedra)
    public void selecionadoPedra(View view) {

        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {

        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view) {

        this.opcaoSelecionada("tesoura");
    }

    // Metodo de seleção Principal
    public void opcaoSelecionada(String escolhaUsuario) {
        // Intanciando a Imagem do resultado do app .
        ImageView imagemResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);

        //Gerando um número Aleátorio
        int numero = new Random().nextInt(3); // 0 1 2
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes[numero];


        // Acessando as imagens dentro de drawable e Colocando em resultado.
        switch (escolhaApp) {
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

        if (
                        (escolhaApp == "tesoura" && escolhaUsuario == "papel") ||
                        (escolhaApp == "papel" && escolhaUsuario == "pedra") ||
                        (escolhaApp == "pedra" && escolhaUsuario == "tesoura")
        ){//App ganhador
            textResultado.setText("Você perdeu :(");

        } else if (
                        (escolhaUsuario == "tesoura" && escolhaApp == "papel") ||
                        (escolhaUsuario == "papel" && escolhaApp == "pedra") ||
                        (escolhaUsuario == "pedra" && escolhaApp == "tesoura")
        ) {//Usuario ganhador
            textResultado.setText("Você ganhou :)");

        } else {//Empate
            textResultado.setText("empatamos :| ");
        }

    }
}

