package ru.stqa.reometry.figures;

import java.util.Objects;

public record Rectangle (double a, double b) {

    //Конструктордля прямоугольника
    public Rectangle {
        if (a < 0 || b < 0){
            throw new IllegalArgumentException ("Rectangle side should be non-negative");
        }
    }

    //Печатает площадь прямоугольника
    public static void printRectanglArea(double a, double b) {
        var text = String.format("Площадь прямоугольника со сторонами %f и %f = %f",a,b,rectanglArea(a,b));
        System.out.println(text);
    }

    //Вычисляем площадь прямоугольника
    private static double rectanglArea(double a, double b) {
        return a*b;
    }

//Просим среду автоматически сгенерировать метод equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(this.a, rectangle.a) == 0 && Double.compare(this.b, rectangle.b) == 0)
                || (Double.compare(this.a, rectangle.b) == 0 && Double.compare(this.b, rectangle.a) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
