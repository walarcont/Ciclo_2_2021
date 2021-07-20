import java.util.Scanner;

public class ejemploscanner {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String entrada = scanner.nextLine();
        System.out.println("El mensaje fue "+entrada);
        int resultado = scanner.nextInt();
        System.out.println("El mensaje fue "+resultado);
    }
}
