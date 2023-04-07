package test.coordinate_calculator;

import coordinate_caculator.Pos;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PosTest {
    @Test
    @DisplayName("X, Y좌표 모두 최대 24까지만 입력 테스트")
    void maxPosNumber() {
        assertThatThrownBy(() -> {
            Pos pos = new Pos(25,25);
                }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("X, Y좌표 모두 0이하 입력 불가 테스트")
    void minPosNumber() {
        assertThatThrownBy(() -> {
            Pos pos = new Pos(-1,1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("두 좌표 사이 거리 계산 테스트, DecimalFormat")
    void calculateDistanceV1() {
        Pos pos1 = new Pos(10,10);
        Pos pos2 = new Pos(14,15);

        double num1 = Math.pow(pos1.getX() - pos2.getX(), 2);
        double num2 = Math.pow(pos1.getY() - pos2.getY(), 2);

        DecimalFormat df = new DecimalFormat("0.000000");
        double distance = Math.sqrt(num1 + num2);
        String result = df.format(distance);

        assertThat(num1).isEqualTo(16);
        assertThat(num2).isEqualTo(25);
        assertThat(result).isEqualTo("6.403124");
    }

    @Test
    @DisplayName("두 좌표 사이 거리 계산 테스트, Math.round")
    void calculateDistanceV2() {
        Pos pos1 = new Pos(10,10);
        Pos pos2 = new Pos(14,15);

        double num1 = Math.pow(pos1.getX() - pos2.getX(), 2);
        double num2 = Math.pow(pos1.getY() - pos2.getY(), 2);
        double num3 = Math.sqrt(num1 + num2);

        double distance = Math.round(num3 * 1000000) / 1000000.0;

        assertThat(num1).isEqualTo(16);
        assertThat(num2).isEqualTo(25);
        assertThat(num3).isEqualTo(6.4031242374328485);
        assertThat(distance).isEqualTo(6.403124);
    }
}
