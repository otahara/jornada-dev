# Dia 9: ler o que a pessoa digita

## O que aprendi

### `IO.readln`

Mostra uma pergunta, espera a pessoa digitar e apertar Enter, e devolve o que ela digitou:

```java
String nome = IO.readln("Qual é o seu nome? ");
```

O que vem do teclado chega **sempre como texto** (`String`), até um número. Para testar outro caso, basta rodar de novo e digitar outro valor, sem mexer no código.

### Transformar texto em número

| Para virar | Use |
|---|---|
| `int` | `Integer.parseInt(texto)` |
| `double` | `Double.parseDouble(texto)` |

```java
int idade = Integer.parseInt(IO.readln("Qual é a sua idade? "));
```

- Sem converter, o `+` **junta** texto: `"30" + 1` dá `"301"`.
- Se a pessoa digitar algo que não é número (`abc`), ou usar vírgula no `double` (`12,5`), o programa para com erro.
- É o mesmo que o `int(input())` do Python, só que mais explícito: `int` e `double` não têm funções próprias, e as ferramentas ficam no `Integer` e no `Double`.
- A conversão pode ser feita em duas linhas (ler e depois converter) ou numa só. As duas formas são boas.

### Comparar texto

Texto se compara com `.equals`, nunca com `==`. Número se compara com `==`.

```java
String resposta = IO.readln("Você é estudante? (s/n) ");
boolean estudante = resposta.equalsIgnoreCase("s");   // aceita "s" e "S"
```

| Método | O que faz |
|---|---|
| `equals` | igual, diferenciando maiúscula de minúscula |
| `equalsIgnoreCase` | igual, sem ligar para maiúscula e minúscula (o melhor para comparar) |
| `toLowerCase` / `toUpperCase` | devolve o texto em minúsculas / maiúsculas (o `.lower()` / `.upper()` do Python) |

O resultado do `equals` já é um `boolean`. Por isso basta `if (estudante)`, sem `== true` e sem `Boolean.parseBoolean`.

### Perguntar só o que muda a resposta

No `Passagem.java` decidi sozinho: quem tem menos de 6 ou 60 ou mais não paga, então o programa nem pergunta se essa pessoa é estudante. A guarda com `return` vem **antes** da pergunta. No `Voto.java` fiz o mesmo com o "alfabetizado?", que só aparece na faixa de 18 a 69.

## Onde tropecei

- No `Passagem.java` comparei o `boolean` com texto (`estudante == "s"`), e o programa não compilou. Como `estudante` já é verdadeiro ou falso, basta `if (estudante)`.
- No `Passagem.java` usei `>=` e `<=` nas fronteiras, e 6 e 59 anos ficavam sem pagar. Testando esses dois casos, troquei para `<` e `>`.
- No `Situacao.java` deixei de novo um `else` depois da guarda com `return`. Não é erro, mas sobra.
- No `Voto.java` sobrou um `if (idade <= idadeObrigatoria)` que sempre dava `true`: as guardas de cima já tinham tirado os outros casos.

## Arquivos

[Cumprimento.java](Cumprimento.java) · [Soma.java](Soma.java) · [Media.java](Media.java) · [Situacao.java](Situacao.java) · [Passagem.java](Passagem.java) · [Voto.java](Voto.java)
