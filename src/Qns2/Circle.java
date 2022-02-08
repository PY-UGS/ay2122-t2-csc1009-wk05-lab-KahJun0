package Qns2;

public class Circle extends Shape{
    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return super.PI*Math.pow(super.dim1, 2);
    }
}
