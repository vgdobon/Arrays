import java.util.Random;
import java.util.Scanner;

public class SumaYMediaDeUnArray {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("De que tamaño quieres el array");
        int tamañoArray=input.nextInt();
        int [] myArray= new int[tamañoArray];
        float suma=0;
        float media;

        for(int i=0;i<myArray.length;i++){
            System.out.println("Dime un valor");
            myArray[i]=input.nextInt();
            suma+=myArray[i];
        }

        System.out.println("La suma de todos los elementos del array es:"+suma);

        media=suma/tamañoArray;

        System.out.println("La media es"+media);

    }
}
