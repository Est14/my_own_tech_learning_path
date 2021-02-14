const question = [
    'What is your name',
    'What is your favorite programing language',
    'How old are you?'
]

const ask = (i = 0) => {
    process.stdout.write(`\n\n\n ${question[i]}`)
    process.stdout.write(' > ')
}

ask()

const answers = []

process.stdin.on('data', data => {
    answers.push(data.toString().trim())

    if (answers.length < question.length){
        ask(answers.length)
    }
    else{
        process.exit()
    }
    
})

process.on('exit', () => {
    const [name, lang, age] = answers
    console.log(`
    
    Thanks for yours answers:

    Your name is: ${name}
    Your age is: ${age}
    You can write code in ${lang}
    
    `);
})
