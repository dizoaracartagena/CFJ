package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int maxComputadoras = 10;
    
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }
    
    public void agregarComputadora(Computadora computadora) {
        if(this.contadorComputadoras < Orden.maxComputadoras) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        
        else {
            System.out.println("Se ha superado el maximo de computadoras" + Orden.maxComputadoras);
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Computadoras de la orden: ");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);  
        }
    }
}
