# Dia 1: verdadeiro, falso e tabela-verdade

Dia feito no papel, sem código.

## O que aprendi

- Uma **comparação** é uma pergunta com duas respostas possíveis: verdadeiro ou falso.
- A comparação se lê **da esquerda para a direita**: `3 < 1` pergunta "3 é menor que 1?" (falso).

| Símbolo | Pergunta |
|---|---|
| `>` | é maior que? |
| `<` | é menor que? |
| `>=` | é maior ou igual a? |
| `<=` | é menor ou igual a? |
| `==` | é igual a? |
| `!=` | é diferente de? |

## Tabelas-verdade

Primeiro resolvo cada comparação; depois junto os resultados com a tabela.

| A | B | A **E** B | A **OU** B |
|---|---|---|---|
| V | V | V | V |
| V | F | F | V |
| F | V | F | V |
| F | F | F | F |

- **E:** só é verdadeiro se os dois lados forem verdadeiros.
- **OU:** é verdadeiro se pelo menos um lado for verdadeiro. Exemplo: "entra na festa quem tem convite OU está na lista"; sem convite e fora da lista, não entra.
- **NÃO:** inverte o resultado (V vira F e F vira V).

## Onde tropecei

- Li `3 < 1` de trás para frente, como se fosse "1 é menor que 3".
- Achei que falso OU falso daria verdadeiro, porque os dois lados eram iguais. O OU só pergunta se pelo menos um lado é verdadeiro.
