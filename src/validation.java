import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
    static String upperCasePattern = "[A-Z]";
    static String numberPattern = "\\d";
    static String specialCharacterPattern = "[!@#$%&*()_+=|<>?{}\\[\\]~-]";

    public static boolean isValidUpperCaseValidator(String text){
        boolean aux = false;
        char[] letras = text.toCharArray();
        for(int i=0;i<letras.length;i++) {
            String s = String.valueOf(letras[i]);
            aux = Pattern.matches(upperCasePattern, s);
            if(aux == true) {
                return aux;
            }
        }
        return aux;
    }

    public static boolean isValidNumberValidator(String text){
        boolean aux = false;
        char[] letras = text.toCharArray();
        for(int i=0;i<letras.length;i++) {
            String s = String.valueOf(letras[i]);
            aux = Pattern.matches(numberPattern, s);
            if(aux == true) {
                return aux;
            }
        }
        return aux;
    }

    public static boolean isValidSpecialCharacterValidator(String text){
        boolean aux = false;
        char[] letras = text.toCharArray();
        for(int i=0;i<letras.length;i++) {
            String s = String.valueOf(letras[i]);
            aux = Pattern.matches(specialCharacterPattern, s);
            if(aux == true) {
                return aux;
            }
        }
        return aux;
    }
}
