package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape{
    protected double a;
    protected double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public void calculateCircuit() {
        circuit = 2*(a+b);
    }

    @Override
    public void calculateArea() {
        area = a*b;
    }
}
