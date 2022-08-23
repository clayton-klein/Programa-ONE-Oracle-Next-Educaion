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
