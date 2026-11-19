// Programa que identifica que se o número é impar, se for soma 1 para virar par.
void main() {
    int numero = 0;

    if ((numero % 2) == 1) {
        numero = numero + 1;
    }
    
    IO.println(numero);
}