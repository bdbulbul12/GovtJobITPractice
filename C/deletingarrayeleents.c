#include<stdio.h>

int main(){

    int LA[7]={5,10,15,20,25},n=5,k=3,item;
    item=LA[k];

    int j;
    for(j=k;j<=n-1;j++){

        LA[j]=LA[j+1];
    }
    n=n-1;

    printf("item %d deleted \n",item);

    int i;
    for(i=0;i<n;i++){

        printf("%d ",LA[i]);
    }
    return 0;
}
