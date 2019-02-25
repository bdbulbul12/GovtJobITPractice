#include<stdio.h>


int main(){

    int LA[7]={5,10,15,20,25},n=5,k=3,item=100;

    int j=n;

    while(j>=k){

          LA[j+1]=LA[j];
          j=j-1;
    }

    LA[k]=item;
    n=n+1;

    int i;
    for(i=0;i<n;i++){

        printf("%d ",LA[i]);
    }
    return 0;
}
