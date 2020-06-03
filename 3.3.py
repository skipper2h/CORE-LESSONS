import ast
array_digit = [0, 0.5, 1, 2, 3, 5, 8, 13, 20, 40, 100]
array_string = ['coffee', '?']
poker_number = (input("Input "))


def seachin():  # определение типа данных и проверка принадлежности
    try:
        # принимает тип входных данных
        vartype = (ast.literal_eval(poker_number))
    except (TypeError, ValueError):
        return print('Некорректный ввод')
    if isinstance(vartype, (int, float)):
        for i in array_digit:
            if i == (vartype):
                return print('poker')
        print('nearest number is ', nearest(array_digit, vartype))
    if isinstance(poker_number, (str)):
        for i in array_string:
            if poker_number == array_string:
                print('think about it')


def nearest(array, target):  # поиск ближайшего
    return array[min(range(len(array)), key=lambda i: abs(array[i]-target))]


if poker_number in array_string:
    print('think about it')
else:
    seachin()
