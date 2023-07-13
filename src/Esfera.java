public class Esfera extends FiguraGeometrica {
    private double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 0; // No se aplica para una esfera
    }

    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularVolumen() {
        return (4 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}