// Programa pergunta o nome e a cidade e mostra "Nome mora em Cidade"
void main() {
    String nome = IO.readln("Qual é o seu nome? ");
    String cidade = IO.readln("Em que cidade você mora? ");
    IO.println(nome + " mora em " + cidade + ".");
}