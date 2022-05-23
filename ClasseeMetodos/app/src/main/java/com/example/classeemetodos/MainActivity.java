package com.example.classeemetodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Passaro passaro = new Passaro();
        passaro.correr();



          /*
        Cao cao = new Cao();
        cao.correr();
       // cao.setCor("Azul");
           */

       // System.out.println(cao.getCor());

    /*
      Animal animal = new Animal();
      animal.correr();
      */






















        /*
        Funcionario funcinario = new Funcionario();
        funcinario.nome = "Jamilton";
        funcinario.salario = 920;

        double salarioRecuperado = funcinario.recuperarSalario(120, 20);
        System.out.println("O salario do Kaio é : " + salarioRecuperado );
        */

       // int numero = 10;
       /* Casa minhaCasa = new Casa();
        minhaCasa.cor = "Cor";
       System.out.println(minhaCasa*/


    }
}
