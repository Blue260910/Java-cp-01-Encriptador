import java.util.Scanner;

public class Main {
    private static final String OPCAO_1 = "1";
    private static final String OPCAO_2 = "2";

    // Função principal que executa o programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que escolha entre trabalhar com código morse ou cifra de César
        System.out.println("========================================================================");
        System.out.println("         ____                  __      ___           _         ");
        System.out.println("        |  _ \\                 \\ \\    / (_)         | |        ");
        System.out.println("        | |_) | ___ _ __ ___    \\ \\  / / _ _ __   __| | ___    ");
        System.out.println("        |  _ < / _ \\ '_ ` _ \\    \\ \\/ / | | '_ \\ / _` |/ _ \\   ");
        System.out.println("        | |_) |  __/ | | | | |    \\  /  | | | | | (_| | (_) |  ");
        System.out.println("        |____/ \\___|_| |_| |_|     \\/   |_|_| |_|\\__,_|\\___/   ");
        System.out.println("========================================================================");
        System.out.println("Conversor de Código Morse e Cifra de César! ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Deseja utilizar código morse ou cifra de César? | ");
        System.out.println("-------------------------------------------------");
        System.out.println(OPCAO_1 + " - Código Morse");
        System.out.println(OPCAO_2 + " - Cifra de César");
        System.out.println("-------------------------------------------------");
        System.out.print("Digite " + OPCAO_1 + " ou " + OPCAO_2 + ": ");
        String escolhaTipoConversao = scanner.nextLine();

        // Dependendo da escolha do usuário, o programa irá manipular o código Morse ou a cifra de César
        switch (escolhaTipoConversao) {
            case OPCAO_1:
                manipularCodigoMorse(scanner);
                break;
            case OPCAO_2:
                manipularCifraCesar(scanner);
                break;
            default:
                System.out.println("-------------------------------------------------");
                System.out.println("Opção inválida");
        }

        scanner.close();
        
    }

    // Função para manipular o código Morse
    private static void manipularCodigoMorse(Scanner scanner) {
        // Solicita ao usuário que escolha entre decriptar ou encriptar uma mensagem em código Morse
        System.out.println("Escolheu Codigo Morse");
        System.out.println("-------------------------");
        System.out.println("Você deseja decriptar ou encriptar uma mensagem? |");
        System.out.println("--------------------------------------------------");
        System.out.println(OPCAO_1 + " - Decriptar");
        System.out.println(OPCAO_2 + " - Encriptar");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite " + OPCAO_1 + " ou " + OPCAO_2 + ": ");
        String escolhaTipoEncriptacao = scanner.nextLine();

        // Dependendo da escolha do usuário, o programa irá decriptar ou encriptar a mensagem em código Morse
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

    // Função para manipular a cifra de César
    private static void manipularCifraCesar(Scanner scanner) {
        // Solicita ao usuário que escolha entre decriptar ou encriptar uma mensagem em cifra de César
        System.out.println("Escolheu Cifra de César");
        System.out.println("-------------------------");
        System.out.println("Você deseja decriptar ou encriptar uma mensagem? |");
        System.out.println("--------------------------------------------------");
        System.out.println(OPCAO_1 + " - Decriptar");
        System.out.println(OPCAO_2 + " - Encriptar");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite " + OPCAO_1 + " ou " + OPCAO_2 + ": ");
        String escolhaTipoEncriptacao = scanner.nextLine();

        // Dependendo da escolha do usuário, o programa irá decriptar ou encriptar a mensagem em cifra de César
        switch (escolhaTipoEncriptacao) {
            case OPCAO_1:
                CifraCesar.manipularDecriptacao(scanner);
                break;
            case OPCAO_2:
                CifraCesar.manipularEncriptacao(scanner);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}