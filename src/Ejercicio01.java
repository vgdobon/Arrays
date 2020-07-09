public class Ejercicio01 {
    public static void main(String[] args) {
        int [] arrayEnteros=new int[3];

        arrayEnteros[0]=1;
        arrayEnteros[1]=2;
        arrayEnteros[2]=3;

        System.out.println(arrayEnteros[0]);
        System.out.println(arrayEnteros[1]);
        System.out.println(arrayEnteros[2]);

        for(int i=0;i<arrayEnteros.length;i++){
            System.out.println(arrayEnteros[i]);
        }
    }
}
