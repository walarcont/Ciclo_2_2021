import java.util.Scanner;

public class junio29 {
    public static void main (String[] args){
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingrese una palabra");
        //String entrada = scanner.nextLine();
        //System.out.println("El mensaje fue "+entrada);
        //int resultado = scanner.nextInt();
        //System.out.println("El mensaje fue "+resultado);
        /*
        if (5>7) {
            System.out.println(":)");
        }else if(3>2) {
            System.out.println("T.T");
        }else {
            System.out.println(":(");
        }
        */
        /*
        int contador = 1;
        while (true){
            System.out.println(":)");
            contador = contador +1;
            if(contador==5){
                break;
            }
        }
        */
        //estructura DO WHILE si entra al menos unas vez falso hacer al menos una vez
        /*
        int numero = 5;
        do{
            System.out.println(":)");
        }while(numero>7);
        */
        // Estructura For
        //for i in range(0,5,1):
        /*
        for (int i=0;i<5;i=i+1){
            System.out.println(i);
        }
        */

        /*
        for(int i=7;i>0;i=i-1){
            System.out.println(i);
        }
        for(int i=0;i<=20;i=i+2){
            System.out.println(i); 
        }
        */
        for(int i=0;i<=20;i=i+2){
            if (i==8){
                continue;
            }
            System.out.println(i);
        }

        for(int i=0;i<=20;i=i+2){ //incremento 1 en 1 es ++
            if (i==8){
                break;
            }
            System.out.println(i);
        }
    } // lo que esta entre estas llaves se llama bloque del codigo
}