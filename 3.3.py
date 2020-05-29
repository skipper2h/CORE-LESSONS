import ast # todo Парсинг строк, для coffee и ?, должен открывать, но не может
array_digit  = [0, 0.5, 1, 2, 3, 5, 8, 13, 20, 40, 100]
array_string = ['coffee', '?']
poker_number = (input("Input "))
vartype = (ast.literal_eval(poker_number)) # принимает тип входных данных 
#определение в массиве или нет
def seachin():
    if isinstance(vartype, (int, float)):
        for i in array_digit:
            if i == (vartype):
                return print ('poker')      
        print('nearest number is ', nearest(array_digit, vartype));                       
    else:
        print ('STOP THIS');  
    if isinstance(poker_number, (str)):
        for i in array_string:       
            if poker_number == array_string: 
                print ('think about it'); 
    else:
        print ('STOP THIS');                                
# поиск ближайшего   
def nearest(array, target): 
   return array[min(range(len(array)), key = lambda i: abs(array[i]-target))]           
seachin()