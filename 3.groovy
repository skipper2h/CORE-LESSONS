import java.util.Scanner;
public static void main(String[] args) {
String[] array_string = ["0","0.5", "1", "2", "3", "5", "8", "13", "20", "40", "100","coffee", "?"];
Scanner in = new Scanner(System.in);
System.out.print("input Poker Planning count ");
String count = in.nextLine();
in.close();
boolean status 
    
    for (int i = 0; i < array_string.length; i++) {
        if (count.length() == 0) 
        {
        System.out.print("String is empty ");
        break;
        }
        else if (count == array_string[i]) 
        {
        System.out.print("poker")
        status = false;
        break;
        }  
}
if (status = true)
{
System.out.print("error") 
}
}
