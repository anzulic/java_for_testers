package ru.stqa.reometry.figures;

import java.util.Objects;

public record Triangle(double a, double b, double c) {

    //Конструктор
    public Triangle {
        if (a < 0 || b < 0 || c < 0){
            throw new IllegalArgumentException ("Triangle side should be non-negative");
        }
        if ((a+b) < c || (b+c) < a || (c+a) < b){
            throw new IllegalArgumentException ("Triangle side should be non-negative");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.a, triangle.b) == 0 && Double.compare(this.b, triangle.c) == 0 && Double.compare(this.c, triangle.a) == 0)
                || (Double.compare(this.a, triangle.c) == 0 && Double.compare(this.b, triangle.a) == 0 && Double.compare(this.c, triangle.b) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
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
