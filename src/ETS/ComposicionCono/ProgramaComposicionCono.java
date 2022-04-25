package ETS.ComposicionCono;

/**
 * @author ZebenSantana Composici�n de un objeto cono
 *
 */
public class ProgramaComposicionCono {

    /**
     * @param datos Imprime todos los datos del main
     */
    private static void imprimir (Object datos) {
        System.out.println(datos);
    }
    /**
     * @param args Main del programa que crea cinco conos en bucle for con valores de radio aleatorios
     */
    public static void main (String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i=1; i<=5; i++) {
            int radio = aleatorio.nextInt(9)+1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }

}
