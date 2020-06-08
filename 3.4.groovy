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

def craftpre(i) {	
	i.add(1)
	return i.get()
}

def craftpost(i) {
	temp = i.get()
	i.add(1)
	return temp	
}


for (i = 0; i <3; i++) {
	def count_pre = new MutableInteger(1)
 	println ('count ' + count_pre.get())
	def count_post = new MutableInteger(1)
	println ('preinc count ' + craftpre(count_pre))
	println ('count ' + count_post.get())
	println ('postinc ' + craftpost(count_post))
	println ('-----------------------')
}



  

