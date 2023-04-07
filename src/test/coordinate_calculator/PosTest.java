package test.coordinate_calculator;

import coordinate_caculator.Pos;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PosTest {
    @Test
    void maxPosNumber() {
        assertThatThrownBy(() -> {
            Pos pos = new Pos(25,25);
                }).isInstanceOf(IllegalArgumentException.class);
    }
}
