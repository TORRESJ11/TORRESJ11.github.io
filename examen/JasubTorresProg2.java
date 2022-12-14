package examen;

import java.util.Scanner;

public class JasubTorresProg2 {
        public static void main(String[] args) {
        
            System.out.println("Nombre: Jasub ");

            Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca un numero:");
        int number = input.nextInt();    
        System.out.println("Ingresaste " + number);

        // closing the scanner object
        input.close();

        if (number == 0)
        System.out.print(number + " es cero");
    else if (number > 1)
        System.out.print(number + " es positivo");
    else if (number < -1)
        System.out.print(number + " es negativo");
}
}