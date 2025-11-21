package ru.stqa.reometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea(){
        // В тестовом вреймворке есть специальный класс, чтобы сравнить значения
        //Автоматически добавляется нужный импорт - класс находитсяв другом пакете
        double result = Square.area(5.0);
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void canCalculateArea2(){
        // Тест площади через объект
        //Вызываем конструктор обекта и передаем в качестве параметра сторону квадрата
        var s = new Square(5.0);
        //Затем вызываем метод area в этом объекте.Параметры не передаем - берет из объекта
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



}
