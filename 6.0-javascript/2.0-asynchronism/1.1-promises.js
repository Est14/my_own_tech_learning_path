const API_URL = 'https://swapi.dev/api/'
const PEOPLE_URL = 'people/:id'

const lukeUrl = `${API_URL}${PEOPLE_URL.replace(':id', 1)}`
const opts = { crossDomain: true } 

function getCharacters(id){

    return new Promise((resolve, reject) => {
        const url = `${API_URL}${PEOPLE_URL.replace(':id', id)}`
        $.get(url, opts, function (data){
            resolve(data)
        })
        .fail(() => reject(id))
    })   
}

function onError(id){
    console.log(`Sorry an ERROR happened, could not get the character ${id}`)
}


async function getAllcharaters () {
    var ids = [1,2,3,4,5,6,7]
    var promises = ids.map(id => getCharacters(id))
    try{
        var characters = await Promise.all(promises)
        console.table(characters)
    } catch (id){
        onError(id)
    }
    
}

getAllcharaters()

