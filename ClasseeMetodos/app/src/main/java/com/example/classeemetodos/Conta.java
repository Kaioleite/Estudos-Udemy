package com.example.classeemetodos;

/*
## Modificadores de  acesso ##
  1) public -> todas as classes terão acesso
  2) private -> apenas poder ser acessado de dentro da classe
  3) protected -> pode ser acessado estandp dentro do mesmo pacote ou subclasses
  4) default -> Caso não tenha sido definido nenhum modificador,
  permitindo o acesso dentro do pacote
 */



public class Conta {

  protected   int numeroConta;
   private double saldo = 100;

   public double recuperarSaldo(){
       return this.saldo;
   }

    public void depositar (double valorDeposito){
        this.saldo = this.saldo + valorDeposito;
    }

    public void sacar (double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }
}
