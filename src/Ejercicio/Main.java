package Ejercicio;

public class Main {
    public static void main(String[] args) {
        Alumno uno= new Alumno("Juan", 20);
        Alumno dos= new Alumno("Pedro", 21);
        Alumno tres= new Alumno("Maria", 22);

        uno.adMaterias(new Asignatura("Matematicas", 3.5));
        uno.adMaterias(new Asignatura("Fisica", 3.0));
        uno.adMaterias(new Asignatura("Quimica", 4.0));
        System.out.println(uno);
        System.out.println("------------------------------------------");

        dos.adMaterias(new Asignatura("Matematicas", 4.0));
        dos.adMaterias(new Asignatura("Fisica", 2.0));
        dos.adMaterias(new Asignatura("Quimica", 3.0));
        System.out.println(dos);
        System.out.println("------------------------------------------");

        tres.adMaterias(new Asignatura("Matematicas", 2.0));
        tres.adMaterias(new Asignatura("Fisica", 3.0));
        tres.adMaterias(new Asignatura("Quimica", 3.5));
        System.out.println(tres);
        System.out.println("------------------------------------------");


    }
}
