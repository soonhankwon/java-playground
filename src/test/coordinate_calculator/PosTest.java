package test.coordinate_calculator;

import coordinate_caculator.Pos;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}
