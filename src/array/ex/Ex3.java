package array.ex;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("5개의숫자를입력하세요");


        for (int i = 0; i < arr.length; i++) {
            int num = scanner.nextInt();

            arr[i] = num;

        }
        System.out.println("출력");

        for (int i = arr.length; i < 0; i--) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : ""));

        }


    }
}
