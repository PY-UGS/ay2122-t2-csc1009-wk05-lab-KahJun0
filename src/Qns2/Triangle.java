package Qns2;

public class Triangle extends Shape{
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return (super.dim1*super.dim2)/2;
    }
}
