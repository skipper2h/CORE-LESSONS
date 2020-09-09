public class MutableStr
{
	public MutableStr(String str) {
		this.str = str;
	}
	public MutableStr(MutableStr str) {
		this.str = str.str;
	}
	
	public String get() {
		return str;
	}

private String str;

public customize (IntRange position, String new_text) {
    this.str = this.str.substring(0, position[0]) + new_text + this.str.substring(position[-1])
    } 
public customize (String new_text) {
    this.str = this.str + new_text
    }	
}	
new_str = new MutableStr('MutableStr ')
println(new_str.get())  
new_str.customize(0..4, 'customize')
println(new_str.get())
new_str.customize('customize')
println(new_str.get())