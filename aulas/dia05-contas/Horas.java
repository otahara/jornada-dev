// Programa que calculas horas exatas juntando divisao e resto
void main() {
    int minutos = 6000;
    int horasCheias = minutos / 60;
    int minutosQueSobram = minutos % 60;

    IO.println(horasCheias+"h"+minutosQueSobram);
}