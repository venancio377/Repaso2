public class ColaImpresion {
    private String[] documentos = new String[10];
    private int frente = 0;
    private int fin = -1; // fin indica el último documento encolado

    public void enqueue(String doc) {
        fin++;                  // avanza fin a la siguiente posición libre
        documentos[fin] = doc;  // agrega doc al final de la cola
    }

    public String dequeue() {
        String doc = documentos[frente]; // toma el documento que está al frente
        frente++;                        // el frente pasa al siguiente documento
        return doc;
    }

    public void imprimirTodo() {
        while (frente <= fin) {
            System.out.println("Imprimiendo: " + dequeue());
        }
    }

    public static void main(String[] args) {
        ColaImpresion cola = new ColaImpresion();
        cola.enqueue("Factura");
        cola.enqueue("Recibo");
        cola.enqueue("Pedido");
        cola.imprimirTodo();
    }
}
