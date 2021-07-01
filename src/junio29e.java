import java.util.Scanner;

public class junio29e {
    /**
     *
     */
    
    public static void main (String[] args){
        Scanner scanner = new  Scanner(System.in);
        int numero = scanner.nextInt();
        //int resultado = contadorDigitos(numero);
        switch (contadorDigitos(numero)){
            case 1:
                System.out.println("muy poquitos digitos");
                break;
            default:
                System.out.println("HAY_MUCHOS_DIGITOS");   

        }
        
    }
    public static int contadorDigitos(int numero){
        //1990 ->4
        int cifras = 0;
        while(numero!=0){
            numero /= 10;
            cifras++;
        }
        return cifras;
    }

}
