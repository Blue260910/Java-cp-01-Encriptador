import java.text.Normalizer;
import java.util.regex.Pattern;
public class NormalizadorDeTexto {
 public static String removeAccents(String text) {
    String nfdNormalizedString = Normalizer.normalize(text, Normalizer.Form.NFKD);
     Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
     return pattern.matcher(nfdNormalizedString).replaceAll("").toUpperCase();
 }
 
}
