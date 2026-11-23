# Dia 9.1: reforço (em andamento)

Reforço de tudo até o dia 9: primeiro lógica e matemática, depois casos reais.

## O que aprendi

### Cadeia ou guarda com `return`

- **Cadeia (`if` / `else if` / `else`):** para opções lado a lado, respostas da mesma pergunta. Quem lê vê todas juntas, e acontece sempre uma só. Exemplo: divisível por 3 e 5, só por 3, só por 5 ou nenhum.
- **Guarda com `return`:** para um caso que encerra o programa antes do principal, como um triângulo que não fecha.

No `Triangulo.java` usei as duas: a guarda tira o caso que não forma, e a cadeia escolhe entre equilátero, isósceles e escaleno.

### A ordem dos `if` importa

No `Divisivel.java`, o caso "por 3 e por 5" precisa vir primeiro. Senão o 15 cai em "só por 3" e nunca chega lá.

### Escrever a condição ao contrário

A regra do triângulo diz quando **forma**: cada lado é menor que a soma dos outros dois. Para a guarda, que pergunta quando **não** forma, há dois jeitos certos:

```java
// a regra direta, negada com ! (NÃO)
if (!(a < b + c && b < a + c && c < a + b)) {

// pensando direto no caso que dá errado
if (a >= b + c || b >= a + c || c >= a + b) {
```

Negar um "E" vira um "OU", e cada `<` vira `>=`, como na tabela-verdade do dia 1. O segundo jeito se lê mais fácil: "se algum lado for grande demais, não forma".

### Primeiro caso real: IMC

`IMC = peso / (altura × altura)`, com as faixas da OMS: menor que 18,5 é abaixo do peso, menor que 25 é peso normal, menor que 30 é sobrepeso e, daí para cima, obesidade. Os limites ficaram em constantes `final`, então se uma faixa mudar, muda uma linha só. Como cada `else if` já sabe que o anterior falhou, basta testar o limite de cima (`imc < 25`), sem repetir `imc >= 18.5`.

## Onde tropecei

- No `Imc.java`, na primeira versão, o programa calculava o IMC mas não mostrava o valor, só a classificação.
- No `Triangulo.java`, ao trocar para a regra direta, usei `<` com `||` e mantive "não forma". Assim o programa dizia "não forma" para tudo, até para 3, 4, 5. "Cada lado" pede `&&`, e essa condição diz quando forma; para a guarda, é preciso negar com `!`.

## Arquivos

[Maior.java](Maior.java) · [Divisivel.java](Divisivel.java) · [Triangulo.java](Triangulo.java) · [Imc.java](Imc.java)

**Próximo:** mais casos reais.
