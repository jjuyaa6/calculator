package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양수(0 포함) 2개를 입력하세요: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 >= 0) {
            System.out.println("첫 번째 숫자: " + num1);
        } else {
            System.out.println("첫 번째 숫자: 양수가 아닙니다");
        }

        if (num2 >= 0) {
            System.out.println("두 번째 숫자: " + num2);
        } else {
            System.out.println("두 번째 숫자: 양수가 아닙니다");
        }

    }
}
