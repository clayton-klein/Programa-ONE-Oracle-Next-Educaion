## Assuntos abordados no curso: 

- O que é, para que serve e como funciona a pilha de execução.
- O que é depuração (debug) e para que serve.
- Como utilizar o Eclipse e sua perspectiva de debug.
- Como alternar entre perspectivas do Eclipse.
- O que são exceções, para que servem e porquê utilizá-las.
- Como analisar o rastro de exceções, ou *stacktrace*.
- Tratar exceções com os blocos `try-catch`.
- Manipular uma exceção lançada dentro do bloco catch.
- Tratar múltiplas exceções com mais de um bloco catch ou usando *Multi-Catch* utilizando o *pipe* (**`|`**).
- Como lançar exceções com throw.
- Como atribuir uma mensagem à exceção passando-a como parâmetro do construtor da exceção.
- Como criar um bloco `catch` genérico usando a classe `Exception`.
- Como criar uma exceção nova `SaldoInsuficienteException`.
- Como transformar a exceção em *checked* ou *unchecked*.
- Que existe um bloco `finally`, útil para o fechamento de recursos (como conexões por exemplo).
 - Quando há um bloco `finally` o bloco `catch` é opcional.
 - Que o bloco `finally` é sempre executado, sem ou com exceção.
 - Como usar o *try-with-resources* (forma mais moderna de try/catch pós versão 7 do Java).