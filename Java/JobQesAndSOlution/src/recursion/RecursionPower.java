package recursion;

import java.util.Scanner;

public class RecursionPower {
    
    public static int power(int base,int power){
        
        if(power!=0)
            return (base*power(base,power-1));
        else
            return 1;
    }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base :");
        a=sc.nextInt();
        System.out.print("Enter Power : ");
        b=sc.nextInt();
        System.out.println(a+"^"+b+" = "+power(a, b));
        
        
    }

}
