// Programa mostra contas básicas com as variáveis a e b
void main() {
    double a = 17;
    double b = 5;

    double soma = a + b;
    double subtracao = a - b;
    double multiplicacao = a * b;
    double divisao = a / b;
    double resto = a % b;

    IO.println("A soma entre "+a+" + "+b+" = "+soma);
    IO.println("A subtração entre "+a+" - "+b+" = "+subtracao);
    IO.println("A multiplicação entre "+a+" x "+b+" = "+multiplicacao);
    IO.println("A divisão entre "+a+" / "+b+" = "+divisao);
    IO.println("O resto da divisão entre "+a+" % "+b+" = "+resto);
}