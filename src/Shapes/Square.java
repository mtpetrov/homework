package Shapes;

import java.util.Scanner;

public class Square extends Shape{
    @Override
    public Double getArea(Double sideLength) {
Scanner scanner = new Scanner(System.in);
sideLength = scanner.nextDouble();
return sideLength * sideLength;
    }

    @Override
    public Double getPerimeter(Double sideLength) {
        Scanner scanner = new Scanner(System.in);
        sideLength = scanner.nextDouble();
        return 4 * sideLength;
    }
}
