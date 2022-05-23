package com.example.classeemetodos.classes;

 public class Animal {
      protected int tamanho;
      protected String cor ;
      protected double peso;

    /*
         Getter (Recuperar o valor de uma Propriedade)
         Setter (Utlizado para configurar o valor de uma propriedade)
         */
    void setCor (String cor){
        //Formatação ou validação
        this.cor = cor;
    }
    String getCor(){
        return this.cor;
    }
    void dormir (){
        System.out.println("Dormir como um animal");
    }
    void correr (){
        System.out.println("Correr como um ");
    }
}
