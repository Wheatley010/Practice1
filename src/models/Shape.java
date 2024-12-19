package models;

public class Shape {
    public Point[] points; // Массив точек
    public int size; // Текущее количество точек


    public Shape(int maxPoints) {
        points = new Point[maxPoints];
        size = 0;
    }


    public void addPoint(Point point) {
        points[size] = point;
        size++;
    }


    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < size; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % size];
            perimeter += current.distance(next);
        }
        return perimeter;
    }


    public double getLongestSide() {
        double longest = 0;
        for (int i = 0; i < size; i++) {
            Point current = points[i];
            Point next = points[(i + 1) % size];
            double length = current.distance(next);
            if (length > longest) {
                longest = length;
            }
        }
        return longest;
    }


    public double getAverageSide() {
        if (size < 2) return 0;
        return calculatePerimeter() / size;
    }
}
