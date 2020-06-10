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

MutableInteger craftpre(MutableInteger value) {	
	value = new MutableInteger(1)	
	value.add(1)
	return value
}

MutableInteger craftpost(MutableInteger value) {
	value = new MutableInteger(1)
	temp = new MutableInteger (value.get())
	value.add(1)
	return temp	
}
	
println ('preinc count ' + craftpre().get())
println ('postinc count ' + craftpost().get())