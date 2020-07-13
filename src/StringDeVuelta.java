import java.util.Scanner;

public class StringDeVuelta {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Dime un string");
        String cadena=input.nextLine();

        int longitudCadena=cadena.length()-1;

        char [] myArrayDeChar = new char[longitudCadena+1];
        int k=longitudCadena;

        for (int i = 0; i<=longitudCadena ; i++) {
            myArrayDeChar[i]=cadena.charAt(k);
            k--;
        }
        System.out.println(myArrayDeChar);
    }
}
