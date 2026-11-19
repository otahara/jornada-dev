// Programa confere 3 lados e diz se forma um triângulo ou não, se forma, forma qual tipo de triângulo
void main() {
    int a = 100;
    int b = 4;
    int c = 5;

    if (a >= b + c || b >= a + c || c >= a + b) {
        IO.println("não forma triângulo");
        return;
    }

    if (a == b && a == c) {
        IO.println("equilátero");
    } else if (a == b || a == c || b == c) {
        IO.println("isósceles");
    } else {
        IO.println("escaleno");
    }
}