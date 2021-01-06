var esteban = {
    name: 'esteban',
    lastName: 'Martinez',
    age: 29,
    weight: 76
}


const UPWEIGHT = 0.3
const GOAL = esteban.weight - 3
const upWeight = person => person.weight += UPWEIGHT
const downWeight = person => person.weight -= UPWEIGHT
const eatToMuch = () => Math.random() < 0.3
const playSports = () => Math.random() < 0.4
var days = 0

while (esteban.weight >= GOAL){
    if (eatToMuch()){
        upWeight(esteban)
    }
    if (playSports()){
        downWeight(esteban)
    }
    days += 1
}

console.log(`Passed ${days} days for that  ${esteban.name} losed ${((GOAL + 3) - esteban.weight).toFixed(2)} kg`)


for (var i = 1; i < 11; i++){ 
    var num = Math.random()
    console.log(num)}