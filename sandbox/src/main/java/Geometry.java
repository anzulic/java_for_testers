public class Geometry {
    public static void main(String[] args) {

        printSquareArea(2.0);
        printSquareArea(5.0);
        printSquareArea(7.0);

        printRectanglArea(3.0, 5.0);
    }

    //Печатает площадь прямоугольника
    private static void printRectanglArea(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами " + a + "и" + b + " = " + rectanglArea(a,b));
    }

    //Вычисляем площадь прямоугольника
    private static double rectanglArea(double a, double b) {
        return a*b;
    }

    //Печатает площадь квдрата
    static void printSquareArea(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + squareArea(side));
    }
    //Вычисляет площадь квдрата.
    private static double squareArea(double a) {
        return a * a;
    }

}
