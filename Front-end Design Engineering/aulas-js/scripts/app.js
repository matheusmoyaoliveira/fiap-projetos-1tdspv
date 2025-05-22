document.getElementById("formulario").addEventListener("submit", function(e) {
    e.preventDefault();

    const nome = document.getElementById("nome").value;
    const email = document.getElementById("email").value;
    
    if(nome === "") {
        alert("O nome é obrigatorio")
    }

    if(email === "") {
        alert("O email é obrigatório")
    }

    const mensagemSucesso = document.getElementById("mensagemSucesso");
});