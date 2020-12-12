var esteban = {
    name: 'esteban',
    lastName: 'Martinez',
    age: 29,
    weight: 76
}


console.log(`${esteban.name} in the start of the year weigth ${esteban.weight} kg`)

const UPWEIGHT = 0.2
const DAY_OF_YEAR

const upWeight = person => person.weight += UPWEIGHT
const downWeight = person => person.weight -= UPWEIGHT


for (var i = 1; i <= DAY_OF_YEAR; i++){

    var random = Math.random()

    if (random < 0.25){
        upWeight(esteban)
    } else if (random < 0.50){
        downWeight(esteban)
    }

}

console.log(`${esteban.name} in the end of the year weigth ${esteban.weight.toFixed(2)} kg`)
