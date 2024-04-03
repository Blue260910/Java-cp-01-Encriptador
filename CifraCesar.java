import java.util.Scanner;
public class CifraCesar {

    // Função para decriptar uma mensagem usando a cifra de César
    public static void manipularDecriptacao(Scanner scanner) {
        System.out.println("Escolheu Decriptar");
        System.out.println("-------------------------");
        System.out.print("Digite sua mensagem: ");

        // Solicita ao usuário que insira a mensagem a ser decriptada
        String textoCriptografado = scanner.nextLine().toUpperCase();

        if (textoCriptografado.isEmpty() || !textoCriptografado.matches("[A-Z\\s]+")) {
            System.out.println("Erro: você deve digitar uma mensagem sem caracteres especiais. Tente novamente.");
            System.exit(1);
        }

        // Solicita ao usuário que insira a chave de deslocamento
        System.out.print("Digite a chave: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Erro: você deve digitar um número inteiro. Tente novamente.");
            System.exit(1);
        }
        int deslocamento = scanner.nextInt();
        deslocamento = deslocamento % 26;
        System.out.println("Deslocamento: " + deslocamento);
    
        // Cria um StringBuilder para armazenar a mensagem decriptada
        StringBuilder textoDecifrado = new StringBuilder();
    
        // Para cada caractere na mensagem, se for uma letra, subtrai o deslocamento do caractere
        // e anexa o caractere decriptado ao textoDecifrado
        for (int i = 0; i < textoCriptografado.length(); i++) {
            char caractere = textoCriptografado.charAt(i);
    
            if (Character.isLetter(caractere)) {
                char caractereDecifrado = (char) ((caractere - 'A' - deslocamento + 26) % 26 + 'A');
                textoDecifrado.append(caractereDecifrado);
            } else {
                textoDecifrado.append(caractere);
            }
        }
    
        // Imprime a mensagem decriptada
        System.out.println("Texto Decriptado: " + textoDecifrado.toString());
    }

    // Função para encriptar uma mensagem usando a cifra de César
    public static void manipularEncriptacao(Scanner scanner) {
        System.out.println("Escolheu Encriptar");
        System.out.println("-------------------------");
        System.out.print("Digite sua mensagem: ");

        // Solicita ao usuário que insira a mensagem a ser encriptada
        String textoCriptografado = scanner.nextLine().toUpperCase();

        if (textoCriptografado.isEmpty() || !textoCriptografado.matches("[A-Z\\s]+")) {
            System.out.println("Erro: você deve digitar uma mensagem sem caracteres especiais. Tente novamente.");
            System.exit(1);
        }

        // Solicita ao usuário que insira a chave de deslocamento
        System.out.print("Digite a chave: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Erro: você deve digitar um número inteiro. Tente novamente.");
            System.exit(1);
        }
        int deslocamento = scanner.nextInt();
        deslocamento = deslocamento % 26;

        // Cria um StringBuilder para armazenar a mensagem encriptada
        StringBuilder textoEncriptado = new StringBuilder();

        // Para cada caractere na mensagem, se for uma letra, adiciona o deslocamento ao caractere
        // e anexa o caractere encriptado ao textoEncriptado
        for (int i = 0; i < textoCriptografado.length(); i++) {
            char caractere = textoCriptografado.charAt(i);

            if (Character.isLetter(caractere)) {
                char caractereEncriptado = (char) ((caractere - 'A' + deslocamento) % 26 + 'A');
                textoEncriptado.append(caractereEncriptado);
            } else {
                textoEncriptado.append(caractere);
            }
        }

        // Imprime a mensagem encriptada
        System.out.println("Texto encriptado: " + textoEncriptado.toString());
    }
}