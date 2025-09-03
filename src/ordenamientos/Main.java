package ordenamientos;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingresa que metodo de ordenamiento quieres ver");
        
        int expression = sc.nextInt();


        switch (expression) {
            case 1 -> {
                OrdenamientoClasico clasic;
                clasic = new OrdenamientoClasico();
            }
            case 2 -> {
                Burbuja bubble;
                bubble = new Burbuja();
            }
        }
    }
}
