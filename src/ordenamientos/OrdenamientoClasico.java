package ordenamientos; // Paquete ordenamiento

// Clase Ordenamiento Clasico
public class OrdenamientoClasico {

    //ImprimirVectores imp;
    //imp  = new ImprimirVectores();

    // Atributo, un objeto de la clase ImprimirVectores
    ImprimirVectores imp = new ImprimirVectores();

    int vec[] = {5, 23, 4, 76, 2, 3, 1, 3, 5, 6, 2}; //Array de Enteros

    //Bluilder
    public OrdenamientoClasico() {

        System.out.println("Ordenamiento clasico");
        System.out.println("Vector Original");
        //Llama a la clase ImprimirVectores (llamada aqui de esta forma imp) y usa el metodo imprimir
        imp.imprimir(vec);
        //Llama al metodo pasando un argumento y guardandolo nuevamente
        vec = ordenacionClasica(vec);
        System.out.println("\n");
        imp.imprimir(vec);
    }

    //Metodo Ordenacion Clasica
    public static int[] ordenacionClasica(int vec[]) {
        final int N = vec.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (vec[i] > vec[j]) {
                    int temp = vec[i];
                    vec[i] = vec[j];
                    vec[j] = temp;
                }
            }
        }
        return vec;
    }
}
