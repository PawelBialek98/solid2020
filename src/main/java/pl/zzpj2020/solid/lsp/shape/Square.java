package pl.zzpj2020.solid.lsp.shape;

public class Square extends Shape {

    protected double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void calculateArea() {
        area = a*a;
    }

    @Override
    public void calculateCircuit() {
        circuit = 4*a;
    }
}
