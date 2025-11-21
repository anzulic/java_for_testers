package ru.stqa.reometry;

import ru.stqa.reometry.figures.Rectangl;
import ru.stqa.reometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {

        Square.printSquareArea(new Square(7.0));


        Rectangl.printRectanglArea(3.0, 5.0);
    }

}
