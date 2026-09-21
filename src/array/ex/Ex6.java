package array.ex;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("입력 받을 숫자의 개수를 입력하세요.");
        int count = scanner.nextInt();


        int[] students = new int[count];

        int greaterNum = 0;
        int lessNum = 0;

        System.out.println(count + "개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            int input = scanner.nextInt();

            students[i] = input;

            greaterNum = (greaterNum < input) ? students[i] : greaterNum;

            if (lessNum == 0) {
                lessNum = input;
            } else {
                lessNum = (lessNum < input) ? lessNum : students[i];
            }

        }

        System.out.println("가장큼 : " + greaterNum);
        System.out.println("가장작음 : " + lessNum);
    }
}
