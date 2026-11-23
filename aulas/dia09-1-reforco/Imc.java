// Programa pede o peso e a altura da pessoa e diz qual o imc, se está abaixo do peso, normal, sobrepeso ou obeso
void main() {
    final double limiteAbaixoDoPeso = 18.5;
    final double limitePesoNormal = 25.0;
    final double limiteSobrepeso = 30.0;

    double peso = Double.parseDouble(IO.readln("Peso: "));
    double altura = Double.parseDouble(IO.readln("Altura: "));

    double imc = peso / (altura * altura);

    IO.println("Seu IMC é: " + imc + ".");

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