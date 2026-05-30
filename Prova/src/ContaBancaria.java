
public class ContaBancaria {

    private String titular;
    private double saldo;
    private double limiteSaque;
    

    

    public ContaBancaria(String titular, double saldo, double limiteSaque) {
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }



    public ContaBancaria() {
    }



    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

        public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }



    public String getTitular() {

        return titular;

    }

    public double getSaldo() {

        return saldo;

    }

    
    public double getLimiteSaque() {
        return limiteSaque;
    }

    


    public void saldo(double saldo) {

        System.out.println("Saldo atual: R$ " + saldo);
    }

    public void depositar(double depositar) {

        if (depositar >= 0) {
            saldo = saldo + depositar;
            System.out.println();
            System.out.println("Depósito de R$" + depositar + " realizado.");
            System.out.println();

        } else {

            System.out.println("Valor inválido para depósito.");

        }

    }

    public void sacar(double sacar) {

        if (sacar <= 0) {
            System.out.println("Valor invalido");

        }else if ( sacar >= limiteSaque){
              System.out.println("Limite de saque atingito");

        }else if ( saldo <= sacar){
              System.out.println("Saldo insuficiente.");
        
        }else{
            saldo = saldo - sacar;
            System.out.println();
            System.out.println("Saque de R$" + sacar + " realizado.");
            System.out.println();}  
        }


    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Limite de saque: R$ " + limiteSaque);
        System.out.println("Saldo: R$" + saldo);

    }

}