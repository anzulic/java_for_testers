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
