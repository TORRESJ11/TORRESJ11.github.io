package examen;

import java.util.Scanner;

public class JasubTorresProg4 {
    public static void main(String[] args) {

    System.out.println("Nombre: Jasub "); 
    System.out.println("Matricula: S22022252");
    
    Scanner sc = new Scanner(System.in); 
    System.out.println("Introduzca un numero entero positivo:");
        int mes = sc.nextInt();

        String mesdelaño; 
        switch (mes) {
            
        case 1:  mesdelaño = "Enero";
                 break;
        case 2:  mesdelaño = "Febrero";
                 break;
        case 3:  mesdelaño = "Marzo";
                 break;
        case 4:  mesdelaño = "Abril";
                 break;
        case 5:  mesdelaño = "Mayo";
                 break;
        case 6:  mesdelaño = "Junio";
                 break;
        case 7:  mesdelaño = "Julio";
                 break;
        case 8:  mesdelaño = "Agosto";
                 break;
        case 9:  mesdelaño = "Septiembre";
                 break;
        case 10: mesdelaño = "Octubre";
                 break;
        case 11: mesdelaño = "Noviembre";
                 break;
        case 12: mesdelaño = "Diciembre";
                 break;
        default: mesdelaño = "Número incorrecto.";
                 break;

        }
        System.out.println(mesdelaño);
    }
}