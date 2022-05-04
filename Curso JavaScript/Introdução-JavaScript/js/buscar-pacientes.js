'use strict';

let botaoAdicionarDaAPI = document.querySelector('#buscar-pacientes');

botaoAdicionarDaAPI.addEventListener('click', function() {
    //criando objeto HTTP
    let xhr = new XMLHttpRequest();
    //configurando método HTTP e URL para buscar os dados
    xhr.open('GET', 'https://api-pacientes.herokuapp.com/pacientess');
    //quando a resposta retornar executar esta função
    xhr.addEventListener('load', function() {
        //pegando span que exibirá possível erro no HTML
        let erroAjax = document.querySelector('#erro-ajax');

        if(xhr.status == 200) {
            erroAjax.classList.add('ocultar');
            //pegar o conteúdo da resposta HTTP
            let resposta = xhr.responseText;
            //converter de JSON para objeto JS    
            let pacientes = JSON.parse(resposta);
            //iterar por cada item do array de resposta e add na lista
            pacientes.forEach(function(paciente) {
                adicionaPacienteNaTabela(paciente) // reaproveitando func do arquivo form.js
            });
        } else {
            //se der erro fazer o span aparecer no HTML
            erroAjax.classList.remove('ocultar');

            console.error(xhr.status)
        }
    });
    //método para enviar a requisição HTTP após ser criada.
    xhr.send();
});