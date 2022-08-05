Assuntos abordados no curso: 

* Regex, ou expressões regulares, é uma linguagem para encontrar padrões de texto.

* Sendo uma linguagem independente, existem interpretadores para a maioria das plataformas de desenvolvimento, como JavaScript, C#, Python ou Ruby.

* Uma classe de caracteres predefinida é `\d`, que significa qualquer dígito.

* Existem vários *meta-char*, como `.` ou `*`.

* Existem *quantifiers* que definem quantas vezes um caractere deve aparecer:
 * `{1}` é um *quantifier* que significa *uma vez*.
 * `*` é um *quantifier* que significa *zero, uma ou mais vezes*

* `.`  é um *meta-char* que significa *qualquer char*.

* Com `\` podemos escapar *meta-chars*, por exemplo `\.`.

* Podemos definir facilmente a classe de qualquer caractere com o `[A-Z]`.

* Conhecemos todos os *quantifiers* como `?`, `+`, `*` e `{n}`.

* `\s` significa *whitespace* e é um atalho para `[ \t\r\n\f]`.

* `\w` significa *word char* e é uma atalho para `[A-Za-z0-9_]`.

* Existem âncoras predefinidas que selecionam uma posição dentro do alvo.

* `\b` é uma âncora que seleciona um *word boundary,* isso é o início ou fim da palavra.

* `^` é uma âncora que seleciona o início da string alvo.

* `$` é uma âncora que seleciona o fim do alvo.

* Declaramos um grupo com `()`.

* Podemos ter grupos e subgrupos.

* Um grupo é retornado na hora de executar, são úteis para selecionar uma parte do *match*.

* Através do `?:`, dizemos que *não* queremos ver esse grupo na resposta.

* *Quantifiers* são "gananciosos" por padrão e podemos utilizar um `?` logo após o *quantifier*, deixando-o "preguiçoso".

* Como podemos referenciar o texto de um grupo dentro da regex, aonde `n` é o número do grupo.
