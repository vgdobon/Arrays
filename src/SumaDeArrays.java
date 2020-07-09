import java.util.Random;

public class SumaDeArrays {
    public static void main(String[] args) {
        int [] myArray1= new int [100];
        int [] myArray2= new int [100];

        for(int i =0;i<myArray1.length;i++){
            myArray1[i]= new Random().nextInt(100);
            myArray2[i]= new Random().nextInt(100);
        }

        for(int k=0;k<myArray1.length;k++){
            System.out.println(k+":  "+myArray1[k]+"+"+myArray2[k]+" = "+(myArray1[k]+myArray2[k]));

        }

    }
}
