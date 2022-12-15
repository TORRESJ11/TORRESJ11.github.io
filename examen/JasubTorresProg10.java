package examen;

public class JasubTorresProg10 {
    public static void main(String[] args) {

        System.out.println("Nombre: Jasub "); 
        System.out.println("Matricula: S22022252");
    
        int a[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
        
        };
        System.out.println("Diagonal inferior");
        
        
                for (int i = 0; i < 8; ++i){
                    for (int j = 0; j < 8; ++j){
                        if (i>=j){
                            a[i][j] = i+1;
                        }
        
        }
        }
         
                for (int i = 0; i < 8; ++i){
                    for (int j = 0; j < 8; ++j){
                        System.out.print(a[i][j] + " ");
            }
                    System.out.println();
                    
            }
            int suma = 0;
        
            for (int i = 0; i < 8; ++i){
                for (int j = 0; j < 8; ++j){
                  
                    if (i>=j){
                        a[i][j] = i+1;
                        suma += a[i][j];
                    }
                }
            }
            
            System.out.println("La suma de todos esos elementos es: "+suma); 
        }
        }
        