interface Workout {
  name: string;
  duration: number; // minutos
  intensity: string;
}

const treinos: Workout[] = [];

function registrarTreinos(treino: Workout): void {
  treinos.push(treino);
}

function listarTreinos(treinosParaSeremExibidos: Workout[]): void {
  treinosParaSeremExibidos.forEach((treino) => {
    console.log(treino);
  });
}

const treinoDeMusculacao: Workout = {
  name: "Treino de perna",
  duration: 60,
  intensity: "alta",
};

registrarTreinos(treinoDeMusculacao);

listarTreinos(treinos);
