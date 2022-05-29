package com.googlelabs.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
   // Caixa de Texto
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textResultado;
   // CheckBox
    private CheckBox checkVerde, checkBranco, checkVermelho;

   //RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Criamos Acesso para toda parte do Código
        campoNome      = findViewById(R.id.editNome);
        campoEmail     = findViewById(R.id.editEmail);
        textResultado  = findViewById(R.id.textResultado);

        //CheckBox - Acessando de toda parte do código
        checkVerde     = findViewById(R.id.checkVerde);
        checkBranco    = findViewById(R.id.checkBranco);
        checkVermelho  = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoMasculino  = findViewById(R.id.radioButtonM);
        sexoFeminino   = findViewById(R.id.radioButtonF);
        //RadioGroup
         opcaoSexo     = findViewById(R.id.radioGroupSexo);
         radiobutton();

      }
     public void radiobutton(){
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButtonM){
                    textResultado.setText("Masculino");
                }else if (checkedId == R.id.radioButtonF){
                    textResultado.setText("Feminino");
                }
            }
        });
      /*
        if (sexoMasculino.isChecked()) {
            textResultado.setText("Masculino Selecionado");
        }
       else { sexoFeminino.isChecked();
            textResultado.setText("Feminino Selecionado - ");
        }
       */
       //Criando Ouvinte para quando selecionar já mude o texto abaixa (Feminino/Masculino)

     }
  //enviar - Criamos um Método que ao clicar no botão recupera os dados e guarda na caixa de Resultado.
    public void enviar(View view){
        // Método CheckBox chamado no botão enviar
       // checkBox();
       //  radiobutton();

      /*
        String nome = campoNome.getText().toString();
        String Email = campoEmail.getText().toString();
        textResultado.setText("nome: "+ nome +"  email: " + Email);
       */
   }


    public void checkBox(){

        String texto = "";
        // checkBox - Recuperando caixa Selecionada [x]
        if(checkVerde.isChecked()){

            /*String corSelecionada = checkVerde.getText().toString();
            texto = corSelecionada;
             */
            texto = "Verde selecionado - ";

        }

        if(checkBranco.isChecked()){
            texto = texto + "Branco selecionado - ";

        }

        if(checkVermelho.isChecked()){
            texto = texto + "Vermelho selecionado - ";

        }

        textResultado.setText(texto);



    }
   /* limpar - Criamos um método no botão limpar para que ele apague
       o que foi digitado dentro da caixa de texto */

     public void limpar(View view){

          campoNome.setText("");
          campoEmail.setText("");

   }
    }
