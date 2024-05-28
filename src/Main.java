import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int a[] = aleatorios();
        printArreglo(a);
//        burbuja(a);
//        insercion(a);
        seleccion(a);
        printArreglo(a);
    }

    public static int[] aleatorios(){
        int arreglo[] = new int[15];
        Random numAleatorio = new Random();
        int valor = 0;

        for(int x = 0 ; x < 15 ; x++){
            valor = numAleatorio.nextInt(100);
            arreglo[x] = valor;
        }
        return arreglo;
    }
    public static void printArreglo(int a[]){
        for(int num : a){
            System.out.print(num + " ");
        }
    }

    public static int[] burbuja(int a[]){
        System.out.println("");
        int temp = 0;
        for(int i = 0 ; i < a.length - 1 ; i ++){
            for(int  j = 0; j < a.length - 1 ; j++){
                if(a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
    public static int[] insercion(int a[]){
        System.out.println("");
        int temp = a[0];
        for(int i = 0 ; i < a.length - 1 ; i++){
            for(int  j = i ; j < a.length ; j++){
                if(a[j] <a[j - 1]){
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
    }
    public static int[] seleccion(int a[]){
        System.out.println("");
        for(int i = 0 ; i < a.length - 2 ; i++){
            int valPos = a[i];
            int minVal = a[i + 1];
            int posMinVal = i;
            for(int  j = i + 1 ; j < a.length ; j++){
                if(a[j] < minVal) {
                    minVal = a[j];
                    posMinVal = j;
                }
            }
            a[i] = minVal;
            a[posMinVal] = valPos;
        }
        return a;
    }
}
