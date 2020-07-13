import java.util.Random;

public class ComparacionDeValores {
    public static void main(String[] args) {
        int [] array1= new int[10];
        int [] array2= new int[10];

        for (int i = 0; i <array1.length ; i++) {
            array1[i]=new Random().nextInt(100);
            array2[i]=new Random().nextInt(100);
        }
        System.out.println("Array 1:");

        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+",");
        }
        System.out.println();

        System.out.println("Array 2:");

        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array2[i]+",");
        }

        System.out.println();

        int valoresRepetidos=0;
        int valoresEIndicesRepetidos=0;

        for (int i = 0; i < array1.length ; i++) {
            for (int k = 0; k < array2.length ; k++){
                if(array1[i]==array2[k]){
                    valoresRepetidos++;
                    if(i==k){
                        valoresEIndicesRepetidos++;
                    }
                }
            }
        }

        System.out.println("Los valores repetidos son : "+valoresRepetidos +" y los valores e indices repetidos son "+valoresEIndicesRepetidos);

    }
}
