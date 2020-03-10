package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Shape {

    protected double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void calculateCircuit() {
        circuit = 2*Math.PI*r;
    }

    @Override
    public void calculateArea() {
        area = Math.PI*r*r;
    }
}
