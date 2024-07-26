package calculator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Level 1 - 7 ArrayList 선언 및 생성
        ArrayList<Integer> intList = new ArrayList<Integer>();

        //  Level 1 - 5
        //int[] intArray = new int[10];
        //int arrayIndex = 0;

        //  Level 1 - 4
        while (true) {
            //  Level 1 - 1
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.print("양수(0 포함)를 입력하세요 : ");
                num1 = sc.nextInt();
            }
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.print("양수(0 포함)를 입력하세요 : ");
                num2 = sc.nextInt();
            }

            //  Level 1 - 2
            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /) : ");
            /*  charAt() 메서드는 매개변수로 char 타입으로 반환하고자 하는 문자열의 위치(index)를 받는다.  */
            char operator = sc.next().charAt(0);

            //  Level 1 - 3
            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.print("나눗셈 연산에서 분모(두번째 숫자)에 0이 입력될 수 없어, 다시 입력해 주세요 : ");
                        num2 = sc.nextInt();
                        result = num1 / num2;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.print("사칙 연산자가 아닙니다. 다시 입력해 주세요 : ");
                    operator = sc.next().charAt(0);
                    break;
            }

            //intArray[arrayIndex] = result;
            //arrayIndex++;

            System.out.println("결과 : " + num1 + " " + operator + " " + num2 + " = " + result);

            // Level 1 - 7 ArrayList
            /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
            intList.add(result);
            System.out.println(intList.toString());

            System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) : ");
            String removeStr = sc.next();
            if (removeStr.equals("remove")) {
                intList.remove(0);
            }

            //  Level 1 - 4
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            String exitStr = sc.next();
            if (Objects.equals(exitStr, "exit")) {
                break;
            }
        }
    }
}
