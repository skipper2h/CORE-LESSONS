import ast
array_digit = [0, 0.5, 1, 2, 3, 5, 8, 13, 20, 40, 100]
array_string = ['coffee', '?']
poker_number = (input("Input "))


def seachin():  # определение типа данных и проверка принадлежности
    try:
        # принимает тип входных данных
        vartype = (ast.literal_eval(poker_number))
    except (TypeError, ValueError):
        print('Некорректный ввод')
        return 
    if isinstance(vartype, (int, float)):
        if vartype in array_digit:
            print('poker')
            return 
        print('nearest number is ', nearest(array_digit, vartype))
   

def nearest(array, target):  # поиск ближайшего
    return array[min(range(len(array)), key=lambda i: abs(array[i]-target))]


if poker_number in array_string:
    print('poker, the nearest value 4 u is holidays ¯\_(ツ)_/¯')
else:
    seachin()
