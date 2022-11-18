import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class main2 {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Prime numbers from 1-");
        int userInput = keyboard.nextInt();
        while (userInput < 0){
            System.out.println("Invalid Input, Please enter a positive number");
            userInput = keyboard.nextInt(); //ensures value is positive
        }
        userInput =+ 1;

        //creates array
        int[] array = new int[userInput];

        //passes array into method and returns prime array
        int[] arrayFinal = primeNumbers(array);

        //creates file and sets up print writer
        File file = new File("PrimeNumbers.txt");
        file.createNewFile();
        PrintWriter myWriter = new PrintWriter(file);


        //prints out all the array into the file
        for(int i = 0; i < arrayFinal.length; i++){
            myWriter.println(arrayFinal[i]);
        }
        //closes file
        myWriter.close();

    }

    public static int[] primeNumbers(int[] array){
        int[] arrayFinal;
        int x=0;
        int j = 0;
        //counts how many prime numbers there are for array
        for(int i = 1; i < (array.length); i++){
            if ((array[i] % 2) == 0){
                x++;
            }
        }
        arrayFinal = new int[x];

        //puts each prime number into an array
        for (int i = 1; i < (array.length); i++){
            if ((array[i] % 2) == 0){
                arrayFinal[j] = i;
                j++;
            }
        }

        return arrayFinal;
    }
}
