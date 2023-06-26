package Shapes;

import java.util.Scanner;

public class Circle extends Shape{
    @Override
    public Double getArea(Double radius) {
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();

        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public Double getPerimeter(Double radius) {
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        return 2 * Math.PI * radius;
    }
}
