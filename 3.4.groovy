/* 
i ++: загрузить x из памяти, использовать, увеличивать, хранить обратно в память.
 ++ i: загрузить x из памяти, увеличить, использовать, сохранить обратно в память.

У класса простой интерфейс: 2 конструктора (от инта и от себя самого), 
метод add для добавления числа к значению внутри и методо get для получения хранящегося там числа (для вывода)
*/
public class MutableInteger
{
	public MutableInteger(int value) {
		this.value = value;
	}
	public MutableInteger(MutableInteger value) {
		this.value = value.value;
	}
	public void add(int value) {
		this.value += value;
	}
	public int get() {
		return value;
	}

	private int value;
}

def craftpre() {	
	def count_pre = new MutableInteger(1)
	count_pre.add(1)
	return count_pre.get()
}

def craftpost() {
	def count_post = new MutableInteger(1)
	temp = count_post.get()
	count_post.add(1)
	return temp	
}


for (i = 0; i <3; i++) {
	
	println ('preinc count ' + craftpre())
	println ('postinc count ' + craftpost())
	println ('-----------------------')
}



  

