package ru.stqa.reometry;

import ru.stqa.reometry.figures.Rectangl;
import ru.stqa.reometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {

        Square.printSquareArea(2.0);
        Square.printSquareArea(5.0);
        Square.printSquareArea(7.0);

        Rectangl.printRectanglArea(3.0, 5.0);
    }

}
