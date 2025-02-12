
public class Demo083 {
    public static void main(String[] args) {
        String input = "Elephant";

        if (input.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }

        char firstChar = Character.toLowerCase(input.charAt(0));

        if (isVowel(firstChar)) {
            System.out.println("The first character '" + input.charAt(0) + "' is a vowel.");
        } else if (Character.isLetter(firstChar)) {
            System.out.println("The first character '" + input.charAt(0) + "' is a consonant.");
        } else {
            System.out.println("The first character '" + input.charAt(0) + "' is not a letter.");
        }
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}