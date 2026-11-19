// Programa confere 3 ângulos e diz se forma um triângulo ou não
void main() {
    int x = 0;
    int y = 0;
    int z = 0;

    if (x <= 0 || y <= 0 || z <= 0) {
        IO.println("não forma triângulo com um dos ângulos menor ou igual a 0");
        return;
    }

    if (x + y + z == 180) {
        IO.println("forma triângulo");
    } else {
        IO.println("não forma triângulo");
    }
}