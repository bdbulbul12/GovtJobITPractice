
package twodarray;

import java.util.Scanner;

public class Video {
    
    public static boolean isSorted(int [] a){
        
        boolean sorted = true;
        boolean isAscending = a[1] > a[0];
        
        if(isAscending){
            for (int i = 0; i <a.length-1; i++) {
                if(a[i] > a[i+1]){
                    sorted = false;
                    break;
                }
            }
        } else{
            for (int i = 0; i <a.length-1; i++) {
                if(a[i] < a[i+1]){
                    sorted = false;
                    break;
                }
            }
        }
        
        return  sorted;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[6];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println(isSorted(a));
    }
    
    
}
