# Dia 4: variáveis

## O que aprendi

Uma **variável** é uma caixa com nome que guarda um valor. No Java, ao criar a caixa, digo também o **tipo** do que ela guarda:

| Tipo | Guarda | Exemplo |
|---|---|---|
| `int` | número inteiro | `int pontos = 10;` |
| `double` | número com casas decimais (com ponto) | `double preco = 9.90;` |
| `String` | texto, entre aspas | `String cidade = "Votuporanga";` |
| `boolean` | `true` ou `false`, sem aspas | `boolean maior = 8 > 5;` |

- O `=` quer dizer **"recebe"**.
- `IO.println(nome)` mostra o que está dentro da caixa, e o nome vai sem aspas.
- O `double` guarda o número, não o jeito de escrever: `9.90` aparece como `9.9`.
- Entre textos, o `+` **junta**: `"Meu nome é " + nome`.
- O `boolean` pode guardar o resultado de uma comparação: `boolean resultado = 10 == 2 * 5;` guarda `true`.
- Depois de criada, a caixa pode receber outro valor sem repetir o tipo (`x = x + 4;`), mas **o tipo nunca muda**: uma caixa `int` não aceita texto.

## O tipo importa

O Java confere os tipos **antes** de rodar. Se algo não combina, o programa nem começa:

- `int altura = 1.75;` → um decimal não cabe numa caixa de inteiros.
- `"5" * 5` → o `*` só funciona entre números. Para repetir um texto: `"5".repeat(5)` mostra `55555`.

## Teste de mesa em Java

```java
int x = 3;
x = x + 4;   // 7
x = x * 2;   // 14
IO.println(x);
```

## Arquivos

[DoisNumeros.java](DoisNumeros.java) · [Decimais.java](Decimais.java) · [Textos.java](Textos.java) · [Logicos.java](Logicos.java) · [Troca.java](Troca.java) · [Teste.java](Teste.java)
