public class PilaCaracteres {
    private char[] pila = new char[20];
    private int tope = -1; // -1 significa pila vacía

    public void push(char c) {
        tope++;          // sube el tope a la siguiente posición libre
        pila[tope] = c;  // coloca c en la posición tope
    }

    public char pop() {
        char c = pila[tope]; // guarda el carácter que está en el tope
        tope--;              // baja el tope para "sacarlo" de la pila
        return c;
    }

    public String revertir(String texto) {
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            push(texto.charAt(i));
        }
        while (tope >= 0) {
            resultado += pop();
        }
        return resultado;
    }

    public static void main(String[] args) {
        PilaCaracteres pila = new PilaCaracteres();
        String original = "MUNDO";
        System.out.println("Texto original: " + original);
        System.out.println("Texto revertido: " + pila.revertir(original));
    }
}
