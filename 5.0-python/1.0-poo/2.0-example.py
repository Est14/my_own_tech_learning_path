from question import Question

questions_prompts = [
    'What color are apples? \n [a] Red/Green\n [b] Purples\n [c] Orange\n',
    'What color are bananas? \n [a] Teal\n [b] Mangenta\n [c] Yellow\n',
    'What color are strawberries? \n [a] Yellow\n [b] Red\n [c] Blue\n'
]

questions = [
    Question(questions_prompts[0], 'a'),
    Question(questions_prompts[1], 'c'),
    Question(questions_prompts[2], 'b')
]


def run_test(questions):
    score = 0
    for question in questions:
        answer = input(question.prompt)
        if answer == question.answer:
            score += 1
            #print('You\'re rigth go on')
    print(f'You got {score} / {len(questions)} correct')


if __name__ == "__main__":
    run_test(questions)