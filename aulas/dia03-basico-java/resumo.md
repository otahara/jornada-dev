# Dia 3: o básico do Java

## O que aprendi

- Um **programa** é um arquivo de texto com instruções. O comando `java` lê o arquivo e executa as instruções de cima para baixo.
- O Java começa pelo bloco **`main`** ("principal"). A moldura de todo programa:

```java
void main() {

}
```

- `{` e `}` marcam onde o bloco começa e termina. Sem instruções dentro, o programa roda e não mostra nada.
- **`IO.println("texto");`** mostra o texto na tela e pula para a linha de baixo. O texto vai entre aspas, e o `;` fecha a instrução.
- **`//`** começa um comentário: o Java ignora, é um recado para quem lê. O bom comentário diz o que o programa faz ou por que algo foi feito, sem repetir o código.
- Nome de arquivo Java em **PascalCase** (`OlaMundo.java`): cada arquivo vira uma classe, e classes seguem essa convenção.
- Para rodar: `java NomeDoArquivo.java` no terminal, dentro da pasta do arquivo.

## Onde tropecei

- A extensão de Java do VS Code preenchia os arquivos novos com um modelo (`package`, `public class`) e renomeava arquivos sozinha. Resolvido desativando a extensão nesta pasta, já que rodamos tudo pelo terminal.
- Escrevi `void main {` sem os parênteses, e o Java respondeu `no class declared in source file`. O certo é `void main() {`.

## Arquivos

- [Moldura.java](Moldura.java): a moldura vazia.
- [OlaMundo.java](OlaMundo.java): duas mensagens na tela, com comentário.
