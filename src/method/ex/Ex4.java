package method.ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택 :");
            int option = scanner.nextInt();


            if (option == 1) {
                System.out.print("입금액을 입력하세요: ");
                int num = scanner.nextInt();
                total = deposit(total, num);
            } else if (option == 2) {
                System.out.print("출금 액을 입력하세요: ");
                int num = scanner.nextInt();
                total = withdraw(total, num);
            } else if (option == 3) {
                System.out.println("현재 잔액: " + total + "원");
            } else if (option == 4) {
                System.out.println("종료합니다. ");
                break;
            } else {
                System.out.println("잘못입력함");
            }
        }


    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " +
                    balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;


    }
}
