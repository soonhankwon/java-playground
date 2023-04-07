package coordinate_caculator;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("좌표를 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        InputGenerator inputGenerator = new InputGenerator();
        List<Pos> pos = inputGenerator.convertInput(scanner.nextLine());

        System.out.println(Pos.calculateDistance(pos.get(0), pos.get(1)));
    }
}
