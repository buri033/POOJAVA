package Ejercicio;

public class Asignatura {

    private String nombre;
    private double nota;

    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }//fin constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }//fin getters y setters

    public String estado() {
        return nota >= 3.5 ? "Aprobado" : "Reprobado";
    }//fin metodo

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ",\nnota=" + nota +
                ", \nAprobó?=" + estado() +
                '}';
    }
}


