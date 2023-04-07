package coordinate_caculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {
    public void printCalculateResult(String input) {
        List<Pos> list = createPosList(input);
        System.out.println("두 점 사이의 거리는 " + calculateDistance(list.get(0), list.get(1)));
    }

    protected List<Pos> createPosList(String input) {
        String[] strings = convertInput(input);

        return Arrays.stream(strings)
                .map(s -> s.split(","))
                .map(parts -> new Pos(Integer.parseInt(parts[0]), Integer.parseInt(parts[1])))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    protected double calculateDistance(Pos pos1, Pos pos2) {
        double result = Math.sqrt(Math.pow(pos1.getX() - pos2.getX(), 2)
                + Math.pow(pos1.getY() - pos2.getY(), 2));

        return Math.round(result * 1000000) / 1000000.0;
    }

    private String[] convertInput(String input) {
        return input.replaceAll("[()]", "").split("-");
    }
}
