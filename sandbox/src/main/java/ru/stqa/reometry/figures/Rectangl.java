package ru.stqa.reometry.figures;

public class Rectangl {
    //Печатает площадь прямоугольника
    public static void printRectanglArea(double a, double b) {
        var text = String.format("Площадь прямоугольника со сторонами %f и %f = %f",a,b,rectanglArea(a,b));
        System.out.println(text);
    }

    //Вычисляем площадь прямоугольника
    private static double rectanglArea(double a, double b) {
        return a*b;
    }
}
