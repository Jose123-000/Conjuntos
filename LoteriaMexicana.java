import java.util.ArrayList;
import java.util.Collections;

public class LoteriaMexicana {
    private ArrayList<String> cartas;

    // Constructor
    public LoteriaMexicana() {
        this.cartas = new ArrayList<>();
    }

    // Método para agregar una carta
    public void agregarCarta(String carta) {
        this.cartas.add(carta);
    }

    // Método para imprimir las cartas en el orden de ingreso
    public void imprimirCartas() {
        System.out.println("Cartas en el orden de ingreso:");
        for (String carta : cartas) {
            System.out.println(carta);
        }
    }

    // Método para imprimir las cartas en un orden aleatorio
    public void imprimirCartasAleatorias() {
        ArrayList<String> cartasAleatorias = new ArrayList<>(cartas);
        Collections.shuffle(cartasAleatorias); // Mezcla las cartas
        System.out.println("Cartas en orden aleatorio:");
        for (String carta : cartasAleatorias) {
            System.out.println(carta);
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        LoteriaMexicana loteria = new LoteriaMexicana();

        // Agregar cartas a la lotería mexicana
        loteria.agregarCarta("El Gallo");
        loteria.agregarCarta("El Diablo");
        loteria.agregarCarta("La Dama");
        loteria.agregarCarta("El Catrín");
        loteria.agregarCarta("El Paraguas");
        loteria.agregarCarta("La Sirena");

        // Imprimir las cartas en el orden de ingreso
        loteria.imprimirCartas();

        System.out.println(); // Espacio entre impresiones

        // Imprimir las cartas en orden aleatorio
        loteria.imprimirCartasAleatorias();
    }
}
