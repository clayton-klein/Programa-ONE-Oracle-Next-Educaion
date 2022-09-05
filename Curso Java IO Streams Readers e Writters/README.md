## Assuntos abordados no curso: 

- Abertura de arquivos.
- Leitura linha a linha do arquivo e detecção de seu fim.
- Utilização de *exceptions* pelo Java IO caso a operação de leitura não saia como esperado.
- Classes abstratas e concretas para leitura.
- Escrever em arquivos.
- Escrever usando outputs diferentes.
- Ler e escrever dados abstraindo implementação.
- Classes abstratas e concretas para escrita e leitura.
- Várias alternativas para estabelecer uma saída para um arquivo de texto, como:
 - A classe `FileWriter`.
 - A classe `PrintStream`.
 - A classe `PrintWriter`.
- Alguns detalhes da classe `System`, como:
 - O atributo `System.out` é do tipo `PrintStream`.
 - O método `System.lineSeparator()` devolve os caracteres que representam uma nova linha independente do sistema operacional.
 - O método `System.currentTimeMillis()` devolve os milissegundos que passaram desde 1 de janeiro de 1970 (marco do início da era UNIX), para fins práticos é utilizado no início e fim da execućão de uma aplicação por exemplo, depois subtrai-se o valor do fim do início para saber quanto tempo durou a execução e posterior comparação com outros métodos de execução para otimizações.
- Leitura de arquivos com Scanner.
- Uso de delimitador com Scanner.
- Formatação de texto e também de números.
- Definição de Localização para formatar o texto.
- A criação do fluxo binário a partir de um objeto é chamado de **serialização**.
- A criação de um objeto a partir de um um fluxo binário é chamado de **desserialização**.
- A classe deve implementar a interface `java.io.Serializable`.
- A serialização/desserialização funciona em cascata e também com herança.
- Existe a palavra-chave `transient` para indicar que o atributo não deve ser serializado.
- É boa prática colocar o atributo estático `serialVersionUID` para versionar a classe.
- A versão sempre fica guardada no fluxo binário.
- Se não colocarmos explicitamente o `serialVersionUID`, a versão será gerada dinamicamente.
- É raro usar a serialização na "unha", mas é um conhecimento importante, pois será utilizado por outras bibliotecas.


