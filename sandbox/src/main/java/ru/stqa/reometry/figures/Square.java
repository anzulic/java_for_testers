package ru.stqa.reometry.figures;

public class Square {
    //Печатает площадь квдрата
    public static void printSquareArea(double side) {
        String text = String.format("Площадь квадрата со стороной %f = %f", side, area(side));
        System.out.println(text);
    }

    //Вычисляет площадь квдрата.
    public static double area(double a) {
        return a * a;
    }

    //Вычисление периметра квадрата
    public static double perimetr(double a) {
        return 4*a;
    }
}
