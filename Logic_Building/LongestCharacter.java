package Logic_Building;

import java.util.*;

public class LongestCharacter {

    public static int LongestNonRepeating(String s) {

        int maxlength = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(right));
                left++;
            }

            set.add(s.charAt(right));

            maxlength = Math.max(maxlength, right - left + 1);

        }

        return maxlength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String str = sc.next();

        int l = LongestNonRepeating(str);
        System.out.println("Longest repeating substring length is:  " + l);
    }
}
