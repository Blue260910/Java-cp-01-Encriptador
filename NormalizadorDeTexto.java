import java.text.Normalizer;
import java.util.regex.Pattern;

public class NormalizadorDeTexto {

    // Função para remover acentos de uma string
    public static String removeAccents(String text) {
        // Normaliza a string para a forma de decomposição canônica (NFKD)
        // Isso significa que caracteres compostos são decompostos em seus componentes básicos
        String nfdNormalizedString = Normalizer.normalize(text, Normalizer.Form.NFKD);

        // Cria um padrão que corresponde a todos os caracteres diacríticos combinados
        // (ou seja, acentos que são tratados como caracteres separados na forma NFKD)
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        // Substitui todos os caracteres diacríticos combinados na string normalizada por nada
        // e converte a string para maiúsculas
        return pattern.matcher(nfdNormalizedString).replaceAll("").toUpperCase();
    }
}