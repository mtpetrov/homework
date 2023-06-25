package Shapes;

import java.util.Scanner;

public class Square extends Shape{
    @Override
    double getArea(double sideLength) {
Scanner scanner = new Scanner(System.in);
sideLength = scanner.nextDouble();
return sideLength * sideLength;
    }

    @Override
    double getPerimeter(double sideLength) {
        Scanner scanner = new Scanner(System.in);
        sideLength = scanner.nextDouble();
        return 4 * sideLength;
    }
}
