package Day21to30.Traversal;

public class StringTraversalOperations {

    // 1. Count Vowels (A, E, I, O, U - case-insensitive)
    public static int countVowels(String str) {
        if (str == null)
            return 0;
        int count = 0;
        String lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // 2. Count Consonants (Alphabet characters that are not vowels)
    public static int countConsonants(String str) {
        if (str == null)
            return 0;
        int count = 0;
        String lower = str.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    count++;
                }
            }
        }
        return count;
    }

    // 3. Count Uppercase Letters
    public static int countUppercase(String str) {
        if (str == null)
            return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // 4. Count Lowercase Letters
    public static int countLowercase(String str) {
        if (str == null)
            return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // 5. Count Digits
    public static int countDigits(String str) {
        if (str == null)
            return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // 6. Count Spaces
    public static int countSpaces(String str) {
        if (str == null)
            return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // 7. Reverse String using Traversal
    public static String reverseString(String str) {
        if (str == null)
            return null;
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // 8. Print Alternate Characters (e.g., index 0, 2, 4, ...)
    public static String printAlternateCharacters(String str) {
        if (str == null)
            return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // 9. Count Words (Handling multiple consecutive spaces safely)
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    // --- Main Method for Demonstration ---
    public static void main(String[] args) {
        String sample = "Hello World! Java 2026.";

        System.out.println("Original String: \"" + sample + "\"\n");
        System.out.println("1. Vowels count: " + countVowels(sample));
        System.out.println("2. Consonants count: " + countConsonants(sample));
        System.out.println("3. Uppercase count: " + countUppercase(sample));
        System.out.println("4. Lowercase count: " + countLowercase(sample));
        System.out.println("5. Digits count: " + countDigits(sample));
        System.out.println("6. Spaces count: " + countSpaces(sample));
        System.out.println("7. Reversed string: \"" + reverseString(sample) + "\"");
        System.out.println("8. Alternate characters: \"" + printAlternateCharacters(sample) + "\"");
        System.out.println("9. Word count: " + countWords(sample));
    }
}