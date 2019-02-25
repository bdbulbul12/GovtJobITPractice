#include<stdio.h>

int main(){
    int number,rem,sum=0,i;
    printf("Enter a number\n");
    scanf("%d",&number);

    for(i=1;i<=(number-1);i++){

        rem=number%i;

        if(rem==0){

            sum=sum+i;
        }
    }
    if(sum==number)
        printf("Enterd Number is perfect");
    else
        printf("Enterd number is not perfect");
    return 0;
}
