def isBalanced(str):

    new_str = ""
    counter = 0

    for j in str:
        if j == '(' or j == ')':
            new_str += j

    for i in range(len(new_str) - 1):

        if new_str[i + 1] == '(' and new_str[i] != ')':
            counter += 1

        if new_str[i + 1] == ')':
            try:
                if new_str[i + 1 + counter] != ')':
                    return False
            except IndexError:
                return False
            counter = 0

    return True


str = "()()())))"
print(isBalanced(str))
