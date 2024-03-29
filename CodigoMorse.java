import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigoMorse {
    private static final Map<String, String> MORSE_TO_TEXT = new HashMap<>();
    private static final Map<String, String> TEXT_TO_MORSE = new HashMap<>();

    static {
        MORSE_TO_TEXT.put(".-", "A");
        MORSE_TO_TEXT.put("-...", "B");
        MORSE_TO_TEXT.put("-.-.", "C");
        MORSE_TO_TEXT.put("-..", "D");
        MORSE_TO_TEXT.put(".", "E");
        MORSE_TO_TEXT.put("..-.", "F");
        MORSE_TO_TEXT.put("--.", "G");
        MORSE_TO_TEXT.put("....", "H");
        MORSE_TO_TEXT.put("..", "I");
        MORSE_TO_TEXT.put(".---", "J");
        MORSE_TO_TEXT.put("-.-", "K");
        MORSE_TO_TEXT.put(".-..", "L");
        MORSE_TO_TEXT.put("--", "M");
        MORSE_TO_TEXT.put("-.", "N");
        MORSE_TO_TEXT.put("---", "O");
        MORSE_TO_TEXT.put(".--.", "P");
        MORSE_TO_TEXT.put("--.-", "Q");
        MORSE_TO_TEXT.put(".-.", "R");
        MORSE_TO_TEXT.put("...", "S");
        MORSE_TO_TEXT.put("-", "T");
        MORSE_TO_TEXT.put("..-", "U");
        MORSE_TO_TEXT.put("...-", "V");
        MORSE_TO_TEXT.put(".--", "W");
        MORSE_TO_TEXT.put("-..-", "X");
        MORSE_TO_TEXT.put("-.--", "Y");
        MORSE_TO_TEXT.put("--..", "Z");
        MORSE_TO_TEXT.put("-----", "0");
        MORSE_TO_TEXT.put(".----", "1");
        MORSE_TO_TEXT.put("..---", "2");
        MORSE_TO_TEXT.put("...--", "3");
        MORSE_TO_TEXT.put("....-", "4");
        MORSE_TO_TEXT.put(".....", "5");
        MORSE_TO_TEXT.put("-....", "6");
        MORSE_TO_TEXT.put("--...", "7");
        MORSE_TO_TEXT.put("---..", "8");
        MORSE_TO_TEXT.put("----.", "9");
        MORSE_TO_TEXT.put("/", " ");

        for (Map.Entry<String, String> entry : MORSE_TO_TEXT.entrySet()) {
            TEXT_TO_MORSE.put(entry.getValue(), entry.getKey());
        }
    }


    public static void manipularDecriptacao(Scanner scanner) {
        System.out.println("Escolheu Decriptar");
        System.out.println("-------------------------");
        System.out.print("Digite sua mensagem: ");
        String textoCriptografado = scanner.nextLine();
        textoCriptografado = NormalizadorDeTexto.removeAccents(textoCriptografado);


        String textoDecriptado = decifrar(textoCriptografado);
        System.out.println("Texto Decriptado: " + textoDecriptado);
    }

    private static String decifrar(String codigoMorse) {
        StringBuilder textoDecifrado = new StringBuilder();

        for (String codigo : codigoMorse.split(" ")) {
            String letra = MORSE_TO_TEXT.get(codigo);
            textoDecifrado.append(letra);
        }

        return textoDecifrado.toString();
    }

    public static void manipularEncriptacao(Scanner scanner) {
        System.out.println("Escolheu Decriptar");
        System.out.println("-------------------------");
        System.out.print("Digite sua mensagem: ");
        String textoCriptografado = scanner.nextLine();
        textoCriptografado = NormalizadorDeTexto.removeAccents(textoCriptografado);


        String textoDecriptado = encriptar(textoCriptografado);
        System.out.println("Texto Encriptado: " + textoDecriptado);
    }
    
    private static String encriptar(String texto) {
        StringBuilder codigoMorse = new StringBuilder();

        for (char letra : texto.toCharArray()) {
            String codigo = TEXT_TO_MORSE.get(String.valueOf(letra));
            codigoMorse.append(codigo).append(" ");
        }

        return codigoMorse.toString().trim();
    }
}