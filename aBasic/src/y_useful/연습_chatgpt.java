package y_useful;

import java.util.*;

public class 연습_chatgpt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        boolean programRunning = true;

        while (programRunning) {
            System.out.println("-----------------");
            System.out.println("n값을 입력해주세요");
            int n = sc.nextInt();
            int a = 0;
            char b = 65;

            if (n <= 6) {
                for (int i = 0; i < n; i++) {

                    for (int k = 0; k <= n - i - 1; k++) {
                        System.out.print((char) b);
                        b++;
                    }

                    for (int j = 0; j < i; j++) {
                        System.out.print(a);
                        a++;
                    }
                    System.out.println();
                }
            } else {
                System.out.println("n값이 6 이상입니다. 프로그램을 다시 실행합니다.");
                continue;
            }

            System.out.println("----------------");
            System.out.println("프로그램을 종료하시겠습니까? (y/n)");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("y")) {
                programRunning = false;
            }
        }

        sc.close();

	}

}
