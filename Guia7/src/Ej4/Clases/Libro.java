package Ej4.Clases;

public class Libro {
    private String nombreLibro;

    public Libro() {
    }

    public Libro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombreLibro='" + nombreLibro + '\'' +
                '}';
    }
}
