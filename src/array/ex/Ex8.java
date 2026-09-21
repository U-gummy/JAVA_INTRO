package array.ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생수를 입력하세요");
        int studentCount = scanner.nextInt();

        int[][] scope = new int[studentCount][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번째 학생 점수");

            for (int j = 0; j < subject.length; j++) {
                System.out.print(subject[j] + "점수 : ");
                scope[i][j] = scanner.nextInt();
            }

        }

        for (int i = 0; i < studentCount; i++) {
            int sum = 0;

            for (int j = 0; j < subject.length; j++) {
                sum += scope[i][j];
            }

            double average = (double) sum / subject.length;
            System.out.println((i + 1) + "번째 총점: " + sum + ", 평균: " + average);
        }

    }
}
