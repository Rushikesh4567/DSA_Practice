package HashSet;

import java.util.*;

public class HappyNumber {

    public static int digitsquaressum(int n) {

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int num = 19;

        while (num != 1 && !set.contains(num)) {
            set.add(num);
            num = digitsquaressum(num);
        }

        if (num == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }
    }
}
/*
 * Happy Number
 * Example
 * 19
 * 
 * Output
 * 
 * HAPPY
 * Logic
 * 
 * Repeatedly calculate
 * 
 * digit² + digit² + ...
 * 
 * If
 * 
 * reaches 1 → Happy
 * repeats a number → Not Happy
 * 
 * Use HashSet to detect repetition.
 */