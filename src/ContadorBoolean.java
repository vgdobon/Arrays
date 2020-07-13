import java.util.Random;
import java.util.Scanner;

public class ContadorBoolean {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Cuantas veces quieres lanzar la moneda");

        int tamaño = input.nextInt();
        boolean myArray [] = new boolean[tamaño];
        Random random = new Random();
        float contadorTrues=0;
        float contadorFalse=0;
        float porcentajeCaras;
        float porcentajeCruz;

        for(int i=0;i<myArray.length;i++){
            myArray[i]=random.nextBoolean();
            if(myArray[i]==true){
                contadorTrues++;
            }else{
                contadorFalse++;
            }
        }
        porcentajeCaras=(contadorTrues/tamaño)*100f;
        porcentajeCruz=(contadorFalse/tamaño)*100f;

        System.out.println("El numero de veces que ha salido cara es: "+contadorTrues+" y su porcentaje es+"+porcentajeCaras+"%");
        System.out.println("El numero de veces que ha salido cara es: "+contadorFalse+" y su porcentaje es+"+porcentajeCruz+"%");




    }
}
