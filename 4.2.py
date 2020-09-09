input_array = (input('Input elements ').split(" "))
input_array = sorted([int(x) for x in input_array if not int(x)%2],reverse=True) 
print('Sorted array' , input_array)