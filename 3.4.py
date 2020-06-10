class MutableInteger:
	def __init__(self, value):
		if (isinstance(value, int)):
			self.__value = value
		else:
			self.__value = value.__value

	def add(self, value):
		self.__value += value

	def get(self):
		return self.__value

def craftpre (value):
	value.add(1)
	return value


def craftpost(value):
	temp = MutableInteger(value.get())
	value.add(1)
	return temp	


value =  MutableInteger(1)
print (value.get())
print (craftpre(value).get())
print (value.get())
print (craftpost(value).get())
print ("-----------------------")
