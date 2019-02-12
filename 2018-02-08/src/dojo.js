/**
 * Valor mínimo
 * Valor máximo
 * Número de elementos na seqüência
 * Valor médio
 * Por exemplo para uma seqüência de números "6, 9, 15, -2, 92, 11", temos como saída:
 * 
 * Valor mínimo: -2
 * Valor máximo: 92
 * Número de elementos na seqüência: 6
 * Valor médio: 18.1666666
 */

const min = (values) => Math.min(...values)

const max = (values) => Math.max(...values)

const len = (values) => values.length

const avg = (values) => values.reduce((prev, curr) => prev + curr, 0) / len(values)

const main = (values) => [min(values), max(values), len(values), avg(values)]

const output = (values) => {
	result = main(values)
	return `Valor mínimo: ${result[0]}\n
Valor máximo: ${result[1]}\n
Número de elementos na seqüência: ${result[2]}\n
Valor médio: ${result[3]}\n`
}

module.exports = { min, max, len, avg, main, output }