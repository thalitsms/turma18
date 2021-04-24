/*

var: global
let: local
const: não muda valor
tag: getElementByTagName()
id: getElementById()
nome: getElementByName()
classe: getElementByClassName()
seletor: querySelector()
*/

let nome = window.document.getElementById('nome')
let sobrenome = window.document.getElementById('sobrenome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let nomeOk = false
let sobrenomeOk = false
let emailOk = false
let assuntoOk = false

function validaNome() {

    let txtNome = document.querySelector('#txtNome')
    if (nome.value.length < 3) {
       txtNome.innerHTML = '*Campo Obrigatório*'
       txtNome.style.color = '#fff' 
    } else {
       txtNome.innerHTML = 'Tudo certo! Continue Preenchendo ;)'
       txtNome.style.color = 'green'
       nomeOk = true
    }
 
 }
 
 function validaSobrenome() {

    let txtSobrenome = document.querySelector('#txtSobrenome')
    if (sobrenome.value.length < 3) {
        txtSobrenome.innerHTML = '*Campo Obrigatório*'
        txtSobrenome.style.color = '#fff' 
    } else {
        txtSobrenome.innerHTML = 'Tudo certo! Continue Preenchendo ;)'
        txtSobrenome.style.color = 'green'
        sobrenomeOk = true
    }
 
 }
 function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail') 
 
    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 ) {
       txtEmail.innerHTML = '*Email Inválido*'
       txtEmail.style.color = '#fff'
    } else {
       txtEmail.innerHTML = 'Tudo certo! Continue Preenchendo ;)'
       txtEmail.style.color = 'green'
       emailOk = true
    }
 }
 
 function validaAssunto() {
    let txtAssunto = document.querySelector('#txtAssunto')
 
    if (assunto.value.length < 100) {
       txtAssunto.innerHTML = '*No mínimo 100 caracteres, continue escrevendo*'
       txtAssunto.style.color = '#fff'
       txtAssunto.style.display = 'block'
    } else {
       txtAssunto.style.display = 'none'
       assuntoOk = true
    }
 }
 
 function enviar() {
     let txtEnviar = document.getElementById('txtEnviar')
    if (nomeOk == true && sobrenomeOk == true && emailOk == true && assuntoOk == true) {
       txtEnviar.style.display = "block"
       txtEnviar.style.backgroundColor = "#c9ac37ab"
       txtEnviar.style.textAlign = "center"
       txtEnviar.style.padding = "25px"
       txtEnviar.style.borderRadius = "5px"
       txtEnviar.innerHTML = `Mensagem enviado com sucesso! Em breve retornaremos contato, ${nome.value} :D` 
    } else {
       alert ('Ops, algo deu errado. Verifique e preencha novamente!')
    }
 }
 
