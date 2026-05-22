// Classe ContaBancaria.java

public class ContaBancaria {

    private String titular;
    private double saldo;
    

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getTitular() {

        return titular;

    }

    public double getSaldo() {

        return saldo;

    }

    public void depositar(double valor) {

        if (valor > 0) {

            saldo += valor;

            System.out.println("Depósito de R$" + valor + " realizado.");

        } else {

            System.out.println("Valor inválido para depósito.");

        }

    }

    public void sacar(double valor) {

        System.out.print("Qual o valor que deseja sacar: ");

        if (valor <= saldo) {

            saldo -= valor;

            System.out.println("Saque de R$" + valor + " realizado.");

        } else {

            System.out.println("Saldo insuficiente.");

        }

    }

    public void exibirDados() {

        System.out.println("Titular: " + titular);


        System.out.println("Saldo: R$" + saldo);

    }





}