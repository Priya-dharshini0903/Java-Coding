import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            int ld=n%10;
            if(ld%2 !=0){
                c++;
            }
            n=n/10;
        }
        System.out.print("No of Odd digits:"+c);
}
}
