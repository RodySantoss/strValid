import java.util.ArrayList;
import java.util.List;

public class strValid extends validation{

    public static boolean IsValid(String text, String optionSelect) {
        switch (optionSelect) {
            case "AllValid":
                return isValidAll(text);

            case "UpperCaseAndSpecialCharacter":
                return upperCaseSpecialCaracter(text);

            case "UpperCaseAndNumber":
                return upperCaseNumber(text);

            case "UpperCase":
                return isValidUpperCase(text);

            case "Number":
                return isValidNumber(text);

            case "NumberAndSpecialCharacter":
                return numberSpecialCharacter(text);

            case "SpecialCharacter":
                return isValidSpecialCaracter(text);

            default:
                return false;
        }
    }

    public static boolean isValidAll(String text){
        List<Boolean> list=new ArrayList<Boolean>();

        Thread t1 = new Thread(){
            public void run() {
                list.add(isValidUpperCaseValidator(text));
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                list.add(isValidNumberValidator(text));
            }
        };
        Thread t3 = new Thread(){
            public void run() {
                list.add(isValidSpecialCharacterValidator(text));
            }
        };
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(list.contains(false)) {
            return false;
        }
        return true;
    }

    public static boolean numberSpecialCharacter(String text){
        List<Boolean> list=new ArrayList<Boolean>();

        Thread t1 = new Thread(){
            public void run() {
                list.add(isValidNumberValidator(text));
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                list.add(isValidSpecialCharacterValidator(text));
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(list.contains(false)) {
            return false;
        }
        return true;
    }

    public static boolean upperCaseNumber(String text){
        List<Boolean> list=new ArrayList<Boolean>();

        Thread t1 = new Thread(){
            public void run() {
                list.add(isValidUpperCaseValidator(text));
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                list.add(isValidNumberValidator(text));
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(list.contains(false)) {
            return false;
        }
        return true;
    }

    public static boolean upperCaseSpecialCaracter(String text){
        List<Boolean> list=new ArrayList<Boolean>();

        Thread t1 = new Thread(){
            public void run() {
                list.add(isValidUpperCaseValidator(text));
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                list.add(isValidSpecialCaracter(text));
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(list.contains(false)) {
            return false;
        }
        return true;
    }

    public static boolean isValidNumber(String text){
        return isValidNumberValidator(text);
    }

    public static boolean isValidSpecialCaracter(String text){
        return isValidSpecialCharacterValidator(text);
    }

    public static boolean isValidUpperCase(String text){
        return isValidUpperCaseValidator(text);
    }
}
