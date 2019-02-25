// 1+(1+2)+(1+2+3)+.......+(1+2+3+....+n)
#include<stdio.h>

int sumOfSeries(int n){

    return (n*(n+1)*(2*n+4))/12;
}

int main(){
    int n=5;
    sumOfSeries(n);
}
