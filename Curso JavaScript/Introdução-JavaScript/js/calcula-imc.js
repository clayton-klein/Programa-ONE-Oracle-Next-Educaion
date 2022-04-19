let titulo = document.querySelector('.titulo');
titulo.textContent = 'Aparecida Nutricionista';


let pacientes = document.querySelectorAll('.paciente')
for(let i = 0; i < pacientes.length; i++) {
    let paciente = pacientes[i];
    
    let tdPeso = paciente.querySelector('.info-peso');
    let tdAltura = paciente.querySelector('.info-altura');
    
    let peso = tdPeso.textContent;
    let altura = tdAltura.textContent;
    
    
    let imc = 0;
    let tdImc = paciente.querySelector('.info-imc');
    tdImc.textContent = imc;
    
    let pesoEhValido = validaPeso(peso);
    let alturaEhValida = validaAltura(altura);
    if(!pesoEhValido) {
        console.log('Peso inválido!');
        tdImc.textContent = 'Peso inválido!';
        pesoEhValido = false;
        paciente.classList.add('paciente-invalido');
    }
    
    if(!alturaEhValida) {
        console.log('Altura inválida!');
        tdImc.textContent = 'Altura inválida!';
        alturaEhValida = false;
        paciente.classList.add('paciente-invalido');
    }
    
    if(pesoEhValido && alturaEhValida) {
        let imc = calculaImc(peso, altura);
        tdImc.textContent = imc;
    }
}

function calculaImc(peso, altura) {
    let imc = 0;
    imc = peso / (altura * altura);
    return imc.toFixed(2); // retornar com 2 casas decimais
}

function validaPeso(peso) {
    if(peso > 0 && peso < 1000) {
        return true;        
    } else {
        return false;
    }
}

function validaAltura(altura) {
    if (altura > 0 && altura <= 3.00) {
        return true;
    } else {
        return false;
    }
}