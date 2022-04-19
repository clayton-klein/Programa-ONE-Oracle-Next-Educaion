let tabela = document.querySelector('#tabela-pacientes');

tabela.addEventListener('dblclick', function(event) {
    // adiciona uma animação de apagar no alemente antes de deletar.
    event.target.parentNode.classList.add('fade-out');
    // aguarda a animação terminar para então deletar.
    setTimeout(function() {
        event.target.parentNode.remove();
    }, 500);
});