package ru.stqa.reometry.figures;

public class Square {
    //Печатает площадь квдрата
    public static void printSquareArea(double side) {
        String text = String.format("Площадь квадрата со стороной %f = %f", side, squareArea(side));
        System.out.println(text);
    }

    //Вычисляет площадь квдрата.
    private static double squareArea(double a) {
        return a * a;
    }
}
