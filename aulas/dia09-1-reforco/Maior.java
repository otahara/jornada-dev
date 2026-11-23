// Programa pede dois números, compara eles e diz qual é maior ou se são iguais.
void main() {
    int primeiroNumero = Integer.parseInt(IO.readln("Primeiro número: "));
    int segundoNumero = Integer.parseInt(IO.readln("Segundo número: "));

    if (primeiroNumero == segundoNumero) {
        IO.println("Os números são iguais.");
    } else if (primeiroNumero > segundoNumero) {
        IO.println("O maior é o " + primeiroNumero + ".");
    } else {
        IO.println("O maior é o " + segundoNumero + ".");
    }
}