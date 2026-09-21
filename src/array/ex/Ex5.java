package array.ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("입력 받을 숫잔의 개수를 입력하세요.");
        int count = scanner.nextInt();


        int[] students = new int[count];

        int total = 0;

        System.out.println(count + "개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            int input = scanner.nextInt();

            students[i] = input;
            total += students[i];
        }

        double average = (double) total / students.length;

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
