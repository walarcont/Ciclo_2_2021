import java.util.Scanner;

public class nuevo_proyecto {
    
    //Paso a paso  =>Algoritmo
    //1)Recoger la informacion: codigo del estudiante y las 5 notas
    //2)Identificar cual es la peor nota
    //3)Hallar el promedio ajustado {descartar la peor de las notas}
    //4)Realizar la conversion a escala de 0 a 5
    //5)Reportar el promedio con el formato indicado


    //2)Identificar cual es la peor nota
    //Funciones que resuelven el problema -- Modularizacion
    //alcance, tipo retorno, nombrefuncion(especificacion de argumentos){bloque de codigos}
    public static int ObtenerPeorNota(int nota1,int nota2, int nota3, int nota4, int nota5){
        //Declarar
        int peorNota;
        //Inicializar 
        peorNota = nota1;
        if(peorNota>nota2){
            peorNota =nota2;
        }
        if(peorNota>nota3){
            peorNota =nota3;
        }
        if(peorNota>nota4){
            peorNota =nota4;
        }
        if(peorNota>nota5){
            peorNota =nota5;
        }

        return peorNota;


    }

    //3)Hallar el promedio ajustado {descartar la peor de las notas}

    public static double calcularPromedioAjustado(int nota1,int nota2, int nota3, int nota4, int nota5){
        int peorNota = ObtenerPeorNota(nota1, nota2, nota3, nota4, nota5);
        int sumatoria = 0;
        double promedioajustado =0;
        sumatoria = (nota1 + nota2 + nota3 + nota4 + nota5)-peorNota;
        promedioajustado = (double)sumatoria/4; //
        return promedioajustado;
    }


    //4) Conversion escala de 100 => escala de 5
    public static double convertirEstacala5(double calificacion100){
        return (calificacion100/20);

    }

    //5)Reportar el promedio con el formato indicado

    public static void reportarPromedioAjustado(String codigo, double promedioajustado){
        System.out.println("El promedio ajustado del estudiante" + codigo +"es"+promedioajustado);

    }


    //Seccion principal o punto de entrada para construir esas funciones
    public static void main(String[] args)  {
        //1)Recoger la informacion: codigo del estudiante y las 5 notas
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el codigo del estudiante: ");
        String codigoEstudiante = sc.nextLine();
        System.out.print("Ingrese nota1: ");
        int nota1 = sc.nextInt();
        System.out.print("Ingrese nota2: ");
        int nota2 = sc.nextInt();
        System.out.print("Ingrese nota3: ");
        int nota3 = sc.nextInt();
        System.out.print("Ingrese nota4: ");
        int nota4 = sc.nextInt();
        System.out.print("Ingrese nota5: ");
        int nota5 = sc.nextInt();

        //Ejecutar las funciones

        double promedioajustado =convertirEstacala5(calcularPromedioAjustado(nota1, nota2, nota3, nota4, nota5));


        //Reportar el resultado
        reportarPromedioAjustado(codigoEstudiante,( promedioajustado));




    }
    
}
