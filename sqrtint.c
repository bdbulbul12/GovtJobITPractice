#include<stdio.h>
#include<Math.h>

int main(){

    int x,y,i;
    float s;
    printf("Enter the value of x :");
    scanf("%d",&x);
    printf("Enter value of y :");
    scanf("%d",&y);

    for(i=x;i<=y;i++){

        s = sqrt(i);
        if(s==(int)(s))
            print("%d",i);
    }

    return 0;

}
