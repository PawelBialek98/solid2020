package pl.zzpj2020.solid.lsp.shape;

public abstract class Shape implements ShapeInterface {

    protected double area;
    protected double circuit;

    public double getArea() {
        return area;
    }

    public double getCircuit() {
        return circuit;
    }
}
