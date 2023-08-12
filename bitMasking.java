// to find ith bit

import java.util.Scanner;

public class bitMasking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your  number: ");
        int n=sc.nextInt();
        
        System.out.print("Which position you want to check: ");
        int i=sc.nextInt();

        System.out.println("mask");
        int mask=n<<i;
        
        int x=n&mask;
        if(x==0){
            System.out.println("ith  is 1");
        }
        else{
            System.out.println("ith is 0");
        }

    }
}