package triangle;

public class Triangle {
    private double side1 = 1.0, side2 = 1.0, side3 = 3.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double area;
        double p = getPerimeter() / 2;
        area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }

    public double getPerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }

    public void checkTypeTriangle() {
        double a = getSide1();
        double b = getSide2();
        double c = getSide3();
        if (a == b && b == c) {
            System.out.println("Tam giác đều");
        } else if ((a == b && (a * a + b * b == c * c))
                || (a == c && (a * a + c * c == b * b))
                || (b == c && (b * b + c * c == a * a))) {
            System.out.println("Tam giác vuông cân");
        } else if ((a * a + b * b == c * c)
                || (a * a + c * c == b * b)
                || (b * b + c * c == a * a)) {
            System.out.println("Tam giác vuông");
        } else if ((a == b)
                || (a == c )
                || (b == c)) {
            System.out.println("Tam giác cân");
        } else System.out.println("Tam giác thường");
    }

    @Override
    public String toString() {

        return "Triangle {" +
                "side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ",Perimeter = " + getPerimeter() +
                ", Area = " + getArea() +
                '}';
    }
}
