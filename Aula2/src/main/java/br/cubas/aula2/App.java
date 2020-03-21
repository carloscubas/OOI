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
        joao.endereco = "Bauru";
        joao.peso = 70.2;
        joao.altura = 1.8;

        System.out.println("Nome: " + joao.nome);

        Pessoa maria = new Pessoa();
        maria.nome = "maria da silva";
        maria.rg = "123456789";
        maria.idade = 20;
        maria.endereco = "Agudos";
        maria.peso = 50.3;
        maria.altura = 1.6;

        int diasMaria = maria.diasQueViveu();
        int diasJoao = joao.diasQueViveu();

        String lugarJoaoMora = joao.ondeMora();
        //String lugarMariaMora = maria.ondeMora();

        System.out.println("O joão mora em: " + lugarJoaoMora);
        System.out.println("A maria mora em: " + maria.ondeMora());

        System.out.println("Dias de vida da maria: " + diasMaria);
        System.out.println("Dias de vida do joao: " + diasJoao);

        System.out.println("IMC do João: " + joao.valorImc());
        System.out.println("IMC do Maria: " + maria.valorImc());

    }
}
