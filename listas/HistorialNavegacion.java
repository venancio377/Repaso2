public class HistorialNavegacion {
    private String[] paginas = new String[15];
    private int tamaño = 0; // cuántas páginas hay guardadas

    public void add(String url) {
        paginas[tamaño] = url; // guarda url en la posición indicada por tamaño
        tamaño++;              // aumenta tamaño en 1
    }

    public void remove(String url) {
        for (int i = 0; i < tamaño; i++) {
            if (paginas[i].equals(url)) {
                // desplaza una posición a la izquierda todas las páginas posteriores
                for (int j = i; j < tamaño - 1; j++) {
                    paginas[j] = paginas[j + 1];
                }
                paginas[tamaño - 1] = null; // limpia la última posición que quedó repetida
                tamaño--;                   // reduce tamaño en 1
                return;                     // ya se eliminó, no hace falta seguir buscando
            }
        }
    }

    public void mostrarHistorial() {
        for (int i = 0; i < tamaño; i++) {
            System.out.println((i + 1) + ". " + paginas[i]);
        }
    }

    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        historial.add("correo.com");
        historial.add("museo.org");
        historial.add("deportes.net");
        System.out.println("Historial despues de los tres add:");
        historial.mostrarHistorial();

        historial.remove("museo.org");
        System.out.println();
        System.out.println("Historial despues de remove(museo.org):");
        historial.mostrarHistorial();
    }
}
