package Exmaple2;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Shape> list=new ArrayList<>();
        list.add(new Rectangle(4, 5));
        list.add(new Rectangle(8, 9));
        list.add(new Rectangle(9, 10));
        list.add(new Rectangle(11, 12));
        list.add(new Rectangle(6, 9));
        int i=0;
        for (Shape shape : list) {
            System.out.println(" dien tich cua hinh thu "+i+" "+shape.getArea());
            System.out.println(" chu vi cua hinh thu "+i+" "+shape.getPerimeter());
            i++;
            System.out.println();
        }
    }
}
