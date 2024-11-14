package org.example;

// Clase base para todos los tipos de departamentos
public abstract class Departamento extends InmuebleVivienda {
    // Todos los departamentos pagan administración
    protected double valorAdministracion;

    //datos necesarios para un departamento
    public Departamento(int identificadorInmobiliario, int areaMetrosCuadrados,
                        String direccion, int numeroHabitaciones, int numeroBanos,
                        double valorAdministracion) {
        // Llamo al constructor de InmuebleVivienda con los datos básicos
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanos);
        this.valorAdministracion = valorAdministracion;
    }
}

// ApartaEstudio es un tipo específico de departamento
class ApartaEstudio extends Departamento {
    public ApartaEstudio(int identificadorInmobiliario, int areaMetrosCuadrados,
                         String direccion, double valorAdministracion) {
        // Apartaestudio siempre tiene 1 habitación y 1 baño
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, 1, 1,
                valorAdministracion);
    }

    // Los apartaestudios valen 200 por metro cuadrado
    @Override
    public double calcularValorCompra() {
        return areaMetrosCuadrados * 200;
    }

    // Metodo Getters y setters específicos para manejar el valor de administración
    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }
}

// DepartamentoFamiliar es otro tipo de departamento
class DepartamentoFamiliar extends Departamento {
    public DepartamentoFamiliar(int identificadorInmobiliario, int areaMetrosCuadrados,
                                String direccion, int numeroHabitaciones, int numeroBanos,
                                double valorAdministracion) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanos, valorAdministracion);
    }

    // Los departamentos familiares valen 300 por metro cuadrado
    @Override
    public double calcularValorCompra() {
        return areaMetrosCuadrados * 300;
    }

    // Metodo Getters y setters específicos para manejar el valor de administración
    public double getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(double valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }
}