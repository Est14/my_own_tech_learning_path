class Drink{
    
    constructor(type, marca, alcohol){
        this.type = type
        this.marca = marca
        this.alcohol = alcohol
    }

    decription(){

        console.log(`
            Drink details:
            Type: ${this.type}
            Marca: ${this.marca}
            Alcohol Drink: ${this.alcohol}
        `);
    }
    }



module.exports = Drink
