// Programa confere peso e altura e diz qual o imc da pessoa, se está abaixo do peso, normal, sobrepeso ou obeso
void main() {
    final double limiteAbaixoDoPeso = 18.5;
    final double limitePesoNormal = 25.0;
    final double limiteSobrepeso = 30.0;

    double peso = 50.0;
    double altura = 1.70;
    double imc = peso / Math.pow(altura, 2);

    if (imc < limiteAbaixoDoPeso) {
        IO.println("abaixo do peso");
    } else if (imc < limitePesoNormal) {
        IO.println("peso normal");
    } else if (imc < limiteSobrepeso) {
        IO.println("sobrepeso");
    } else {
        IO.println("obesidade");
    }
}