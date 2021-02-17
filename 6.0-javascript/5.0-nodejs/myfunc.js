class Book{

    constructor(title, author, price, snb){
        this.title = title
        this.author = author
        this.price = price
        this.snb = snb
    }

    description(){
        console.log(`
        Books Details:

        Title: ${this.title}
        Author: ${this.author}
        Price: ${this.price}
        SNB: ${this.snb}

        `);
    }
}

export default Book;