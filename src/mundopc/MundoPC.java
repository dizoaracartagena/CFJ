package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        
        Monitor monitor1 = new Monitor("HP", 120.54);
        Monitor monitor2 = new Monitor("Apple", 23.98);
        
        Teclado teclado1 = new Teclado("USB","Huawei");
        Teclado teclado2 = new Teclado("HDMI","Acer");
        
        Raton raton1 = new Raton("HDMI","Apple");
        Raton raton2 = new Raton("USB","HP");
        
        Computadora computadora1 = new Computadora("Lenovo",monitor1,teclado1,raton1);
        Computadora computadora2 = new Computadora("Acer",monitor2,teclado2,raton2);
        Computadora computadora3 = new Computadora("Apple",monitor1,teclado2,raton1);        
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadora3);
        orden2.agregarComputadora(computadora2);
        orden2.mostrarOrden();
        
    }
}
