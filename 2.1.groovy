public static void main(String[] args) {
    int value = 1;
    int sum = 0;
    for (int i = 0; i < 20; i++) {
        if (i>0 && i%2==1)  
            sum = sum + i;  
    }
    System.out.println(sum);
}