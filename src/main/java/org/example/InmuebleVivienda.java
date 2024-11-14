package org.example;

// Clase base para todos los inmuebles que son para vivir
public abstract class InmuebleVivienda extends Inmueble {
    // Atributos comunes a todas las viviendas
    protected int numeroHabitaciones;
    protected int numeroBanos;

    // Constructor con los datos basicos de una vivienda
    public InmuebleVivienda(int identificadorInmobiliario, int areaMetrosCuadrados,
                            String direccion, int numeroHabitaciones, int numeroBanos) {
        // Llamo al constructor de Inmueble
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }

    // Metodo Getters y setters para obtener informacion de la vivienda
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public int getNumeroBanos() {
        return numeroBanos;
    }
}