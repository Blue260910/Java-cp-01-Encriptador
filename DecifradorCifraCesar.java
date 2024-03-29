import java.util.Scanner;

public class DecifradorCifraCesar {

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

        String textoDecriptado = DecifradorCifraCesar.decifrar(textoCriptografado, deslocamento);
        System.out.println("Texto Decriptado: " + textoDecriptado);
    }

    public static String decifrar(String textoCriptografado, int deslocamento) {
        StringBuilder textoDecifrado = new StringBuilder();

        deslocamento = deslocamento % 26;

        for (int i = 0; i < textoCriptografado.length(); i++) {
            char caractere = textoCriptografado.charAt(i);

            if (Character.isLetter(caractere)) {
                char caractereDecifrado = (char) (caractere - deslocamento);

                if (Character.isUpperCase(caractere) && caractereDecifrado < 'A') {
                    caractereDecifrado = (char) (caractereDecifrado + 26);
                }

                textoDecifrado.append(caractereDecifrado);
            } else {
                textoDecifrado.append(caractere);
            }
        }

        return textoDecifrado.toString();
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

        String textoEncriptado = DecifradorCifraCesar.encriptar(textoCriptografado, deslocamento);
        System.out.println("Texto encriptado: " + textoEncriptado);
    }

    public static String encriptar(String texto, int deslocamento) {
        StringBuilder textoEncriptado = new StringBuilder();

        deslocamento = deslocamento % 26;

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char caractereEncriptado = (char) (caractere + deslocamento);

                if (Character.isUpperCase(caractere) && caractereEncriptado > 'Z') {
                    caractereEncriptado = (char) (caractereEncriptado - 26);
                }

                textoEncriptado.append(caractereEncriptado);
            } else {
                textoEncriptado.append(caractere);
            }
        }

        return textoEncriptado.toString();
    }
}