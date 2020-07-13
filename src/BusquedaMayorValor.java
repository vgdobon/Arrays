import java.util.Random;
import java.util.Scanner;

public class BusquedaMayorValor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dime un tamaño del array");
        int tamañoArray=input.nextInt();

        int [] arrayDeInt =  new int[tamañoArray];
        for (int i = 0; i <tamañoArray ; i++) {
            arrayDeInt[i]=new Random().nextInt(100);
        }
        int valorMaximo=-1;
        int valorMinimo=10000;
        int indiceDeReferenciaDeValorminimo=0;
        int indiceDeReferencia=0;
        for (int i = 0; i <tamañoArray ; i++) {
            if(arrayDeInt[i]>valorMaximo){
                valorMaximo=arrayDeInt[i];
                indiceDeReferencia=i;
            }
            System.out.println((i+1)+" :"+arrayDeInt[i]);
        }
        for (int i = 0; i <tamañoArray ; i++) {
            if(arrayDeInt[i]<valorMinimo){
                valorMinimo=arrayDeInt[i];
                indiceDeReferenciaDeValorminimo=i;
            }
            System.out.println((i+1)+" :"+arrayDeInt[i]);
        }

        System.out.println("El valor máximo es "+valorMaximo+" y su índice es "+indiceDeReferencia);
        System.out.println("El valor mínimo es "+valorMinimo+" y su índice es "+indiceDeReferenciaDeValorminimo);


    }
}
