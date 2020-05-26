import java.util.Scanner;
 
public static void main(String[] args) {
String[] array_string = ["0","0.5", "1", "2", "3", "5", "8", "13", "20", "40", "100","coffee", "?"];
Scanner in = new Scanner(System.in);
System.out.print("input Poker Planning count ");
String count = in.nextLine();
in.close();
boolean status = false;
if(count.length() == 0) 
System.out.print("String is empty ");
    for (int i = 0; i < array_string.length; i++) {
        if (count == array_string[i]) {
            status = true}
        }     
if (status == false) {
    System.out.println("error")
    switch(count)
      { 
        case '4' :
            System.out.println("Может всё таки 3?"); 
            break;
        case '6' :
        case '7' :
        case '9' :
            System.out.println("Может всё таки 8?");
            break;
        case '10' :
        case '11' :
        case '12' :
        
        case '14' :
        case '15' :
            System.out.println("Может всё таки 13?");
            break;
        case '16' :
        case '17' :
        case '18' :
        case '19' :
        case '21' :
            System.out.println("Может всё таки 20?");
        break;    
        default :
            System.out.println("А оно вам надо?");
      }
      }    
else   
if (status == true) {
    System.out.println("poker")  
    switch(count)
      { 
        case '?' :
            System.out.println("Ну что тут непонятного?");
            break; 
        case 'coffee' :
            System.out.println("Осуждаю");
        break;       
      }
     }
}
