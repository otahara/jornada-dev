# Dia 8: `else if` e decisão dentro de decisão

> Em andamento: falta um exercício parecido com o `Voto.java`, para eu fazer sozinho.

## O que aprendi

### A ordem do `else if`

O Java testa de cima para baixo e roda **só a primeira condição que der `true`**. As de baixo nem são olhadas. Por isso o caso mais específico vem primeiro:

```java
if (a == b && a == c) {                  // os três iguais: mais específico
    IO.println("equilátero");
} else if (a == b || a == c || b == c) { // dois iguais
    IO.println("isósceles");
} else {
    IO.println("escaleno");
}
```

Se o isósceles viesse primeiro, o 5, 5, 5 cairia nele.

Quando o Java chega num `else if`, ele já sabe que tudo acima deu `false`. Então não precisa repetir a pergunta:

```java
if (imc < limiteAbaixoDoPeso) { ... }
else if (imc < limitePesoNormal) { ... }   // já se sabe que imc >= 18.5
```

### O `return;`

O `main` roda de cima para baixo. No `return;`, o Java **sai do `main`** e o programa termina: as linhas de baixo não rodam. É o que faz a guarda funcionar. Com a guarda e o `return`, não precisa de `else` depois dela.

- `return`: sai da função inteira (aqui, o `main`).
- `break`: sai só de uma repetição (aparece no dia 10).

### Constantes com `final`

```java
final double limitePesoNormal = 25.0;
```

O `final` trava o valor: tentar mudar depois dá erro. Serve para dar nome a números que têm significado (número sem nome é o "número mágico"). Dentro do `main` o nome segue o camelCase. As constantes em MAIÚSCULAS ficam fora do `main` e vêm no Bloco 2.

### Decisão dentro de decisão

Um `if` dentro de outro faz sentido quando a segunda pergunta **só existe dentro de um dos casos**. No voto, saber ler só muda a resposta na faixa de 18 a 69:

```java
} else if (idade <= idadeObrigatoria) {
    if (alfabetizado) {
        IO.println("obrigatório");
    } else {
        IO.println("facultativo");
    }
}
```

## Onde tropecei

- No `TipoTriangulo.java` deixei o `else` depois da guarda com `return`. Ele sobrava: o `return` já para o programa.
- No `Voto.java` esqueci de usar o `alfabetizado` e travei em onde colocar a pergunta. Resolvemos juntos: ela entra só no bloco de 18 a 69.

## Arquivos

[TipoTriangulo.java](TipoTriangulo.java) · [Imc.java](Imc.java) · [Voto.java](Voto.java)
