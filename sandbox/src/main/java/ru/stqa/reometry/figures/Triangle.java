package ru.stqa.reometry.figures;

public class Triangle {

    //Свойства объекта
    private double a;
    private double b;
    private double c;

    //Конструктор
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException ("Triangle side should be non-negative");
        }
        if ((a+b) >= c || (b+c) >= a || (c+a) >= b){
            throw new IllegalArgumentException ("Triangle side should be non-negative");
        }
    }

    //Метод для периметра
    public double perimetr(){
        return this.a +this.b + this.c;
    }

    //Метод для площади
    public double arae(){
        var p = (this.perimetr()/2);
        return Math.sqrt(p * (p-this.a) * (p-this.b) * (p - this.c));
    }
}
