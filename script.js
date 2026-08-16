console.log("Javascript funcionado!");

let display = document.getElementById("display");

let botoes = document.querySelectorAll("button");

botoes.forEach(function(botao){
    botao.addEventListener("click", function(){
        console.log("clicou em: " + botao.textContent);

    });
});

