package ru.stqa.reometry.figures;

public class Rectangl {

    //Свойства объекта
    private double a;
    private double b;

    //Конструктордля прямоугольника
    public Rectangl (double a, double b) {
        this.a = a;
        this.b = b;
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
}
