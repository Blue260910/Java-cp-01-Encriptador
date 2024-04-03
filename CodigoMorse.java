import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigoMorse {
    // Mapas para armazenar as correspondências entre texto e código Morse
    private static final Map<String, String> MORSE_TO_TEXT = new HashMap<>();
    private static final Map<String, String> TEXT_TO_MORSE = new HashMap<>();

    // Bloco estático para inicializar os mapas
    static {
        // Preenche o mapa MORSE_TO_TEXT com as correspondências entre código Morse e texto
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


        // Preenche o mapa TEXT_TO_MORSE com as correspondências entre texto e código Morse
        for (Map.Entry<String, String> entry : MORSE_TO_TEXT.entrySet()) {
            TEXT_TO_MORSE.put(entry.getValue(), entry.getKey());
        }
    }

    // Função para decriptar uma mensagem em código Morse
    public static void manipularDecriptacao(Scanner scanner) {
        System.out.println("Escolheu Decriptar");
        System.out.println("-------------------------");
        System.out.print("Digite sua mensagem: ");

        // Solicita ao usuário que insira a mensagem a ser decriptada
        String textoCriptografado = scanner.nextLine();
        if (!textoCriptografado.matches("[.-/ ]+")) {
            System.out.println("Mensagem inválida");
            return;
        }
       
    
        // Cria um StringBuilder para armazenar a mensagem decriptada
        StringBuilder textoDecifrado = new StringBuilder();


        // Para cada código Morse na mensagem, busca a letra correspondente e a anexa ao textoDecifrado    
        for (String codigo : textoCriptografado.split(" ")) {
            String letra = MORSE_TO_TEXT.get(codigo);
            textoDecifrado.append(letra);
        }
    
        // Imprime a mensagem decriptada
        System.out.println("Texto Decriptado: " + textoDecifrado.toString());
    }

    // Função para encriptar uma mensagem em código Morse
    public static void manipularEncriptacao(Scanner scanner) {
        System.out.println("Escolheu Encriptar");
        System.out.println("-------------------------");
        System.out.print("Digite sua mensagem: ");

        // Solicita ao usuário que insira a mensagem a ser encriptada
        String textoDecifrado = scanner.nextLine().toUpperCase();

        if (textoDecifrado.isEmpty() || !textoDecifrado.matches("[A-Z\\s]+")) {
            System.out.println("Erro: você deve digitar uma mensagem sem caracteres especiais. Tente novamente.");
            System.exit(1);
        }
    
        // Cria um StringBuilder para armazenar a mensagem encriptada
        StringBuilder codigoMorse = new StringBuilder();
    
        // Para cada letra na mensagem, busca o código Morse correspondente e o anexa ao codigoMorse
        for (char letra : textoDecifrado.toCharArray()) {
            String codigo = TEXT_TO_MORSE.get(String.valueOf(letra));
            codigoMorse.append(codigo).append(" ");
        }
    
        // Imprime a mensagem encriptada
        String textoEncriptado = codigoMorse.toString().trim();
        System.out.println("Texto Encriptado: " + textoEncriptado);
    }
}