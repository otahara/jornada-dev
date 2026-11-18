# Dia 5: contas

## O que aprendi

| Símbolo | Conta |
|---|---|
| `+` | soma |
| `-` | subtração |
| `*` | multiplicação |
| `/` | divisão |
| `%` | resto da divisão |

- A ordem é a da matemática: primeiro `*`, `/` e `%`; depois `+` e `-`. Os parênteses mudam a ordem.
- **`int` dividido por `int` dá `int`:** o Java corta a parte decimal, sem arredondar. `17 / 5` dá `3`.
- Para ter as casas decimais, pelo menos um dos números precisa ser `double`: `17.0 / 5` dá `3.4`. Com `double`, todo resultado aparece com decimal (`22.0`).
- **O resto (`%`) é o que sobra inteiro.** 17 balas para 5 crianças: cada uma ganha 3 (`17 / 5`) e sobram 2 (`17 % 5`). Não é o `0.4`: esse é o pedaço que cada criança ganharia partindo as 2 balas que sobraram (`2 / 5 = 0.4`). Com `double`, `17.0 % 5.0` também dá `2.0`.

## Cuidado com o `+` e o texto

Depois de um texto, o `+` passa a **juntar** em vez de somar:

```java
IO.println("Resultado: " + x + y);     // x = 8, y = 2 → Resultado: 82
IO.println("Resultado: " + (x + y));   // Resultado: 10
IO.println("Resultado: " + x * y);     // Resultado: 16 (o * vem antes do +)
```

## Minutos em horas

```java
int minutos = 200;
int horas = minutos / 60;     // 3 horas cheias
int resto = minutos % 60;     // 20 minutos sobrando
IO.println(horas + "h" + resto);   // 3h20
```

## Onde tropecei

- Achei que `17 % 5` daria `0.4`, confundindo o resto com a parte decimal de `3.4`. O exemplo das balas resolveu.

## Arquivos

[Basicas.java](Basicas.java) · [Parenteses.java](Parenteses.java) · [Horas.java](Horas.java)
