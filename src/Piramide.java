public class Piramide extends FiguraGeometrica {
    private double base;
    private double altura;

    public Piramide(double base, double altura) {
        super("Pirámide");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return 0; // No se aplica para una pirámide
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.pow(base, 2);
        double areaLateral = base * altura;
        return areaBase + areaLateral;
    }

    @Override
    public double calcularVolumen() {
        return (base * base * altura) / 3;
    }

}