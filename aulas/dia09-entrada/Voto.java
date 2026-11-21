void main() {
    final int idadeMinima = 16;
    final int limiteFacultativo = 17;
    final int idadeObrigatoria = 69;

    int idade = Integer.parseInt(IO.readln("Qual a sua idade? "));
    
    if (idade < idadeMinima) {
        IO.println("não vota");
        return;
    }

    if (idade <= limiteFacultativo || idade > idadeObrigatoria) {
        IO.println("facultativo");
        return;
    }

    String resposta = IO.readln("Alfabetizado? (s/n) ");
    boolean alfabetizado = resposta.equalsIgnoreCase("s");

    if (alfabetizado) {
        IO.println("obrigatório");
    } else {
        IO.println("facultativo");
    }
}