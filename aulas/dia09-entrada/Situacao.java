// Programa pede 2 notas e mostra a média entre elas e no final mostra se o aluno foi aprovado, está de recuperação ou foi reprovado
void main() {
    final double limiteNotaMedia = 7.0;
    final double limiteNotaRecuperacao = 5.0;

    double primeiraNota = Double.parseDouble(IO.readln("Primeira nota: "));
    double segundaNota = Double.parseDouble(IO.readln("Segunda nota: "));
    
    double media = (primeiraNota + segundaNota) / 2;

    if (media < limiteNotaRecuperacao) {
        IO.println("Média: " + media + " - Reprovado.");
        return;
    }
    
    if (media >= limiteNotaMedia) {
        IO.println("Média: " + media + " - Aprovado!");
    } else {
        IO.println("Média: " + media + " - Está de recuperação!");
    }
}