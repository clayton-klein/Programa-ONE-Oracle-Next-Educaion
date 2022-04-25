// Boas vindas ao primeiro desafio!

// Durante estas quatro semanas, vamos trabalhar em uma aplicação que criptografa textos, assim você poderá trocar mensagens secretas com outras pessoas que saibam o segredo da criptografia utilizada.

// As "chaves" de criptografia que utilizaremos são:
// `A letra "a" é convertida para "ai"`
// `A letra "e" é convertida para "enter"`
// `A letra "i" é convertida para "imes"`
// `A letra "o" é convertida para "ober"`
// `A letra "u" é convertida para "ufat"`

// **Requisitos:**
// - Deve funcionar apenas com letras minúsculas
// - Não devem ser utilizados letras com acentos nem caracteres especiais
// - Deve ser possível converter uma palavra para a versão criptografada e também retornar uma palavra criptografada para a versão original. 

// Por exemplo:
// `"gato" => "gaitober"`
// `gaitober" => "gato"`

// - A página deve ter campos para inserção do texto a ser criptografado ou descriptografado, e a pessoa usuária deve poder escolher entre as duas opções
// - O resultado deve ser exibido na tela.

// **Extras:**
// - Um botão que copie o texto criptografado/descriptografado para a área de transferência - ou seja, que tenha a mesma funcionalidade do `ctrl+C` ou da opção "copiar" do menu dos aplicativos.


let textoInput = document.querySelector('#textoInput');
let imagemSemTexto = document.querySelector('#noMessage')
let boxOutput = document.querySelector(".texto-output");
let textoOutput = document.querySelector('#textoOutput');

let btnCriptografar = document.querySelector('#btnCriptografar');
let btnDescriptografar = document.querySelector('#btnDescriptografar');
let btnCopiar = document.querySelector('#btnCopiar');

btnCriptografar.addEventListener('click', criptografar);
btnDescriptografar.addEventListener('click', descriptografar);
btnCopiar.addEventListener('click', copiar);

textoInput.focus();

let regex = /^[a-z\s]+$/; //aceita somente letras minúsculas e sem acento, inclusive escritos em múltiplas linhas.
function criptografar() {
    let mensagem = textoInput.value;

    if(!mensagem) {
        alert('Digite uma mensagem para ser criptografada');
        return;
    } else if( !regex.test(mensagem) ) {
        alert('Utilize somente letras minúsculas e sem acento.');
        textoInput.value = '';
        textoInput.focus();
        return;  
    } else {
        // NÃO organizar por ordem alfabética, senão ocorre bug
        // devido ao "i" de "ai" que será convertido novamente depois.
        mensagem = mensagem.replaceAll('e', 'enter');
        mensagem = mensagem.replaceAll('i', 'imes');
        mensagem = mensagem.replaceAll('a', 'ai');
        mensagem = mensagem.replaceAll('o', 'ober');
        mensagem = mensagem.replaceAll('u', 'ufat');
    };

    imagemSemTexto.style.display = 'none';
    boxOutput.style.display = 'flex';
    textoOutput.value = mensagem;
    textoInput.value = '';
};
        
function descriptografar() {
    let mensagemSaida = textoInput.value;

    if(!mensagemSaida) {
        alert('Digite uma mensagem para ser descriptografada');
        textoInput.focus();
        return;
    };

    mensagemSaida = mensagemSaida.replaceAll('enter', 'e');
    mensagemSaida = mensagemSaida.replaceAll('imes', 'i');
    mensagemSaida = mensagemSaida.replaceAll('ai', 'a');
    mensagemSaida = mensagemSaida.replaceAll('ober', 'o');
    mensagemSaida = mensagemSaida.replaceAll('ufat', 'u');

    imagemSemTexto.style.display = 'none';
    boxOutput.style.display = 'flex';
    textoOutput.value = mensagemSaida;
    textoInput.value = '';
};

function copiar() { 
    navigator.clipboard.writeText(textoOutput.value);
    textoOutput.value = '';
    boxOutput.style.display = 'none';
    imagemSemTexto.style.display = 'flex';
    textoInput.focus();

    alert('Texto copiado')
};

function mudarTema() {
    
};