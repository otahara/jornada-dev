// Programa pede 3 lados e diz se forma um triângulo ou não, se forma, forma qual tipo de triângulo
void main() {
    int a = Integer.parseInt(IO.readln("Primeiro lado: "));
    int b = Integer.parseInt(IO.readln("Segundo lado: "));
    int c = Integer.parseInt(IO.readln("Terceiro lado: "));

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