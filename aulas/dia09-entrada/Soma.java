// Programa pede 2 números e mostra a soma entre eles
void main() {
    int primeiroNumero = Integer.parseInt(IO.readln("Primeiro número: "));
    int segundoNumero = Integer.parseInt(IO.readln("Segundo número: "));
    
    int soma = primeiroNumero + segundoNumero;

    IO.println(primeiroNumero + " + " + segundoNumero + " = " + soma);
}