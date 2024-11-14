package org.example;

public abstract class Inmueble {
    protected int identificadorInmobiliario;  // Para identificar único del inmueble
    protected int areaMetrosCuadrados;  // Tamaño del inmueble
    protected String direccion;  // Donde está ubicado
    protected double valorCompra; // Cuánto vale

    // Constructor que pide los datos básicos
    public Inmueble(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
    }

    // Cada tipo de inmueble calculará su valor de forma diferente
    public abstract double calcularValorCompra();

    // Getters y setters
    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public int getAreaMetrosCuadrados() {
        return areaMetrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }
}