void main() {
    int numero = Integer.parseInt(IO.readln("Digite um número: "));

    if (numero % 3 == 0 && numero % 5 == 0) {
        IO.println("Divisível por 3 e 5.");
    } else if (numero % 3 == 0) {
        IO.println("Divisível só por 3.");
    } else if (numero % 5 == 0) {
        IO.println("Divisível só por 5.");        
    } else {
        IO.println("Não é divisível nem por 3 nem por 5.");
    }
}