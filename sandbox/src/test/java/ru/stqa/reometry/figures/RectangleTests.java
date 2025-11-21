package ru.stqa.reometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {

    @Test
    void cannotCreatRectangleWithNegativSide() {
        try {
            new Rectangle(-5.0, 1.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }
}
