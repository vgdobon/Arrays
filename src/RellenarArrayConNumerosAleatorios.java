import java.util.Random;

public class RellenarArrayConNumerosAleatorios {
    public static void main(String[] args) {
        int [] arrayEnteros=new int[5];
        Random aleatorio=new Random();

        for(int i=0;i<arrayEnteros.length;i++){
            arrayEnteros[i]=aleatorio.nextInt(10);
        }
    }
}
