import java.util.Random;

public class ArraySuma {
    public static void main(String[] args) {
        int [] arrayEnteros=new int[5];
        for(int i=0;i<arrayEnteros.length;i++){
            arrayEnteros[i]= i+5;
        }

        for(int j=0;j<arrayEnteros.length;j++){
            if(j<arrayEnteros.length-1){
                System.out.print(arrayEnteros[j]+"+");
            }else{
                System.out.print(arrayEnteros[j]+"=");
            }

        }

        int suma=0;

        for (int h=0;h<arrayEnteros.length;h++){
            suma=suma+arrayEnteros[h];


        }
        System.out.println(suma);
    }
}
