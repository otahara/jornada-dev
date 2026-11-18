# Dia 2: expressões combinadas e teste de mesa

Dia feito no papel, sem código.

## Expressões combinadas

Resolvo por pedaços, do mais de dentro para fora:

1. cada comparação (V ou F);
2. o que está entre parênteses;
3. o que sobrou.

Exemplo: `(5 > 2 E 3 > 9) OU 1 == 1` → `(V E F) OU V` → `F OU V` → **V**.

## Teste de mesa

Uma **variável** é uma caixa com um nome, que guarda um valor por vez. **Teste de mesa** é seguir os passos no papel, anotando o valor de cada caixa depois de cada passo.

```
1. a recebe 3
2. b recebe a * 2
3. a recebe a + 1
4. b recebe b - a
```

| Passo | a | b |
|---|---|---|
| 1 | 3 | |
| 2 | 3 | 6 |
| 3 | 4 | 6 |
| 4 | 4 | 2 |

- Uma variável **não muda sozinha** quando outra muda: ela guarda o resultado da conta feita naquele passo.
- `a recebe a + 1` usa o valor que já está na caixa e guarda o resultado na mesma caixa.

## Teste de mesa com decisão

Com **se / senão**, só um dos dois caminhos acontece.

```
1. a recebe 8
2. b recebe 3
3. se a > 5 E b > 5 então
4.     c recebe a + b
5. senão
6.     c recebe a - b
7. a recebe c * 2
```

`8 > 5 E 3 > 5` → `V E F` → F, então roda o senão: `c = 5`. Depois, `a = 10`. Resultado: **a = 10, b = 3, c = 5**.
