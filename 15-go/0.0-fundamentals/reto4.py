def get_data():
    nk = input().split()
    answers = input().split()

    nk_list_int, answers_list_int = [], []

    for i in nk:
        nk_list_int.append(int(i))

    for i in answers:
        answers_list_int.append(int(i))

    return nk_list_int, answers_list_int


def software(answers):
    no_cp = set(answers)
    cp = len(answers) - len(no_cp)
    return cp


def teacher(nk, answers):
    memomy_amount = nk[1]
    memory = []
    counter = 0

    for i in range(memomy_amount):
        if answers[i] in memory:
            counter += 1
        memory.append(answers[i])
    
    for i in range(len(memory), len(answers)):
        if answers[i] in memory:
            counter += 1
        memory.remove(memory[0])
        memory.append(answers[i])


    return counter


def run():
    nk, answers = get_data()
    soft = software(answers)
    teach = teacher(nk, answers)

    return f'{soft} {teach}'


if __name__ == '__main__':
    print(run())