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

def craftpre():
	count_pre =  MutableInteger(1) 	
	count_pre.add(1)
	return count_pre.get()


def craftpost():
	count_post =  MutableInteger(1)
	temp = count_post.get()
	count_post.add(1)
	return temp	



print (craftpre())
print (craftpost())
print ("-----------------------")
