import java.util.Scanner;
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input number count ");
        int count = in.nextInt()*2; // full array of all numbers
        System.out.println(count); 
        in.close();
    int value = 1;
    int sum = 0;
    for (int i = 0; i < count; i++) {
        if (i>0 && i%2==1)
            sum = sum + i;    
    }
    System.out.println(sum);
}
