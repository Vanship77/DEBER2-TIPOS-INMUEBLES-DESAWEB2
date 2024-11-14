package org.example;

public class Oficina extends Local {
    // Atributo para saber si es una oficina del gobierno
    private boolean esGobierno;

    //datos necesarios para una oficina
    public Oficina(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String localizacion, boolean esGobierno) {
        // Llamo al constructor de Local con los datos básicos
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, localizacion);
        this.esGobierno = esGobierno;
    }

    // Métodos para saber si es del gobierno
    public boolean isEsGobierno() {
        return esGobierno;
    }

    public void setEsGobierno(boolean esGobierno) {
        this.esGobierno = esGobierno;
    }

    // Las oficinas valen 450 por metro cuadrado
    @Override
    public double calcularValorCompra() {
        return areaMetrosCuadrados * 450; // 450 es el valor por metro cuadrado para oficinas
    }
}