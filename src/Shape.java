abstract class Shape {
    abstract double rectangleArea(double length, double breadth);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends Shape {
    double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    double squareArea(double side) {
        return side * side;
    }

    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}


