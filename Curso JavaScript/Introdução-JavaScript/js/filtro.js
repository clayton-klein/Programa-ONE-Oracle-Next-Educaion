let campoFiltro = document.querySelector('#filtrar-tabela');

campoFiltro.addEventListener('input', function () {
    let pacientes = document.querySelectorAll('.paciente');

    if (this.value.length > 0) {
        for (let i = 0; i < pacientes.length; i++) {
            let paciente = pacientes[i];
            let tdNome = paciente.querySelector('.info-nome');
            nome = tdNome.textContent;

            // pegar o valor do input de forma "case insensitive"
            let expressao = new RegExp(this.value, 'i');
            // se algum char digitado no input bater com o de algum nome,
            // mostrar esse nome e ocultar os demais.
            if (expressao.test(nome)) {
                paciente.classList.remove('ocultar');
                // se nenhum char bater com o de algum nome, ocultar tudo.
            } else {
                paciente.classList.add('ocultar');
            }
        }
        // se o input estiver em branco (legth NÃO é > 0), mostrar todos os pacientes da lista.            
    } else {
        for (let i = 0; i < pacientes.length; i++) {
            let paciente = pacientes[i];
            paciente.classList.remove('ocultar')
        };
    };
});

// Exemplo de como fazer a comparação do input utilizando o método .subString();
// deixado pelo professor:

// começar a comparação no indice 0.
// var comparavel = nome.substr(0, this.value.length);

// converter as strings para minusculo antes de comparar:
// var comparavelMinusculo = comparavel.toLowerCase();
// var valorDigitadoMinusculo = this.value.toLowerCase();

// if (!(valorDigitadoMinusculo == comparavelMinusculo)) {
//     paciente.classList.add("invisivel");
// } else {
//     paciente.classList.remove("invisivel");
// }