package Shapes;

import java.util.Scanner;

public class Circle extends Shape{
    @Override
    double getArea(double radius) {
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();

        return Math.PI * Math.pow(radius,2);
    }

    @Override
    double getPerimeter(double radius) {
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        return 2 * Math.PI * radius;
    }
}
