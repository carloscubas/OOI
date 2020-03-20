package br.cubas.aula2;

public class Pessoa {
    
    // atributos -o que ela precisa para existir 
    String nome;
    String endereco;
    int idade;
    String cpf;
    String rg;

    // métodos - ações 
    public int diasQueViveu(){ // assinatura do método
        int totalDias = this.idade * 365;
        return totalDias;
    }

    //dias que ela viveu
//onde ela mora
//sera que tem mae
}