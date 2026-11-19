void main() {
    final int idadeMinima = 16;
    final int limiteFacultativo = 17;
    final int idadeObrigatoria = 69;

    int idade = 30;
    boolean alfabetizado = true;
    
    if (idade < idadeMinima) {
        IO.println("não vota");
        return;
    }

    if (idade <= limiteFacultativo) {
        IO.println("facultativo");
    } else if (idade <= idadeObrigatoria) {
        if (alfabetizado) {
            IO.println("obrigatório");
        } else {
            IO.println("facultativo");
        }
    } else {
        IO.println("facultativo");
    }
}