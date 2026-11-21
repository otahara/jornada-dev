// Programa pede 2 notas e mostra a média entre elas
void main() {
    double primeiraNota = Double.parseDouble(IO.readln("Primeira nota: "));
    double segundaNota = Double.parseDouble(IO.readln("Segunda nota: "));
    
    double media = (primeiraNota + segundaNota) / 2;

    IO.println("Média: " + media);
}