package com.example.classeemetodos;

 class Passaro extends Animal {

     void voar(){
         System.out.println("Voar como um Passaro");
     }

     void correr(){
         super.correr();
         System.out.println("Passarp");
     }
}
