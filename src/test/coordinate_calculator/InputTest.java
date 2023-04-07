package test.coordinate_calculator;

import coordinate_caculator.Calculator;
import coordinate_caculator.Pos;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputTest extends Calculator{
    @Test
    @DisplayName("문자열 괄호 제거 및 -로 스플릿 테스트")
    void convertInput() {
        String input = "(10,10)-(14,15)";
        String[] result = input.replaceAll("[()]","").split("-");

        assertThat(result[0]).isEqualTo("10,10");
        assertThat(result[1]).isEqualTo("14,15");
    }

    @Test
    @DisplayName("문자열 객체 변환 테스트")
    void convertStringToPos() {
        String input = "(10,10)-(14,15)";
        List<Pos> posList = super.createPosList(input);

        assertThat(posList.get(0)).isEqualTo(new Pos(10,10));
        assertThat(posList.get(1)).isEqualTo(new Pos(14,15));
    }
}
