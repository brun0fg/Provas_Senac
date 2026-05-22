import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria(null, 0, 0);

       System.out.println("Nome Titular: ");
        conta1.setTitular(scanner.nextLine());

        System.out.println("Valor a depositar: ");
        conta1.setSaldo(scanner.nextDouble());


        conta1.exibirDados();

        System.out.println("----------------");

        conta1.sacar(200);

        System.out.println("----------------");


        conta1.exibirDados();

    scanner.close();
}
    
}
