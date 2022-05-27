package com.example.classeemetodos;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

      public ContaBancaria(){
        System.out.println("Construtor chamado");
    }

    public ContaBancaria(int nConta){
          this.numeroConta = nConta;
       // System.out.println("Construtor chamado" + nConta);
    }
}
