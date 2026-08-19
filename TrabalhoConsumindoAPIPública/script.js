function obterDadosUsuario(nomeUsuario){
    const url = `https://api.github.com/users/${nomeUsuario}`
    return fetch(url)
        .then(function(response){
            if(response.ok){
                return response.json()
            }else{
                throw new Error("Erro ao obter dados do usuário. Cheque o nome do usuário")
            }
        })
        .then(function(dados){
            return dados
        })
        .catch(function(erro){
            console.log("Error: " + erro)
        })
}

obterDadosUsuario('FelipePeraro2402')
    .then(function(usuario){
        exibirDadosDoUsuario(usuario)
    })

function exibirDadosDoUsuario(usuario){
    const tableBody = document.querySelector("#dados-table")

    const row = document.createElement('tr')
    const nomeCell = document.createElement('td')
    const reposCell = document.createElement('td')
    const seguidoresCell = document.createElement('td')

    nomeCell.textContent =  usuario.name || usuario.login
    reposCell.textContent = usuario.public_repos
    seguidoresCell.textContent = usuario.followers

    row.appendChild(nomeCell)
    row.appendChild(reposCell)
    row.appendChild(seguidoresCell)
    
    tableBody.appendChild(row)
}

//Comandos usados para criar uma variável que não tem como ter o valor dela reatribuído
//São definidas pelo id do botão e da caixa de texto definidos no HTML --> btn-buscar e input-usuario 
const btnBuscar = document.querySelector("#btn-buscar")
const inputUsuario = document.querySelector('#input-usuario')

//Comando usado para adicionar um "evento" ao clique do botão
btnBuscar.addEventListener('click', function() { 
    const nome = inputUsuario.value.trim() // Pega o valor digitado e remove espaços vazios

    if (nome !== '') {
        obterDadosUsuario(nome)
            .then(function(usuario) {
                if (usuario) {
                    exibirDadosDoUsuario(usuario)
                    inputUsuario.value = '' // Limpa o campo de texto
                }
            })
    } else {
        alert('Por favor, digite um nome de usuário do GitHub.')
    }
})