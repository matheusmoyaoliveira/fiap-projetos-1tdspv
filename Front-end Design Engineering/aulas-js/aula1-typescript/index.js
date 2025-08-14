var treinos = [];
function registrarTreinos(treino) {
    treinos.push(treino);
}
function listarTreinos(treinosParaSeremExibidos) {
    treinosParaSeremExibidos.forEach(function (treino) {
        console.log(treino);
    });
}
var treinoDeMusculacao = {
    name: "Treino de perna",
    duration: 60,
    intensity: "alta",
};
registrarTreinos(treinoDeMusculacao);
listarTreinos(treinos);
