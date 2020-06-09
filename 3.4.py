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

def craftpre(i):
	count_pre =  MutableInteger(i) 	
	count_pre.add(1)
	return count_pre.get()


def craftpost(i):
	count_post =  MutableInteger(i)
	temp = count_post.get()
	count_post.add(1)
	return temp	



print (craftpre(1))
print (craftpost(1))
print ("-----------------------")
