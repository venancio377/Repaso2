public class Busqueda {

    public static int busquedaLineal(int[] arr, int objetivo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arr[medio] == objetivo) {
                return medio;
            } else if (arr[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ids = {12, 19, 26, 33, 47, 58, 71, 90};
        int objetivo = 71;

        System.out.println("Busqueda lineal del " + objetivo + ": indice " + busquedaLineal(ids, objetivo));
        System.out.println("Busqueda binaria del " + objetivo + ": indice " + busquedaBinaria(ids, objetivo));
        System.out.println("Busqueda binaria del 50 (no existe): " + busquedaBinaria(ids, 50));
    }
}
