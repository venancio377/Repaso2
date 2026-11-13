import java.util.Arrays;

public class Ordenamiento {

    // Bubble Sort
    public static void ordenar(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Partición de QuickSort (el último elemento es el pivote)
    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;

        for (int j = inicio; j <= fin - 1; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;
        return i + 1;
    }

    // QuickSort completo, apoyado en particion
    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int p = particion(arr, inicio, fin);
            quickSort(arr, inicio, p - 1);
            quickSort(arr, p + 1, fin);
        }
    }

    public static void main(String[] args) {
        int[] original = {23, 5, 41, 8, 17, 30, 12, 26};
        System.out.println("Arreglo original:       " + Arrays.toString(original));

        // Bubble Sort
        int[] a = original.clone();
        ordenar(a);
        System.out.println("Bubble Sort:            " + Arrays.toString(a));

        // Primera partición de QuickSort
        int[] b = original.clone();
        int pos = particion(b, 0, b.length - 1);
        System.out.println("Primera particion:      " + Arrays.toString(b));
        System.out.println("Posicion del pivote 26: " + pos);

        // QuickSort completo
        int[] c = original.clone();
        quickSort(c, 0, c.length - 1);
        System.out.println("QuickSort:              " + Arrays.toString(c));
    }
}
