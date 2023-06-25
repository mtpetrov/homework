import Shapes.Circle;
import Shapes.Shape;
import Shapes.Square;
import demo.Employee;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        Circle s1 = new Circle();
        System.out.println(s1.getArea(3.0));
        System.out.println(s1);
        Shape s2 = new Circle(); // Upcast Circle to Shape
        System.out.println(s2.getArea(3.0));
        System.out.println(s2);
        Circle s3 = (Circle) s2; // Downcast back to Circle
        System.out.println(s3);
        System.out.println(s2.getPerimeter(3.0));

        Square s5 = new Square();
        System.out.println(s5.getArea(6.0));
        System.out.println(s5.getPerimeter(6.0));


    }

}