public class app extends strValid{
    public static void main(String[] args) {
        System.out.println("AllValid - Valido:");
        System.out.println(IsValid("A@12b", "AllValid"));

        System.out.println("AllValid - Invalido:");
        System.out.println(IsValid("A2b", "AllValid"));

        System.out.println("UpperCaseAndSpecialCharacter - Valido:");
        System.out.println(IsValid("A@12b", "UpperCaseAndSpecialCharacter"));

        System.out.println("UpperCaseAndSpecialCharacter - Invalido:");
        System.out.println(IsValid("@12b", "UpperCaseAndSpecialCharacter"));

        System.out.println("UpperCaseAndNumber - Valido:");
        System.out.println(IsValid("A@12b", "UpperCaseAndNumber"));

        System.out.println("UpperCaseAndNumber - Invalido:");
        System.out.println(IsValid("A@b", "UpperCaseAndNumber"));

        System.out.println("UpperCase - Valido:");
        System.out.println(IsValid("A@12b", "UpperCase"));

        System.out.println("UpperCase - Invalido:");
        System.out.println(IsValid("@12b", "UpperCase"));

        System.out.println("Number - Valido:");
        System.out.println(IsValid("A@12b", "Number"));

        System.out.println("Number - Invalido:");
        System.out.println(IsValid("A@b", "Number"));

        System.out.println("NumberAndSpecialCharacter - Valido:");
        System.out.println(IsValid("A@12b", "NumberAndSpecialCharacter"));

        System.out.println("NumberAndSpecialCharacter - Invalido:");
        System.out.println(IsValid("A2b", "NumberAndSpecialCharacter"));

        System.out.println("SpecialCharacter - Valido:");
        System.out.println(IsValid("A@12b", "SpecialCharacter"));

        System.out.println("SpecialCharacter - Invalido:");
        System.out.println(IsValid("A12b", "SpecialCharacter"));
    }
}
