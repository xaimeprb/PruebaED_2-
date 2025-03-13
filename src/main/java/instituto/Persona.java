/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * La clase Persona representa a un individuo con información personal.
 * Implementa la interfaz Comparable para poder ordenar objetos Persona.
 * <p>
 * Contiene información como NIF, nombre, género y fecha de nacimiento.
 * </p>
 * 
 * @author xaime
 * @version 1.0
 * @since 2025
 */
public class Persona implements Comparable<Persona> {

    private Nif nif;
    private String nombre;
    private char genero;
    private LocalDate nacimiento;

    /**
     * Constructor por defecto que inicializa los atributos con valores predeterminados.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que inicializa la persona con un NIF.
     * 
     * @param nif El número del NIF.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor que inicializa todos los atributos de la persona.
     * 
     * @param nif El número del NIF.
     * @param nombre El nombre completo de la persona.
     * @param genero El género de la persona.
     * @param dia Día de nacimiento.
     * @param mes Mes de nacimiento.
     * @param ano Año de nacimiento.
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento = LocalDate.of(ano, mes, dia);
    }

    /**
     * Obtiene el NIF de la persona.
     * 
     * @return El objeto Nif.
     */
    public Nif getNif() {
        return nif;
    }

    /**
     * Establece el NIF de la persona.
     * 
     * @param nif El objeto Nif.
     */
    public void setNif(Nif nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * 
     * @param nombre El nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el género de la persona.
     * 
     * @return El género (carácter) de la persona.
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Establece el género de la persona.
     * 
     * @param genero El género de la persona.
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona.
     * 
     * @return La fecha de nacimiento.
     */
    public LocalDate getNacimiento() {
        return nacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     * 
     * @param nacimiento La fecha de nacimiento.
     */
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    /**
     * Calcula la edad de la persona en años a partir de su fecha de nacimiento.
     * 
     * @return La edad en años.
     */
    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Genera una representación en cadena de la persona, mostrando el NIF, nombre y edad.
     * 
     * @return Cadena formateada con la información de la persona.
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Compara la persona con otra para determinar igualdad basada en el NIF.
     * 
     * @param a Otra persona.
     * @return {@code true} si los NIF son iguales, de lo contrario {@code false}.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Método sobrescrito para comparar objetos de tipo Persona.
     * 
     * @param obj Objeto a comparar.
     * @return {@code true} si son iguales, {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Compara esta persona con otra basada en el NIF.
     * 
     * @param o La otra persona.
     * @return Un número negativo, cero o positivo según el orden lexicográfico de los NIF.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }
}
