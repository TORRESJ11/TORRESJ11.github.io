package tarea5;
public class ArrayAverash {
    
    public static void main(String[] argas) {

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
        
        // acces all elements using for each loop 
        // add each elemets in sum 
        for (int number: numbers) {
            sum += number;    
        }
        
        // get the total numbers for elemets
        int arrayLength = numbers.length;
        
        // calcaulate the average 
        // convert the average from int to double 
        average = ((double)sum/ (double)arrayLength);
        
        System.out.println("Sum =" + sum);
        System.out.println("Average = " + average);
        }
        }