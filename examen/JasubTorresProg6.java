package examen;

import java.util.Scanner;

public class JasubTorresProg6 {
    public static void main(String[] args) {

    System.out.println("Nombre: Jasub Torres Ramírez"); 
  
    Scanner sc = new Scanner(System.in); 
    System.out.println("Introduzca un numero entero positivo:");
        int n = sc.nextInt();

        System.out.println("Pares menores o iguales:");
      for (int i = 2; i <= n; i=i+2) {
        System.out.println(i); 

}
}
}
