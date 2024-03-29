import java.util.Scanner;

public class Main {
    private static final String OPCAO_1 = "1";
    private static final String OPCAO_2 = "2";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja utilizar código morse ou cifra de César? ");
        System.out.println(OPCAO_1 + " - Código Morse");
        System.out.println(OPCAO_2 + " - Cifra de César");
        System.out.print("Digite " + OPCAO_1 + " ou " + OPCAO_2 + ": ");
        String escolhaTipoConversao = scanner.nextLine();

        switch (escolhaTipoConversao) {
            case OPCAO_1:
                System.out.println("Escolheu Código Morse");
                manipularCodigoMorse(scanner);
                break;
            case OPCAO_2:
                manipularCifraCesar(scanner);
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }

    private static void manipularCifraCesar(Scanner scanner) {
        System.out.println("Escolheu Cifra de César");
        System.out.println("-------------------------");
        System.out.println("Você deseja decriptar ou encriptar uma mensagem? ");
        System.out.println(OPCAO_1 + " - Decriptar");
        System.out.println(OPCAO_2 + " - Encriptar");
        System.out.print("Digite " + OPCAO_1 + " ou " + OPCAO_2 + ": ");
        String escolhaTipoEncriptacao = scanner.nextLine();

        switch (escolhaTipoEncriptacao) {
            case OPCAO_1:
                DecifradorCifraCesar.manipularDecriptacao(scanner);
                break;
            case OPCAO_2:
                DecifradorCifraCesar.manipularEncriptacao(scanner);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private static void manipularCodigoMorse(Scanner scanner) {
        System.out.println("Escolheu Codigo Morse");
        System.out.println("-------------------------");
        System.out.println("Você deseja decriptar ou encriptar uma mensagem? ");
        System.out.println(OPCAO_1 + " - Decriptar");
        System.out.println(OPCAO_2 + " - Encriptar");
        System.out.print("Digite " + OPCAO_1 + " ou " + OPCAO_2 + ": ");
        String escolhaTipoEncriptacao = scanner.nextLine();

        switch (escolhaTipoEncriptacao) {
            case OPCAO_1:
                CodigoMorse.manipularDecriptacao(scanner);
                break;
            case OPCAO_2:
                CodigoMorse.manipularEncriptacao(scanner);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}