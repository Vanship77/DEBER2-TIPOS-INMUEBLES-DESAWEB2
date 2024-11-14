package org.example;

public class LocalComercial extends Local {
    // Atributo específico para saber en qué centro comercial está ubicado el local
    private String centroComercial;

    //pide todos los datos necesarios para un local comercial
    public LocalComercial(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String localizacion, String centroComercial) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

    // Métodos para obtener y cambiar el centro comercial
    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

    @Override
    public double calcularValorCompra() {
        return areaMetrosCuadrados * 400; // 400 es el valor por metro cuadrado para locales comerciales
    }
}