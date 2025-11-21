package ru.stqa.reometry.figures;

public class Rectangle {

    //Свойства объекта
    private double a;
    private double b;

    //Конструктордля прямоугольника
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
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
}
