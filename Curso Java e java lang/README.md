## Assuntos abordados no curso: 

- Packages servem para organizar o nosso código.
- Packages fazem parte do FQN (*Full Qualified Name*) da classe.
- O nome completo da classe (FQN) é composto de: `PACKAGE.NOME_SIMPLES_CLASSE`.
- A definição do package deve ser a primeira declaração no código fonte.
- Para facilitar o uso de classes de outros packages podemos importá-los.
- Os `import`s ficam logo após da declaração do `package`.
- Por convenção, a nomenclatura padrão de um package é o nome do domínio na web ao contrário junto com o nome do projeto, por exemplo: *br.com.empresa.geradornotas*
- Existem 3 palavras chaves relacionadas com a visibilidade: `private`,  `protected`, `public`.
- Existem 4 níveis de visibilidade (de menor para maior): 
  - `private` (visível apenas na classe)
  - *`<<package private>>`* (visível na classe E em qualquer outro membro do mesmo pacote, podendo ser chamado de *default* caso não seja declarado nenhum modificador explicitamente).
  - `protected` (visível na classe E em qualquer outro membro do mesmo pacote E para qualquer filho).
  - `public` (visível em qualquer pacote).
- Os modificadores podem ser usados na definição da classe, atributo, construtor e método.
- Comentários e tags (anotações) para definir o *javadoc*.
- Como gerar o *javadoc* no Eclipse.
- Que *javadoc* é uma documentação para desenvolvedores.
- Que as classes Java padrão também usam *javadoc*.
- Como criar nossa própria biblioteca através do JAR (**J**ava **AR**chive).
- Como importar a biblioteca no novo projeto.
- Como criar um JAR executável.

- O *package* `java.lang` é o único pacote que não precisa ser importado, nele tem classes fundamentais que qualquer aplicação precisa, como a classe `String` e `System`.
- Objetos da classe `String` são imutáveis e usamos uma sintaxe literal para criar (*object literal*).
- Qualquer método de alteração da classe `String` devolve uma nova `String` que representa a alteração (e deve ser guardada em uma variável).
- A classe `String` é uma `CharSequence`.
- Se precisarmos concatenar muitas `String` devemos usar a classe `StringBuilder`.
- Vimos vários métodos da classe **String** como `trim`, `charAt`, `contains`, `isEmpty`, `length`, `indexOf`, `replace`.
