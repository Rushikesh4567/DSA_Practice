package Day_41_to_55;

import java.util.*;

public class VaildParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(')
                    return false;

                if (ch == '}' && top != '{')
                    return false;

                if (ch == ']' && top != '[')
                    return false;

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string(paranthesis): ");

        String str = sc.next();

        if (isValid(str)) {
            System.out.println("This paranthesis is Valid");
        } else {
            System.out.println("This paranthesis is not valid");
        }
    }
}
