
package ud4.calculadora;

/**
 *
 * @author cic
 */
public class Calculadora {

    public static void main(String[] args) {
        Resta resta = new Resta();
        System.out.println("Resta: "+ resta.getResta(10,3));
        System.out.println("Decrementa: " + resta.decrementa(6));
        
        Suma suma = new Suma();
        System.out.println("Suma: "+ suma.getSuma(10,3));
        System.out.println("Incrementa: " + suma.incrementa(6));
    }
}
