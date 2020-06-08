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
	i.add(1)
	return i.get()


def craftpost(i):
	temp = i.get()
	i.add(1)
	return temp	

count_pre =  MutableInteger(1)
print (count_pre.get())
count_post =  MutableInteger(1)
print (craftpre(count_pre))
print (count_post.get())
print (craftpost(count_post))
print ("-----------------------")
