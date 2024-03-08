package c_control;


import java.util.Scanner;

public class Ex07_for연습3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        
        char ch = scanner.next().charAt(0);

        if ('a'<=ch&&ch<='z') {
            for (char c = 'a'; c <= ch; c++) {
                System.out.print(c);
            }
        } else if ('A'<=ch&&ch<='Z') {
            for (char c = ch; c <= 'Z'; c++) {
                System.out.print(c);
            }
        } else {
            System.out.println("Error");
        }
    }
}
