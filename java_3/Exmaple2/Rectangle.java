package Exmaple2;

public class Rectangle implements Shape {
    private double chieudai ;
    private double chieurong;
    public Rectangle(double chieudai, double chieurong){
        this.chieudai=chieudai;
        this.chieurong=chieurong;
    }
    @Override
    public double getArea() {
        return chieudai*chieurong;
    }

    @Override
    public double getPerimeter() {
        return 2*(chieudai+chieurong);
    }
    
}
