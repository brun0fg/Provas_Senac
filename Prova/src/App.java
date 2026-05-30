import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 ArrayList<ContaBancaria> clientes = new ArrayList<>();

for(int i = 0; i < 3; i++){

        ContaBancaria conta = new ContaBancaria();

         System.out.println("\nCliente " + (i + 1));

        System.out.println("Nome Titular: ");
        conta.setTitular(scanner.nextLine());

        System.out.println("Digite seu saldo: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("Limite de saque diario: ");
        conta.setLimiteSaque(scanner.nextDouble());

        System.out.println("Valor a depositar: ");
        conta.depositar(scanner.nextDouble());

        System.out.println("Valor sacar: ");
        conta.sacar(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("----------------");

        System.out.println("----------------");

         clientes.add(conta);

     


        }

        for (ContaBancaria conta : clientes) {
            conta.exibirDados();
            System.out.println("------------------------");
              

    }
      scanner.close();
}

}
