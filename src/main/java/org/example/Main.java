package org.example;

public class Main {
    public static void main(String[] args) {
        // Se crea diferentes tipos de inmuebles con sus datos específicos

        CasaRural casaRural = new CasaRural(1, 120, "Calle Leonidas", 3, 2, 2, 50, 1500);
        CasaConjuntoCerrado casaConjunto = new CasaConjuntoCerrado(2, 150, "Av. Principal Roca", 4, 3, 2, 500000, true, true);
        ApartaEstudio apartaEstudio = new ApartaEstudio(3, 50, "Calle 45 y Dinamo", 150000);
        LocalComercial localComercial = new LocalComercial(4, 80, "Plaza Central Espiral", "Interno", "Centro Comercial Espiralado");
        Oficina oficina = new Oficina(5, 100, "Edificio Torres Valverde", "Externo", false);

        // Se imprime el valor de compra de cada inmueble
        System.out.println("Valor de compra Casa Rural: $" + casaRural.calcularValorCompra());
        System.out.println("Valor de compra Casa en Conjunto Cerrado: $" + casaConjunto.calcularValorCompra());
        System.out.println("Valor de compra Aparta-estudio: $" + apartaEstudio.calcularValorCompra());
        System.out.println("Valor de compra Local Comercial: $" + localComercial.calcularValorCompra());
        System.out.println("Valor de compra Oficina: $" + oficina.calcularValorCompra());
    }
}