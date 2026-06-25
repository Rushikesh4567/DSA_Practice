package Logic_Building;

import java.util.*;

public class ScholarshipRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N no. of students: ");
        int n = sc.nextInt();

        Integer first = null;
        Integer second = null;
        Integer third = null;

        System.out.println("Enter N students: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            // Skip duplicates
            if ((first != null && num == first) ||
                    (second != null && num == second) ||
                    (third != null && num == third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        System.out.println(third == null ? -1 : third);
    }
}