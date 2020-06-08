//i ++: загрузить x из памяти, использовать, увеличивать, хранить обратно в память.
// ++ i: загрузить x из памяти, увеличить, использовать, сохранить обратно в память.
/*
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

def creaftpre(i) {
	i.add(1)
	return i.get()
}

def creaftpost(i) {
	temp = i.get()
	i.add(1)
	return temp	
}

def count_pre = new MutableInteger(1)
def count_post = new MutableInteger(1)



for (i = 0; i <3; i++) {
 	println ('count ' + count_pre.get())
	println ('preinc count ' + creaftpre(count_pre))
	println ('count ' + count_post.get())
	println ('postinc ' + creaftpost(count_post))
	println ('-----------------------')
}


def craftpost_old() { 
    temp = i
    i = i + 1 
    i = temp 
    println (i) 
}

  

