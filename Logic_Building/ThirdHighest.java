package Logic_Building;

import java.util.*;

public class ThirdHighest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 7;
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter " + n + " input marks: ");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        if (set.size() < 3) {
            System.out.println(-1);
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Third largest distinct marks are: " + list.get(2));
    }
}

/*
 * Student Marks Analyzer
 * A university stores the marks of students in an array.
 * Your task is to determine the third highest distinct mark.
 * If fewer than three distinct marks exist, print -1.
 * Input Format
 * • First line contains integer N
 * • Second line contains N space-separated integers
 * Output Format
 * Print the third highest distinct mark.
 * Sample Input
 * 
 * 7
 * 78 91 85 91 67 88 78
 * 
 * Sample Output
 * 85
 */