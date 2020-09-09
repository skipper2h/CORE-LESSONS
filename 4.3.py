count = {}
input_str = (str(input('Enter cities with a space ')))
split = input_str.split()
for i in split:
   if i in count:
      count[i] += 1
   else:
      count[i] = 1

print(count)