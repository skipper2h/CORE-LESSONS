inputList = System.console().readLine().split(" ")
newList = inputList*.toInteger().findAll {it%2 == 0 && it !=0 }
print(newList.sort().reverse())
