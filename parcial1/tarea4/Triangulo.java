package p4arcial1.tarea4;
import java.util.Scanner;

public class Triangulo {
    
    public static void dibujarTriangulo(int anchura) {
        int asteriscos = 1;
        int espacios = anchura - 1;
        
        for (int fila = 0; fila < anchura; fila++) {
            for (int columnaEspacios = 0; columnaEspacios < espacios; columnaEspacios++)  {
                System.out.print(" ");
            }
            for (int columnaAsteriscos = 0; columnaAsteriscos < asteriscos; columnaAsteriscos++) {
                System.out.print("*");
            }
            System.out.println();
            
            asteriscos ++;
            espacios --;
        }
    }
    
    public static void main (String[] args) {
        
        int ancho;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Escribe el ancho del Triangulo: ");
            ancho = sc.nextInt();
        }
        
        dibujarTriangulo(ancho);
    }
}