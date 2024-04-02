import java.util.Scanner;

public class CifraCesar {

    public static void manipularDecriptacao(Scanner scanner) {
        System.out.println("Escolheu Decriptar");
        System.out.println("-------------------------");
        System.out.print("Digite sua mensagem: ");
        String textoCriptografado = scanner.nextLine();
        textoCriptografado = NormalizadorDeTexto.removeAccents(textoCriptografado);
    
        System.out.print("Digite a chave: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Erro: você deve digitar um número inteiro. Tente novamente.");
            System.exit(1);
        }
        int deslocamento = scanner.nextInt();
        deslocamento = deslocamento % 26;
    
        StringBuilder textoDecifrado = new StringBuilder();
    
        for (int i = 0; i < textoCriptografado.length(); i++) {
            char caractere = textoCriptografado.charAt(i);
    
            if (Character.isLetter(caractere)) {
                char caractereDecifrado = (char) (caractere - deslocamento);
                textoDecifrado.append(caractereDecifrado);
            } else {
                textoDecifrado.append(caractere);
            }
        }
    
        System.out.println("Texto Decriptado: " + textoDecifrado.toString());
    }

    public static void manipularEncriptacao(Scanner scanner) {
        System.out.println("Escolheu Encriptar");
        System.out.println("-------------------------");
        System.out.print("Digite sua mensagem: ");
        String textoCriptografado = scanner.nextLine();
        textoCriptografado = NormalizadorDeTexto.removeAccents(textoCriptografado);

        System.out.print("Digite a chave: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Erro: você deve digitar um número inteiro. Tente novamente.");
            System.exit(1);
        }
        int deslocamento = scanner.nextInt();
        deslocamento = deslocamento % 26;

        StringBuilder textoEncriptado = new StringBuilder();

        for (int i = 0; i < textoCriptografado.length(); i++) {
            char caractere = textoCriptografado.charAt(i);

            if (Character.isLetter(caractere)) {
                char caractereEncriptado = (char) (caractere + deslocamento);
                textoEncriptado.append(caractereEncriptado);
            } else {
                textoEncriptado.append(caractere);
            }
        }

        System.out.println("Texto encriptado: " + textoEncriptado.toString());
    }
}