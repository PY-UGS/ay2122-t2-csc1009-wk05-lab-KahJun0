package Qns2;

public abstract class Shape {
    public double dim1;
    public double dim2;
    public double PI = Math.PI;
    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract double area();
}
