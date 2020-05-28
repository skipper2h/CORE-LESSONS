array_digit  = [0,0.5, 1, 2, 3, 5, 8, 13, 20, 40, 100]
array_string = ['coffee', '?']
poker_number = str(input("Input "));
#определение в массиве или нет
def seachint():
    for i in array_digit:
        if i == int(poker_number):
            print ('poker');
            break            
        else:
            print('nearest number is ', checktype()); 
            break                   
#поиск ближайшего   
def nearest(array, target):
 #return (array, key=lambda x: abs(x-target))  
   return array[min(range(len(array)), key = lambda i: abs(array[i]-target))]          
def checktype():
    if poker_number.isdigit():    
        return ((nearest(array_digit , int(poker_number))));
    elif poker_number == array_string:
        return ('think about it');    
seachint();