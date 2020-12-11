var x = 4 
var y = '4'

x == y // This is true
x ===y // This is false 

var esteban = {
    name: 'Esteban'
}

var otherPerson = {
    name: 'Esteban'
}

esteban == otherPerson  // This is false 

person_3 = esteban

person_3 == esteban // This is true because point to seme space in memory
