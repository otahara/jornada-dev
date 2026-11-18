// Programa que faz 3 testes logicos com booleanos
void main() {
    boolean a = 3 > 1 && 8 > 5;
    boolean b = 3 < 1 || 8 < 5;
    boolean c = !(6 == 6) || 2 < 5;

    IO.println(a);
    IO.println(b);
    IO.println(c);
}