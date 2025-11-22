package ru.stqa.reometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea(){
        double result = Square.area(5.0);
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculateArea2(){
        var s = new Square(5.0);
        double result = s.area();
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculatePerimetr2(){
        // Тест периметра через объект
        //Вызываем конструктор обекта и передаем в качестве параметра сторону квадрата
        var ss = new Square(5.0);
        //Затем вызываем метод area в этом объекте.Параметры не передаем - берет из объекта
        double result = ss.perimetr();
        Assertions.assertEquals(25.0, result);
    }
    @Test
    void canCalculatePerimetr(){
        Assertions.assertEquals(20.0, Square.perimetr(5.0));
    }

    @Test
    void cannotCreatSquareWithNegativSide (){
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }



    }

    @Test
    void testEquality (){
        var s1 = new Square(5.0);
        var s2 = new Square(5.0);
        Assertions.assertEquals(s1,s2);
    }
}
