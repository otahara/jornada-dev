// Programa que lê 3 números e diz se forma um triângulo ou não
void main() {
    int a = 1;
    int b = 2;
    int c = 3;

    if (a >= b + c || b >= a + c || c >= a + b) {
        IO.println("não forma triângulo");        
    } else {
        IO.println("forma triângulo");
    }
}