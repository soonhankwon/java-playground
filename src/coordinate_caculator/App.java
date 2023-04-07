package coordinate_caculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IllegalArgumentException{
        System.out.println("좌표를 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        try {
            Calculator calculator = new Calculator();
            calculator.printCalculateResult(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("좌표를 다시 입력해주세요.");
            main(args);
        }
    }
}
