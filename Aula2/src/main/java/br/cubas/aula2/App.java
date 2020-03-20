package br.cubas.aula2;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa joao = new Pessoa(); //instanciar um objeto
        joao.cpf = "123456";
        joao.rg = "124578";
        joao.nome = "cubas";
        joao.idade = 10;

        System.out.println("Nome: " + joao.nome);

        Pessoa maria = new Pessoa();
        maria.nome = "maria da silva";
        maria.rg = "123456789";
        maria.idade = 20;

        int diasMaria = maria.diasQueViveu();
        int diasJoao = joao.diasQueViveu();

        System.out.println("Dias de vida da maria: " + diasMaria);
        System.out.println("Dias de vida do joao: " + diasJoao);

    }
}
