function calcularIMC(peso, altura) {
    const IMC = peso / (altura * altura)
    return IMC
}

const peso = 90;
const altura = 1.80;

const resultado = calcularIMC(peso, altura)

console.log("IMC: " + resultado)