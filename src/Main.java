import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            File file = new File("src/source");
            Scanner scanner = new Scanner(file);


            Shape shape = new Shape(10);


            while (scanner.hasNextDouble()) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                Point point = new Point(x, y);
                shape.addPoint(point);
            }
            scanner.close();


            System.out.println("Периметр: " + shape.calculatePerimeter());
            System.out.println("Самая длинная сторона: " + shape.getLongestSide());
            System.out.println("Средняя длина стороны: " + shape.getAverageSide());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        }
    }
}