// Programa que identifica se um número é postivo, zero ou ímpar
void main() {
    int numero = -3;

    if (numero == 0) {
        IO.println("zero");
    } else if (numero > 0) {
        IO.println("positivo");
    } else {
        IO.println("negativo");
    }
}