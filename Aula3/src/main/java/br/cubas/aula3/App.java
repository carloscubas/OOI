package br.cubas.aula3;

public class App 
{
    public static void main( String[] args )
    {
        Conta c = new Conta();
        double saldoTotal = c.deposito(600.0);

        System.out.println("saldo total: " + saldoTotal);

        boolean sacou = c.saque(800.0);
        if(sacou == true){
            System.out.println("saque efetuado");
        }else{
            System.out.println("saldo insuficiente");
        }


        System.out.println(c.saldoConta());

    }
}
