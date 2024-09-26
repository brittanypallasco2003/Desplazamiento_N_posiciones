import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int enteros[] = new int[10];
        System.out.println("Ingrese un número para los desplazamientos: ");
        int numeroDesplazamientos = entrada.nextInt();

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Ingrese valores: ");
            enteros[i] = entrada.nextInt();
        }

        entrada.close();

        // Rescatar números
        int numeroIndicePartida = 10 - numeroDesplazamientos;
        int numerosRescatados[] = new int[numeroDesplazamientos];
        int contador = 0;

        for (int i = numeroIndicePartida; i < enteros.length; i++) {
            numerosRescatados[contador] = enteros[i];
            contador++;
        }

        // Mover números
        for (int i = enteros.length - 1; i >= numeroDesplazamientos; i--) {
            enteros[i] = enteros[i - numeroDesplazamientos];
        }

        // Guardar números rescatados en las primeras posiciones del arreglo
        for (int i = 0; i < numerosRescatados.length; i++) {
            enteros[i] = numerosRescatados[i];
        }

        // Imprimir valores
        for (int i : enteros) {
            System.out.println("Elemento: " + i);
        }

    }

}
