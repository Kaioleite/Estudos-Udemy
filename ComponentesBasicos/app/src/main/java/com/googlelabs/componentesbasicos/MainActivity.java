package com.googlelabs.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
   // Está chamando o Tipo de cada componente para poder chamar no FindVIewById.
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Criamos Acesso para toda parte do Código
        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textResultado = findViewById(R.id.textResultado);

      }

  // Criamos um Método que ao clicar no botão recupera os dados e guarda na caixa de Resultado.
    public void enviar(View view){

        String nome = campoNome.getText().toString();
        String Email = campoEmail.getText().toString();
        textResultado.setText("nome: "+ nome +"  email: " + Email);
   }
   /* Criamos um método no botão limpar para que ele apague
       o que foi digitado dentro da caixa de texto */
     public void limpar(View view){

          campoNome.setText("");
          campoEmail.setText("");

   }
    }
