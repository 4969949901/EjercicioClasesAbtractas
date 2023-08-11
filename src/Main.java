//En este apartado el alumno deberá trabajar un ejercicio de POO utilizando Clases Abstractas, deberá trabajarlo basado en las figuras Geometricas.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declaración de objetos
        FigurasPlanas figPlana = new FigurasPlanas();
        FigurasVolumetricas figVol = new FigurasVolumetricas();
        System.out.println();
        Scanner ing = new Scanner(System.in);
        int opcion;
       do {
           //salida por pantalla
           System.out.println("Figuras Geometricas\n");
           System.out.println(" Seleccione lo que desea ver: 1.Figuras Geometricas Planas\n 2.Figuras Geometricas Volumetricas\n 3.Salir");
           opcion= ing.nextInt();

           switch (opcion){
               case 1:
                   System.out.println("FIGURAS GEOMETRICAS PLANAS\n");
                   System.out.println("------Cuadrado------\n");
                   figPlana.cuadrado();
                   System.out.println("------Triangulo------\n");
                   figPlana.triangulo();
               case 2:
                   System.out.println("FIGURAS GEOMETRICAS VOLUMETRICAS\n");
                   System.out.println("------Cono------\n");
                   figVol.conoRecto();
                   System.out.println("------Ortoedro------\n");
                   figVol.ortoedro();
           }
       }while(opcion!=3);

    }
}
