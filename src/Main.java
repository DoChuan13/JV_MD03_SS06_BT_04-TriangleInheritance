import shape.Shape;
import triangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideValue;
        System.out.println("-------------Shape-------------");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("yellow", false);
        System.out.println(shape);
        System.out.println("-------------Triangle-------------");
        Triangle triangle = new Triangle();
        boolean check;
        do {
            while (true) {
                System.out.print("Nhập độ dài cạnh 1: ");
                sideValue = Double.parseDouble(input.nextLine());
                if (sideValue > 0) {
                    triangle.setSide1(sideValue);
                    break;
                }
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại");
            }
            while (true) {
                System.out.print("Nhập độ dài cạnh 2: ");
                sideValue = Double.parseDouble(input.nextLine());
                if (sideValue > 0) {
                    triangle.setSide2(sideValue);
                    break;
                }
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại");
            }
            while (true) {
                System.out.print("Nhập độ dài cạnh 3: ");
                sideValue = Double.parseDouble(input.nextLine());
                if (sideValue > 0) {
                    triangle.setSide3(sideValue);
                    break;
                }
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại");
            }
            double a = triangle.getSide1();
            double b = triangle.getSide2();
            double c = triangle.getSide3();
            check = (a + b > c && a + c > b && b + c > a);
            if (check) {
                break;
            } else {
                System.out.println("Giá trị 3 cạnh không thỏa mãn điều kiện tam giác, vui lòng nhập lại");
            }
        } while (!check);
        System.out.println("Triangle Info ==> " + triangle);
        triangle.checkTypeTriangle();
    }
}
