
var notas = [100, 50, 20, 10, 5, 2, 1];

function main() {
	return 2 == 2
}

function calculaTroco(valorPago, valorCompra) {
	return Math.round((valorPago - valorCompra) * 100) / 100;
}

function cedulas(valor) {
	let arrayNotas = []
	let resto = 0

	for (nota of notas) {
		let n = valor / nota
		if (n < 1)
			continue;

		let countNotas = parseInt(n)
		resto = valor % nota
		valor -= countNotas * nota
		arrayNotas.push(...Array(countNotas).fill(nota))
	}
	return arrayNotas;
}

module.exports = { main, calculaTroco, cedulas };
