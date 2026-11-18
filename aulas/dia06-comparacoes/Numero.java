//
void main() {
    int numero = -4;
    boolean ehPar = numero % 2 == 0;
    boolean ehPositivo = numero > 0;
    boolean multiploDe7 = numero % 7 == 0;

    IO.println(ehPar);
    IO.println(ehPositivo);
    IO.println(multiploDe7);
}