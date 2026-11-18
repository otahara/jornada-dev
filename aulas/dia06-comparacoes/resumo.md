# Dia 6: comparações e E/OU/NÃO no código

## O que aprendi

As comparações usam os mesmos símbolos do dia 1 (`>`, `<`, `>=`, `<=`, `==`, `!=`). E, OU e NÃO mudam de escrita:

| Dia 1 | Java |
|---|---|
| E | `&&` |
| OU | `\|\|` |
| NÃO | `!` |

```java
boolean a = 3 > 1 && 8 > 5;        // true
boolean b = 3 < 1 || 8 < 5;        // false
boolean c = !(6 == 6) || 2 < 5;    // true
```

## Comparações com variáveis

Comparando variáveis, a mesma linha funciona para qualquer número:

```java
int numero = -4;
boolean ehPar = numero % 2 == 0;          // true
boolean ehPositivo = numero > 0;          // false
boolean multiploDe7 = numero % 7 == 0;    // false
```

- `numero % 2 == 0`: o resto por 2 é zero, então o número é par.
- `numero >= 10 && numero <= 20`: o número está entre 10 e 20.

## Arquivos

[Logica.java](Logica.java) · [Numero.java](Numero.java)
