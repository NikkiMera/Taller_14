import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularPerimetro();
    public abstract double calcularArea();
    public abstract double calcularVolumen();

    public String getNombre() {
        return nombre;
    }

    public void registrarCalculo(String calculo, double valor) {
    }


}