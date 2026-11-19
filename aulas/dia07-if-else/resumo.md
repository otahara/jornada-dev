# Dia 7: `if` / `else`

## O que aprendi

O `if` usa um `boolean` para escolher o que o programa faz. Sempre roda **um** dos dois blocos, nunca os dois:

```java
if (numero % 2 == 0) {
    IO.println("par");       // roda se a condição der true
} else {
    IO.println("ímpar");     // roda se a condição der false
}
```

- **`if` sem `else`:** quando só há algo a fazer se a condição for `true`. Se der `false`, o bloco é pulado.
- **Condição com E/OU:** qualquer expressão do dia 6 serve, como `numero >= 10 && numero <= 20`.

## `else if`, `if` dentro do `else` e guarda

As três funcionam. A diferença é como o código se lê.

| Forma | Quando usar |
|---|---|
| `else if` | os casos são alternativas do mesmo nível (zero, positivo, negativo) |
| `if` dentro do `else` | a segunda pergunta só faz sentido dentro daquele caso, junto com outras coisas |
| guarda com `return;` | a regra **barra** tudo: se não passou, o programa para ali |

```java
if (x <= 0 || y <= 0 || z <= 0) {
    IO.println("não forma triângulo com um dos ângulos menor ou igual a 0");
    return;                  // encerra o main aqui
}

if (x + y + z == 180) {
    IO.println("forma triângulo");
} else {
    IO.println("não forma triângulo");
}
```

**Evitar:** `if` dentro de `if` dentro de `if`. A escada empurra o código para a direita e esconde qual `}` fecha o quê.

## Código que todo mundo entende

- O comentário do topo diz o que o programa **faz de verdade**.
- Mesmo espaço dos dois lados do operador: `z <= 0`, e não `z <=0`.
- Uma linha em branco entre as partes (dados, guarda e regra), e a linha em branco fica vazia, sem espaços.

## Onde tropecei

- No triângulo usei `>` em vez de `>=`. Com 1, 2, 3, o `3 > 1 + 2` dá `false`, e o programa dizia que formava triângulo. O caso igual precisa entrar: `>=`.
- No `ProximoPar.java`, `numero % 2 == 1` não pega ímpar negativo: em Java, `-3 % 2` dá `-1`. O teste seguro de ímpar é `numero % 2 != 0`.

## Por conta própria

- Tratei o zero no `Positivo.java` (zero não é positivo nem negativo) e cheguei no `else if` antes do dia 8.
- Reescrevi o `Angulos.java` com `if` dentro do `else` e depois com guarda.

## Arquivos

[Positivo.java](Positivo.java) · [ProximoPar.java](ProximoPar.java) · [Triangulo.java](Triangulo.java) · [Angulos.java](Angulos.java)
