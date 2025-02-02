package SwichCase;

public class VowelChecker {
    public void checkVowel(char letter) {
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a vowel");
                break;
            default:
                System.out.println(letter + " is not a vowel");
        }
    }

    public static void main(String[] args) {
        VowelChecker checker = new VowelChecker();

        checker.checkVowel('a');
        checker.checkVowel('A');
        checker.checkVowel('H');
        checker.checkVowel('h');
    }
}
