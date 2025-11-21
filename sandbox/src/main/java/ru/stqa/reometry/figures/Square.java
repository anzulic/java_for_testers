package ru.stqa.reometry.figures;

public class Square {

    //Каждый объект типа Square будет иметь свойство side
    private double side;

    //Создаем конструктор объекта
    public Square(double side) {
        this.side = side;

    }

    //Функция Печатает площадь квдрата
    public static void printSquareArea(Square s){
        String text = String.format("Площадь квадрата со стороной %f = %f", s.side, s.area());
        System.out.println(text);
    }

    //Функция Вычисляет площадь квдрата.
    public static double area(double a) {
        return a * a;
    }

    //Функция Вычисление периметра квадрата
    public static double perimetr(double a) {
        return 4*a;
    }

    //Метод area для объекта Square
    public double area() {
       return this.side * this.side;
    }
    //Метод peri для объекта Square
    public double perimetr() {
       return  4 * this.side;
    }
}
