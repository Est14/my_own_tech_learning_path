const API_URL = 'https://swapi.dev/api/'
const PEOPLE_URL = 'people/:id'

const lukeUrl = `${API_URL}${PEOPLE_URL.replace(':id', 1)}`
const opts = { crossDomain: true } 

function getCharacters(id, callback){
    const url = `${API_URL}${PEOPLE_URL.replace(':id', id)}`
    $.get(url, opts, callback).fail(() => {
        console.log(`Sorry an ERROR happened, could not get the character ${id}`)
    })
}
// Callback hell 
getCharacters(1, function callback (luke){
        console.log(`Hello I\'m ${luke.name}`)
        getCharacters(2, function callback (luke){
        console.log(`Hello I\'m ${luke.name}`)
            getCharacters(3, function callback (luke){
            console.log(`Hello I\'m ${luke.name}`)
                getCharacters(4, function callback (luke){
                console.log(`Hello I\'m ${luke.name}`)
                    getCharacters(5, function callback (luke){
                    console.log(`Hello I\'m ${luke.name}`)
                        getCharacters(6, function callback (luke){
                        console.log(`Hello I\'m ${luke.name}`)
                            getCharacters(7, function callback (luke){
                            console.log(`Hello I\'m ${luke.name}`)})
                    })
                })
            })
        })
    })
})

