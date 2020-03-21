package br.cubas.aula2;

public class Pessoa {
    
    // atributos -o que ela precisa para existir 
    String nome;
    String endereco;
    int idade;
    String cpf;
    String rg;
    double altura;
    double peso;

    // métodos - ações 
    public int diasQueViveu(){ // assinatura do método
        int totalDias = this.idade * 365;
        return totalDias;
    }

    public String ondeMora(){
        return endereco;
    }

    public double valorImc(){
        return peso / (altura * altura);
    }

}