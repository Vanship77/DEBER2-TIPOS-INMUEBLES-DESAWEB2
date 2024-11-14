package org.example;

// Clase base para todos los tipos de casa
public abstract class Casa extends InmuebleVivienda {
    protected int numeroPisos;  // Todas las casas tienen pisos

    // Constructor que pide todos los datos necesarios para una casa
    public Casa(int identificadorInmobiliario, int areaMetrosCuadrados,
                String direccion, int numeroHabitaciones, int numeroBanos, int numeroPisos) {
        // Llamo al constructor padre en este caso (InmuebleVivienda)
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numeroHabitaciones, numeroBanos);
        this.numeroPisos = numeroPisos;
    }
}

// CasaRural tipo específico de casa
class CasaRural extends Casa {
    private int distanciaCapital;
    private int altitud;

    public CasaRural(int identificadorInmobiliario, int areaMetrosCuadrados,
                     String direccion, int numeroHabitaciones, int numeroBanos,
                     int numeroPisos, int distanciaCapital, int altitud) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanos, numeroPisos);
        this.distanciaCapital = distanciaCapital;
        this.altitud = altitud;
    }

    // Las casas rurales valen 200 por metro cuadrado
    @Override
    public double calcularValorCompra() {
        return areaMetrosCuadrados * 200;
    }
}

// CasaUrbana es un tipo de Casa
class CasaUrbana extends Casa {
    public CasaUrbana(int identificadorInmobiliario, int areaMetrosCuadrados,
                      String direccion, int numeroHabitaciones, int numeroBanos,
                      int numeroPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanos, numeroPisos);
    }

    @Override
    public double calcularValorCompra() {
        return 0; // Este metodo debe ser implementado por las subclases
    }
}

// CasaConjuntoCerrado es un tipo específico de CasaUrbana
class CasaConjuntoCerrado extends CasaUrbana {
    // Atributos específicos de casas en conjunto cerrado
    private double valorAdministracion;
    private boolean tienePiscina;
    private boolean tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificadorInmobiliario, int areaMetrosCuadrados,
                               String direccion, int numeroHabitaciones, int numeroBanos,
                               int numeroPisos, double valorAdministracion,
                               boolean tienePiscina, boolean tieneCamposDeportivos) {
        // Se le llama al constructor de CasaUrbana con los datos básicos
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanos, numeroPisos);
        //Estos son los atributos específicos
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    // Las casas en conjunto cerrado valen 350 por metro cuadrado
    @Override
    public double calcularValorCompra() {
        return areaMetrosCuadrados * 350;
    }
}

// CasaIndependiente es otro tipo de CasaUrbana
class CasaIndependiente extends CasaUrbana {
    public CasaIndependiente(int identificadorInmobiliario, int areaMetrosCuadrados,
                             String direccion, int numeroHabitaciones, int numeroBanos,
                             int numeroPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion,
                numeroHabitaciones, numeroBanos, numeroPisos);
    }

    // Las casas independientes valen 400 por metro cuadrado
    @Override
    public double calcularValorCompra() {
        return areaMetrosCuadrados * 400;
    }
}