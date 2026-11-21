// Programa perunta a idade, confere se a idade está no range para pagar passagem ou não, se sim confere se é estusdante ou não para confirmar se paga meia ou inteira.
void main() {
    final int idadeMinima = 6;
    final int idadeMaxima = 59;

    int idade = Integer.parseInt(IO.readln("Qual a sua idade? "));

    if (idade > idadeMaxima || idade < idadeMinima) {
        IO.println("Não paga passagem.");
        return;
    }

    String resposta = IO.readln("Você é estudante? (s/n) ");
    boolean estudante = resposta.equalsIgnoreCase("s");

    if (estudante) {
        IO.println("Paga meia.");
    } else {
        IO.println("Paga inteira.");
    }
}