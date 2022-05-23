package com.example.classeemetodos.classes;

 class Passaro extends Animal {

     void voar(){
         System.out.println("Voar como um Passaro");
     }

     void correr(){
         super.correr();
         System.out.println("Passarp");
     }
}
