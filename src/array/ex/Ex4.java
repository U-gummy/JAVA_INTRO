package array.ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] students = new int[5];

        int total = 0;

        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < students.length; i++) {
            int input = scanner.nextInt();

            students[i] = input;
            total += students[i];
        }

        double average = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
