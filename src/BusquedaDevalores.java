import java.util.Random;
import java.util.Scanner;

public class BusquedaDevalores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myArray[] = new int[100];

        for(int i=0;i<myArray.length;i++){
            myArray[i]=new Random().nextInt(10);
        }

        int numero=0;

        while(numero!=-1){ //bucle que determina si termina el programa si el usuario introduce -1
            System.out.println("Que valor quieres buscar(si no quieres buscar ningun valor introduce -1)");
            numero= input.nextInt();

            if(numero!=-1){ //si el usuario introduce el valor -1 no ejecuta el buscador
                System.out.println("Que quieres saber:\n 1)cuantas veces aparece tu valor y sus indices \n 2)En cual es la primera posicion esta el valor");
                int opcion=input.nextInt();

                int contador=0;
                int indice=-1;

                if(opcion==1){//cuando elige la primera opcion
                    for(int i=0;i<myArray.length;i++){
                        if (myArray[i]==numero) {//
                            contador++;
                            System.out.println("El valor "+numero+" aparece en el indice: "+i);
                        }
                    }

                    if(contador>0){
                        System.out.println("El numero de veces que aparece tu valor es:"+contador);
                    }else{
                        System.out.println("Tu valor no aparece en el array");
                    }

                }else{
                    for(int i=0;i<myArray.length;i++){
                        if (myArray[i]==numero) {
                            indice=i;
                            break;
                        }
                    }
                    if(indice>=0){
                        System.out.println("La primera aparición de tu valor es en el indice:"+indice);
                    }else{
                        System.out.println("Tu valor no aparece en el array");
                    }
                }
            }
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}