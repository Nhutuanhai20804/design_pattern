package Example;
// File: Main.java
import java.util.ArrayList;
// Lớp chứa phương thức main để kiểm tra các hình
public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các hình
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0)); // Hình tròn
        shapes.add(new Rectangle(4.0, 6.0)); // Hình chữ nhật

        // In thông tin diện tích và chu vi của từng hình
        for (Shape shape : shapes) {
            System.out.println("tinh dien tich ");
            System.out.println("Area: " + shape.getArea());
            System.out.println("tinh chu vi");
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println();
        }
    }
}
