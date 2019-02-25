#include<stdio.h>

int sumOftheSeries(int n){

    int sum_n=(n*(n+1)/2);

    int sum_sq_n=(n*(n+1)/2)*(2*n+1)/3;

    return (sum_n+sum_sq_n);
}

int main(){

    int n=5;
    sumOfSeries(n);
}
