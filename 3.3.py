array_digit  = [0,0.5, 1, 2, 3, 5, 8, 13, 20, 40, 100]
array_string = ['coffee', '?']
poker_number = (input("Input "));
#определение в массиве или нет
def seachint():
    for i in array_digit:
        if i == int(poker_number) or i == float(poker_number):
            print ('poker');
            break              
        elif isinstance(poker_number, (int, float)) == True:  
            print('nearest number is ', checknearest()); 
            break
        else: 
            print ('input correct number');           
#поиск ближайшего   
def nearest(array, target): 
   return array[min(range(len(array)), key = lambda i: abs(array[i]-target))]          
def checknearest():
    if poker_number.isdigit():    
        return ((nearest(array_digit , int(poker_number))));
    elif poker_number == array_string:
        return ('think about it');    
seachint();