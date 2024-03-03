public class Main {
    public static void main(String[] args) {
        // Create an object of class 'Area'
        Area areaCalculator = new Area();

        // Call all three methods
        double rectangleArea = areaCalculator.rectangleArea(5, 8);
        double squareArea = areaCalculator.squareArea(4);
        double circleArea = areaCalculator.circleArea(3);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}