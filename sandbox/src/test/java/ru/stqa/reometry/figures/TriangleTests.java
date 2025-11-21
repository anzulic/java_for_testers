package ru.stqa.reometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimetr(){

        var s = new Triangle(2.0,2.0,2.0);

        Assertions.assertEquals(6.0, s.perimetr());
    }

    @Test
    void canCalculateArea(){

        var s = new Triangle(2.0,2.25,3.25);
        double result = s.arae();
        Assertions.assertEquals(2.0, Math.round(result));
    }

    @Test
    void cannotCreatTriangleWithNegativSide () {
        try {
            new Triangle(-5.0,2.0,2.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    }



