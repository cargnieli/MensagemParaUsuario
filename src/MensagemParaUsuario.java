import java.util.Scanner;

public class MensagemParaUsuario {







    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        System.out.println("Agora sua idade: ");

        String name = scanner.nextLine();
        int idade = scanner.nextInt();

        System.out.println("Olá " + name + " sua idade é de " + idade + " anos.");


    }

}