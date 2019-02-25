
package twodarray;


public class FindSencongHeighestNumber {
    public static int  second_largest(int arr[],int size){
        int f_largest=arr[0];
        int s_largest=arr[0];
        
        for(int i=1;i<=size;i++){
            if(arr[i]>f_largest){
                s_largest=f_largest;
                f_largest=arr[i];
            }
        }
        return s_largest;
    }
    
    
    public static void main(String[] args) {
        int size=8;
        int arr[]={10,23,54,22,65,76,89,62,5};
        int s_largest=second_largest(arr, size);
        System.out.println("Second largest number is :"+s_largest);
    }
}
