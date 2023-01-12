public class Comentarios {
    public static void main(String[] args) {
        // olá, eu sou um comentario
    }

    public int somaMultiplica(int n, int x, String m) {
        int r = 0;
        if (m == "M") {
            r = n * x;
        } else {
            r = n + x;
        }
        return r;
    }
}
