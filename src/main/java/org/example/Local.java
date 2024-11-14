package org.example;

// Clase base para todos los tipos de locales
public abstract class Local extends Inmueble {
    // Atributo que indica si el local es interno o da a la calle
    protected String localizacion;

    // Constructor con los datos básicos de un local
    public Local(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String localizacion) {
        // Llamo al constructor de Inmueble con los datos básicos
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.localizacion = localizacion;
    }

    // Metodo para obtener la localizacion del local
    public String getLocalizacion() {
        return localizacion;
    }
    // Metodo para cambiar la localizacion del local
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    // El metodo calcularValorCompra se implementara en las subclases
    // ya que cada tipo de local puede tener un valor diferente dependiendo de la ubicacion
    @Override
    public abstract double calcularValorCompra();

}