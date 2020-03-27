package br.cubas.aula3;
/*
    Conta
    // O que ela tem
        - saldo
    
    // O que ela faz
        - deposito
        - saque
        - transferencia  
        - mostra Saldo
*/

public class Conta {

        // atributo
        private double saldo = 0;
 
        //métodos - ações
        public double deposito(double valorDeposito){
            saldo = saldo + valorDeposito;
            return saldo;
        }

        public boolean saque(double valorSaque){
            if(valorSaque <= saldo){
                saldo = saldo - valorSaque;
                return true;
            }else{
                return false;
            }
        }

        public double saldoConta(){
            return saldo;
        }
}