/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 * La clase Curso representa un curso del instituto.
 * Contiene el nombre del curso y una lista ordenada de alumnos.
 * <p>
 * Permite aniadir alumnos y generar una representación en cadena de texto
 * con la información del curso.
 * </p>
 * 
 * @author xaime
 * @version 1.0
 * @since 2025
 */
public class Curso {

    private String nombre;
    private TreeSet<Persona> listaAlumnos;

    /**
     * Obtiene el nombre del curso.
     * 
     * @return el nombre del curso.
     */
    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor que inicializa el curso con un nombre y una lista vacía de alumnos.
     * 
     * @param nombre El nombre del curso.
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Retorna una representación en cadena del curso y sus alumnos.
     * 
     * @return Información formateada del curso y su lista de alumnos.
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Añade un alumno a la lista del curso.
     * 
     * @param p El objeto Persona a añadir.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}
