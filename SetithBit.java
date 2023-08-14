import java.util.Scanner;
public class SetithBit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // we will change the i'th Bit
        System.out.println("Enter your number: ");
        int a=sc.nextInt();
        System.out.println("Enter ith Bit: ");
        int i=sc.nextInt();
        int mask=~(1<<i);
         a=a|mask;
         System.out.println(a);
    }
}