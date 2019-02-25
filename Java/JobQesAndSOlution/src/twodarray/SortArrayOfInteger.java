package twodarray;

import java.util.Scanner;

public class SortArrayOfInteger {

    public static boolean isSorted(int a[]) {
        
        boolean isSorted = true;
       boolean isAscending = a[1] > a[0];
        if (isAscending) {
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    isSorted = false;
                    break;
                }
            }
        }else {
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] < a[i+1]){
                    isSorted=false;
                    break;
                }
            }
        }
        return  isSorted;
        

    }

    public static void main(String[] args) {
//        int n;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no. of elements you want in array:");
//        n = sc.nextInt();

        int a[] = new int[6];
//        System.out.println("Enter all the elements:");

        for (int i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();  
        }
        System.out.println(isSorted(a));
    }
}
