package ru.stqa.reometry.figures;

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
}
