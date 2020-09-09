d = {'Коля': '1000', 'Вася': '500', 'Петя':'200'}
count = 0
for key, value in d.items():
    count = count + int(value)
print (count)